import java.util.Scanner;

public class Banco {
    private String nome;
    private String endereco;
    private double saldo;
    private double chequeEspecial;
    private double chequeEspecialUsado;

    public Banco(String nome, String endereco, double saldo) {
        this.nome = nome;
        this.endereco = endereco;
        this.saldo = saldo;
        if (saldo <= 500) {
            this.chequeEspecial = 50.0;
        } else {
            this.chequeEspecial = saldo * 0.5;
        }
        this.chequeEspecialUsado = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public boolean isUsandoChequeEspecial() {
        return saldo < 0;
    }

    public void depositar(double valor) {
        // Se estiver usando cheque especial, cobre a taxa de 20% do valor usado
        if (chequeEspecialUsado > 0) {
            double taxa = chequeEspecialUsado * 0.2;
            double totalDevido = chequeEspecialUsado + taxa;
            if (valor >= totalDevido) {
                valor -= totalDevido;
                chequeEspecialUsado = 0;
                saldo += valor;
            } else {
                chequeEspecialUsado -= (valor / 1.2);
                valor = 0;
            }
        } else {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        double limiteTotal = saldo + (chequeEspecial - chequeEspecialUsado);
        if (valor <= limiteTotal) {
            saldo -= valor;
            if (saldo < 0) {
                chequeEspecialUsado = Math.abs(saldo);
            }
            return true;
        }
        return false;
    }

    public boolean pagarBoleto(double valor) {
        return sacar(valor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do titular: ");
        String nome = sc.nextLine();
        System.out.print("Endereço: ");
        String endereco = sc.nextLine();
        System.out.print("Valor inicial de depósito: ");
        double saldo = sc.nextDouble();

        Banco conta = new Banco(nome, endereco, saldo);

        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Consultar cheque especial");
            System.out.println("3. Depositar dinheiro");
            System.out.println("4. Sacar dinheiro");
            System.out.println("5. Pagar boleto");
            System.out.println("6. Verificar uso do cheque especial");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f\n", conta.getSaldo());
                    break;
                case 2:
                    System.out.printf("Limite do cheque especial: R$ %.2f\n", conta.getChequeEspecial());
                    System.out.printf("Cheque especial usado: R$ %.2f\n", conta.chequeEspecialUsado);
                    break;
                case 3:
                    System.out.print("Valor para depositar: ");
                    double valorDep = sc.nextDouble();
                    conta.depositar(valorDep);
                    System.out.println("Depósito realizado.");
                    break;
                case 4:
                    System.out.print("Valor para sacar: ");
                    double valorSaq = sc.nextDouble();
                    if (conta.sacar(valorSaq)) {
                        System.out.println("Saque realizado.");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 5:
                    System.out.print("Valor do boleto: ");
                    double valorBol = sc.nextDouble();
                    if (conta.pagarBoleto(valorBol)) {
                        System.out.println("Boleto pago.");
                    } else {
                        System.out.println("Saldo insuficiente para pagar o boleto.");
                    }
                    break;
                case 6:
                    if (conta.isUsandoChequeEspecial()) {
                        System.out.println("Atenção: Você está usando o cheque especial!");
                    } else {
                        System.out.println("Você não está usando o cheque especial.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
