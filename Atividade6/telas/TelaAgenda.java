/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telas;

import entidade.Medico;
import entidade.Paciente;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.crypto.Data;

/**
 *
 * @author Diogo Brumassio
 */
public class TelaAgenda {
    private int idPaciente;
    private int idMedico;
    private String data;
    private String horario;
    
    ///////////////////////

    public TelaAgenda(ArrayList<Medico> medicos, ArrayList<Paciente> pacientes) {
        Scanner sc = new Scanner(System.in);
        new TelaRelatorioPaciente(pacientes);
        System.out.println("Digite o idPaciente:");
        this.setIdPaciente(Integer.parseInt(sc.nextLine()));
        new TelaRelatorioMedico(medicos);
        System.out.println("Digite o idMedico:");
        this.setIdMedico(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a data:");
        this.setData(sc.nextLine());
        System.out.println("Digite o horário:");
        this.setHorario(sc.nextLine());

    }

    
    

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
      
}
