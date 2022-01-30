package FisicaJuridicaPessoa;

import java.sql.Date;

public class Cliente {

	private int idCliente;

	private Date dataCadastro;

	protected Juridica juridica;


	private void trocartelefone(String telefone)
	{
		this.juridica.trocarTelefonePessoa(telefone);
	}
}


