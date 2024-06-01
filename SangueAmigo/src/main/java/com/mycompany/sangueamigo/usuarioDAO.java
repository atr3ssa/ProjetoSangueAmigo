// pacote
package com.mycompany.sangueamigo;
// Importações sql
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

//Tudo que é manipulação de banco, coloco em uma classe a parte chamada: UsuarioDAO (o que passa as infos do Usuario para o banco)
public class usuarioDAO {
    
    //Método Insert para inclusão no usuario DAO
      public void insert(Usuario usuario) {
    //Código para auto incremento
      String sql =   "INSERT INTO usuario (nome_usuario, datadeNascimento, endereco, tipoSanguineo, senha_usuario) VALUES ('"
       + usuario.getNome_usuario() + "','"
       + usuario.getSenha_usuario() + "')";
      
       System.out.println(sql);
       try {
        Connection conectar = ConexaoDB.obtemConexao();
        PreparedStatement ps = conectar.prepareStatement(sql);
        ps.execute();
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");	
        ps.close();
        conectar.close();               

        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erros na Transação");
        e.printStackTrace();
       }
    }
    
    //Alterar um usuario
    public void update(Usuario usuario) {
       String sql =   "UPDATE  usuario SET nome=\"" +usuario.getNome_usuario()+ "\",senha=\""
       + usuario.getSenha_usuario() + "\" WHERE id=" + usuario.getCodigo();
       System.out.println(sql);
       
       // try catch = Tratamento de erros
       try {
        Connection conectar = ConexaoDB.obtemConexao();
        PreparedStatement ps = conectar.prepareStatement(sql);
        ps.execute();
        JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso");	
        ps.close();
        conectar.close();               

        } catch (SQLException e) {
        e.printStackTrace();
       }
    }
    //Excluir um usuario
    public void delete(int usuario) {
       String sql =   "DELETE FROM usuario WHERE id=" + usuario;
       System.out.println(sql);
       try {
        Connection conectar = ConexaoDB.obtemConexao();
        PreparedStatement ps = conectar.prepareStatement(sql);
        ps.execute();
        JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso");	
        ps.close();
        conectar.close();               

        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Usuario não excluido");
             e.printStackTrace();
       }
    }
    // Método consulta para consultar um Usuario na Classe DAO
    public void consulta(Usuario usuario) {    
        String sql =   "SELECT * from usuario where id=" + usuario.getCodigo();
        System.out.println(sql);
        // try catch = Tratamento de erros
        try {  Connection conectar = ConexaoDB.obtemConexao();
               PreparedStatement ps = conectar.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();

               while (rs.next()){
                   usuario.setNome_usuario(rs.getString("nome"));     
                   usuario.setSenha_usuario(rs.getString("senha"));     
               }
           }   
           catch (Exception e){
               e.printStackTrace();
           }      
     }
    // Lista
     public ArrayList listaUsuario(){
        ArrayList<Usuario> dados = new ArrayList();
        String sql = "SELECT * FROM usuario";

        try { Connection conectar = ConexaoDB.obtemConexao();
              PreparedStatement ps = conectar.prepareStatement(sql);

                ResultSet rs = ps.executeQuery();

            rs = ps.executeQuery();
            while (rs.next())
            {   Usuario usuario = new Usuario();
            
                usuario.setCodigo(Integer.parseInt(rs.getString("id")));
                usuario.setNome_usuario(rs.getString("nome"));
                usuario.setCodigo(rs.getInt("id"));
                System.out.println(usuario.getNome_usuario());
                
                dados.add(usuario);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return dados;
     }}
  

