package edu.vini.primeirasemana;
import java.util.Scanner;

public class BoletimEstudantil {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a media do aluno");
			int mediaFinal = scanner.nextInt();
		if (mediaFinal < 6)
			System.out.println("REPROVADO");
		else if (mediaFinal == 6)
			System.out.println("PROVA MINERVA");
		else
			System.out.println("APROVADO");
	}
}