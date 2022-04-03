/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import entidade.ItemReceitaMedica;
import entidade.Medicamento;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Diogo Brumassio
 */
public class ControleItemReceitaMedica {
    private ArrayList<Medicamento> listinha;
    private ArrayList<ItemReceitaMedica> listinha2;
    private int qtde;
    private int aux;
   
  
    public ArrayList<ItemReceitaMedica> retornaItem() throws IOException{
        ControleMedicamento control = new ControleMedicamento();
        listinha = control.lerArquivo("medicamento.txt", "//C:/Users//Diogo Brumassio//Desktop//");
        listinha2 = new ArrayList<>();
        aux = listinha.size();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<aux;i++){
            System.out.println("Digite a quantidade do medicamento "+ listinha.get(i).getNome());
            qtde = Integer.parseInt(sc.nextLine());
            listinha2.add(new ItemReceitaMedica(i,listinha.get(i),qtde));
        }
        return listinha2;
        
    }
        
}
