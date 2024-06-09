// pacote
package dao;
// Importações sql
import bean.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import conection.ConexaoDB;

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
        JOptionPane.showMessageDialog(null, "Doação agendada com sucesso");	
        ps.close();
        c.close();               

        //classe usada para tratamentos de erros sql
        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erros no agendamento");
        //método para imprimir o rastreamento da pilha de chamadas (ajudaa identificar a origem e o contexto do erro
        e.printStackTrace();
       }
    }
  
  
   //Alterar um usuario
    public void update(Usuario usuario) {
       String sql =   "UPDATE  usuario SET nome_usuario=\"" +usuario.getNome_usuario()+ "\",senha_usuario=\""
       + usuario.getSenha_usuario() + "\" WHERE id_usuario=" + usuario.getId_usuario();
       System.out.println(sql);
       try {
        Connection c = ConexaoDB.obtemConexao();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.execute();
        JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso");	
        ps.close();
        c.close();               

        } catch (SQLException e) {
        e.printStackTrace();
       }
    }
  
  
    //Excluir um usuario (conta)
    public void delete(int usuario) {
       String sql =   "DELETE FROM usuario WHERE id_usuario=" + usuario;
       System.out.println(sql);
       try {
        Connection c = ConexaoDB.obtemConexao();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.execute();
        JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso");	
        ps.close();
        c.close();               

        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Usuario não excluido");
             e.printStackTrace();
       }
    }
    /*
    // Consultar um Usuario
    public void consulta(Usuario usuario) {    
        String sql =   "SELECT * from usuario where id_usuario=" + usuario.getId_usuario();
        System.out.println(sql);
        try {  Connection c = ConexaoDB.obtemConexao();
               PreparedStatement ps = c.prepareStatement(sql);
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
    */
    /*
     public ArrayList listaUsuario(){
        ArrayList<Usuario> dados = new ArrayList();
        String sql = "SELECT * FROM usuario";

        try { Connection c = ConexaoDB.obtemConexao();
              PreparedStatement ps = c.prepareStatement(sql);

                ResultSet rs = ps.executeQuery();

            rs = ps.executeQuery();
            while (rs.next())
            {   Usuario usuario = new Usuario();
            
                usuario.setId_usuario(Integer.parseInt(rs.getString("id")));
                usuario.setNome_usuario(rs.getString("nome"));
                usuario.setId_usuario(rs.getInt("id"));
                System.out.println(usuario.getNome_usuario());
                
                dados.add(usuario);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return dados;
       }
     */
    
     /*
     public void logar(){
            String sql = "select * from usuario where email_usuario=? and senha_usuario=?";
            try{
                Connection c = ConexaoDB.obtemConexao();
                PreparedStatement ps = c.prepareStatement(sql);

                ResultSet rs = ps.executeQuery();
                
                rs = ps.executeQuery();
               
              ps = c.prepareStatement(sql);
              //ps.setString(1, txtUsuario.getText());
              //ps.setString(2, txtSenha.getText());
              
              //ResultSet rs = ps.executeQuery();
              
              if (rs.next()) {  
                  UsuarioPerfil usuarioperfil = new UsuarioPerfil();
                  JOptionPane.showMessageDialog(null, "Seja Bem-Vindo!");
                  usuarioperfil.setVisible(true);                
              } else {
                  JOptionPane.showMessageDialog(null,"Email e/ou senha incorreto(s)");
              }
            } catch (SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }*/
        }

  

  

