/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.myproject.smartcity.SCREENS;
import com.myproject.smartcity.database_connectivity.ConnectionClass;
import com.myproject.smartcity.model.UserModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Admin
 */
public class AddEmployee extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployee
     */
    public AddEmployee() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        passwordTF = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        addressTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 500));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        jLabel1.setText("        ADD EMPLOYEE");
        jLabel1.setMinimumSize(new java.awt.Dimension(400, 500));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 0, 280, 46);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("      EMAIL");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 110, 101, 35);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("  PASSWORD");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 150, 101, 35);

        emailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTFActionPerformed(evt);
            }
        });
        getContentPane().add(emailTF);
        emailTF.setBounds(190, 110, 180, 33);

        passwordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTFActionPerformed(evt);
            }
        });
        getContentPane().add(passwordTF);
        passwordTF.setBounds(190, 150, 180, 35);

        add.setBackground(java.awt.SystemColor.activeCaption);
        add.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        add.setText("ADD");
        add.setBorder(new javax.swing.border.MatteBorder(null));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(130, 310, 100, 33);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText(" ADDRESS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 210, 90, 20);
        getContentPane().add(addressTF);
        addressTF.setBounds(190, 200, 180, 35);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("      NAME");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 60, 101, 32);
        getContentPane().add(nameTF);
        nameTF.setBounds(190, 60, 180, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("EMPLOYEE ID");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 260, 120, 20);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(190, 252, 180, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTFActionPerformed

    private void passwordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTFActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        String name = nameTF.getText();
        String password = passwordTF.getText();
        String email = emailTF.getText();
        String address = addressTF.getText();

        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter email");
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter password");
        } else if(name.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Enter name");
         }else if(address.isEmpty()){
             JOptionPane.showMessageDialog(null,"Enter address");
         }
         else {
            final String searchStatement = "SELECT * from users where email=?";

            try {
                PreparedStatement searchPreparedStatement = ConnectionClass.getInstance().connection.prepareStatement(searchStatement);
                searchPreparedStatement.setString(1, email);

                ResultSet searhResultSet = searchPreparedStatement.executeQuery();

                while (searhResultSet.next()) {
                    JOptionPane.showMessageDialog(null, "Email already exists");
                    return;
                }

                final String insertStatement = "INSERT INTO users(name, email, password, address, role) values(?,?,?,?,?)";
                PreparedStatement preparedStatement = ConnectionClass.getInstance().connection.prepareStatement(insertStatement);
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, email);
                preparedStatement.setString(3, password);
                preparedStatement.setString(4, address);
                preparedStatement.setInt(5, 2);

                final int isAdded = preparedStatement.executeUpdate();

                if (isAdded > 1) {
                    JOptionPane.showMessageDialog(null, "error");
                } else {
                    JOptionPane.showMessageDialog(null, "value add");
                }
            } catch (SQLException ex) {
                System.out.println("error in " + AddEmployee.class.getName() + " = " + ex);
            }
        
    }//GEN-LAST:event_addActionPerformed
    }
    /**
     * @param args the command line arguments
     */
   public static void main(String args[]){
       
   
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField addressTF;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField passwordTF;
    // End of variables declaration//GEN-END:variables

}
