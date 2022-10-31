package Codigos;
import java.util.Scanner;
public class Questao08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double mat[][] = new double[2][5];
		
		for(int l = 0; l < 2; l++) {
			for(int c = 0; c < 5; c++) {
				System.out.print("Digite o valor "+(l+1)+"."+(c+1)+" : ");
				mat[l][c] = ler.nextDouble();
			}
		}
	
		System.out.print("\n");
		for(int l = 0; l < 2; l++) {
			for(int c = 0; c < 5; c++) {
				System.out.print(mat[l][c]+" | ");
			}
			System.out.print("\n");
		}
	}

}