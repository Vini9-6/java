//POO - Aula 20/08/2025
import java.util.Scanner;
public class OperacoesMatrizes {
    int[][] A,B,S,D;

    OperacoesMatrizes (){
        A = new int[2][2];
        B = new int[2][2];
        S = new int[2][2];
        D = new int[2][2];
    }

    public void calculo(){
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                S[i][j] = A[i][j] + B[i][j];
                D[i][j] = A[i][j] - B[i][j];
            }
        }
    }

    public void setElementos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os elementos da matriz A:");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Digite os elementos da matriz B:");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                B[i][j] = sc.nextInt();
            }
        }
    }

    public void getResultados(){
        System.out.println("Soma:");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                System.out.print(S[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Subtração:");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                System.out.print(D[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        OperacoesMatrizes op = new OperacoesMatrizes();
        op.setElementos();
        op.calculo();
        op.getResultados();
    }
}

