package controle;

import java.io.*;
import java.util.ArrayList;

import entidade.Especialidade;
import telas.TelaEspecialidade;
import telas.TelaRelatorioEspecialidade;

public class ControleEspecialidade {

    private Especialidade especialidade;
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

    public void gravarArquivo(TelaEspecialidade dadoEsp) throws FileNotFoundException, IOException {

        abrirArquivo("especialidade.txt", "//C:/Users//Diogo Brumassio//Desktop//");
        fw = new FileWriter(f, true);
        bw = new BufferedWriter(fw);
        Especialidade espec = new Especialidade(dadoEsp.getIdEspecialidade(), dadoEsp.getNome());
        String esp = espec.getIdEspecialidade() + ", " + espec.getNome();
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
        ArrayList<Especialidade> esps = new ArrayList<>();
        while ((linha = br.readLine()) != null) {
            String[] dados = linha.split(",");
            especialidade = new Especialidade(Integer.parseInt(dados[0]), dados[1]);
            esps.add(especialidade);
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
