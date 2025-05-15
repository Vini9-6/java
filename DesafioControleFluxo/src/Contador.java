import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        // criando o scanner pra ler do terminal
        Scanner scanner = new Scanner(System.in);

        // pedindo o primeiro numero
        System.out.println("digite o primeiro parametro:");
        int parametroUm = scanner.nextInt();

        // pedindo o segundo numero
        System.out.println("digite o segundo parametro:");
        int parametroDois = scanner.nextInt();

        try {
            // chamando o metodo contar
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            // se der erro mostra a mensagem
            System.out.println(exception.getMessage());
        }

        // fecha o scanner
        scanner.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // se o primeiro for maior ou igual que o segundo, vai da erro
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("o segundo parametro deve ser maior que o primeiro");
        }

        // calcula quantas vezes vai repetir
        int contagem = parametroDois - parametroUm;

        // repete de 1 ate o valor da contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("imprimindo o numero " + i);
        }
    }
}
