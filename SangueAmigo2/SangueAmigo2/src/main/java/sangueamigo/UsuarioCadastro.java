/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sangueamigo;



/**
 *
 * @author DreEm
 */
public class UsuarioCadastro extends javax.swing.JFrame {
    // banco de dados
                Usuario usuario= new Usuario();
                ConexaoDB conn = new ConexaoDB();  
                //usuarioDAO = usuario padrao = todos os métodos de CRUD ficam aqui, tudo do banco fica nele
                //usuario = normal, só os getters e setters
                usuarioDAO usuarioBD;
 
    

    /**
     * Creates new form UsuarioCadastro
     */
    public UsuarioCadastro() {
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        JQuadroVermelho2 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblDNascimento = new javax.swing.JLabel();
        jblTituloCadastro2 = new javax.swing.JLabel();
        lblCEP = new javax.swing.JLabel();
        lblTSanguineo = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        B1 = new javax.swing.JButton();
        tx1 = new javax.swing.JTextField();
        tx2 = new javax.swing.JTextField();
        tx3 = new javax.swing.JTextField();
        tx4 = new javax.swing.JTextField();
        tx5 = new javax.swing.JTextField();
        tx7 = new javax.swing.JTextField();
        tx6 = new javax.swing.JTextField();
        jQuadrovermelho1 = new javax.swing.JPanel();
        lblSistema = new javax.swing.JLabel();
    
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

        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        JQuadroVermelho2 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        jblTituloCadastro2 = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        B1 = new javax.swing.JButton();
        tx1 = new javax.swing.JTextField();
        tx2 = new javax.swing.JTextField();
        tx3 = new javax.swing.JTextField();
        tx4 = new javax.swing.JTextField();
        tx5 = new javax.swing.JTextField();
        tx7 = new javax.swing.JTextField();
        tx6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblDNascimento = new javax.swing.JLabel();
        lblCEP = new javax.swing.JLabel();
        lblTSanguineo = new javax.swing.JLabel();
        jQuadrovermelho1 = new javax.swing.JPanel();
        lblSistema = new javax.swing.JLabel();

        jTextField3.setText("Digite o nome Inteiro");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        JQuadroVermelho2.setBackground(new java.awt.Color(204, 0, 0));
        JQuadroVermelho2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JQuadroVermelho2.setForeground(new java.awt.Color(102, 0, 0));

        lblNome.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblNome.setText("Nome:");

        jblTituloCadastro2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jblTituloCadastro2.setForeground(new java.awt.Color(51, 0, 0));
        jblTituloCadastro2.setText("Cadastro");

        lblSenha.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblSenha.setText("Senha:");

        lblEmail.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblEmail.setText("Email:");

        lblCPF.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblCPF.setText("CPF:");

        B1.setBackground(new java.awt.Color(102, 0, 0));
        B1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B1.setForeground(new java.awt.Color(255, 255, 255));
        B1.setText("Cadastrar");
        B1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        tx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx2ActionPerformed(evt);
            }
        });

        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblDNascimento.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblDNascimento.setText("Data De Nascimento:");

        lblCEP.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblCEP.setText("CEP:");

        lblTSanguineo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblTSanguineo.setText("Tipo sanguíneo:");

        javax.swing.GroupLayout JQuadroVermelho2Layout = new javax.swing.GroupLayout(JQuadroVermelho2);
        JQuadroVermelho2.setLayout(JQuadroVermelho2Layout);
        JQuadroVermelho2Layout.setHorizontalGroup(
            JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jblTituloCadastro2))
                    .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                                .addComponent(lblTSanguineo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tx7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                                .addComponent(lblCEP)
                                .addGap(26, 26, 26)
                                .addComponent(tx6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                                .addComponent(lblEmail)
                                .addGap(18, 18, 18)
                                .addComponent(tx3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome)
                                    .addComponent(lblCPF))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tx2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tx1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                                    .addComponent(lblDNascimento)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tx5))
                                .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                                    .addComponent(lblSenha)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tx4, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JQuadroVermelho2Layout.setVerticalGroup(
            JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JQuadroVermelho2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jblTituloCadastro2)
                .addGap(30, 30, 30)
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(tx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPF))
                .addGap(18, 18, 18)
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addGap(18, 18, 18)
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDNascimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCEP))
                .addGap(18, 18, 18)
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTSanguineo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(JQuadroVermelho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jQuadrovermelho1.setBackground(new java.awt.Color(153, 0, 0));
        jQuadrovermelho1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblSistema.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lblSistema.setText("Sangue Amigo");

        javax.swing.GroupLayout jQuadrovermelho1Layout = new javax.swing.GroupLayout(jQuadrovermelho1);
        jQuadrovermelho1.setLayout(jQuadrovermelho1Layout);
        jQuadrovermelho1Layout.setHorizontalGroup(
            jQuadrovermelho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jQuadrovermelho1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lblSistema)
                .addContainerGap())
        );
        jQuadrovermelho1Layout.setVerticalGroup(
            jQuadrovermelho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jQuadrovermelho1Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(lblSistema)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jQuadrovermelho1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JQuadroVermelho2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jQuadrovermelho1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JQuadroVermelho2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                         
                            //pegando o que foi digitado no Nome do formulario e atualizando
                            //padrão mvc
                            
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
                            tx7.setText(""); 
                            
                           
                            
                            
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx2ActionPerformed

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
            java.util.logging.Logger.getLogger(UsuarioCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JPanel JQuadroVermelho2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jQuadrovermelho1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel jblTituloCadastro2;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblDNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSistema;
    private javax.swing.JLabel lblTSanguineo;
    private javax.swing.JTextField tx1;
    private javax.swing.JTextField tx2;
    private javax.swing.JTextField tx3;
    private javax.swing.JTextField tx4;
    private javax.swing.JTextField tx5;
    private javax.swing.JTextField tx6;
    private javax.swing.JTextField tx7;
    // End of variables declaration//GEN-END:variables
}
