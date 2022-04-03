/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.io.*;
import java.util.*;
import entidade.Convenio;
import telas.TelaConvenio;
/**
 *
 * @author Diogo Brumassio
 */
public class ControleConvenio {
    private Convenio convenio;
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

    public void gravarArquivo(TelaConvenio dadoEsp) throws FileNotFoundException, IOException {

        abrirArquivo("convenio.txt", "//C:/Users//Diogo Brumassio//Desktop//");
        fw = new FileWriter(f, true);
        bw = new BufferedWriter(fw);
        Convenio conv = new Convenio(dadoEsp.getIdConvenio(), dadoEsp.getNomeConvenio());
        String esp = conv.getIdConvenio() + ", " + conv.getNomeConvenio();
        bw.write(esp);
        bw.newLine();
        bw.close();
        fecharArquivo();

    }

    public ArrayList lerArquivo(String nomeArq, String path) throws IOException {
        String linha = "";
        abrirArquivo(nomeArq, path);
        fr = new FileReader(f);
        br = new BufferedReader(fr);
        ArrayList<Convenio> esps = new ArrayList<>();
        while ((linha = br.readLine()) != null) {
            String[] dados = linha.split(",");
            convenio = new Convenio(Integer.parseInt(dados[0]), dados[1]);
            esps.add(convenio);
        }

        br.close();
        fr.close();
        return esps;
    }

    public void fecharArquivo() throws IOException {
        if (f.exists()) {
            bw.close();
            fw.close();
        }
    }
}
