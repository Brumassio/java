
package entidade;


public class Exame {
    private int idExame;
    private String descricaoExame;
    
    //////////////////////

    public Exame(int idExame, String descricaoExame) {
        this.idExame = idExame;
        this.descricaoExame = descricaoExame;
    }
    

    public int getIdExame() {
        return idExame;
    }

    public void setIdExame(int idExame) {
        this.idExame = idExame;
    }

    public String getDescricaoExame() {
        return descricaoExame;
    }

    public void setDescricaoExame(String descricaoExame) {
        this.descricaoExame = descricaoExame;
    }
    
    
}
