

public class Secretaria extends Funcionario {

	@Override
	public double getBonificacao() {
		return this.salario * 0.10;
	}

}
