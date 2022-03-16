package Atividade5;


public class Paciente extends Pessoa{
    private float peso;
    private float altura;
    private int idade;
    
    //////////////////
    
    public Paciente(String nome, String cpf,String endereco,String telefone,float peso, float altura, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
        
    }

    Paciente() {
        
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
     
}