package Atividade2;
import java.util.Scanner;
public class EntradaDeTela {
    
    public static void RecebeMedico(Medico m1,Scanner sc)
    {
        System.out.println("Digite o nome do médico:");
        m1.setNome(sc.nextLine());
        System.out.println("Digite o telefone do médico:");
        m1.setTelefone(sc.nextLine());
        System.out.println("Digite o Endereco do médico:");
        m1.setEndereco(sc.nextLine());
        System.out.println("Digite o crm do médico:");
        m1.setCrm(sc.nextLine());
        System.out.println("Digite a especialização do médico:");
        m1.setEspecialidade(sc.nextLine());
    }

    public static void RecebePaciente(Paciente p1,Scanner sc)
    {
        System.out.println("Digite o nome do Paciente:");
        p1.setNome(sc.nextLine());
        System.out.println("Digite o telefone do Paciente:");
        p1.setTelefone(sc.nextLine());
        System.out.println("Digite o Endereco do Paciente:");
        p1.setEndereco(sc.nextLine());
        System.out.println("Digite o id do Convencio  do Paciente:");
        p1.setIdConvenio(sc.nextLine());
        System.out.println("Digite a idade do Paciente:");
        p1.setIdade(sc.nextInt());
        System.out.println("Digite o peso do Paciente:");
        p1.setPeso(sc.nextFloat());
        sc.nextLine();
        System.out.println("Digite a altura do Paciente:");
        p1.setAltura(sc.nextFloat());
        

    }
}
