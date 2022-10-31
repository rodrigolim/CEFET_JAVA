package Codigos;
import java.util.Scanner;
public class Questao10 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int m[][] = new int[3][3];
		int contPar = 0, contImpar = 0;
		
		for(int l = 0; l < m.length; l++) {
			for(int c = 0; c < m.length; c++) {
				System.out.print("Informe o valor: ");
				m[l][c] = leer.nextInt();
			}
		}
		System.out.println("\n");
		
		for(int l = 0; l < m.length; l++) {
			for(int c = 0; c < m.length; c++) {
				System.out.print(m[l][c]+" | ");
			}
			System.out.print("\n");
		}
		for(int l = 0; l < m.length; l++) {
			for(int c = 0; c < m.length; c++) {
				if (m[l][c]%2 == 0) {
					contPar++;
				}else {
					contImpar++;
				}
			}
		}
		System.out.println("Quantidade de numeros pares: "+contPar);
		System.out.println("Quantidade de numeros impares: "+contImpar);;
	}
}
