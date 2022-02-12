package Atividade2;

public class Relatorio {
    public static void LeiaMedicoComPaciente(Medico m1, Paciente p1)
    {
        System.out.println("-----------------MEDICO--------------------");
        System.out.println("Nome :"+ m1.getNome());
        System.out.println("Telefone :"+ m1.getTelefone());
        System.out.println("Endereço :"+ m1.getEndereco());
        System.out.println("crm : :"+ m1.getCrm());
        System.out.println("Especialidade:"+ m1.getEspecialidade());

        System.out.println();

        System.out.println("-------------------PACIENTE------------------");
        System.out.println("Nome :"+ p1.getNome());
        System.out.println("Telefone:"+ p1.getTelefone());
        System.out.println("Endereço :"+ p1.getEndereco());
        System.out.println("ID Convenio :"+ p1.getIdConvenio());
        System.out.println("Peso :"+ p1.getPeso());
        System.out.println("Idade :"+ p1.getIdade());
        System.out.println("Altura :"+ p1.getAltura());
    }
}
