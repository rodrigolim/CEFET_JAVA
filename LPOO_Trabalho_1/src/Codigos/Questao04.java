package Codigos;
import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int v[] = new int[10];
		double contPar = 0, contImpar = 0;
		double pcPar = 0, pcImpar = 0;
		
		for(int i = 0; i < v.length; i++) {
			System.out.print("Digite o valor:");
			v[i] = ler.nextInt();
		}
		for (int i = 0; i < v.length; i++) {
			if (v[i]%2 == 0) {
				contPar++;
				pcPar = contPar*10;
			}else {
				contImpar++;
				pcImpar = contImpar*10;
			}
		}	
		System.out.println("Percentual de números pares: "+pcPar);
		System.out.println("Percentual de números impares: "+pcImpar);
	}

}
