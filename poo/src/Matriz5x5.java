import java.util.Scanner;

public class Matriz5x5 {
    private int[][] M;
    private int somaLinha3;
    private int somaColuna2;
    private int somaDiagonalPrincipal;
    private int somaDiagonalSecundaria;
    private int somaTotal;

    public Matriz5x5() {
        M = new int[5][5];
    }

    public void calcularOperacoes() {
        // a) Soma da linha 3
        somaLinha3 = 0;
        for (int j = 0; j < 5; j++) {
            somaLinha3 += M[2][j];
        }

        // b) Soma da coluna 2
        somaColuna2 = 0;
        for (int i = 0; i < 5; i++) {
            somaColuna2 += M[i][1];
        }

        // c) Soma da diagonal principal
        somaDiagonalPrincipal = 0;
        for (int i = 0; i < 5; i++) {
            somaDiagonalPrincipal += M[i][i];
        }

        // d) Soma da diagonal secundária
        somaDiagonalSecundaria = 0;
        for (int i = 0; i < 5; i++) {
            somaDiagonalSecundaria += M[i][4 - i];
        }

        // e) Soma de todos os elementos
        somaTotal = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                somaTotal += M[i][j];
            }
        }
    }

    public void lerMatriz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os elementos da matriz M 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("M[%d][%d] = ", i+1, j+1);
                M[i][j] = sc.nextInt();
            }
        }
    }

    public void exibirResultados() {
        System.out.println("\nResultados:");
        System.out.println("a) Soma da linha 3 de M: " + somaLinha3);
        System.out.println("b) Soma da coluna 2 de M: " + somaColuna2);
        System.out.println("c) Soma da diagonal principal: " + somaDiagonalPrincipal);
        System.out.println("d) Soma da diagonal secundária: " + somaDiagonalSecundaria);
        System.out.println("e) Soma de todos os elementos: " + somaTotal);
    }

    public static void main(String[] args) {
        Matriz5x5 op = new Matriz5x5();
        op.lerMatriz();
        op.calcularOperacoes();
        op.exibirResultados();
    }
}