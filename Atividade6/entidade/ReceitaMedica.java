
package entidade;

import java.util.ArrayList;
import java.util.Date;


public class ReceitaMedica {
    private int idReceita;
    private int idConsulta;
    private String dataReceita;
    private String dataValidade;
    private ArrayList<ItemReceitaMedica> itemReceitaMedica;
    
    //////////////////////

    public ReceitaMedica(int idReceita, int idConsulta, String dataReceita, String dataValidade) {
        this.idReceita = idReceita;
        this.idConsulta = idConsulta;
        this.dataReceita = dataReceita;
        this.dataValidade = dataValidade;
    }


    
    
    public int getIdReceita() {
        return idReceita;
    }

    public void setIdReceita(int idReceita) {
        this.idReceita = idReceita;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getDataReceita() {
        return dataReceita;
    }

    public void setDataReceita(String dataReceita) {
        this.dataReceita = dataReceita;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public ArrayList<ItemReceitaMedica> getItemReceitaMedica() {
        return itemReceitaMedica;
    }

    public void setItemReceitaMedica(ArrayList<ItemReceitaMedica> itemReceitaMedica) {
        this.itemReceitaMedica = itemReceitaMedica;
    }
    
    
    
    
}
