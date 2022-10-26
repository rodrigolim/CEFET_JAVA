

import java.util.Iterator;

public class TestaPrograma {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.setNome("Paulo Silveira");
		c1.setCpf("222.222.222.-22");
		c1.setProfissao("programador");

		Conta ct1 = new Conta(123,456);
		ct1.deposita(100);		
		ct1.setTitular(c1);
		System.out.println(ct1.getTitular().getNome());
		System.out.println(ct1.getTitular());

	}
}