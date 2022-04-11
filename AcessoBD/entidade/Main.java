/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

import controle.ProdutoDAO;
import java.sql.SQLException;
import telas.TelaProduto;

/**
 *
 * @author Diogo Brumassio
 */
public class Main {
    public static void main(String[] args) throws SQLException  {
        TelaProduto tp = new TelaProduto();
        ProdutoDAO produtoControl = new ProdutoDAO();
        produtoControl.inserir(tp);
    }
}
