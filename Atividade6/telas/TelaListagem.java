package telas;

import controle.ControleAgenda;
import controle.ControleConsulta;
import controle.ControleConvenio;
import controle.ControleEspecialidade;
import controle.ControleMedicamento;
import controle.ControleMedico;
import controle.ControlePaciente;
import controle.ControleReceitaMedica;
import entidade.Agenda;
import entidade.Consulta;
import entidade.Convenio;
import entidade.Especialidade;
import entidade.Medicamento;
import entidade.Medico;
import entidade.Paciente;
import entidade.ReceitaMedica;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TelaListagem {

    public TelaListagem() throws IOException {
        Scanner sc = new Scanner(System.in);
        int r;
        
        System.out.println("\n*******LISTAGEM******\n");
        System.out.println("Digite 0 para listar as Especialidades");
        System.out.println("Digite 1 para listar os Medicos");
        System.out.println("Digite 2 para listar os Pacientes");
        System.out.println("Digite 3 para listar os Convenios");
        System.out.println("Digite 4 para listar as Agendas");
        System.out.println("Digite 5 para listar as Consultas");
        System.out.println("Digite 6 para listar as Receiras Médicas");
        System.out.println("Digite 7 para listar os Medicamentos");


        r = Integer.parseInt(sc.nextLine());
        
        if(r == 0){
            ArrayList<Especialidade> especialidade = new ArrayList<>();
            ControleEspecialidade controle = new ControleEspecialidade();
            especialidade = controle.lerArquivo("especialidade.txt", "//C://Users//Diogo Brumassio//Desktop//");
            new TelaRelatorioEspecialidade(especialidade);
        }else if(r == 1){
            ArrayList<Medico> medico = new ArrayList<>();
            ControleMedico controle = new ControleMedico();
            medico = controle.lerArquivo("medico.txt", "//C://Users//Diogo Brumassio//Desktop//");
            new TelaRelatorioMedico(medico);
        }else if(r == 2){
            ArrayList<Paciente> paciente = new ArrayList<>();
            ControlePaciente controle = new ControlePaciente();
            paciente = controle.lerArquivo("paciente.txt", "//C://Users//Diogo Brumassio//Desktop//");
            new TelaRelatorioPaciente(paciente);
        }else if(r == 3){
            ArrayList<Convenio> convenio = new ArrayList<>();
            ControleConvenio controle = new ControleConvenio();
            convenio = controle.lerArquivo("convenio.txt", "//C://Users//Diogo Brumassio//Desktop//");
            new TelaRelatorioConvenio(convenio);            
        }else if(r == 4){
            ArrayList<Agenda> agenda = new ArrayList<>();
            ControleAgenda controle = new ControleAgenda();
            agenda = controle.lerArquivo("convenio.txt", "//C://Users//Diogo Brumassio//Desktop//");
            new TelaRelatorioAgenda(agenda);            
        }else if(r == 5){
            ArrayList<Consulta> consulta = new ArrayList<>();
            ControleConsulta controle = new ControleConsulta();
            consulta = controle.lerArquivo("consulta.txt", "//C://Users//Diogo Brumassio//Desktop//");
            new TelaRelatorioConsulta(consulta);            
        }else if(r == 6){
            ArrayList<ReceitaMedica> receita = new ArrayList<>();
            ControleReceitaMedica controle = new ControleReceitaMedica();
            receita = controle.lerArquivo("receitamedica.txt", "//C://Users//Diogo Brumassio//Desktop//");
            new TelaRelatorioReceitaMedica(receita);        
        }else if(r == 7){
            ArrayList<Medicamento> medicamento = new ArrayList<>();
            ControleMedicamento controle = new ControleMedicamento();
            medicamento = controle.lerArquivo("receitamedica.txt", "//C://Users//Diogo Brumassio//Desktop//");
            new TelaRelatorioMedicamento(medicamento);                   
        }
        else {
            new TelaPrincipal();
        }
        new TelaPrincipal();
    }
}
