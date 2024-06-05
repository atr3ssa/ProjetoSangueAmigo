/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sangueamigo2;

/**
 *
 * @author DreEm
 */
public class UsuarioDoacao extends javax.swing.JFrame {
    // banco de dados
                Doacao doacao = new Doacao();
                ConexaoDB conn = new ConexaoDB();  
                //doacoesDAO = usuario padrao = todos os métodos de CRUD ficam aqui, tudo do banco fica nele
                //doacao = normal, só os getters e setters
                doacaoDAO doacaoBD;
    /**
     * Creates new form DoacoesUsuario
     */
    public UsuarioDoacao() {
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

        jQuadroDoacao = new javax.swing.JPanel();
        jlbLocal = new javax.swing.JLabel();
        jLbData = new javax.swing.JLabel();
        jLbHora = new javax.swing.JLabel();
        jLbOpcao = new javax.swing.JLabel();
        tx8 = new javax.swing.JTextField();
        tx11 = new javax.swing.JTextField();
        tx10 = new javax.swing.JTextField();
        tx9 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        B5 = new javax.swing.JButton();
        jLbCodigo = new javax.swing.JLabel();
        tx12 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jQuadroDoacao.setBackground(new java.awt.Color(204, 0, 0));

        jlbLocal.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jlbLocal.setText("Local:");

        jLbData.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLbData.setText("Data:");

        jLbHora.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLbHora.setText("Hora:");

        jLbOpcao.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLbOpcao.setText("Doação de:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Agendar Doações");

        B5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B5.setText("Agendar");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        jLbCodigo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLbCodigo.setText("Código:");

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jQuadroDoacaoLayout = new javax.swing.GroupLayout(jQuadroDoacao);
        jQuadroDoacao.setLayout(jQuadroDoacaoLayout);
        jQuadroDoacaoLayout.setHorizontalGroup(
            jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jQuadroDoacaoLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jQuadroDoacaoLayout.createSequentialGroup()
                        .addComponent(jLbOpcao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tx11, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jQuadroDoacaoLayout.createSequentialGroup()
                        .addGroup(jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jQuadroDoacaoLayout.createSequentialGroup()
                                .addComponent(jlbLocal)
                                .addGap(18, 18, 18)
                                .addComponent(tx8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLbCodigo))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jQuadroDoacaoLayout.createSequentialGroup()
                                .addComponent(jLbData)
                                .addGap(18, 18, 18)
                                .addComponent(tx9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jLbHora)))
                        .addGap(18, 18, 18)
                        .addGroup(jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tx10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tx12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 125, Short.MAX_VALUE))
            .addGroup(jQuadroDoacaoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jQuadroDoacaoLayout.setVerticalGroup(
            jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jQuadroDoacaoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbLocal)
                    .addComponent(jLbCodigo)
                    .addComponent(tx12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbData)
                    .addComponent(tx9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbHora)
                    .addComponent(tx10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbOpcao)
                    .addComponent(tx11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jQuadroDoacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jQuadroDoacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        //pegando o que foi digitado no Nome do formulario e atualizando
                            //padrão mvc
                            
                            doacao.setLocal_doacao(tx8.getText());
                            doacao.setData_doacao(tx9.getText());
                            doacao.setHora_doacao  (tx10.getText());
                            doacao.setOpcaoDoacao(tx11.getText());
                            doacao.setCodigodoacao(Integer.parseInt(tx12.getText()));
                            
                           
                            doacaoBD = new doacaoDAO();
                            doacaoBD.insert(doacao);
                            
                            // limpar campos
                            tx8.setText("");
			    tx9.setText("");
			    tx10.setText("");    
                            tx11.setText("");
                            tx12.setText("");
    }//GEN-LAST:event_B5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new UsuarioPerfil().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UsuarioDoacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioDoacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioDoacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioDoacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioDoacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLbCodigo;
    private javax.swing.JLabel jLbData;
    private javax.swing.JLabel jLbHora;
    private javax.swing.JLabel jLbOpcao;
    private javax.swing.JPanel jQuadroDoacao;
    private javax.swing.JLabel jlbLocal;
    private javax.swing.JTextField tx10;
    private javax.swing.JTextField tx11;
    private javax.swing.JTextField tx12;
    private javax.swing.JTextField tx8;
    private javax.swing.JTextField tx9;
    // End of variables declaration//GEN-END:variables
}
