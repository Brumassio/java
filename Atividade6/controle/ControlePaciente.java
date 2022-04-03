package controle;

import java.io.*;

import entidade.Paciente;
import java.util.ArrayList;
import telas.TelaPaciente;

public class ControlePaciente {
    
    private Paciente paciente;
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

    public void gravarArquivo(TelaPaciente dadoPaciente) throws FileNotFoundException, IOException {

        abrirArquivo("paciente.txt", "//C:/Users//Diogo Brumassio//Desktop//");
        fw = new FileWriter(f, true);
        bw = new BufferedWriter(fw);
        Paciente paciente = new Paciente(dadoPaciente.getNome(), dadoPaciente.getCpf(), dadoPaciente.getEndereco(),
                dadoPaciente.getTelefone(), dadoPaciente.getPeso(), dadoPaciente.getAltura(), dadoPaciente.getIdade());
        String paci = paciente.getNome() + ", " + paciente.getCpf() + ", " + paciente.getEndereco() + ", "
                + paciente.getTelefone() + ", " + paciente.getPeso() + ", " + paciente.getAltura() + ", "
                + paciente.getIdade();
        bw.write(paci);
        bw.newLine();
        bw.close();
        fecharArquivo();

    }
    public ArrayList lerArquivo(String nomeArq, String path) throws IOException {
        String linha = "";
        abrirArquivo(nomeArq, path);
        fr = new FileReader(f);
        br = new BufferedReader(fr);
        ArrayList<Paciente> pacis = new ArrayList<>();
        while ((linha = br.readLine()) != null) {
            String[] dados = linha.split(", ");
            paciente = new Paciente(dados[0], dados[1], dados[2], dados[3],Float.parseFloat(dados[4]),Float.parseFloat(dados[5]),Integer.parseInt(dados[6]));
            pacis.add(paciente);
        }

        br.close();
        fr.close();
        return pacis;
    }

    public void fecharArquivo() throws IOException {
        if (f.exists()) {
            bw.close();
            fw.close();
        }
    }
}
