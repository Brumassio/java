package FisicaJuridicaPessoa;

import java.sql.Date;

public class Juridica extends Pessoa {

	private String cnpj;

	private float receita;

	private Date dataAbertura;

	public  void setCnpj(String cnpj)
	{
		this.cnpj = cnpj;
	}

	public String getCnpj()
	{
		return cnpj;
	}

	
	public void cadastrarPessoaJuridica(String nome,String endereco, String telefone)
	{
		cadastrarPessoa(nome, endereco, telefone);
	}
}