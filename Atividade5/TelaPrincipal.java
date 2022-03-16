package Atividade5;

import java.io.IOException;
import java.util.Scanner;

public class TelaPrincipal {
    public TelaPrincipal() throws IOException{
        Scanner sc = new Scanner(System.in);
        String r,r2;
        System.out.println("*******CADASTRO******");
        System.out.println("Digite 1 para cadastrar um Medico");
        System.out.println("Digite 2 para cadastrar um Paciente");
        System.out.println("Digite 3 para cadastrar uma Especialidade");
        System.out.println("Digite 4 para listar as especialidades");
        System.out.println("Digite 0 para sair");
        r= sc.nextLine();
        
        
        if (r.equals("1")) {
        System.out.println("\n$$$$$$$$$$$$ CADASTRANDO MÉDICO $$$$$$$$$$$\n");
        TelaMedico tela = new TelaMedico();
        //Medico medico = new Medico();
        ControleMedico controle = new ControleMedico();
        controle.gravarArquivo(tela);
        }
        else if (r.equals("2")) {
        System.out.println("\n$$$$$$$$$$$$ CADASTRANDO PACIENTE $$$$$$$$$$$\n");
        TelaPaciente tela = new TelaPaciente();
        //Paciente paciente = new Paciente();
        ControlePaciente controle = new ControlePaciente();
        controle.gravarArquivo(tela);
        }
        else if (r.equals("3")) {
        System.out.println("\n$$$$$$$$$$$$ CADASTRANDO ESPECIALIDADE $$$$$$$$$$$\n");
        TelaEspecialidade tela = new TelaEspecialidade();
        //Especialidade espec = new Especialidade();
        ControleEspecialidade controle = new ControleEspecialidade();
        controle.gravarArquivo(tela);
        }
        else if (r.equals("4")){
            //TelaRelatorio oi = new TelaRelatorio();
            ControleEspecialidade controle2 = new ControleEspecialidade();
            System.out.println("Digite o nome do arquivo a ser lido");
            r2= sc.nextLine();
            controle2.lerArquivo(r2, "//C://Users//Diogo Brumassio//Desktop//");
        }        
        else if (r.equals("0")){
            System.exit(0);
        }
        else{
            new TelaPrincipal();
        }
        new TelaPrincipal();
        
    }
}
