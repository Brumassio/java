/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade5;

/**
 *
 * @author guest-pe84ue
 */
public class Medico {
    private String crm;
    private String nome;
    private String endereco;
    private String especialidade;

    public Medico(String crm, String nome, String endereco, String especialidade) {
        this.crm = crm;
        this.nome = nome;
        this.endereco = endereco;
        this.especialidade = especialidade;
    }

    Medico() {
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