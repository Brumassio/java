
package entidade;

import javax.xml.crypto.Data;


public class Agenda {
    private int idPaciente;
    private int idMedico;
    private String data;
    private String horario;
    
    ///////////////////////

    public Agenda(int idPaciente, int idMedico, String data, String horario) {
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.data = data;
        this.horario = horario;
    }
    

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
      
    public void agendarConsulta(Medico med,Paciente pac,Data data,String horario)
    {
        
    }
}
