import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestarHeranca {

	public static void main(String[] args) {
	

//		Onibus bus1 = new Onibus("AAA-1111", 2000, 41);
//		bus1.exibirDados();
//		Onibus bus2 = new Onibus("ABC-1234", 2005, 45);
//		bus2.exibirDados();
//		Onibus bus3 = new Onibus("BBB-2222", 2010, 42);
//		bus3.exibirDados();
//		Onibus bus4 = new Onibus("CCC-3333", 2015, 43);
//		bus4.exibirDados();
//		Onibus bus5 = new Onibus("DDD-4444", 2020, 44);
//		bus5.exibirDados();
//		
//		Caminhao truck1 = new Caminhao("EFG-5678", 2022, 11);
//		truck1.exibirDados();
//		Caminhao truck2 = new Caminhao("EEE-555", 1982, 2);
//		truck2.exibirDados();
//		Caminhao truck3 = new Caminhao("FFF-6666", 1992, 3);
//		truck3.exibirDados();
//		Caminhao truck4 = new Caminhao("GGG-7777", 2002, 4);
//		truck4.exibirDados();
//		Caminhao truck5 = new Caminhao("HHH-8888", 2012, 7);
//		truck5.exibirDados();
			
		
		
//		//PONTO EXTRA
//		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
//		veiculos.add(new Onibus("AAA-1111", 2000, 41));
//		veiculos.add(new Onibus("ABC-1234", 2005, 45));
//		veiculos.add(new Onibus("BBB-2222", 2010, 42));
//		veiculos.add(new Onibus("CCC-3333", 2015, 43));
//		veiculos.add(new Onibus("DDD-4444", 2020, 44));
//		veiculos.add(new Caminhao("EFG-5678", 2022, 11));
//		veiculos.add(new Caminhao("EEE-555", 1982, 2));
//		veiculos.add(new Caminhao("FFF-6666", 1992, 3));
//		veiculos.add(new Caminhao("GGG-7777", 2002, 4));
//		veiculos.add(new Caminhao("HHH-8888", 2012, 7));
//		
//		for (Veiculo veiculo : veiculos) {
//			veiculo.exibirDados();
//		}
		
		
		//PONTO EXTRA + DESAFIO
		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
		
		Boolean inserindoItens = true;
	    while (inserindoItens) {
	    	Scanner scanner = new Scanner(System.in);	
	    	
	    	System.out.print("Digite a Placa: ");
	    	String placa = scanner.next().toUpperCase();
	    	
	    	System.out.print("Digite o Ano: ");
	    	int ano = scanner.nextInt();	    	
	    	
	    	System.out.print("Digite 1 para Onibus e 2 para Caminhão: ");
	        int opcao = scanner.nextInt();
	        
	        if (opcao == 1) {	        
	        	System.out.print("Digite a quantidade de Assentos:");
		    	int assentos = scanner.nextInt();
		    	
		    	veiculos.add(new Onibus(placa, ano, assentos));
	        } else {	        
	        	System.out.print("Digite a quantidade de Eixos:");
		    	int eixos = scanner.nextInt();
		    	
		    	veiculos.add(new Caminhao(placa, ano, eixos));
	        }	    	
	    	
	        System.out.print("Deseja Continuar inserindo? (informe S ou N) ");
	        String flag = scanner.next();	                
	    	
	        inserindoItens = flag.equalsIgnoreCase("s");			
		}
		
		for (Veiculo veiculo : veiculos) {
			veiculo.exibirDados();
		}
		

	}

}
