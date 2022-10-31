package Codigos;

public class Questao01 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int b[] = new int[10];

		for (int i = 0; i < 10; i++) {
			b[i] = a[i] * i;
		}

		System.out.print("Vetor A: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + ", ");
		}

		System.out.print("\nVetor B: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(b[i] + ", ");
		}
	}

}
