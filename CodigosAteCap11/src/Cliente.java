
public class Cliente implements Autenticavel {

	private String nome;
	private String cpf;
	private String Profissao;
	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getString() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf= cpf;
	}


	public String getProfissao() {
		return Profissao;
	}


	public void setProfissao(String profissao) {
		Profissao = profissao;
	}


}
