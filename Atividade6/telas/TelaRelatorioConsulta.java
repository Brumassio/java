/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telas;

import entidade.Consulta;
import java.util.ArrayList;

/**
 *
 * @author Diogo Brumassio
 *     private int idConsulta;
    private String data;
    private int idConvenio;
    private String horario;
    private float duracao;
    private int idAgenda;
    private boolean  primeiraConsulta;
 */
public class TelaRelatorioConsulta {
    public TelaRelatorioConsulta(ArrayList<Consulta> consultas) {
        System.out.println("\n*******CONSULTAS******");
        consultas.forEach(i -> System.out.println("[" + Integer.toString(i.getIdConsulta()) + "] Data: " + i.getData()+ " IdConvenio: "+Integer.toString(i.getIdConvenio())+
                " Horario: "+i.getHorario()+" Duração: "+ i.getDuracao()+" IdAgenda: "+Integer.toString(i.getIdAgenda())+" PrimeiraConsulta: "+Boolean.toString(i.getPrimeiraConsulta())));
    }
}
