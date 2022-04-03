package telas;

import java.io.IOException;
import java.util.Scanner;

import controle.ControleEspecialidade;
import entidade.Especialidade;
import java.util.ArrayList;

public class TelaMedico {
	private String crm;
	private String nome;
	private String endereco;
	private int idEspecialidade;

	public TelaMedico(ArrayList<Especialidade> especialidades) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome:");
		this.setNome(sc.nextLine());
		System.out.println("Digite o CRM:");
		this.setCrm(sc.nextLine());
		System.out.println("Digite o endereco:");
		this.setEndereco(sc.nextLine());
		new TelaRelatorioEspecialidade(especialidades);
		System.out.println("Digite id da especialidade:");
		this.setIdEspecialidade(Integer.parseInt(sc.nextLine()));
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdEspecialidade() {
		return idEspecialidade;
	}

	public void setIdEspecialidade(int idEspecialidade) {
		this.idEspecialidade = idEspecialidade;
	}

}
