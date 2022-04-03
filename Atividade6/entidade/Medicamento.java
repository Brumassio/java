
package entidade;


public class Medicamento {
    private int idMedicamento;
    private String nome;

    public Medicamento(int idMedicamento, String nome) {
        this.idMedicamento= idMedicamento;
        this.nome = nome;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
}
