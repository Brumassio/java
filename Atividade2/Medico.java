package Atividade2;

public class Medico extends Pessoa {
    private String crm;
    private String especialidade;

    
    public Medico(String telefone, String nome, String endereco,String crm, String especialidade) {
        this.telefone = telefone;
        this.nome = nome;
        this.endereco= endereco;
        this.crm = crm;
        this.especialidade = especialidade;
    }
    
    public Medico()
    {
    }
    //////////////////////////////

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
   
    
}

