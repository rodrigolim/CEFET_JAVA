package Codigos;

import java.util.Scanner;

public class Questao05 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i, j, qtdeAlunos = 10;

		double notas[][] = new double[qtdeAlunos][3];

		
		for (i = 0; i < qtdeAlunos; i++) {
			for (j = 0; j < 2; j++) {
				System.out.print("Digite a "+((j==0)?"Primeira":"Segunda")+" nota do " + (i + 1) + " aluno: ");
				notas[i][j] = ler.nextDouble();
			}			
			notas[i][2] = (notas[i][0] + notas[i][1]) / 2;
		}
		
		
		System.out.println("\n");
		for (i = 0; i < qtdeAlunos; i++) {
			if (notas[i][2] >= 7) {
				System.out.println("O aluno "+(i+1)+" obteve nota "+notas[i][2]+" está Aprovado!");
			} else {
				System.out.println("O aluno "+(i+1)+" obteve nota "+notas[i][2]+" foi REPROVADO!");
			}
		}
	}
}
