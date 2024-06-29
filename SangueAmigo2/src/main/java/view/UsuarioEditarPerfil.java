/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.bean.Usuario;
import conection.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.dao.usuarioDAO;

/**
 *
 * @author DreEm
 */
public class UsuarioEditarPerfil extends javax.swing.JFrame {
        // banco de dados
                Usuario usuario= new Usuario();
                ConexaoDB conn = new ConexaoDB();  
                //usuarioDAO = usuario padrao = todos os métodos de CRUD ficam aqui, tudo do banco fica nele
                //usuario = normal, só os getters e setters
                usuarioDAO usuarioBD;
    /**
     * Creates new form UsuarioEditarPerfil
     */
    public UsuarioEditarPerfil() {
        //inicialização
        initComponents();
    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JQuadroVermelho2 = new javax.swing.JPanel();
        lbl16 = new javax.swing.JLabel();
        jblTituloCadastro2 = new javax.swing.JLabel();
        lbl18 = new javax.swing.JLabel();
        lbl17 = new javax.swing.JLabel();
        tx16 = new javax.swing.JTextField();
        tx17 = new javax.swing.JTextField();
        B14Update = new javax.swing.JButton();
        B15 = new javax.swing.JButton();
        B14Update1 = new javax.swing.JButton();
        tx18 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        lbl19 = new javax.swing.JLabel();
        tx19 = new javax.swing.JTextField();
        lbl20 = new javax.swing.JLabel();
        tx20 = new javax.swing.JTextField();
        lbl21 = new javax.swing.JLabel();
        tx21 = new javax.swing.JTextField();
        lbl22 = new javax.swing.JLabel();
        tx22 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setForeground(new java.awt.Color(153, 0, 0));

        JQuadroVermelho2.setBackground(new java.awt.Color(255, 255, 255));
        JQuadroVermelho2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JQuadroVermelho2.setForeground(new java.awt.Color(102, 0, 0));

        lbl16.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl16.setForeground(new java.awt.Color(204, 0, 0));
        lbl16.setText("Nome:");

        jblTituloCadastro2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jblTituloCadastro2.setForeground(new java.awt.Color(204, 0, 0));
        jblTituloCadastro2.setText("Editar perfil");

        lbl18.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl18.setForeground(new java.awt.Color(204, 0, 0));
        lbl18.setText("Senha:");

        lbl17.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl17.setForeground(new java.awt.Color(204, 0, 0));
        lbl17.setText("Email:");

        tx16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx16ActionPerformed(evt);
            }
        });

        B14Update.setBackground(new java.awt.Color(153, 0, 0));
        B14Update.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B14Update.setForeground(new java.awt.Color(255, 255, 255));
        B14Update.setText("Atualizar dados");
        B14Update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B14Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B14UpdatejButton5ActionPerformed(evt);
            }
        });

        B15.setBackground(new java.awt.Color(153, 0, 0));
        B15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B15.setForeground(new java.awt.Color(255, 255, 255));
        B15.setText("Voltar");
        B15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B15ActionPerformed(evt);
            }
        });

        B14Update1.setBackground(new java.awt.Color(153, 0, 0));
        B14Update1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B14Update1.setForeground(new java.awt.Color(255, 255, 255));
        B14Update1.setText("Excluir dados");
        B14Update1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B14Update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B14Update1jButton5ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lbl19.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl19.setForeground(new java.awt.Color(204, 0, 0));
        lbl19.setText("CPF:");

        tx19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx19ActionPerformed(evt);
            }
        });

        lbl20.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl20.setForeground(new java.awt.Color(204, 0, 0));
        lbl20.setText("CEP:");

        tx20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx20ActionPerformed(evt);
            }
        });

        lbl21.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl21.setForeground(new java.awt.Color(204, 0, 0));
        lbl21.setText("Data de Nascimento:");

        tx21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx21ActionPerformed(evt);
            }
        });

        lbl22.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl22.setForeground(new java.awt.Color(204, 0, 0));
        lbl22.setText("Tipo Sanguíneo:");

        tx22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JQuadroVermelho2Layout = new javax.swing.GroupLayout(JQuadroVermelho2);
        JQuadroVermelho2.setLayout(JQuadroVermelho2Layout);
        JQuadroVermelho2Layout.setHorizontalGroup(
            JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(B15, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B14Update, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B14Update1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl20)
                                    .addComponent(lbl16)
                                    .addComponent(lbl19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tx16, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                                        .addComponent(tx20, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tx22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tx19, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jblTituloCadastro2))))
                    .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lbl21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tx21, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JQuadroVermelho2Layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl17)
                                .addComponent(lbl18))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tx17, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tx18, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JQuadroVermelho2Layout.setVerticalGroup(
            JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jblTituloCadastro2)
                .addGap(18, 18, 18)
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl19))
                .addGap(18, 18, 18)
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl20)
                    .addComponent(lbl22)
                    .addComponent(tx22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl16))
                .addGap(18, 18, 18)
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl21)
                    .addComponent(tx21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl17)
                    .addComponent(tx17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl18)
                    .addComponent(tx18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B14Update, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B14Update1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(JQuadroVermelho2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JQuadroVermelho2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tx16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx16ActionPerformed
        // TODO add your handling code here:
        
        
     
        
         
    }//GEN-LAST:event_tx16ActionPerformed

    private void B14UpdatejButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B14UpdatejButton5ActionPerformed

        //pegando o que foi digitado no Nome do formulario e atualizando
        //padrão mvc

        usuario.setNome_usuario(tx16.getText());
        usuario.setEmail_usuario (tx17.getText());
        usuario.setSenha_usuario(tx18.getText());
        

        usuarioBD = new usuarioDAO();
        usuarioBD.update2(usuario);

        // limpar campos
        tx16.setText("");
        tx17.setText("");
        tx18.setText("");
        
        
        new UsuarioHome().setVisible(true);
        dispose();
    }//GEN-LAST:event_B14UpdatejButton5ActionPerformed

    private void B15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B15ActionPerformed
        // TODO add your handling code here:
        new UsuarioHome().setVisible(true);
        dispose();
    }//GEN-LAST:event_B15ActionPerformed

    private void B14Update1jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B14Update1jButton5ActionPerformed
        // TODO add your handling code here:
        
        usuario.setEmail_usuario (tx17.getText());
        usuario.setSenha_usuario(tx18.getText());
        
       

        usuarioBD = new usuarioDAO();
        usuarioBD.delete2(usuario);

        // limpar campos
        tx17.setText("");
        tx18.setText("");
        
        new UsuarioHome().setVisible(true);
        dispose();
    }//GEN-LAST:event_B14Update1jButton5ActionPerformed

    private void tx19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx19ActionPerformed

    private void tx20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx20ActionPerformed

    private void tx21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx21ActionPerformed

    private void tx22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx22ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UsuarioEditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioEditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioEditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioEditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioEditarPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B14Update;
    private javax.swing.JButton B14Update1;
    private javax.swing.JButton B15;
    private javax.swing.JPanel JQuadroVermelho2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jblTituloCadastro2;
    private javax.swing.JLabel lbl16;
    private javax.swing.JLabel lbl17;
    private javax.swing.JLabel lbl18;
    private javax.swing.JLabel lbl19;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl22;
    private javax.swing.JTextField tx16;
    private javax.swing.JTextField tx17;
    private javax.swing.JPasswordField tx18;
    private javax.swing.JTextField tx19;
    private javax.swing.JTextField tx20;
    private javax.swing.JTextField tx21;
    private javax.swing.JTextField tx22;
    // End of variables declaration//GEN-END:variables
}
