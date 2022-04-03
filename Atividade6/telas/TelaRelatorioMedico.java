package telas;

import entidade.Medico;
import java.util.ArrayList;

public class TelaRelatorioMedico {

    public TelaRelatorioMedico(ArrayList<Medico> med) {
        System.out.println("*******MEDICOS******");
        med.forEach(i -> System.out.println(i.getNome() +" "+ i.getCrm()+" "+ i.getEndereco()+" "+ Integer.toString(i.getIdEspecialidade())));
        
    }
}
