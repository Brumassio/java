package Atividade5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class ControleMedico {
    public ControleMedico(){
    }
    private File abrirArquivo(String nome, String path) throws IOException{
        
        String pathCompleto = path+nome;
        File arq = new File(pathCompleto);
        if(!arq.exists()){
            arq.createNewFile();
        }
        return arq;
    }
    
    public void gravarArquivo(TelaMedico dadoMedico) throws FileNotFoundException, IOException{
        
        File  arquivo = abrirArquivo("medico.csv", "//C://Users//Diogo Brumassio//Desktop//");
        FileWriter fw = new FileWriter(arquivo, true);
        BufferedWriter bw = new BufferedWriter(fw);
        Medico medico = new Medico(dadoMedico.getNome(),dadoMedico.getCrm(), dadoMedico.getEndereco(),dadoMedico.getEspecialidade());
        String medi = medico.getNome()+", "+medico.getCrm()+", "+medico.getEndereco()+", "+medico.getEspecialidade();
        bw.write(medi);
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