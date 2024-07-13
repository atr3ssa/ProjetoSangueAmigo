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
        lbl17 = new javax.swing.JLabel();
        jblTituloCadastro2 = new javax.swing.JLabel();
        lbl22 = new javax.swing.JLabel();
        lbl19 = new javax.swing.JLabel();
        tx17 = new javax.swing.JTextField();
        tx19 = new javax.swing.JTextField();
        B14Update = new javax.swing.JButton();
        B14 = new javax.swing.JButton();
        tx22 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        B15 = new javax.swing.JButton();
        lbl16 = new javax.swing.JLabel();
        tx16 = new javax.swing.JTextField();
        lbl21 = new javax.swing.JLabel();
        tx21 = new javax.swing.JTextField();
        lbl20 = new javax.swing.JLabel();
        lbl18 = new javax.swing.JLabel();
        tx18 = new javax.swing.JTextField();
        B16 = new javax.swing.JButton();
        lbl23 = new javax.swing.JLabel();
        tx20 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setForeground(new java.awt.Color(153, 0, 0));

        JQuadroVermelho2.setBackground(new java.awt.Color(255, 255, 255));
        JQuadroVermelho2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JQuadroVermelho2.setForeground(new java.awt.Color(102, 0, 0));

        lbl17.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl17.setForeground(new java.awt.Color(204, 0, 0));
        lbl17.setText("Nome:");

        jblTituloCadastro2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jblTituloCadastro2.setForeground(new java.awt.Color(204, 0, 0));
        jblTituloCadastro2.setText("Editar perfil");

        lbl22.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl22.setForeground(new java.awt.Color(204, 0, 0));
        lbl22.setText("Senha:");

        lbl19.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl19.setForeground(new java.awt.Color(204, 0, 0));
        lbl19.setText("Email:");

        tx17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx17ActionPerformed(evt);
            }
        });

        tx19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx19ActionPerformed(evt);
            }
        });

        B14Update.setBackground(new java.awt.Color(153, 0, 0));
        B14Update.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B14Update.setForeground(new java.awt.Color(255, 255, 255));
        B14Update.setText("Atualizar ");
        B14Update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B14Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B14UpdatejButton5ActionPerformed(evt);
            }
        });

        B14.setBackground(new java.awt.Color(153, 0, 0));
        B14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B14.setForeground(new java.awt.Color(255, 255, 255));
        B14.setText("Excluir");
        B14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B14jButton5ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(B15, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        lbl16.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl16.setForeground(new java.awt.Color(204, 0, 0));
        lbl16.setText("CPF:");

        tx16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx16ActionPerformed(evt);
            }
        });

        lbl21.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl21.setForeground(new java.awt.Color(204, 0, 0));
        lbl21.setText("CEP:");

        tx21.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tx21ComponentAdded(evt);
            }
        });
        tx21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx21ActionPerformed(evt);
            }
        });

        lbl20.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl20.setForeground(new java.awt.Color(204, 0, 0));
        lbl20.setText("Data de Nascimento:");

        lbl18.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl18.setForeground(new java.awt.Color(204, 0, 0));
        lbl18.setText("Tipo Sanguíneo:");

        tx18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx18ActionPerformed(evt);
            }
        });

        B16.setBackground(new java.awt.Color(153, 0, 0));
        B16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B16.setForeground(new java.awt.Color(255, 255, 255));
        B16.setText("Consultar");
        B16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B16ActionPerformed(evt);
            }
        });

        lbl23.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl23.setForeground(new java.awt.Color(204, 0, 0));
        lbl23.setText("*");

        tx20.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tx20ComponentAdded(evt);
            }
        });
        tx20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JQuadroVermelho2Layout = new javax.swing.GroupLayout(JQuadroVermelho2);
        JQuadroVermelho2.setLayout(JQuadroVermelho2Layout);
        JQuadroVermelho2Layout.setHorizontalGroup(
            JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(B16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(B14Update, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B14, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                                .addComponent(lbl20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tx20, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tx21, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                                .addComponent(lbl22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tx22, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                                .addComponent(lbl19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tx19, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl17)
                                    .addComponent(lbl16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                                        .addComponent(tx16, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl23)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tx18, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tx17, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jblTituloCadastro2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JQuadroVermelho2Layout.setVerticalGroup(
            JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jblTituloCadastro2)
                .addGap(42, 42, 42)
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl16)
                    .addComponent(lbl23)
                    .addComponent(lbl18)
                    .addComponent(tx18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl17))
                .addGap(20, 20, 20)
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl19)
                    .addComponent(tx19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl20)
                    .addComponent(tx20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl21)
                    .addComponent(tx21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tx22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl22))
                .addGap(41, 41, 41)
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B14Update, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(JQuadroVermelho2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tx17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx17ActionPerformed
        // TODO add your handling code here:
        
        
     
        
         
    }//GEN-LAST:event_tx17ActionPerformed

    private void B14UpdatejButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B14UpdatejButton5ActionPerformed

        //pegando o que foi digitado no Nome do formulario e atualizando
        //padrão mvc
        if(evt.getSource()==B14Update){
			if (usuario.getCpf_usuario() == "" ){
                            JOptionPane.showMessageDialog(null, "Primeiro consulte o Usuário");
                        }
                        else
                        {
                            usuario.setCpf_usuario(tx16.getText());
                            usuario.setNome_usuario (tx17.getText());
                            usuario.setTipoSanguineo(tx18.getText());
                            usuario.setEmail_usuario (tx19.getText());
                            usuario.setDataDeNascimento(tx20.getText());
                            usuario.setCep(tx21.getText());
                            usuario.setSenha_usuario (tx22.getText());

                            usuarioBD = new usuarioDAO();
                            usuarioBD.update2(usuario);

                            // limpar campos
                            tx17.setText("");
                            tx18.setText("");
                            tx19.setText("");
                            tx20.setText("");
                            tx21.setText("");
                            tx22.setText("");
                            
                            new UsuarioHome().setVisible(true);
                             dispose();
                        }
                        }
        
    
    }//GEN-LAST:event_B14UpdatejButton5ActionPerformed

    private void B15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B15ActionPerformed
        // TODO add your handling code here:
        new UsuarioHome().setVisible(true);
        dispose();
    }//GEN-LAST:event_B15ActionPerformed

    private void B14jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B14jButton5ActionPerformed
        // TODO add your handling code here:
        
        usuario.setCpf_usuario (tx16.getText());
        //usuario.setSenha_usuario(tx22.getText());
        
       

        usuarioBD = new usuarioDAO();
        usuarioBD.delete2(usuario);

        // limpar campos
        tx17.setText("");
        tx18.setText("");
        tx19.setText("");
        tx20.setText("");
        tx21.setText("");
        tx22.setText("");
        
        new UsuarioHome().setVisible(true);
        dispose();
    }//GEN-LAST:event_B14jButton5ActionPerformed

    private void tx16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx16ActionPerformed

    private void tx21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx21ActionPerformed

    private void tx18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx18ActionPerformed

    private void B16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B16ActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == B16)
			{
			    if ("".equals(tx16.getText())) {
                            JOptionPane.showMessageDialog(null, "Digitar o CPF  para consultar");
                            }
                            else
                            {	 usuario.setCpf_usuario(tx16.getText());
         
                                    usuarioBD = new usuarioDAO();
                                   // usuario.setCpf_usuario(txConsultar.getText());
                                    usuarioBD.consulta(usuario);


                                    tx17.setText(usuario.getNome_usuario());
                                    tx18.setText(usuario.getTipoSanguineo());
                                    tx19.setText(usuario.getEmail_usuario());
                                    tx20.setText(usuario.getDataDeNascimento());
                                    tx21.setText(usuario.getCep());
                                    tx22.setText(usuario.getSenha_usuario());
                            }
                        }
        
        
    }//GEN-LAST:event_B16ActionPerformed

    private void tx21ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tx21ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tx21ComponentAdded

    private void tx19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx19ActionPerformed

    private void tx20ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tx20ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tx20ComponentAdded

    private void tx20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx20ActionPerformed

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
    private javax.swing.JButton B14;
    private javax.swing.JButton B14Update;
    private javax.swing.JButton B15;
    private javax.swing.JButton B16;
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
    private javax.swing.JLabel lbl23;
    private javax.swing.JTextField tx16;
    private javax.swing.JTextField tx17;
    private javax.swing.JTextField tx18;
    private javax.swing.JTextField tx19;
    private javax.swing.JTextField tx20;
    private javax.swing.JTextField tx21;
    private javax.swing.JPasswordField tx22;
    // End of variables declaration//GEN-END:variables
}
