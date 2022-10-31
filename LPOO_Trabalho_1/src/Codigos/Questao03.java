package Codigos;

public class Questao03 {

	public static void main(String[] args) {
		int []VetorA = {1,2,3,4,5,6,7,8,9,0};
		int i, soma =0;
		
		for (i =0; i<10; i++) {
			soma= soma + VetorA[i];

		}
		System.out.print("Vetor A: ");
		for (i = 0; i < 10; i++) {
			System.out.print(VetorA[i] + ", ");
		}
		System.out.println("\nA soma desses valores é: "+ soma);

	}
}
