/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sangueamigo2;

/**
 *
 * @author DreEm
 */
public class UsuarioExame extends javax.swing.JFrame {
    Exame exame = new Exame();
                ConexaoDB conn = new ConexaoDB();  
                //doacoesDAO = usuario padrao = todos os métodos de CRUD ficam aqui, tudo do banco fica nele
                //doacao = normal, só os getters e setters
                exameDAO exameBD;
    /**
     * Creates new form ExamesUsuario
     */
    public UsuarioExame() {
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

        jTextField7 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jQuadroExames = new javax.swing.JPanel();
        jlbLocal4 = new javax.swing.JLabel();
        jLbData4 = new javax.swing.JLabel();
        jLbHora4 = new javax.swing.JLabel();
        jLbCodigo3 = new javax.swing.JLabel();
        jLbOpcao4 = new javax.swing.JLabel();
        B9 = new javax.swing.JButton();
        jlbExame = new javax.swing.JLabel();
        tx133 = new javax.swing.JTextField();
        tx144 = new javax.swing.JTextField();
        tx155 = new javax.swing.JTextField();
        tx166 = new javax.swing.JTextField();
        tx177 = new javax.swing.JTextField();

        jTextField7.setBackground(new java.awt.Color(204, 0, 0));
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setText("Agendar Doações");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jQuadroExames.setBackground(new java.awt.Color(153, 0, 0));

        jlbLocal4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jlbLocal4.setText("Local:");

        jLbData4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLbData4.setText("Data:");

        jLbHora4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLbHora4.setText("Hora:");

        jLbCodigo3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLbCodigo3.setText("Código:");

        jLbOpcao4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLbOpcao4.setText("Especialidade:");

        B9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B9.setText("Agendar");
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        jlbExame.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jlbExame.setText("Agendar Exames");

        tx166.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx166ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jQuadroExamesLayout = new javax.swing.GroupLayout(jQuadroExames);
        jQuadroExames.setLayout(jQuadroExamesLayout);
        jQuadroExamesLayout.setHorizontalGroup(
            jQuadroExamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jQuadroExamesLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jQuadroExamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jQuadroExamesLayout.createSequentialGroup()
                        .addComponent(jLbCodigo3)
                        .addGap(18, 18, 18)
                        .addComponent(tx166, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(jQuadroExamesLayout.createSequentialGroup()
                        .addGroup(jQuadroExamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jQuadroExamesLayout.createSequentialGroup()
                                .addComponent(jlbLocal4)
                                .addGap(18, 18, 18)
                                .addComponent(tx133, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jQuadroExamesLayout.createSequentialGroup()
                                .addGroup(jQuadroExamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jQuadroExamesLayout.createSequentialGroup()
                                        .addComponent(jLbData4)
                                        .addGap(18, 18, 18)
                                        .addComponent(tx144, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLbHora4))
                                    .addComponent(jlbExame))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tx177, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jQuadroExamesLayout.createSequentialGroup()
                                .addComponent(jLbOpcao4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tx155, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(158, 158, Short.MAX_VALUE))))
        );
        jQuadroExamesLayout.setVerticalGroup(
            jQuadroExamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jQuadroExamesLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jlbExame)
                .addGap(46, 46, 46)
                .addGroup(jQuadroExamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbLocal4)
                    .addComponent(tx133, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jQuadroExamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbData4)
                    .addComponent(jLbHora4)
                    .addComponent(tx144, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tx177, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jQuadroExamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbOpcao4)
                    .addComponent(tx155, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jQuadroExamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jQuadroExamesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(jQuadroExamesLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jQuadroExamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLbCodigo3)
                            .addComponent(tx166, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jQuadroExames, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jQuadroExames, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        //pegando o que foi digitado no Nome do formulario e atualizando
        //padrão mvc
                            exame.setLocal_exame(tx133.getText());
                            exame.setData_exame(tx144.getText());
                            exame.setHora_exame  (tx155.getText());
                            exame.setOpcaoExame(tx166.getText());
                            exame.setCodigoExame(tx177.getText());
                            
                           
                            exameBD = new exameDAO();
                            exameBD.insert(exame);
                            
                            // limpar campos
                            tx133.setText("");
			    tx144.setText("");
			    tx155.setText("");    
                            tx166.setText("");
                            tx177.setText("");

       
    }//GEN-LAST:event_B9ActionPerformed

    private void tx166ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx166ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx166ActionPerformed

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
            java.util.logging.Logger.getLogger(UsuarioExame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioExame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioExame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioExame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioExame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLbCodigo;
    private javax.swing.JLabel jLbCodigo1;
    private javax.swing.JLabel jLbCodigo2;
    private javax.swing.JLabel jLbCodigo3;
    private javax.swing.JLabel jLbData;
    private javax.swing.JLabel jLbData1;
    private javax.swing.JLabel jLbData2;
    private javax.swing.JLabel jLbData3;
    private javax.swing.JLabel jLbData4;
    private javax.swing.JLabel jLbHora;
    private javax.swing.JLabel jLbHora1;
    private javax.swing.JLabel jLbHora2;
    private javax.swing.JLabel jLbHora3;
    private javax.swing.JLabel jLbHora4;
    private javax.swing.JLabel jLbOpcao;
    private javax.swing.JLabel jLbOpcao1;
    private javax.swing.JLabel jLbOpcao2;
    private javax.swing.JLabel jLbOpcao3;
    private javax.swing.JLabel jLbOpcao4;
    private javax.swing.JPanel jQuadroDoacao;
    private javax.swing.JPanel jQuadroDoacao1;
    private javax.swing.JPanel jQuadroDoacao2;
    private javax.swing.JPanel jQuadroDoacao3;
    private javax.swing.JPanel jQuadroExames;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel jlbExame;
    private javax.swing.JLabel jlbLocal;
    private javax.swing.JLabel jlbLocal1;
    private javax.swing.JLabel jlbLocal2;
    private javax.swing.JLabel jlbLocal3;
    private javax.swing.JLabel jlbLocal4;
    private javax.swing.JTextField tx10;
    private javax.swing.JTextField tx11;
    private javax.swing.JTextField tx12;
    private javax.swing.JTextField tx13;
    private javax.swing.JTextField tx133;
    private javax.swing.JTextField tx14;
    private javax.swing.JTextField tx144;
    private javax.swing.JTextField tx15;
    private javax.swing.JTextField tx155;
    private javax.swing.JTextField tx16;
    private javax.swing.JTextField tx166;
    private javax.swing.JTextField tx17;
    private javax.swing.JTextField tx177;
    private javax.swing.JTextField tx18;
    private javax.swing.JTextField tx19;
    private javax.swing.JTextField tx20;
    private javax.swing.JTextField tx21;
    private javax.swing.JTextField tx22;
    private javax.swing.JTextField tx23;
    private javax.swing.JTextField tx24;
    private javax.swing.JTextField tx25;
    private javax.swing.JTextField tx26;
    private javax.swing.JTextField tx8;
    private javax.swing.JTextField tx9;
    // End of variables declaration//GEN-END:variables
}
