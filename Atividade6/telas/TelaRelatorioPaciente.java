package telas;

import entidade.Paciente;
import java.util.ArrayList;

public class TelaRelatorioPaciente {

    public TelaRelatorioPaciente(ArrayList<Paciente> pac) {
        System.out.println("*******PACIENTES******");
        pac.forEach(i -> System.out.println(i.getNome() +" "+ i.getCpf()+""+ i.getEndereco()+" "+i.getTelefone()+" "+Float.toString(i.getAltura())+ Float.toString(i.getPeso())+" "+Integer.toString(i.getIdade())));
    }

}
