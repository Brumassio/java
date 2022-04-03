/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.util.Scanner;

/**
 *
 * @author guest-qqsnvi
 */
public class TelaMedicamento {
     private int idMedicamento;
    private String nome;
    
    public TelaMedicamento() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome:");
        this.setNome(sc.nextLine());
        System.out.println("Digite o idMedicamento:");
        this.setIdMedicamento(Integer.parseInt(sc.nextLine()));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }
    
    
}
