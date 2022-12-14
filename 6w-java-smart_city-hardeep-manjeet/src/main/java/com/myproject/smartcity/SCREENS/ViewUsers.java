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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ViewUsers extends javax.swing.JFrame {

    /**
     * Creates new form ViewUser
     */
    public ViewUsers() {
        initComponents();
        
       getUsers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(Table);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(6, 19, 398, 275);

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void TableMouseClicked(java.awt.event.MouseEvent evt) {                                     
        DefaultTableModel dtm = (DefaultTableModel)Table.getModel();
        int selectedRow = Table.getSelectedRow();
        UserModel userModel = new UserModel();
        userModel.setID(Integer.parseInt(dtm.getValueAt(selectedRow, 0).toString()));
        userModel.setName(dtm.getValueAt(selectedRow, 1).toString());
        userModel.setEmail(dtm.getValueAt(selectedRow, 2).toString());
        userModel.setPassword(dtm.getValueAt(selectedRow, 3).toString());
        userModel.setAddress(dtm.getValueAt(selectedRow, 4).toString());
        
        userModel.setRole(Integer.parseInt(dtm.getValueAt(selectedRow, 5).toString()));
        
        UpdateAdminform updateAdmin = new UpdateAdminform(userModel);
        updateAdmin.setVisible(true);
        this.dispose();
        
        
   
    }
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
            java.util.logging.Logger.getLogger(ViewUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
             
            }
        });
    }
      private void getUsers() {
        final String statement = "SELECT * from users";
        try {
            PreparedStatement preparedStatement = ConnectionClass.getInstance().connection.prepareStatement(statement);

            ResultSet resultSet = preparedStatement.executeQuery();
            final String[] headerName = {"id","name","email","address","role",};
            DefaultTableModel model = new DefaultTableModel(null, headerName);
            Table.setModel(model);
            Object[] row = new Object[5];

            while (resultSet.next()) {
                row[0] = resultSet.getInt("id");
                row[1] = resultSet.getString("name");
                 row[2] = resultSet.getString("email");
                row[3] = resultSet.getInt("password");
                row[4] = resultSet.getString("Address");
                 row[5] = resultSet.getInt("role");
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewUsers.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
