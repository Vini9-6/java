import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    private int  agencia;
    private int numeroConta;
    private String nomeCliente;
    private Double saldo = 0.0;

    // getters e setters
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public static void main(String[] args) throws Exception {
        
        ContaTerminal conta = new ContaTerminal(); // instancia da classe
        Scanner scanner = new Scanner(System.in); // instancia do Scanner
        Random random = new Random(); // instancia do random

        try {
        System.out.println("Olá, seja bem vindo ao Banco Uni");
        System.out.println("Para criar uma conta digite seu nome: ");
        conta.setNomeCliente(scanner.next()); // atribuir o nome ao atributo usando o setter

        System.out.println("Digite o número da agência (xxx-x): ");
        conta.setAgencia(scanner.nextInt()); // atribuir a agencia ao atributo usando o setter
                }
        catch(InputMismatchException e){ // tratamento de excecao
            System.out.println("Os campos agência e número da conta precisam ser numéricos!");
        }

        // gera numero de conta aleatorio de 4 digitos
        conta.setNumeroConta(1000 + random.nextInt(9000));

        System.out.println("Conta criada com sucesso!");
        System.out.println("Cliente: " + conta.getNomeCliente());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Seu saldo é: " + conta.getSaldo());

        scanner.close(); // fechar o Scanner

    }


}