package Atividade2;

public class Paciente extends Pessoa {
    private String idConvenio;
    private float peso;
    private int idade;
    private float altura;

    public Paciente(String telefone, String nome, String endereco,String idConvenio, float peso, int idade, float altura) {
        this.telefone = telefone;
        this.nome = nome;
        this.endereco= endereco;
        this.idConvenio = idConvenio;
        this.peso = peso;
        this.idade = idade;
        this.altura = altura;

    }
    
    
    public Paciente()
    {
        
    }
    
    //////////////////////////////////

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getIdConvenio() {
        return idConvenio;
    }

    public void setIdConvenio(String idConvenio) {
        this.idConvenio = idConvenio;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
}
