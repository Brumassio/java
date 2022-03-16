/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade5;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author guest-olovp2
 */
public class TelaEspecialidade {
        
    private int idEspecialidade;
    private String nome;
    
    public TelaEspecialidade(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome:");
        this.setNome(sc.nextLine());
        System.out.println("Digite o idEspecialidade:");
        this.setIdEspecialidade(Integer.parseInt(sc.nextLine()));
 
    }
    
    //////////////////////////////

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdEspecialidade() {
        return idEspecialidade;
    }

    public void setIdEspecialidade(int idEspecialidade) {
        this.idEspecialidade = idEspecialidade;
    }
    
    
}
