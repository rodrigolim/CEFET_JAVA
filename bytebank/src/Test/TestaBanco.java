package Test;
import java.util.List;

import Banco.Cliente;
import Banco.Conta;
import DataBase.DB;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		paulo.setCpf("222.222.222.-22");
		paulo.setProfissao("programador");

		Conta contaDoPaulo = new Conta(6646,969060);
		contaDoPaulo.deposita(100);

		contaDoPaulo.setTitular(paulo);
		System.out.println(contaDoPaulo.getTitular().getNome());
		
		
		Cliente rodrigo = new Cliente();
		rodrigo.setNome("Rodrigo de Lima Cunha");
		rodrigo.setCpf("111.111.111.-11");
		rodrigo.setProfissao("Professor");

		Conta contaDorodrigo = new Conta(001,123456);
		contaDorodrigo.deposita(10000.00);
		contaDorodrigo.setTitular(rodrigo);
		System.out.println(contaDorodrigo.getTitular().getNome());
		
		
		
		
		DB banco = new DB();
		banco.add(contaDoPaulo);
		banco.add(contaDorodrigo);
		
		System.out.println("\n************** listando contas **********");
		List<Conta> lista = banco.getContas();
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		
		Conta contaUpdate = banco.getContaById(2);
		contaUpdate.setSaldo(123);
		
		System.out.println("\n************** listando contas **********");
		for (Conta conta : banco.getContas()) {
			System.out.println(conta);
		}
		
		
		banco.remove(1);
		
		System.out.println("\n************** listando contas **********");
		for (Conta conta : banco.getContas()) {
			System.out.println(conta);
		}
		

	}
}