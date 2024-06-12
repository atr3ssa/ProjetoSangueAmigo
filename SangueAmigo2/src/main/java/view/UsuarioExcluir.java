/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.bean.Usuario;
import conection.ConexaoDB;
import model.dao.usuarioDAO;

/**
 *
 * @author DreEm
 */
public class UsuarioExcluir extends javax.swing.JFrame {
        // banco de dados
                Usuario usuario= new Usuario();
                ConexaoDB conn = new ConexaoDB();  
                //usuarioDAO = usuario padrao = todos os métodos de CRUD ficam aqui, tudo do banco fica nele
                //usuario = normal, só os getters e setters
                usuarioDAO usuarioBD;
    /**
     * Creates new form UsuarioExcluir
     */
    public UsuarioExcluir() {
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
        jblTituloCadastro2 = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        B12Excluir = new javax.swing.JButton();
        tx2 = new javax.swing.JTextField();
        tx3 = new javax.swing.JTextField();
        tx4 = new javax.swing.JTextField();
        B13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JQuadroVermelho2.setBackground(new java.awt.Color(204, 0, 0));
        JQuadroVermelho2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JQuadroVermelho2.setForeground(new java.awt.Color(102, 0, 0));

        jblTituloCadastro2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jblTituloCadastro2.setForeground(new java.awt.Color(51, 0, 0));
        jblTituloCadastro2.setText("Excluir Perfil");

        lblSenha.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblSenha.setText("Senha:");

        lblEmail.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblEmail.setText("Email:");

        lblCPF.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblCPF.setText("CPF:");

        B12Excluir.setBackground(new java.awt.Color(102, 0, 0));
        B12Excluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B12Excluir.setForeground(new java.awt.Color(255, 255, 255));
        B12Excluir.setText("Excluir Informações");
        B12Excluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B12Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B12ExcluirjButton5ActionPerformed(evt);
            }
        });

        tx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx2ActionPerformed(evt);
            }
        });

        B13.setText("Voltar");
        B13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JQuadroVermelho2Layout = new javax.swing.GroupLayout(JQuadroVermelho2);
        JQuadroVermelho2.setLayout(JQuadroVermelho2Layout);
        JQuadroVermelho2Layout.setHorizontalGroup(
            JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                                .addComponent(lblEmail)
                                .addGap(18, 18, 18)
                                .addComponent(tx3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                                .addComponent(lblSenha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tx4, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(B13)))
                    .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                                .addComponent(lblCPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tx2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jblTituloCadastro2))))
                .addGap(164, 164, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JQuadroVermelho2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(B12Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        JQuadroVermelho2Layout.setVerticalGroup(
            JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jblTituloCadastro2)
                .addGap(18, 18, 18)
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(tx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addGap(18, 18, 18)
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B12Excluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B13, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(33, 33, 33))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B12ExcluirjButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B12ExcluirjButton5ActionPerformed

        //pegando o que foi digitado no Nome do formulario e atualizando
        //padrão mvc
/*
        usuario.setNome_usuario(tx1.getText());
        usuario.setCpf_usuario(tx2.getText());
        usuario.setEmail_usuario (tx3.getText());
        usuario.setSenha_usuario(tx4.getText());
        usuario.setDataDeNascimento(tx5.getText());
        usuario.setCep (tx6.getText());
        usuario.setTipoSanguineo(tx7.getText());

        usuarioBD = new usuarioDAO();
        usuarioBD.insert(usuario);

        // limpar campos
        tx1.setText("");
        tx2.setText("");
        tx3.setText("");
        tx4.setText("");
        tx5.setText("");
        tx6.setText("");
        tx7.setText(""); */

        new UsuarioHome().setVisible(true);
    }//GEN-LAST:event_B12ExcluirjButton5ActionPerformed

    private void tx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx2ActionPerformed

    private void B13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B13ActionPerformed
        // TODO add your handling code here:
        new UsuarioHome().setVisible(true);
    }//GEN-LAST:event_B13ActionPerformed

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
            java.util.logging.Logger.getLogger(UsuarioExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioExcluir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B12Excluir;
    private javax.swing.JButton B13;
    private javax.swing.JPanel JQuadroVermelho2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jblTituloCadastro2;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField tx2;
    private javax.swing.JTextField tx3;
    private javax.swing.JTextField tx4;
    // End of variables declaration//GEN-END:variables
}
