
public class Onibus extends Veiculo {

	private int assentos;

	public Onibus(String placa, int ano, int assentos) {
		super(placa, ano);
		this.assentos = assentos;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}


	@Override
	public void exibirDados() {
		System.out.println("A Placa do Onibus �: " + getPlaca() + " � o ano de fabrica��o �: " + getAno()
				+ " O n�mero de assentos �: " + getAssentos());
	}

}
