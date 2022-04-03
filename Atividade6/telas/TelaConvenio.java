/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telas;

import java.util.Scanner;

/**
 *
 * @author Diogo Brumassio
 */
public class TelaConvenio {
    private int idConvenio;
    private String nomeConvenio;
    
    /////////////////

    public TelaConvenio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o idConvenio: ");
        this.setIdConvenio(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o nomeConvenio: ");
        this.setNomeConvenio(sc.nextLine());
    }
    
    
    
    public int getIdConvenio() {
        return idConvenio;
    }

    public void setIdConvenio(int idConvenio) {
        this.idConvenio = idConvenio;
    }

    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public void setNomeConvenio(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }
    
}
