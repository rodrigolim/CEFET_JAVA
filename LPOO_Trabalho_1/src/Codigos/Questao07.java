package Codigos;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		int [] vetor = new int[10];
		
		Scanner ler = new Scanner(System.in);
		for (int i=0; i<10; i++) {
			System.out.printf("Informe o numero: ");
			vetor[i] = ler.nextInt();
		}
		
		Arrays.sort(vetor);
		System.out.println("\n Vetor em ordem crescente: ");
		for (int k : vetor) {
			System.out.print(k + ", ");
		}	
		
	}

}
