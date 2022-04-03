/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telas;

import entidade.Medicamento;
import java.util.ArrayList;

/**
 *
 * @author Diogo Brumassio
 */
public class TelaRelatorioMedicamento {
        public TelaRelatorioMedicamento(ArrayList<Medicamento> med) {
        System.out.println("\n*******MEDICAMENTOS******");
        med.forEach(i -> System.out.println("[" + Integer.toString(i.getIdMedicamento()) + "]" + i.getNome()));
        System.out.println("\n");
    }
}
