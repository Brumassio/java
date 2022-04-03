
package entidade;

public class ItemReceitaMedica {
    private int idItem;
    private Medicamento  medicamento;
    private int quantidade;
    
    /////////////////////

    public ItemReceitaMedica(int idItem, Medicamento medicamento, int quantidade) {
        this.idItem = idItem;
        this.medicamento = medicamento;
        this.quantidade = quantidade;
    }

    ItemReceitaMedica() {
    }

     
    
    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }


    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
