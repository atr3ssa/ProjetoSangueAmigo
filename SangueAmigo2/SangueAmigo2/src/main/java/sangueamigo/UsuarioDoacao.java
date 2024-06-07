/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sangueamigo;



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
        B7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jQuadroDoacao.setBackground(new java.awt.Color(204, 0, 0));

        lblLocalD.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblLocalD.setText("Local:");

        lblDataD.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblDataD.setText("Data:");

        lblHoraD.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblHoraD.setText("Hora:");

        lblOpcaoD.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblOpcaoD.setText("Doação de:");

        lblTituloD.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTituloD.setText("Agendar Doações");

        B7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B7.setText("Agendar");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

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
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(jQuadroDoacaoLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jQuadroDoacaoLayout.createSequentialGroup()
                        .addComponent(lblHoraD)
                        .addGap(18, 18, 18)
                        .addComponent(tx14, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTituloD)
                    .addGroup(jQuadroDoacaoLayout.createSequentialGroup()
                        .addComponent(lblOpcaoD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tx15, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jQuadroDoacaoLayout.createSequentialGroup()
                            .addComponent(lblLocalD)
                            .addGap(18, 18, 18)
                            .addComponent(tx12, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jQuadroDoacaoLayout.createSequentialGroup()
                            .addComponent(lblDataD)
                            .addGap(18, 18, 18)
                            .addComponent(tx13, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jQuadroDoacaoLayout.setVerticalGroup(
            jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jQuadroDoacaoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblTituloD)
                .addGap(48, 48, 48)
                .addGroup(jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLocalD))
                .addGap(29, 29, 29)
                .addGroup(jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataD)
                    .addComponent(tx13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoraD)
                    .addComponent(tx14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOpcaoD)
                    .addComponent(tx15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jQuadroDoacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
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
    }//GEN-LAST:event_B7ActionPerformed

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
    private javax.swing.JButton B7;
    private javax.swing.JButton jButton1;
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
