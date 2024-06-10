// pacote
package dao;

//importaçoes java

import bean.AgendarExames;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import conection.ConexaoDB;


public class exameDAO {
    //INSERT
    public void insert(AgendarExames exame) {
       
       //Com auto increment
      /*String sql =   "INSERT INTO usuario (nome,senha) VALUES ('"
       +usuario.getNome() + "','"
       + usuario.getSenha() + "')";
      */
      
       String sql =   "INSERT INTO agendarexames (local_exame, data_exame, hora_exame, opcaoExame) VALUES ('"
       + exame.getLocal_exame() + "','"
       + exame.getData_exame() + "','"        
       + exame.getHora_exame() + "','"
       + exame.getOpcaoExame() + "')" ;      
      
      
     
       System.out.println(sql);
        //Usado para tentar mapear o erro do código. Vai tentar executar a conexão com o banco de dados, caso não ocorra, ele vai te informar o erro (podemos detalhar futuramente as possibilidades de erros)
        //Passo muito importande, devido a conexão Cliente - Servidor.
       try {
        Connection c = ConexaoDB.obtemConexao();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.execute();
        JOptionPane.showMessageDialog(null, "Exame agendado com sucesso");	
        ps.close();
        c.close();               

        //classe usada para tratamentos de erros sql
        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erros no agendamento");
        //método para imprimir o rastreamento da pilha de chamadas (ajudaa identificar a origem e o contexto do erro
        e.printStackTrace();
       }
    }
    /*
    //DELETAR
    
    public void delete(String local_usuario, String data_usuario, String hora_usuario, String opcaoExame) {
       String sql =   "DELETE FROM agendarexames WHERE local_usuario=" + local_usuario + " and data_usuario=" + data_usuario + " and hora_usuario=" + hora_usuario +" and opcaoExame=" + opcaoExame;
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
*/
    
 /*
    public void consulta(AgendarExames agendarexames) {    
        String sql =   "SELECT * from usuario where id_usuario=" + agendarexames.getCodigoExame();
        System.out.println(sql);
        try {  Connection c = ConexaoDB.obtemConexao();
               PreparedStatement ps = c.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();

               while (rs.next()){
                   agendarexames.setLocal_exame(rs.getString("Local"));     
                   agendarexames.setData_exame(rs.getString("Data"));
                   agendarexames.setHora_exame(rs.getString("Local"));     
                   agendarexames.setOpcaoExame(rs.getString("Data"));
                   JOptionPane.showMessageDialog(null, "abc");
                   
               }
           }   
           catch (Exception e){
               e.printStackTrace();
               JOptionPane.showMessageDialog(null, "Consulta não realizada");
           }
        
     }*/
}



