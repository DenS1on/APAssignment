/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment1;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ooiju
 */
public class ProcedureForm extends javax.swing.JFrame {
    
    private String userInput1;
    private String userInput2;
    private String userInput3;
    private String userInput4;
    private String userInput5;
    private String userInput6;
    private String userInput7;
    private int integer1;
    private int integer2;
    

    /**
     * Creates new form TreatmentForm
     */
    public ProcedureForm() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TreatmentID = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        DateStart = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        DateStart1 = new javax.swing.JLabel();
        Submit1 = new javax.swing.JButton();
        DateStart2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        DateStart3 = new javax.swing.JLabel();
        DateStart4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        DateStart5 = new javax.swing.JLabel();
        DateStart6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        DateStart7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        DateStart8 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField7 = new javax.swing.JTextField();
        ReturntoMainMenu = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setBackground(new java.awt.Color(204, 255, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel1.setText("Treatment Form");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        TreatmentID.setText("Procedure ID:");

        jTextField1.setToolTipText("Example: 0335");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        DateStart.setText("Procedure Name:");

        jTextField4.setText("RM");
        jTextField4.setToolTipText("");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField2.setToolTipText("");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        DateStart1.setText("Duration:");

        Submit1.setText("Submit");
        Submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit1ActionPerformed(evt);
            }
        });

        DateStart2.setText("Cost:");

        jTextField5.setToolTipText("Example: 2 days");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        DateStart3.setText("Description:");

        DateStart4.setText("Procedure Type:");

        jTextField3.setToolTipText("");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        DateStart5.setText("Date:");

        DateStart6.setText("Time:");

        jTextField6.setToolTipText("03:00 a.m");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        DateStart7.setText("Amount:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        DateStart8.setText("Frequency:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jTextField7.setToolTipText("Exmp: 03/03/2023");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        ReturntoMainMenu.setText("Return to Main Menu");
        ReturntoMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturntoMainMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TreatmentID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateStart1)
                    .addComponent(DateStart2)
                    .addComponent(DateStart3)
                    .addComponent(DateStart4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateStart5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateStart6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateStart7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateStart8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(ReturntoMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Submit1))
                        .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TreatmentID)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateStart)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateStart4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateStart5)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateStart6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateStart7)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateStart8)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateStart1)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateStart2)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateStart3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit1)
                    .addComponent(ReturntoMainMenu))
                .addGap(15, 15, 15))
        );

        jPanel3.setToolTipText("");

        jLabel7.setBackground(new java.awt.Color(187, 187, 187));
        jLabel7.setFont(new java.awt.Font("Sitka Subheading", 1, 48)); // NOI18N
        jLabel7.setText("Procedure Form");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel7)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        userInput1 = jTextField1.getText();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        userInput7 = jTextField4.getText();
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        userInput2 = jTextField2.getText();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        userInput6 = jTextField5.getText();
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        userInput3 = jTextField3.getText();
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        userInput5 = jTextField6.getText();
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Object selectedObject = jComboBox1.getSelectedItem();
        integer1 = Integer.parseInt(selectedObject.toString());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        Object selectedObject = jComboBox3.getSelectedItem();
        integer2 = Integer.parseInt(selectedObject.toString());
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        userInput4 = jTextField7.getText();
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void Submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit1ActionPerformed
            jTextField1ActionPerformed(evt);
            jTextField4ActionPerformed(evt);
            jTextField2ActionPerformed(evt);
            jTextField5ActionPerformed(evt);
            jTextField3ActionPerformed(evt);
            jTextField6ActionPerformed(evt);
            jTextField7ActionPerformed(evt);
            String description = jTextArea1.getText();
            

            String Data = "Procedure ID: " + userInput1 + "\n";
            String Data2 = "Procedure Name: " + userInput2 + "\n";
            String Data3 = "Procedure Type: " + userInput3 + "\n";
            String Data4 = "Date: "+ userInput4 + "\n";
            String Data5 = "Time: " + userInput5 + "\n";
            String Data6 = "Amount: " + integer1 + "\n";
            String Data7 = "Frequency: " + integer2 + "\n";
            String Data8 = "Duration: " + userInput6 + "\n";
            String Data9 = "Cost: " + userInput7 + "\n";
            String Data10 = "Description: " + description + "\n";
            
            


           try {
            FileWriter writer = new FileWriter("../APAssignment/src/Text/Procedure Form.txt", true);
            writer.write(Data);
            writer.write(Data2);
            writer.write(Data3);
            writer.write(Data4);
            writer.write(Data5);
            writer.write(Data6);
            writer.write(Data7);
            writer.write(Data8);
            writer.write(Data9);                       
            writer.write(Data10);                                   
            writer.write("\n");                
            writer.close();
            JOptionPane.showMessageDialog(this, "Success");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the data: " + e.getMessage());
        }
    }//GEN-LAST:event_Submit1ActionPerformed

    private void ReturntoMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturntoMainMenuActionPerformed
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
        menu.pack();
        menu.setLocationRelativeTo(null);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_ReturntoMainMenuActionPerformed

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
            java.util.logging.Logger.getLogger(ProcedureForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProcedureForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProcedureForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcedureForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProcedureForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DateStart;
    private javax.swing.JLabel DateStart1;
    private javax.swing.JLabel DateStart2;
    private javax.swing.JLabel DateStart3;
    private javax.swing.JLabel DateStart4;
    private javax.swing.JLabel DateStart5;
    private javax.swing.JLabel DateStart6;
    private javax.swing.JLabel DateStart7;
    private javax.swing.JLabel DateStart8;
    private javax.swing.JButton ReturntoMainMenu;
    private javax.swing.JButton Submit1;
    private javax.swing.JLabel TreatmentID;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
