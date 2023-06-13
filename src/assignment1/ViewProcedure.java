/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment1;

/**
 *
 * @author chrisliuwell
 */
public class ViewProcedure extends javax.swing.JFrame {

    /**
     * Creates new form ViewProcedure
     */
    public ViewProcedure() {
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

        Header = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        iconminmaxclose1 = new javax.swing.JPanel();
        ButtonClose1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ProcedureOptions = new javax.swing.JPanel();
        CreateProcedureForm = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        GetProcedureType = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        EditProcedureType = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        EditProcedureForm = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        GetDateTime = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        CreateProcedureForm1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        GetDateTime1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setBackground(new java.awt.Color(0, 153, 255));
        Header.setPreferredSize(new java.awt.Dimension(100, 50));
        Header.setLayout(new java.awt.BorderLayout());

        iconminmaxclose1.setPreferredSize(new java.awt.Dimension(150, 100));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/close.png"))); // NOI18N
        jLabel13.setText("jLabel1");
        jLabel13.setPreferredSize(new java.awt.Dimension(120, 40));
        ButtonClose1.add(jLabel13);

        javax.swing.GroupLayout iconminmaxclose1Layout = new javax.swing.GroupLayout(iconminmaxclose1);
        iconminmaxclose1.setLayout(iconminmaxclose1Layout);
        iconminmaxclose1Layout.setHorizontalGroup(
            iconminmaxclose1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iconminmaxclose1Layout.createSequentialGroup()
                .addGap(0, 100, Short.MAX_VALUE)
                .addComponent(ButtonClose1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        iconminmaxclose1Layout.setVerticalGroup(
            iconminmaxclose1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconminmaxclose1Layout.createSequentialGroup()
                .addComponent(ButtonClose1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel14.setText("PROCEDURE");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                .addComponent(iconminmaxclose1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconminmaxclose1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Header.add(jPanel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(Header, java.awt.BorderLayout.PAGE_START);

        ProcedureOptions.setBackground(new java.awt.Color(204, 204, 204));
        ProcedureOptions.setPreferredSize(new java.awt.Dimension(230, 408));

        CreateProcedureForm.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Get Duration");

        javax.swing.GroupLayout CreateProcedureFormLayout = new javax.swing.GroupLayout(CreateProcedureForm);
        CreateProcedureForm.setLayout(CreateProcedureFormLayout);
        CreateProcedureFormLayout.setHorizontalGroup(
            CreateProcedureFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateProcedureFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CreateProcedureFormLayout.setVerticalGroup(
            CreateProcedureFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateProcedureFormLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        GetProcedureType.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Get Description");

        javax.swing.GroupLayout GetProcedureTypeLayout = new javax.swing.GroupLayout(GetProcedureType);
        GetProcedureType.setLayout(GetProcedureTypeLayout);
        GetProcedureTypeLayout.setHorizontalGroup(
            GetProcedureTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GetProcedureTypeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        GetProcedureTypeLayout.setVerticalGroup(
            GetProcedureTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GetProcedureTypeLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        EditProcedureType.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Return to Main Menu");

        javax.swing.GroupLayout EditProcedureTypeLayout = new javax.swing.GroupLayout(EditProcedureType);
        EditProcedureType.setLayout(EditProcedureTypeLayout);
        EditProcedureTypeLayout.setHorizontalGroup(
            EditProcedureTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditProcedureTypeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        EditProcedureTypeLayout.setVerticalGroup(
            EditProcedureTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditProcedureTypeLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        EditProcedureForm.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("Get Procedure ID");

        javax.swing.GroupLayout EditProcedureFormLayout = new javax.swing.GroupLayout(EditProcedureForm);
        EditProcedureForm.setLayout(EditProcedureFormLayout);
        EditProcedureFormLayout.setHorizontalGroup(
            EditProcedureFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditProcedureFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EditProcedureFormLayout.setVerticalGroup(
            EditProcedureFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditProcedureFormLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        GetDateTime.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("Procedure Form");

        javax.swing.GroupLayout GetDateTimeLayout = new javax.swing.GroupLayout(GetDateTime);
        GetDateTime.setLayout(GetDateTimeLayout);
        GetDateTimeLayout.setHorizontalGroup(
            GetDateTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GetDateTimeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        GetDateTimeLayout.setVerticalGroup(
            GetDateTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GetDateTimeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        CreateProcedureForm1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setText("Edit Duration");

        javax.swing.GroupLayout CreateProcedureForm1Layout = new javax.swing.GroupLayout(CreateProcedureForm1);
        CreateProcedureForm1.setLayout(CreateProcedureForm1Layout);
        CreateProcedureForm1Layout.setHorizontalGroup(
            CreateProcedureForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateProcedureForm1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CreateProcedureForm1Layout.setVerticalGroup(
            CreateProcedureForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateProcedureForm1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        GetDateTime1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setText("Get Cost");

        javax.swing.GroupLayout GetDateTime1Layout = new javax.swing.GroupLayout(GetDateTime1);
        GetDateTime1.setLayout(GetDateTime1Layout);
        GetDateTime1Layout.setHorizontalGroup(
            GetDateTime1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GetDateTime1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        GetDateTime1Layout.setVerticalGroup(
            GetDateTime1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GetDateTime1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        javax.swing.GroupLayout ProcedureOptionsLayout = new javax.swing.GroupLayout(ProcedureOptions);
        ProcedureOptions.setLayout(ProcedureOptionsLayout);
        ProcedureOptionsLayout.setHorizontalGroup(
            ProcedureOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProcedureOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProcedureOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EditProcedureForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GetDateTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProcedureOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CreateProcedureForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CreateProcedureForm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GetDateTime1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProcedureOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditProcedureType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GetProcedureType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ProcedureOptionsLayout.setVerticalGroup(
            ProcedureOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProcedureOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProcedureOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GetProcedureType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProcedureOptionsLayout.createSequentialGroup()
                        .addComponent(CreateProcedureForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CreateProcedureForm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EditProcedureForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProcedureOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProcedureOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(EditProcedureType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GetDateTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(GetDateTime1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        getContentPane().add(ProcedureOptions, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ViewProcedure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProcedure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProcedure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProcedure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProcedure().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonClose1;
    private javax.swing.JPanel CreateProcedureForm;
    private javax.swing.JPanel CreateProcedureForm1;
    private javax.swing.JPanel EditProcedureForm;
    private javax.swing.JPanel EditProcedureType;
    private javax.swing.JPanel GetDateTime;
    private javax.swing.JPanel GetDateTime1;
    private javax.swing.JPanel GetProcedureType;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel ProcedureOptions;
    private javax.swing.JPanel iconminmaxclose1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
