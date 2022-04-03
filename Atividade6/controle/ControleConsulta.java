/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import entidade.Consulta;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import telas.TelaConsulta;
import telas.TelaEspecialidade;

/**
 *
 * @author Diogo Brumassio
 */
public class ControleConsulta {
    private Consulta consulta;
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

    public void gravarArquivo(TelaConsulta dadoConsul) throws FileNotFoundException, IOException {

        abrirArquivo("consulta.txt", "//C:/Users//Diogo Brumassio//Desktop//");
        fw = new FileWriter(f, true);
        bw = new BufferedWriter(fw);
        //idConsulta, String data, int idConvenio, String horario, float duracao, int idAgenda, boolean primeiraConsulta
        Consulta consul = new Consulta(dadoConsul.getIdConsulta(),dadoConsul.getData(), dadoConsul.getIdConvenio(), dadoConsul.getHorario(),dadoConsul.getDuracao(),
                dadoConsul.getIdAgenda(), dadoConsul.getPrimeiraConsulta());
        
        
        String consultastring = consul.getIdConsulta()+ ", " + consul.getData()+ ", "+ consul.getIdConvenio()+", "+ consul.getHorario()+", "+consul.getDuracao()+ ", "+consul.getIdAgenda()+", "+consul.getPrimeiraConsulta();
        bw.write(consultastring);
        bw.newLine();
        bw.close();
        fecharArquivo();

    }

    public ArrayList lerArquivo(String nomeArq, String path) throws IOException {
        String linha = "";
        abrirArquivo(nomeArq, path);
        fr = new FileReader(f);
        br = new BufferedReader(fr);
        ArrayList<Consulta> consuls = new ArrayList<>();
        while ((linha = br.readLine()) != null) {
            String[] dados = linha.split(",");
            consulta = new Consulta(Integer.parseInt(dados[0]), dados[1], Integer.parseInt(dados[2]), dados[3],Float.parseFloat(dados[4]),Integer.parseInt(dados[5]),Boolean.getBoolean(dados[6]));
            consuls.add(consulta);
        }

        br.close();
        fr.close();
        return consuls;
    }

    public void fecharArquivo() throws IOException {
        if (f.exists()) {
            bw.close();
            fw.close();
        }
    }
}
