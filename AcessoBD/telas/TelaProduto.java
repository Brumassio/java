/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.util.Scanner;

/**
 *
 * @author guest-44bnxg
 */
public class TelaProduto {
    private int id;
    private String nome;
    private String descricao;
    private int codBarras;
    private String categoria;
    private int quantidade;
    private double valor;

    public TelaProduto() {
        this.desenhaTela();
    }
    
    
    ///////////////////////////////////
    
    private void desenhaTela(){
        Scanner sc = new Scanner(System.in);
        System.out.println("****************************");
        System.out.println("*** CADASTRO DE PRODUTOS **");
        System.out.println("****************************");
        System.out.println("ID :");
        setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Descrição: ");
        setDescricao(sc.nextLine());
        System.out.println("Cod. Barras");
        setCodBarras(Integer.parseInt(sc.nextLine()));
        System.out.println("Categoria: ");
        setCategoria(sc.nextLine());
        System.out.println("Quantidade: ");
        setQuantidade(Integer.parseInt(sc.nextLine()));
        System.out.println("Valor: ");
        setValor(Double.parseDouble(sc.nextLine()));
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(int codBarras) {
        this.codBarras = codBarras;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
    
    
    
    
    
}
