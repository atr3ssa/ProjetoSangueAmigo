/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.AgendarDoacao;
import conection.ConexaoDB;
import dao.doacaoDAO;



/**
 *
 * @author DreEm
 */
public class UsuarioDoacao extends javax.swing.JFrame {
    // banco de dados
                AgendarDoacao doacao = new AgendarDoacao();
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
        lblLocalD = new javax.swing.JLabel();
        lblDataD = new javax.swing.JLabel();
        lblHoraD = new javax.swing.JLabel();
        lblOpcaoD = new javax.swing.JLabel();
        tx12 = new javax.swing.JTextField();
        tx15 = new javax.swing.JTextField();
        tx14 = new javax.swing.JTextField();
        tx13 = new javax.swing.JTextField();
        lblTituloD = new javax.swing.JLabel();
        B10 = new javax.swing.JButton();
        B11 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jQuadroDoacao.setBackground(new java.awt.Color(255, 153, 102));

        lblLocalD.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblLocalD.setForeground(new java.awt.Color(204, 0, 0));
        lblLocalD.setText("Local:");

        lblDataD.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblDataD.setForeground(new java.awt.Color(204, 0, 0));
        lblDataD.setText("Data:");

        lblHoraD.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblHoraD.setForeground(new java.awt.Color(204, 0, 0));
        lblHoraD.setText("Hora:");

        lblOpcaoD.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblOpcaoD.setForeground(new java.awt.Color(204, 0, 0));
        lblOpcaoD.setText("Doação de:");

        lblTituloD.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTituloD.setForeground(new java.awt.Color(204, 0, 0));
        lblTituloD.setText("Agendar Doações");

        B10.setBackground(new java.awt.Color(204, 0, 0));
        B10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B10.setForeground(new java.awt.Color(255, 255, 255));
        B10.setText("Agendar");
        B10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B10ActionPerformed(evt);
            }
        });

        B11.setBackground(new java.awt.Color(204, 0, 0));
        B11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B11.setForeground(new java.awt.Color(255, 255, 255));
        B11.setText("Voltar");
        B11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B11ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Doações:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sangue;");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Plasma;");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sangue de Cordão Umbilical;");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Plaquetas;");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Orgãos e Tecidos");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Medula Óssea;");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        javax.swing.GroupLayout jQuadroDoacaoLayout = new javax.swing.GroupLayout(jQuadroDoacao);
        jQuadroDoacao.setLayout(jQuadroDoacaoLayout);
        jQuadroDoacaoLayout.setHorizontalGroup(
            jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jQuadroDoacaoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblTituloD)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jQuadroDoacaoLayout.createSequentialGroup()
                .addGroup(jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jQuadroDoacaoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblLocalD)
                        .addGap(18, 18, 18)
                        .addGroup(jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jQuadroDoacaoLayout.createSequentialGroup()
                                .addComponent(tx13, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblHoraD)
                                .addGap(18, 18, 18)
                                .addComponent(tx14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tx12, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jQuadroDoacaoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOpcaoD)
                            .addComponent(lblDataD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tx15, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jQuadroDoacaoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jQuadroDoacaoLayout.setVerticalGroup(
            jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jQuadroDoacaoLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lblTituloD)
                .addGap(53, 53, 53)
                .addGroup(jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jQuadroDoacaoLayout.createSequentialGroup()
                        .addGroup(jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tx12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLocalD))
                        .addGroup(jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jQuadroDoacaoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tx13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDataD)))
                            .addGroup(jQuadroDoacaoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tx14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHoraD))))
                        .addGap(18, 18, 18)
                        .addGroup(jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tx15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOpcaoD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                        .addGroup(jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(jQuadroDoacaoLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void B10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B10ActionPerformed
                            //pegando o que foi digitado no Nome do formulario e atualizando
                            //padrão mvc
                            
                            doacao.setLocal_doacao(tx12.getText());
                            doacao.setData_doacao(tx13.getText());
                            doacao.setHora_doacao(tx14.getText());
                            doacao.setOpcaoDoacao(tx15.getText());
                            
                           
                            doacaoBD = new doacaoDAO();
                            doacaoBD.insert(doacao);
                            
                            // limpar campos
                            tx12.setText("");
			    tx13.setText("");
			    tx14.setText("");    
                            tx15.setText("");                          
    }//GEN-LAST:event_B10ActionPerformed

    private void B11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B11ActionPerformed
        // TODO add your handling code here:
        new UsuarioPerfil().setVisible(true);
        dispose();
    }//GEN-LAST:event_B11ActionPerformed

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
    private javax.swing.JButton B10;
    private javax.swing.JButton B11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jQuadroDoacao;
    private javax.swing.JLabel lblDataD;
    private javax.swing.JLabel lblHoraD;
    private javax.swing.JLabel lblLocalD;
    private javax.swing.JLabel lblOpcaoD;
    private javax.swing.JLabel lblTituloD;
    private javax.swing.JTextField tx12;
    private javax.swing.JTextField tx13;
    private javax.swing.JTextField tx14;
    private javax.swing.JTextField tx15;
    // End of variables declaration//GEN-END:variables
}
