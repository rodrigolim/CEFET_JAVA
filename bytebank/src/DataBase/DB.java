package DataBase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Banco.Conta;

public class DB {

	private static List<Conta> lista = new ArrayList<>();
	private static int total = 0;
	private static int chaveSequencial = 1;

	public void add(Conta conta) {
		conta.setId(chaveSequencial++);
		DB.lista.add(conta);
		total++;
	}

	public List<Conta> getContas() {
		return DB.lista;
	}

	public Conta getContaById(Integer id) {
		for (Conta conta : lista) {
			if (conta.getId() == id) {
				return conta;
			}
		}
		return null;
	}

	public void remove(Integer id) {
		Iterator<Conta> it = lista.iterator();
		while (it.hasNext()) {
			Conta c = it.next();
			if (c.getId() == id) {
				it.remove();
			}
		}

		/*
		 * Este padrão não e recomendavel de se utilizar quando esta trabalhando com
		 * servidor web.
		 * 
		 * O Motivo e que não podemos alterar a LISTA e modifica-la ao mesmo tempo
		 */
//		for (Conta conta : lista) {
//			if (conta.getId() == id) {
//				lista.remove(conta);
//			}
//		}
	}

}
