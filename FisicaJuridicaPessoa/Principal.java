package FisicaJuridicaPessoa;

public class Principal {
    
    public static void main(String[] args)
    {
        Juridica j1 = new Juridica();
        j1.setCnpj("0001");
        j1.cadastrarPessoa("UEM","Rua Dom Pedro","123456");

        System.out.println("Empresa " + j1.getNome());
        System.out.println("Endereço " + j1.getEndereco());
        System.out.println("Telefone " + j1.getTelefone());
        System.out.println("CNPJ " + j1.getCnpj());

    }
}
