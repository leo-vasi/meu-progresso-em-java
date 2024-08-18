import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    public void cadastrar(Produto p) throws ClassNotFoundException, SQLException {
        Connection con = Conexao.getConexao();
        PreparedStatement comando = con.prepareStatement("insert into produtos (descricao, preco) values (?,?)");
        comando.setString(1, p.getDescricao());
        comando.setDouble(2, p.getPreco());
        comando.execute();
        con.close();
    }

    public Produto consultarById(Produto prod) throws ClassNotFoundException, SQLException {
        Connection con = Conexao.getConexao();
        PreparedStatement comando = con.prepareStatement("select id, descricao, preco from produtos where id=?");
        comando.setInt(1, prod.getId());
        ResultSet resultado = comando.executeQuery();
        Produto p = new Produto();
        if (resultado.next()) {
            p.setId(resultado.getInt("id"));
            p.setDescricao(resultado.getString("descricao"));
            p.setPreco(resultado.getDouble("preco"));
        }
        con.close();
        return p;
    }

    public List<Produto> consultarTodos() throws ClassNotFoundException, SQLException {
        Connection con = Conexao.getConexao();
        PreparedStatement comando = con.prepareStatement("select id, descricao, preco from produtos order by descricao");
        ResultSet resultado = comando.executeQuery();
        List<Produto> todosProdutos = new ArrayList<Produto>();
        while (resultado.next()) {
            Produto p = new Produto();
            p.setId(resultado.getInt("id"));
            p.setDescricao(resultado.getString("descricao"));
            p.setPreco(resultado.getDouble("preco"));
            todosProdutos.add(p);
        }
        con.close();
        return todosProdutos;
    }

    public void atualizar(Produto p) throws ClassNotFoundException, SQLException {
        Connection con = Conexao.getConexao();
        PreparedStatement comando = con.prepareStatement(
            "update produtos set descricao=?, preco=? where id=?"
        );
        comando.setString(1, p.getDescricao());
        comando.setDouble(2, p.getPreco());
        comando.setInt(3, p.getId());
        comando.executeUpdate();
        con.close();
    }

    public void deletar(Produto p) throws ClassNotFoundException, SQLException {
        Connection con = Conexao.getConexao();
        PreparedStatement comando = con.prepareStatement(
            "delete from produtos where id=?"
        );
        comando.setInt(1, p.getId());
        comando.executeUpdate();
        con.close();
    }
}
