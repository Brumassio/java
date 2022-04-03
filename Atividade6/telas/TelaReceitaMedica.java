/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telas;

import controle.ControleItemReceitaMedica;
import entidade.Consulta;
import entidade.ItemReceitaMedica;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Diogo Brumassio
 */
public class TelaReceitaMedica {
    private int idReceita;
    private int idConsulta;
    private String dataReceita;
    private String dataValidade;
    private ArrayList<ItemReceitaMedica> itemReceitaMedica = new ArrayList<>();
    private ControleItemReceitaMedica item;
    
    //////////////////////

    public TelaReceitaMedica(ArrayList<Consulta> consultas) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o idReceita: ");
        this.setIdReceita(Integer.parseInt(sc.nextLine()));
        new TelaRelatorioConsulta(consultas);
        System.out.println("Digite o idConsulta: ");
        this.setIdConsulta(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a Data da Receita");
        this.setDataReceita(sc.nextLine());
        System.out.println("Digite a Data de Validade");
        this.setDataValidade(sc.nextLine());
        System.out.println("COLOCANDO OS ITENS RECEITA !!");
        item = new ControleItemReceitaMedica();
        itemReceitaMedica = item.retornaItem();
    }
    
    
    public int getIdReceita() {
        return idReceita;
    }

    public void setIdReceita(int idReceita) {
        this.idReceita = idReceita;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getDataReceita() {
        return dataReceita;
    }

    public void setDataReceita(String dataReceita) {
        this.dataReceita = dataReceita;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade( String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public ArrayList<ItemReceitaMedica> getItemReceitaMedica() {
        return itemReceitaMedica;
    }

    public void setItemReceitaMedica(ArrayList<ItemReceitaMedica> itemReceitaMedica) {
        this.itemReceitaMedica = itemReceitaMedica;
    }
    
}
