// pacote
package model.dao;
// Importações sql
import model.bean.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import conection.ConexaoDB;
import java.sql.ResultSet;

//Tudo que é manipulação de banco, coloco em uma classe a parte chamada: UsuarioDAO (o que passa as infos do Usuario para o banco)
public class usuarioDAO {
    
   
  public void insert(Usuario usuario) {
       
       //Com auto increment
      /*String sql =   "INSERT INTO usuario (nome,senha) VALUES ('"
       +usuario.getNome() + "','"
       + usuario.getSenha() + "')";
      */
      
       String sql =   "INSERT INTO usuario ( nome_usuario, Cpf_usuario, email_usuario, senha_usuario, dataDeNascimento, Cep, tipoSanguineo) VALUES ('"
       + usuario.getNome_usuario() + "','"
       + usuario.getCpf_usuario() + "','"  
       + usuario.getEmail_usuario() + "','" 
       + usuario.getSenha_usuario() + "','"        
       + usuario.getDataDeNascimento() + "','"        
       + usuario.getCep() + "','"
       + usuario.getTipoSanguineo() + "')" ; 
      
     
       System.out.println(sql);
        //Usado para tentar mapear o erro do código. Vai tentar executar a conexão com o banco de dados, caso não ocorra, ele vai te informar o erro (podemos detalhar futuramente as possibilidades de erros)
        //Passo muito importande, devido a conexão Cliente - Servidor.
       try {
        Connection c = ConexaoDB.obtemConexao();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.execute();
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");	
        ps.close();
        c.close();               

        //classe usada para tratamentos de erros sql
        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erros na transação");
        //método para imprimir o rastreamento da pilha de chamadas (ajudaa identificar a origem e o contexto do erro
        e.printStackTrace();
       }
    }
  
  public void insert2(Usuario usuario) {
        String sql = "INSERT INTO usuario (nome_usuario, cpf_usuario, email_usuario, senha_usuario, dataDeNascimento, cep, tipoSanguineo) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection c = ConexaoDB.obtemConexao(); PreparedStatement ps = c.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, usuario.getNome_usuario());
            ps.setString(2, usuario.getCpf_usuario());
            ps.setString(3, usuario.getEmail_usuario());
            ps.setString(4, usuario.getSenha_usuario());
            ps.setString(5, usuario.getDataDeNascimento());
            ps.setString(6, usuario.getCep());
            ps.setString(7, usuario.getTipoSanguineo());
            ps.executeUpdate();

            // Obter o ID gerado
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                usuario.setId_usuario(rs.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

  
  public void delete2 (Usuario usuario) {
        String sql = "DELETE FROM usuario WHERE email_usuario=? and senha_usuario=?";
        try (Connection c = ConexaoDB.obtemConexao(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, usuario.getEmail_usuario());
            ps.setString(2, usuario.getSenha_usuario());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Usuário não excluído");
            e.printStackTrace();
        }
    }
  
  
  public void update2(Usuario usuario) {
    String sql = "UPDATE usuario SET nome_usuario=?, email_usuario=?, senha_usuario=? WHERE nome_usuario=?";
    try (Connection c = ConexaoDB.obtemConexao(); PreparedStatement ps = c.prepareStatement(sql)) {
        ps.setString(1, usuario.getNome_usuario());
        ps.setString(2, usuario.getEmail_usuario());
        ps.setString(3, usuario.getSenha_usuario());
        ps.setString(4, usuario.getNome_usuario());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Alteração não realizada");
        e.printStackTrace();
    }
}
  
 //Método consulta e método update
  
    public void consulta(Usuario usuario) {
    String sql = "SELECT * FROM usuario WHERE nome_usuario=?";
    try (Connection c = ConexaoDB.obtemConexao(); PreparedStatement ps = c.prepareStatement(sql)) {
        //ps.setInt(1, usuario.getId_usuario()); // arrumar aqui
        ps.setString(1, usuario.getNome_usuario());
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            usuario.setNome_usuario(rs.getString("nome_usuario"));
            usuario.setCpf_usuario(rs.getString("cpf_usuario"));
            usuario.setEmail_usuario(rs.getString("email_usuario"));
            usuario.setSenha_usuario(rs.getString("senha_usuario"));
            usuario.setDataDeNascimento(rs.getString("dataDeNascimento"));
            usuario.setCep(rs.getString("cep"));
            usuario.setTipoSanguineo(rs.getString("tipoSanguineo"));
            JOptionPane.showMessageDialog(null, "Consulta realizada com sucesso");
        }
        rs.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Consulta não realizada com sucesso");
        e.printStackTrace();
    } 
    }
    
     public static void carregarDadosUsuario(Usuario usuario) {
        // Realiza a consulta no banco de dados e carrega os dados do usuário nos campos
        String sql = "SELECT * FROM usuario WHERE nome_usuario=?";
        try (Connection c = ConexaoDB.obtemConexao(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, usuario.getNome_usuario());
            ResultSet rs = ps.executeQuery();

//             if (rs.next()) {
//                tx16.setText(rs.getString("nome_usuario"));
//                tx17.setText(rs.getString("email_usuario"));
//                tx18.setText(rs.getString("senha_usuario"));
//                // Carregue outros campos conforme necessário
//      }

            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados do usuário");
            e.printStackTrace();
        }
    }
}



  

  

