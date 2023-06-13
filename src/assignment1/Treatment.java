/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment1;

import javax.swing.JFrame;

/**
 *
 * @author chrisliuwell
 */
public class Treatment extends javax.swing.JFrame {

    /**
     * Creates new form Delete1
     */
    public Treatment() {
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

        MainFrame = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        DeleteLabel = new javax.swing.JLabel();
        CloseIcon = new javax.swing.JLabel();
        TreatmentForm = new javax.swing.JPanel();
        TFormLabel = new javax.swing.JLabel();
        TFromIcon = new javax.swing.JLabel();
        ReturntoMainMenu = new javax.swing.JPanel();
        ReturnMainMenuLabel = new javax.swing.JLabel();
        ReturnMainMenuIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        MainFrame.setBackground(new java.awt.Color(102, 102, 102));
        MainFrame.setForeground(new java.awt.Color(255, 255, 255));

        Header.setBackground(new java.awt.Color(51, 51, 51));

        DeleteLabel.setBackground(new java.awt.Color(255, 255, 255));
        DeleteLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        DeleteLabel.setForeground(new java.awt.Color(255, 255, 255));
        DeleteLabel.setText("TREATMENT");

        CloseIcon.setIcon(new javax.swing.ImageIcon("/Users/chrisliuwell/Full_of_me/Java/Assignment1/src/Icons/close.png"));
        CloseIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DeleteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CloseIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CloseIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TreatmentForm.setBackground(new java.awt.Color(255, 255, 255));
        TreatmentForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TreatmentFormMouseClicked(evt);
            }
        });

        TFormLabel.setBackground(new java.awt.Color(204, 204, 204));
        TFormLabel.setText("Treatment Form");

        TFromIcon.setIcon(new javax.swing.ImageIcon("/Users/chrisliuwell/Full_of_me/Java/Assignment1/src/Icons/Procedure Form.png"));

        javax.swing.GroupLayout TreatmentFormLayout = new javax.swing.GroupLayout(TreatmentForm);
        TreatmentForm.setLayout(TreatmentFormLayout);
        TreatmentFormLayout.setHorizontalGroup(
            TreatmentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TreatmentFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TFormLabel)
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TreatmentFormLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TFromIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        TreatmentFormLayout.setVerticalGroup(
            TreatmentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TreatmentFormLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TFromIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(TFormLabel)
                .addContainerGap())
        );

        ReturntoMainMenu.setBackground(new java.awt.Color(255, 255, 255));
        ReturntoMainMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturntoMainMenuMouseClicked(evt);
            }
        });

        ReturnMainMenuLabel.setBackground(new java.awt.Color(204, 204, 204));
        ReturnMainMenuLabel.setText("Return to Main Menu");

        ReturnMainMenuIcon.setIcon(new javax.swing.ImageIcon("/Users/chrisliuwell/Full_of_me/Java/Assignment1/src/Icons/Menu.png"));

        javax.swing.GroupLayout ReturntoMainMenuLayout = new javax.swing.GroupLayout(ReturntoMainMenu);
        ReturntoMainMenu.setLayout(ReturntoMainMenuLayout);
        ReturntoMainMenuLayout.setHorizontalGroup(
            ReturntoMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReturntoMainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ReturnMainMenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReturntoMainMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ReturnMainMenuIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        ReturntoMainMenuLayout.setVerticalGroup(
            ReturntoMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReturntoMainMenuLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(ReturnMainMenuIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ReturnMainMenuLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout MainFrameLayout = new javax.swing.GroupLayout(MainFrame);
        MainFrame.setLayout(MainFrameLayout);
        MainFrameLayout.setHorizontalGroup(
            MainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TreatmentForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReturntoMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        MainFrameLayout.setVerticalGroup(
            MainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainFrameLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(MainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TreatmentForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ReturntoMainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        getContentPane().add(MainFrame, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseIconMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseIconMouseClicked

    private void TreatmentFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TreatmentFormMouseClicked
        TreatmentForm tf = new TreatmentForm();
        tf.setVisible(true);
        tf.pack();
        tf.setLocationRelativeTo(null);
        tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_TreatmentFormMouseClicked

    private void ReturntoMainMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturntoMainMenuMouseClicked
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
        menu.pack();
        menu.setLocationRelativeTo(null);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_ReturntoMainMenuMouseClicked

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
            java.util.logging.Logger.getLogger(Treatment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Treatment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Treatment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Treatment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Treatment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseIcon;
    private javax.swing.JLabel DeleteLabel;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel MainFrame;
    private javax.swing.JLabel ReturnMainMenuIcon;
    private javax.swing.JLabel ReturnMainMenuLabel;
    private javax.swing.JPanel ReturntoMainMenu;
    private javax.swing.JLabel TFormLabel;
    private javax.swing.JLabel TFromIcon;
    private javax.swing.JPanel TreatmentForm;
    // End of variables declaration//GEN-END:variables
}
