
package controle;

import entidade.Especialidade;
import entidade.ReceitaMedica;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import telas.TelaReceitaMedica;


public class ControleReceitaMedica {
    private ReceitaMedica receita;
    private File f;
    private FileWriter fw;
    private BufferedWriter bw;
    private FileReader fr;
    private BufferedReader br;
    /////////////////////////////////
    /*
    int idReceita, int idConsulta, Date dataReceita, Date dataValidade
    */
    private void abrirArquivo(String nome, String path) throws IOException {

        String pathCompleto = path + nome;
        f = new File(pathCompleto);
        if (!f.exists()) {
            f.createNewFile();
        }
    }
    
    public void gravarArquivo(TelaReceitaMedica dadoRece) throws FileNotFoundException, IOException {

        abrirArquivo("receitamedica.txt", "//C:/Users//Diogo Brumassio//Desktop//");
        fw = new FileWriter(f, true);
        bw = new BufferedWriter(fw);
        receita = new ReceitaMedica(dadoRece.getIdReceita(), dadoRece.getIdConsulta(), dadoRece.getDataReceita(),
        dadoRece.getDataValidade());
        String receitaString = receita.getIdReceita() + ", " + receita.getIdConsulta()+", "+receita.getDataReceita()
                +", "+receita.getDataValidade()+", "+receita.getItemReceitaMedica();
        bw.write(receitaString);
        bw.newLine();
        bw.close();
        fecharArquivo();

    }

    public ArrayList lerArquivo(String nomeArq, String path) throws IOException {
        String linha = "";
        abrirArquivo(nomeArq, path);
        fr = new FileReader(f);
        br = new BufferedReader(fr);
        ArrayList<ReceitaMedica> receits = new ArrayList<>();
        while ((linha = br.readLine()) != null) {
            String[] dados = linha.split(", ");
            receita = new ReceitaMedica(Integer.parseInt(dados[0]), Integer.parseInt(dados[1]),dados[2],dados[3]);
            receits.add(receita);
        }

        br.close();
        fr.close();
        return receits;
    }

    public void fecharArquivo() throws IOException {
        if (f.exists()) {
            bw.close();
            fw.close();
        }
    }
}
