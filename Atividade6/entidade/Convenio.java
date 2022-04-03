
package entidade;


public class Convenio {
    private int idConvenio;
    private String nomeConvenio;
    
    /////////////////

    public Convenio(int idConvenio, String nomeConvenio) {
        this.idConvenio = idConvenio;
        this.nomeConvenio = nomeConvenio;
    }
    
    
    
    public int getIdConvenio() {
        return idConvenio;
    }

    public void setIdConvenio(int idConvenio) {
        this.idConvenio = idConvenio;
    }

    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public void setNomeConvenio(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }
    
    
    
}
