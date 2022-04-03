/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telas;

import entidade.Convenio;
import java.util.ArrayList;

/**
 *
 * @author Diogo Brumassio
 */
public class TelaRelatorioConvenio {
    public TelaRelatorioConvenio(ArrayList<Convenio> conv) {
        System.out.println("*******ESPECIALIDADES******");
        conv.forEach(i -> System.out.println("[" + Integer.toString(i.getIdConvenio()) + "]" + i.getNomeConvenio()));
    }
}
