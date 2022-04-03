/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telas;

import entidade.Agenda;
import java.util.ArrayList;

/**
 *    private int idPaciente;
    private int idMedico;
    private String data;
    private String horario;
 * @author Diogo Brumassio
 */
public class TelaRelatorioAgenda {
    public TelaRelatorioAgenda(ArrayList<Agenda> agend) {
        System.out.println("*******ESPECIALIDADES******");
        agend.forEach(i -> System.out.println( "IdPaciente: "+Integer.toString(i.getIdPaciente()) +" IdMedico: "+ Integer.toString(i.getIdMedico()) + " Data: "+ i.getData()+" Horario: "+ i.getHorario()));
        
    }
}
