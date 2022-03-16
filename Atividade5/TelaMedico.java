/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade5;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author guest-pe84ue
 */
public class TelaMedico {
    private String crm;
    private String nome;
    private String endereco;
    private String especialidade;
    
    public TelaMedico()throws IOException{ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome:");
        this.setNome(sc.nextLine());
        System.out.println("Digite o CRM:");
        this.setCrm(sc.nextLine());
        System.out.println("Digite o endereco:");
        this.setEndereco(sc.nextLine());
        System.out.println("\n");
        ControleEspecialidade esp  = new ControleEspecialidade();
        esp.lerArquivo("especialidade.csv", "//C://Users//Diogo Brumassio//Desktop//");
        System.out.println("Digite o ID da especialidade escolhida:");
        this.setEspecialidade(sc.nextLine());
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
