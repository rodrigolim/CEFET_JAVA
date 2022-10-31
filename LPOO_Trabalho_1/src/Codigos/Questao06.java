package Codigos;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] A = new int[6];
		int[] B = new int[6];
		
		for (int i = 0; i < 6; ++i) {
			System.out.print("insira um valor que deseja: ");
			A[i] = input.nextInt();
		}
		
		for (int i = 0; i < 6; ++i) {
			B[i] = (A[i] % 2 == 0) ? 1 : 0;
		}
		
		System.out.print("\n");
		
		System.out.print("Vetor A: ");
		for (int i = 0; i < 6; ++i) {
		    System.out.print(A[i]+"-");
		}
		
		System.out.print("\nVetor B: ");		
		for (int i = 0; i < 6; ++i) {
		    System.out.print(B[i]+"-");
		}

	}

}
