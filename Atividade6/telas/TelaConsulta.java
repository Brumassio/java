/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telas;

import entidade.Agenda;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import entidade.Convenio;

/**
 *
 * @author Diogo Brumassio
 */
public class TelaConsulta {
    private int idConsulta;
    private String data;
    private int idConvenio;
    private String horario;
    private float duracao;
    private int idAgenda;
    private boolean  primeiraConsulta;
    
    //////////////////////////////

    public TelaConsulta(ArrayList<Convenio> convenios, ArrayList<Agenda> agendas) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o idConsulta:");
        this.setIdConsulta(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a data: ");
        this.setData(sc.nextLine());
        new TelaRelatorioConvenio(convenios);
        System.out.println("Digite o idConvenio:");
        this.setIdConvenio(Integer.parseInt(sc.nextLine()));
        new TelaRelatorioAgenda(agendas);
        System.out.println("Digite o idAgenda");
        this.setIdAgenda(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o horario:");
        this.setHorario(sc.nextLine());
        System.out.println("Digite a duração :");
        this.setDuracao(Float.parseFloat(sc.nextLine()));
        System.out.println("É sua primeira consulta?? (TRUE OR FALSE)");
        this.setPrimeiraConsulta(Boolean.getBoolean(sc.nextLine()));
        
    }

    public int getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(int idAgenda) {
        this.idAgenda = idAgenda;
    }
    
    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getIdConvenio() {
        return idConvenio;
    }

    public void setIdConvenio(int idConvenio) {
        this.idConvenio = idConvenio;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public boolean getPrimeiraConsulta() {
        return primeiraConsulta;
    }

    public void setPrimeiraConsulta(boolean primeiraConsulta) {
        this.primeiraConsulta = primeiraConsulta;
    }
    
}
