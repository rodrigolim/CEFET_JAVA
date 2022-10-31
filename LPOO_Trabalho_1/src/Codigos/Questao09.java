package Codigos;
import java.util.Random;
public class Questao09 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		int [][]matriz = new int[4][4];
		int i, j = 0;
		
		int maior = matriz[0][0]; 
	    int linha = 1;
	    int coluna = 1;

	    for (i=0; i<matriz.length; i++) {
	        for (j=0; j<matriz.length; j++) {
	        	matriz[i][j] = aleatorio.nextInt(10);
	        } 
	    } 
	    for (i=0; i<matriz.length; i++) {
	        for (j=0; j<matriz.length; j++) {
	        	if (matriz[i][j] > maior) {
	        		maior = matriz[i][j];
	        		linha = i+1;
	        		coluna= j+1;
	        	}
	        }
	    }
	    for (i=0; i<matriz.length; i++) {
	        for (j=0; j<matriz.length; j++) {
	        	 System.out.print(matriz[i][j]+" | ");
	        }
	        System.out.print("\n");
	    }
	    System.out.println("o maior numero da matriz é: "+ maior + " Linha "+ linha+ " na coluna "+ coluna);
	}
}


