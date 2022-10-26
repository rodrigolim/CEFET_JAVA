

public class TestaGerente {

	public static void main(String[] args) {

		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		
		Funcionario gerente = new Gerente();
		gerente.setSalario(5000.0);
		controle.registra(gerente);
		
		Funcionario secretaria = new Secretaria();
		secretaria.setSalario(1000.0);
		controle.registra(secretaria);
			
		System.out.println(controle.getTotalDeBonificacoes());

//		Gerente gerente = new Gerente();		
//		gerente.setNome("João da Silva");
//		gerente.setSalario(5000);		
//		System.out.println(gerente.getNome()+" - "+gerente.getBonificacao());
//		
//		Funcionario funcionario = new Funcionario();		
//		funcionario.setNome("Funcionario");
//		funcionario.setSalario(1000);	
//		System.out.println(funcionario.getNome()+" - "+funcionario.getBonificacao());

	}

}
