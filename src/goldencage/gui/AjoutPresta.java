/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package goldencage.gui;

import goldencage.Dao.PrestataireDao;
import goldencage.entities.Prestataire;
import javax.swing.JOptionPane;

/**
 *
 * @author ASMA
 */
public class AjoutPresta extends javax.swing.JFrame {

    /**
     * Creates new form AjoutPresta
     */
    public AjoutPresta() {
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

        jLabel2 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        btninscription = new javax.swing.JButton();
        combodomaine = new javax.swing.JComboBox();
        textlogin = new javax.swing.JTextField();
        textpassword = new javax.swing.JPasswordField();
        textemail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inscription Prestataire", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 18), new java.awt.Color(0, 102, 51))); // NOI18N

        jPasswordField1.setText("jPasswordField1");
        jLayeredPane1.add(jPasswordField1);
        jPasswordField1.setBounds(237, 363, 111, 20);

        jTextField2.setText("jTextField2");
        jLayeredPane1.add(jTextField2);
        jTextField2.setBounds(237, 401, 111, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jLayeredPane1.add(jComboBox1);
        jComboBox1.setBounds(237, 450, 111, 20);

        btninscription.setText("sign in");
        btninscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninscriptionActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btninscription);
        btninscription.setBounds(210, 270, 63, 23);

        combodomaine.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "coiffure", "gastronomie", "salles des fetes", "voyage" }));
        combodomaine.setBorder(null);
        jLayeredPane1.add(combodomaine);
        combodomaine.setBounds(220, 210, 170, 20);

        textlogin.setBorder(null);
        textlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textloginActionPerformed(evt);
            }
        });
        jLayeredPane1.add(textlogin);
        textlogin.setBounds(210, 100, 180, 20);

        textpassword.setBorder(null);
        jLayeredPane1.add(textpassword);
        textpassword.setBounds(220, 140, 170, 20);

        textemail.setBorder(null);
        jLayeredPane1.add(textemail);
        textemail.setBounds(220, 180, 170, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/forme2.png"))); // NOI18N
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(20, 20, 480, 320);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textloginActionPerformed

    private void btninscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninscriptionActionPerformed
        // TODO add your handling code here:
     String username = textlogin.getText();
     String password= textpassword.getText();
     String email = textemail.getText();
     String domaine= combodomaine.getSelectedItem().toString();
     PrestataireDao prestDAO = new PrestataireDao();
        Prestataire p = new Prestataire();
        p.setUsername_prestataire(username);
        p.setPassword_prestataire(password);
         p.setEmail_prestataire(email);
        
        p.setDomaine_prestataire(domaine);
        
       prestDAO.insertPrestataire(p);
       JOptionPane.showMessageDialog(rootPane, "Inscription terminée avec succes !");
       new accueil1().setVisible(true);
       
        
      
                                                  

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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AjoutPresta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutPresta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutPresta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutPresta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutPresta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btninscription;
    private javax.swing.JComboBox combodomaine;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField textemail;
    private javax.swing.JTextField textlogin;
    private javax.swing.JPasswordField textpassword;
    // End of variables declaration//GEN-END:variables
}