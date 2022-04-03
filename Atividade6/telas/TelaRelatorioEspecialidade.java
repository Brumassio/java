package telas;

import entidade.Especialidade;
import java.util.ArrayList;

public class TelaRelatorioEspecialidade {

    public TelaRelatorioEspecialidade(ArrayList<Especialidade> esp) {
        System.out.println("*******ESPECIALIDADES******");
        esp.forEach(i -> System.out.println("[" + Integer.toString(i.getIdEspecialidade()) + "]" + i.getNome()));
    }

}
