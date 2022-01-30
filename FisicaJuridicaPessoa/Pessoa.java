package FisicaJuridicaPessoa;

public class Pessoa {

	private String telefone;

	private String endereco;

	private String nome;



	private void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	protected String getTelefone() {
		return telefone;
	}

	private void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	protected String getEndereco() {
		return endereco;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	protected String getNome() {
		return nome;
	}




	// ---------------------
	protected void trocarTelefonePessoa(String telefone)
	{
		this.setTelefone(telefone);
	}

	protected void cadastrarPessoa(String nome,String endereco, String telefone)
	{
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
	}
} 
