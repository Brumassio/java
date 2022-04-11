
package controle;

import realization.MySqlFactory;
import entidade.Produto;
import java.sql.*;
import telas.TelaProduto;


public class ProdutoDAO {
    
    private MySqlFactory conn;
    
    ////////////////////////
   public void cadastrar (Produto prod) throws SQLException {
    String sql = "insert into produto "
           + " (nome, descricao, codBarras, categoria, quantidade, valor)"
           + "values (?,?,?,?,?,?) ";
    Connection conProduto = conn.getConnection();
    
    try{
        PreparedStatement stmt = conProduto.prepareStatement(sql);
        stmt.setString (1, prod.getNome ());
        stmt.setString (2, prod.getDescricao ());
        stmt.setInt (3, prod.getCodBarras ());
        stmt.setString (4, prod.getCategoria ());
        stmt.setInt (5, prod.getQuantidade () );
        stmt.setDouble (6, prod.getValor ());
        //executando
       stmt.execute () ;
        stmt.close ();
    }catch (SQLException e) {
       throw new RuntimeException (e);
        }
    }


    public void inserir(TelaProduto telaProduto) throws SQLException{
        Produto produto = new Produto();
        String sql = "insert into produto "
        + " (Id,nome, descricao, codBarras, categoria, quantidade, valor)"
        + "values (?,?,?,?,?,?,?) ";
        Connection conProduto = conn.getConnection();
        PreparedStatement pstm;
        ResultSet rs;
   
        produto.setId(telaProduto.getId());
        produto.setCodBarras(telaProduto.getCodBarras());
        produto.setDescricao(telaProduto.getDescricao());
        produto.setNome(telaProduto.getNome());
        produto.setQuantidade(telaProduto.getQuantidade());
        produto.setValor(telaProduto.getValor());
        produto.setCategoria(telaProduto.getCategoria());
        
        try{
            pstm = conProduto.prepareStatement(sql);
           
            /*rs = pstm.executeQuery(sql);;
            produto.getId();
            produto.getNome();
            produto.getDescricao();
            produto.getCodBarras();
            produto.getCategoria();
            produto.getQuantidade();
            produto.getValor();*/
            
            pstm.setInt(1, produto.getId());
            pstm.setString(2, produto.getNome());
            pstm.setString(3,produto.getDescricao());
            pstm.setInt(4, produto.getCodBarras());
            pstm.setString(5, produto.getCategoria());
            pstm.setInt(6, produto.getQuantidade());
            pstm.setDouble(7, produto.getValor());
            pstm.execute();
            pstm.close();
            //pstm.set
            
        }catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }
    
    public void atualizar(){
        
    }
    
    public void excluir(){
        
    }
}
