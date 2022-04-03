/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telas;

import entidade.ReceitaMedica;
import java.util.ArrayList;

/**
 *
 * @author Diogo Brumassio
 *     private int idReceita;
    private int idConsulta;
    private Date dataReceita;
    private Date dataValidade;
    private ArrayList<ItemReceitaMedica> itemReceitaMedica = new ArrayList<>();
 */
public class TelaRelatorioReceitaMedica {
    public TelaRelatorioReceitaMedica(ArrayList<ReceitaMedica> receiMed) {
        System.out.println("*******ESPECIALIDADES******");
        receiMed.forEach(i -> System.out.println("[" + Integer.toString(i.getIdReceita()) + "] IdConsulta: "
                + Integer.toString(i.getIdConsulta())+" DataReceita: "+i.getDataReceita()+" DataValidade: "+i.getDataValidade()+" QTDE de Itens Receita: "+Integer.toString(i.getItemReceitaMedica().size())));
    }
}
