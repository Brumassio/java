/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Medicamento;
import java.io.*;
import java.util.ArrayList;
import telas.TelaMedicamento;

/**
 *
 * @author guest-sookmr
 */
public class ControleMedicamento {
    private Medicamento medicamento;
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

    public void gravarArquivo(TelaMedicamento dadoMed) throws FileNotFoundException, IOException {

        abrirArquivo("medicamento.txt", "//C:/Users//Diogo Brumassio//Desktop//");
        fw = new FileWriter(f, true);
        bw = new BufferedWriter(fw);
        Medicamento espec = new Medicamento(dadoMed.getIdMedicamento(), dadoMed.getNome());
        String esp = espec.getIdMedicamento() + ", " + espec.getNome();
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
        ArrayList<Medicamento> med = new ArrayList<>();
        while ((linha = br.readLine()) != null) {
            String[] dados = linha.split(", ");
            medicamento = new Medicamento(Integer.parseInt(dados[0]), dados[1]);
            med.add(medicamento);
        }

        br.close();
        fr.close();
        return med;
    }

    public void fecharArquivo() throws IOException {
        if (f.exists()) {
            bw.close();
            fw.close();
        }
    }
}
