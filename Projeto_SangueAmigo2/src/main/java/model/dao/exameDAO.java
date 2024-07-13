// pacote
package model.dao;

//importaçoes java

import model.bean.AgendarExames;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
        JOptionPane.showMessageDialog(null, "Exame agendado com sucesso!");	
        ps.close();
        c.close();               

        //classe usada para tratamentos de erros sql
        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erros no agendamento");
        //método para imprimir o rastreamento da pilha de chamadas (ajudaa identificar a origem e o contexto do erro
        e.printStackTrace();
       }
    }

     public void delete2 (AgendarExames agendarexames) {
        String sql = "DELETE FROM agendarexames WHERE local_exame=? and data_exame=? and hora_exame=? and opcaoExame=?";
        try (Connection c = ConexaoDB.obtemConexao(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, agendarexames.getLocal_exame());
            ps.setString(2, agendarexames.getData_exame());
            ps.setString(3, agendarexames.getHora_exame());
            ps.setString(4, agendarexames.getOpcaoExame());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Agendamento desmarcado com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Processo não realizado");
            e.printStackTrace();
        }
    }
    
}



