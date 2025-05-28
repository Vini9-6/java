import java.util.Scanner;

public class Matriz {
    private  int[][] A;
    private int somaDiagonal;
    private int somaAbaixoDiagonal;
    private int somaAcimaDiagonal;

    public void setMatriz(){
        Scanner sc = new Scanner(System.in);
        A = new int[3][3];
        System.out.println("digite os 9 elementos da matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
        } sc.close();
    }

    public int[][] getA() {
        return A;
    }

    public int getSomaDiagonal() {
        return somaDiagonal;
    }

    public int getSomaAbaixoDiagonal() {
        return somaAbaixoDiagonal;
    }

    public int getSomaAcimaDiagonal() {
        return somaAcimaDiagonal;
    }

    public void resultados(){
        System.out.println("Q2- Diagonal= "+ getSomaDiagonal());
        System.out.println("Q3- Abaixo da diagonal= "+ getSomaAbaixoDiagonal());
        System.out.println("Q3- Acima da diagonal= "+ getSomaAcimaDiagonal());
    }

    public void calcularOperacoes() {
        System.out.println("Calculando as somas...");
        somaDiagonal = 0;
        somaAbaixoDiagonal = 0;
        somaAcimaDiagonal = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    somaDiagonal += A[i][j];
                }
                if (i > j) {
                    somaAbaixoDiagonal += A[i][j];
                }
                if (i < j) {
                    somaAcimaDiagonal += A[i][j];
                }
            }
        }
    }
    public void status() {
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Matriz A = new Matriz();
        A.setMatriz();
        A.status();
        A.calcularOperacoes();
        A.resultados();
    }

}
