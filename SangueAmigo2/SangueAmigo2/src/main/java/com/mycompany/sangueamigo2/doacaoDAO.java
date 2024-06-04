//pacote
package com.mycompany.sangueamigo2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class doacaoDAO {
    public void insert(Doacao  doacao) {
       
       //Com auto increment
      /*String sql =   "INSERT INTO usuario (nome,senha) VALUES ('"
       +usuario.getNome() + "','"
       + usuario.getSenha() + "')";
      */
      
       String sql =   "INSERT INTO agendardoacao (local_doacao, data_doacao, hora_doacao, opcaoDoacao, codigodoacao) VALUES ('"
       + doacao.getLocal_doacao() + "','"
       + doacao.getData_doacao() + "','"        
       + doacao.getHora_doacao() + "','"
        + doacao.getOpcaoDoacao() + "','"       
       + doacao.getCodigodoacao() + "')" ;
      
      
     
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

