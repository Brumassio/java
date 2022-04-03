
package entidade;

import java.util.Date;


public class Consulta {
    private int idConsulta;
    private String data;
    private int idConvenio;
    private String horario;
    private float duracao;
    private int idAgenda;
    private boolean  primeiraConsulta;
    
    //////////////////////////////

    public Consulta(int idConsulta, String data, int idConvenio, String horario, float duracao, int idAgenda, boolean primeiraConsulta) {
        this.idConsulta = idConsulta;
        this.data = data;
        this.idConvenio = idConvenio;
        this.horario = horario;
        this.duracao = duracao;
        this.idAgenda = idAgenda;
        this.primeiraConsulta = primeiraConsulta;
    }

    
    public Consulta(Agenda agenda, Convenio convenio) {
    }
    
    
    

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getIdConvenio() {
        return idConvenio;
    }

    public void setIdConvenio(int idConvenio) {
        this.idConvenio = idConvenio;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public boolean getPrimeiraConsulta() {
        return primeiraConsulta;
    }

    public void setPrimeiraConsulta(boolean primeiraConsulta) {
        this.primeiraConsulta = primeiraConsulta;
    }

    public int getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(int idAgenda) {
        this.idAgenda = idAgenda;
    }
      
    
}
