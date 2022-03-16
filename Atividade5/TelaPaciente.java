package Atividade5;

import java.util.Scanner;


public class TelaPaciente {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private float peso;
    private float altura;
    private int idade;
    
    ////////////////////////

    public TelaPaciente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome:");
        this.setNome(sc.nextLine());
        System.out.println("Digite o Cpf:");
        this.setCpf(sc.nextLine());
        System.out.println("Digite o endereco:");
        this.setEndereco(sc.nextLine());
        System.out.println("Digite o telefone:");
        this.setTelefone(sc.nextLine());
        System.out.println("Digite o peso:");
        this.setPeso(sc.nextFloat());
        sc.nextLine();
        System.out.println("Digite o altura:");
        this.setAltura(sc.nextFloat());
        sc.nextLine();
        System.out.println("Digite o idade:");
        this.setIdade(sc.nextInt());

    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    private void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    
    
}