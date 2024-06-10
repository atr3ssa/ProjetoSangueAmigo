/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import bean.AgendarExames;
import conection.ConexaoDB;
import dao.exameDAO;

/**
 *
 * @author DreEm
 */
public class UsuarioExame extends javax.swing.JFrame {
                AgendarExames agendarexames = new AgendarExames();
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
        lblLocalEx = new javax.swing.JLabel();
        lblDataEx = new javax.swing.JLabel();
        lblHoraEx = new javax.swing.JLabel();
        lblOpcaoEx = new javax.swing.JLabel();
        B8 = new javax.swing.JButton();
        lblTituloEx = new javax.swing.JLabel();
        tx8 = new javax.swing.JTextField();
        tx9 = new javax.swing.JTextField();
        tx11 = new javax.swing.JTextField();
        tx10 = new javax.swing.JTextField();
        B9 = new javax.swing.JButton();

        jTextField7.setBackground(new java.awt.Color(204, 0, 0));
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setText("Agendar Doações");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jQuadroExames.setBackground(new java.awt.Color(255, 153, 102));

        lblLocalEx.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblLocalEx.setForeground(new java.awt.Color(204, 0, 0));
        lblLocalEx.setText("Local:");

        lblDataEx.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDataEx.setForeground(new java.awt.Color(204, 0, 0));
        lblDataEx.setText("Data:");

        lblHoraEx.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblHoraEx.setForeground(new java.awt.Color(204, 0, 0));
        lblHoraEx.setText("Hora:");

        lblOpcaoEx.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblOpcaoEx.setForeground(new java.awt.Color(204, 0, 0));
        lblOpcaoEx.setText("Especialidade:");

        B8.setBackground(new java.awt.Color(204, 0, 0));
        B8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B8.setForeground(new java.awt.Color(255, 255, 255));
        B8.setText("Agendar");
        B8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        lblTituloEx.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTituloEx.setForeground(new java.awt.Color(204, 0, 0));
        lblTituloEx.setText("Agendar Exames");

        B9.setBackground(new java.awt.Color(204, 0, 0));
        B9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B9.setForeground(new java.awt.Color(255, 255, 255));
        B9.setText("Voltar");
        B9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jQuadroExamesLayout = new javax.swing.GroupLayout(jQuadroExames);
        jQuadroExames.setLayout(jQuadroExamesLayout);
        jQuadroExamesLayout.setHorizontalGroup(
            jQuadroExamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jQuadroExamesLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jQuadroExamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTituloEx)
                    .addGroup(jQuadroExamesLayout.createSequentialGroup()
                        .addGroup(jQuadroExamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLocalEx)
                            .addComponent(lblDataEx))
                        .addGap(18, 18, 18)
                        .addGroup(jQuadroExamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tx8)
                            .addGroup(jQuadroExamesLayout.createSequentialGroup()
                                .addComponent(tx9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(lblHoraEx)
                                .addGap(18, 18, 18)
                                .addComponent(tx10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jQuadroExamesLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblOpcaoEx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tx11)))
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(jQuadroExamesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jQuadroExamesLayout.setVerticalGroup(
            jQuadroExamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jQuadroExamesLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lblTituloEx)
                .addGap(48, 48, 48)
                .addGroup(jQuadroExamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLocalEx))
                .addGap(19, 19, 19)
                .addGroup(jQuadroExamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDataEx)
                    .addComponent(lblHoraEx)
                    .addComponent(tx10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jQuadroExamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOpcaoEx)
                    .addComponent(tx11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(jQuadroExamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jQuadroExames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        //pegando o que foi digitado no Nome do formulario e atualizando
        //padrão mvc
                            agendarexames.setLocal_exame(tx8.getText());
                            agendarexames.setData_exame(tx9.getText());
                            agendarexames.setHora_exame(tx10.getText());
                            agendarexames.setOpcaoExame(tx11.getText());
                            
                            
                           
                            exameBD = new exameDAO();
                            exameBD.insert(agendarexames);
                            
                            // limpar campos
                            tx8.setText("");
			    tx9.setText("");
                            tx10.setText("");
			    tx11.setText("");    
 
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        // TODO add your handling code here:
        new UsuarioPerfil().setVisible(true);
    }//GEN-LAST:event_B9ActionPerformed

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
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jQuadroExames;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lblDataEx;
    private javax.swing.JLabel lblHoraEx;
    private javax.swing.JLabel lblLocalEx;
    private javax.swing.JLabel lblOpcaoEx;
    private javax.swing.JLabel lblTituloEx;
    private javax.swing.JTextField tx10;
    private javax.swing.JTextField tx11;
    private javax.swing.JTextField tx8;
    private javax.swing.JTextField tx9;
    // End of variables declaration//GEN-END:variables
}
