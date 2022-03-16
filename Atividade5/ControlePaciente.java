package Atividade5;

import java.io.*;


public class ControlePaciente {

    public ControlePaciente() {
    }
    
    private File abrirArquivo(String nome, String path) throws IOException{
        
        String pathCompleto = path+nome;
        File arq = new File(pathCompleto);
        if(!arq.exists()){
            arq.createNewFile();
        }
        return arq;
    }
    
    public void gravarArquivo(TelaPaciente dadoPaciente) throws FileNotFoundException, IOException{
        
        File  arquivo = abrirArquivo("Paciente.csv", "//C://Users//Diogo Brumassio//Desktop//");
        FileWriter fw = new FileWriter(arquivo, true);
        BufferedWriter bw = new BufferedWriter(fw);
        Paciente paciente = new Paciente(dadoPaciente.getNome(),dadoPaciente.getCpf(), dadoPaciente.getEndereco(),dadoPaciente.getTelefone(), dadoPaciente.getPeso(), dadoPaciente.getAltura(),dadoPaciente.getIdade());
        String paci = paciente.getNome()+", "+paciente.getCpf()+", "+paciente.getEndereco()+", "+paciente.getTelefone()+", "+paciente.getPeso()+", " + paciente.getAltura() + ", " + paciente.getIdade();
        bw.write(paci);
        bw.newLine();
        bw.close();
        fecharArquivo(arquivo, fw, bw);
        
    }
    
    public void fecharArquivo(File arquivo,FileWriter fw,BufferedWriter bw) throws IOException{
        if(arquivo.exists()){
            bw.close();
            fw.close();
        }
    }
}