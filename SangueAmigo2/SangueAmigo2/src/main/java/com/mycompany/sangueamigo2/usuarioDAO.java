// pacote
package com.mycompany.sangueamigo2;
// Importações sql
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//Tudo que é manipulação de banco, coloco em uma classe a parte chamada: UsuarioDAO (o que passa as infos do Usuario para o banco)
public class usuarioDAO {
  public void insert(Usuario usuario) {
       
       //Com auto increment
      /*String sql =   "INSERT INTO usuario (nome,senha) VALUES ('"
       +usuario.getNome() + "','"
       + usuario.getSenha() + "')";
      */
      
       String sql =   "INSERT INTO usuario (nome_usuario, datadeNascimento, endereco, tipoSanguineo, email_usuario, cpf_usuario, senha_usuario) VALUES ('"
       + usuario.getNome_usuario() + "','"
       + usuario.getDatadeNascimento() + "','"        
       + usuario.getEndereco() + "','"
       + usuario.getTipoSanguineo() + "','"
       + usuario.getEmail_usuario() + "','"        
       + usuario.getCpf_usuario() + "','"       
       + usuario.getSenha_usuario() + "')" ;
      
      
     
       System.out.println(sql);
        //Usado para tentar mapear o erro do código. Vai tentar executar a conexão com o banco de dados, caso não ocorra, ele vai te informar o erro (podemos detalhar futuramente as possibilidades de erros)
        //Passo muito importande, devido a conexão Cliente - Servidor.
       try {
        Connection c = ConexaoDB.obtemConexao();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.execute();
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");	
        ps.close();
        c.close();               

        //classe usada para tratamentos de erros sql
        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erros na Transação");
        //método para imprimir o rastreamento da pilha de chamadas (ajudaa identificar a origem e o contexto do erro
        e.printStackTrace();
       }
    }
}
  

