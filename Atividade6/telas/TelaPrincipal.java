package telas;

import controle.ControleAgenda;
import controle.ControleConvenio;
import java.io.IOException;
import java.util.Scanner;

import controle.*;
import entidade.*;
import telas.*;

import java.util.ArrayList;

public class TelaPrincipal {
    ArrayList<Paciente> lista;
    ArrayList<Medico> lista2;
    ArrayList<Convenio> lista3;
    ArrayList<Agenda> lista4;
    ArrayList<Consulta> lista5;


    /////////////////////////////
    
    public TelaPrincipal() throws IOException {
        Scanner sc = new Scanner(System.in);
        int r;
        System.out.println("*******CADASTRO******");
        System.out.println("Digite 1 para cadastrar um Medico");
        System.out.println("Digite 2 para cadastrar um Paciente");
        System.out.println("Digite 3 para cadastrar uma Especialidade");
        System.out.println("Digite 4 para cadastrar um Medicamento");
        System.out.println("Digite 5 para listar as coisas");
        System.out.println("Digite 6 para cadastrar um Convenio");
        System.out.println("Digite 7 para cadastrar uma Agenda");
        System.out.println("Digite 8 para cadastrar uma Consulta");
        System.out.println("Digite 9 para cadastrar uma Receita Médica");


        System.out.println("Digite 0 para sair");
        r = Integer.parseInt(sc.nextLine());

        if (r == 1) {
            System.out.println("\n------ CADASTRANDO MÉDICO ------\n");
            ControleEspecialidade controle1 = new ControleEspecialidade();
            ArrayList<Especialidade> esps = new ArrayList<>();
            esps = controle1.lerArquivo("especialidade.txt", "/tmp/guest-trdwfl/Área de Trabalho/");
            TelaMedico tela = new TelaMedico(esps);
            ControleMedico controle2 = new ControleMedico();
            try {
                controle2.gravarArquivo(tela);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else if (r == 2) {
            System.out.println("\n------ CADASTRANDO PACIENTE ------\n");
            TelaPaciente tela = new TelaPaciente();
            ControlePaciente controle = new ControlePaciente();
            try {
                controle.gravarArquivo(tela);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else if (r == 3) {
            System.out.println("\n------ CADASTRANDO ESPECIALIDADE ------\n");
            TelaEspecialidade tela = new TelaEspecialidade();
            ControleEspecialidade controle = new ControleEspecialidade();
            try {
                controle.gravarArquivo(tela);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else if (r == 4) {
            System.out.println("\n------ CADASTRANDO MEDICAMENTO ------\n");
            TelaMedicamento tela = new TelaMedicamento();
            ControleMedicamento controle = new ControleMedicamento();
            try {
                controle.gravarArquivo(tela);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }else if(r == 5){
            new TelaListagem();
        }else if (r == 6){
            System.out.println("\n------ CADASTRANDO CONVÊNIO------\n");
            TelaConvenio tela = new TelaConvenio();
            ControleConvenio controle = new ControleConvenio();
            try {
                controle.gravarArquivo(tela);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }else if(r == 7){
            System.out.println("\n------ CADASTRANDO AGENDA------\n");
            ControlePaciente pac = new ControlePaciente();
            ControleMedico med = new ControleMedico();
            lista = pac.lerArquivo("pacientes.txt","/tmp/guest-trdwfl/Área de Trabalho/");
            lista2 = med.lerArquivo("medico.txt", "/tmp/guest-trdwfl/Área de Trabalho/");
            TelaAgenda tela = new TelaAgenda(lista2,lista);
            ControleAgenda controle = new ControleAgenda();
            try {
                controle.gravarArquivo(tela);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }else if(r == 8){
            System.out.println("\n------ CADASTRANDO CONSULTA------\n");
            ControleConvenio conv = new ControleConvenio();
            ControleAgenda age = new ControleAgenda();
            lista3 = conv.lerArquivo("convenio.txt", "/tmp/guest-trdwfl/Área de Trabalho/");
            lista4 = age.lerArquivo("agenda.txt", "/tmp/guest-trdwfl/Área de Trabalho/");
            TelaConsulta tela = new TelaConsulta(lista3,lista4);
            ControleConsulta controle = new ControleConsulta();
            try {
                controle.gravarArquivo(tela);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }       
        }else if (r == 9){
            System.out.println("\n------ CADASTRANDO RECEITA MÉDICA------\n");
            ControleConsulta controle1 = new ControleConsulta();
            lista5 = controle1.lerArquivo("consulta.txt","/tmp/guest-trdwfl/Área de Trabalho/");
            TelaReceitaMedica tela = new TelaReceitaMedica(lista5);
            ControleReceitaMedica controle = new ControleReceitaMedica();
            try {
                controle.gravarArquivo(tela);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }            
        }
        else if (r == 0) {
            System.exit(0);
        } else {
            new TelaPrincipal();
        }

        new TelaPrincipal();

    }
}