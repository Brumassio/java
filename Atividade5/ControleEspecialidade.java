/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade5;

import java.io.*;

/**
 *
 * @author guest-olovp2
 */
public class ControleEspecialidade {
    private File abrirArquivo(String nome, String path) throws IOException{
        
        String pathCompleto = path+nome;
        File arq = new File(pathCompleto);
        if(!arq.exists()){
            arq.createNewFile();
        }
        return arq;
    }
    
    public  void gravarArquivo(TelaEspecialidade dadoEsp) throws FileNotFoundException, IOException{
        
        File  arquivo = abrirArquivo("especialidade.csv", "//C://Users//Diogo Brumassio//Desktop//");
        FileWriter fw = new FileWriter(arquivo, true);
        BufferedWriter bw = new BufferedWriter(fw);
        Especialidade espec = new Especialidade(dadoEsp.getIdEspecialidade(),dadoEsp.getNome());
        String esp = espec.getNome()+", "+ espec.getIdEspecialidade();
        bw.write(esp);
        bw.newLine();
        bw.close();
        fecharArquivo(arquivo, fw, bw);
        
    }
    
    public  void lerArquivo(String nomeArq,String path) throws IOException{
       String linha="";
        System.out.println("\n&&&&&&&&&& LISTANDO AS ESPECIALIDADES &&&&&&&&&&\n");
       File arq =  abrirArquivo(nomeArq, path);
       FileReader fr = new FileReader(arq);
       BufferedReader br = new BufferedReader(fr);
       while((linha = br.readLine()) != null){
           String [] dados = linha.split(",");
           System.out.println(dados[1]+" "+dados[0]);
       } 
       br.close();
       fr.close();
    }
    
    public void fecharArquivo(File arquivo,FileWriter fw,BufferedWriter bw) throws IOException{
        if(arquivo.exists()){
            bw.close();
            fw.close();
        }
    }
}
