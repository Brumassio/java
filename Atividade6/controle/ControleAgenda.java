/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import entidade.Agenda;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import telas.TelaAgenda;
import telas.TelaConsulta;

/**
 *
 * @author Diogo Brumassio
 */
public class ControleAgenda {
    private Agenda agenda;
    private File f;
    private FileWriter fw;
    private BufferedWriter bw;
    private FileReader fr;
    private BufferedReader br;

    private void abrirArquivo(String nome, String path) throws IOException {

        String pathCompleto = path + nome;
        f = new File(pathCompleto);
        if (!f.exists()) {
            f.createNewFile();
        }
    }

    public void gravarArquivo(TelaAgenda dadoAge) throws FileNotFoundException, IOException {

        abrirArquivo("agenda.txt", "//C:/Users//Diogo Brumassio//Desktop//");
        fw = new FileWriter(f, true);
        bw = new BufferedWriter(fw);
        agenda = new Agenda(dadoAge.getIdPaciente(), dadoAge.getIdMedico(), dadoAge.getData(), dadoAge.getHorario());
        
        
        String agendastring = agenda.getIdPaciente()+", "+agenda.getIdMedico()+", "+agenda.getData()+", "+agenda.getHorario();
        bw.write(agendastring);
        bw.newLine();
        bw.close();
        fecharArquivo();

    }

    public ArrayList lerArquivo(String nomeArq, String path) throws IOException {
        String linha = "";
        abrirArquivo(nomeArq, path);
        fr = new FileReader(f);
        br = new BufferedReader(fr);
        ArrayList<Agenda> agends = new ArrayList<>();
        while ((linha = br.readLine()) != null) {
            String[] dados = linha.split(",");
            agenda = new Agenda(Integer.parseInt(dados[0]),Integer.parseInt(dados[1]), dados[3], dados[4]);
            agends.add(agenda);
        }

        br.close();
        fr.close();
        return agends;
    }

    public void fecharArquivo() throws IOException {
        if (f.exists()) {
            bw.close();
            fw.close();
        }
    }    
}
