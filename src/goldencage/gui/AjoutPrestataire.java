/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package goldencage.gui;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import goldencage.Dao.PrestataireDao;
import goldencage.entities.Prestataire;

/**
 *
 * @author ASMA
 */
public class AjoutPrestataire extends javax.swing.JFrame {

    /**
     * Creates new form AjoutPrestataire
     */
    public AjoutPrestataire() {
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textlogin = new javax.swing.JTextField();
        textemail = new javax.swing.JTextField();
        textpassword = new javax.swing.JPasswordField();
        textconfirm = new javax.swing.JPasswordField();
        combodomaine = new javax.swing.JComboBox();
        btninscription = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jLayeredPane1.setName("S'inscrire\n"); // NOI18N

        jLabel3.setText("login :");

        jLabel4.setText("password :");

        jLabel5.setText("confirm password :");

        jLabel6.setText("email :");

        jLabel7.setText("Domaine :");

        combodomaine.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "coiffure", "tailleur", "gastronomie", "agence de voyage", "salles de fetes" }));
        combodomaine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combodomaineActionPerformed(evt);
            }
        });

        btninscription.setText("s'inscrire");
        btninscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninscriptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(textemail))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(combodomaine, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(32, 32, 32)
                        .addComponent(textlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textconfirm)
                            .addComponent(textpassword))))
                .addContainerGap(276, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btninscription, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(combodomaine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btninscription)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(textlogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(textemail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(textpassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(textconfirm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(combodomaine, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btninscription, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combodomaineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combodomaineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combodomaineActionPerformed

    private void btninscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninscriptionActionPerformed
        // TODO add your handling code here:
       String username = textlogin.getText();
       String pswd= textpassword.getText();
       String mail= textemail.getText();
       //String conf= textconfirm.getText();
       String dom=combodomaine.getSelectedItem().toString();
        PrestataireDao prestDAO = new PrestataireDao();
        Prestataire p = new Prestataire();
        p.setUsername_prestataire(username);
       
        p.setPassword_prestataire(pswd);
         p.setEmail_prestataire(mail);
        
        p.setDomaine_prestataire(dom);
        
       prestDAO.insertPrestataire(p);
       JOptionPane.showMessageDialog(rootPane, "Inscription terminée avec succes !");
    }//GEN-LAST:event_btninscriptionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       // try {
       //     for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
       //         if ("Nimbus".equals(info.getName())) {
          //          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          //          break;
          //      }
        //    }
       // } catch (ClassNotFoundException ex) {
         //   java.util.logging.Logger.getLogger(AjoutPrestataire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //} catch (ItextloginnException ex) {
         //   java.util.logging.Logger.getLogger(AjoutPrestataire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //} catch (IllegalAccessException ex) {
          //  java.util.logging.Logger.getLogger(AjoutPrestataire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //} catch (javax.swing.UnsupportedLookAndFeelException ex) {
          //  java.util.logging.Logger.getLogger(AjoutPrestataire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //}
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutPrestataire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btninscription;
    private javax.swing.JComboBox combodomaine;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPasswordField textconfirm;
    private javax.swing.JTextField textemail;
    private javax.swing.JTextField textlogin;
    private javax.swing.JPasswordField textpassword;
    // End of variables declaration//GEN-END:variables
}