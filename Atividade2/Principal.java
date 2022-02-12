package Atividade2;

import java.util.Scanner;

class Principall { 

    public static void main(String[] args) {
        
        Medico m1 = new Medico();
        Paciente p1 = new Paciente();
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Digite os Dados do Médico !!! ");
        EntradaDeTela.RecebeMedico(m1,sc);
        System.out.println("\n\nDigite os Dados do Paciente !!! \n");
        EntradaDeTela.RecebePaciente(p1, sc);
        Relatorio.LeiaMedicoComPaciente(m1, p1);


    }

    
    }
