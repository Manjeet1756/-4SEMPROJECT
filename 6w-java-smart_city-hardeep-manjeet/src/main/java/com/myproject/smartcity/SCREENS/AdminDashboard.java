/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.myproject.smartcity.SCREENS;

/**
 *
 * @author Admin
 */
public class AdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     */
    public AdminDashboard() {
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

        birth = new javax.swing.JButton();
        death = new javax.swing.JButton();
        complaints = new javax.swing.JButton();
        employee = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dashboard = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 500));
        getContentPane().setLayout(null);

        birth.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        birth.setText("REQUEST BIRTH CERTIFICATE");
        birth.setBorder(new javax.swing.border.MatteBorder(null));
        birth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthActionPerformed(evt);
            }
        });
        getContentPane().add(birth);
        birth.setBounds(62, 70, 270, 39);

        death.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        death.setText("REQUEST DEATH CERTIFICATE");
        death.setBorder(new javax.swing.border.MatteBorder(null));
        death.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deathActionPerformed(evt);
            }
        });
        getContentPane().add(death);
        death.setBounds(62, 127, 268, 37);

        complaints.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        complaints.setText("COMPLAINTS");
        complaints.setBorder(new javax.swing.border.MatteBorder(null));
        complaints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complaintsActionPerformed(evt);
            }
        });
        getContentPane().add(complaints);
        complaints.setBounds(62, 182, 268, 35);

        employee.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        employee.setText("EMPLOYEES");
        employee.setBorder(new javax.swing.border.MatteBorder(null));
        employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeActionPerformed(evt);
            }
        });
        getContentPane().add(employee);
        employee.setBounds(62, 235, 268, 36);

        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        jLabel1.setText("ADMIN  DASHBOARD");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(66, 19, 282, 45);

        dashboard.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dashboard.setText("go to DASHBOARD ->");
        dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardActionPerformed(evt);
            }
        });
        getContentPane().add(dashboard);
        dashboard.setBounds(205, 310, 150, 22);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void birthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthActionPerformed
        // TODO add your handling code here:
        BirthCertificate users = new BirthCertificate();
        users.setVisible(true);
    }//GEN-LAST:event_birthActionPerformed

    private void complaintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complaintsActionPerformed
        // TODO add your handling code here:
        Complaints sc = new Complaints();
        sc.setVisible(true);
    }//GEN-LAST:event_complaintsActionPerformed

    private void employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeActionPerformed
        // TODO add your handling code here:
        EmployeeInformation users = new EmployeeInformation();
        users.setVisible(true);
    }//GEN-LAST:event_employeeActionPerformed

    private void deathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deathActionPerformed
        // TODO add your handling code here:
        DeathCertificate users = new DeathCertificate();
        users.setVisible(true);
    }//GEN-LAST:event_deathActionPerformed

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        // TODO add your handling code here:
        Dashboard sc = new Dashboard();
        sc.setVisible(true);
        
        
    }//GEN-LAST:event_dashboardActionPerformed

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton birth;
    private javax.swing.JButton complaints;
    private javax.swing.JButton dashboard;
    private javax.swing.JButton death;
    private javax.swing.JButton employee;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
