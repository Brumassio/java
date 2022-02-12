package Atividade2;

public class Pessoa {

	protected String nome;

	protected String endereco;

	protected String telefone;

	public void setNome(String nome) {
		this.nome = nome;
	}

	protected String getNome() {
		return nome;
	}

	protected void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	protected String getEndereco() {
		return endereco;
	}

	protected void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	protected String getTelefone() {
		return telefone;
	}

	protected void trocarTelefonePessoa(String telefone) {
		this.setTelefone(telefone);
	}

	protected void cadastrarPessoa(String nome, String endereco, String telefone) {
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
	}
} 

