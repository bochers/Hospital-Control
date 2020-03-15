/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author erick
 */
public class Navigation extends javax.swing.JFrame {

    /**
     * Creates new form Navigation
     *
     * @param userType
     */
    String uType;

    public Navigation(String userType) {

        initComponents();

        if (userType.equals("Supervisor")) {
            bttnUsers.setEnabled(false);
            // bttnStock.setEnabled(false);
        } else if (userType.equals("Secretari@")) {
            bttnMedics.setEnabled(false);
            bttnMedicalH.setEnabled(false);
            bttnUsers.setEnabled(false);
            //bttnStock.setEnabled(false);
            bttnServices.setEnabled(false);
        }

        uType = userType;
    }

    public Navigation() {

        initComponents();
        uType = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttnMedics = new javax.swing.JButton();
        bttnUsers = new javax.swing.JButton();
        bttonAppointments = new javax.swing.JButton();
        bttonPatients = new javax.swing.JButton();
        bttnMedicalH = new javax.swing.JButton();
        bttnQuit = new javax.swing.JButton();
        HCLabel = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        bttnServices = new javax.swing.JButton();
        bttnStock = new javax.swing.JButton();
        bttnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bttnMedics.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bttnMedics.setText("Médicos");
        bttnMedics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnMedicsActionPerformed(evt);
            }
        });
        getContentPane().add(bttnMedics, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 250, 50));

        bttnUsers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bttnUsers.setText("Usuarios");
        bttnUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnUsersActionPerformed(evt);
            }
        });
        getContentPane().add(bttnUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 250, 50));

        bttonAppointments.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bttonAppointments.setText("Citas");
        bttonAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttonAppointmentsActionPerformed(evt);
            }
        });
        getContentPane().add(bttonAppointments, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 250, 50));

        bttonPatients.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bttonPatients.setText("Pacientes");
        bttonPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttonPatientsActionPerformed(evt);
            }
        });
        getContentPane().add(bttonPatients, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 250, 50));

        bttnMedicalH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bttnMedicalH.setText("Historial Médico");
        getContentPane().add(bttnMedicalH, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 250, 50));

        bttnQuit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bttnQuit.setText("Salir");
        bttnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnQuitActionPerformed(evt);
            }
        });
        getContentPane().add(bttnQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 250, 50));

        HCLabel.setFont(new java.awt.Font("DFMincho-UB", 1, 48)); // NOI18N
        HCLabel.setForeground(new java.awt.Color(255, 255, 255));
        HCLabel.setText("Hospital Control");
        getContentPane().add(HCLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 420, 60));

        separator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        getContentPane().add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 700, 4));

        bttnServices.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bttnServices.setText("Servicios");
        bttnServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnServicesActionPerformed(evt);
            }
        });
        getContentPane().add(bttnServices, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 250, 50));

        bttnStock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bttnStock.setText("Stock");
        bttnStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnStockActionPerformed(evt);
            }
        });
        getContentPane().add(bttnStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 250, 50));

        bttnLogout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bttnLogout.setText("Cerrar Sesión");
        bttnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(bttnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/lake.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bttnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnQuitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bttnQuitActionPerformed

    private void bttnUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnUsersActionPerformed
        // TODO add your handling code here:
        Users usersWindow = new Users(uType);
        usersWindow.show();
        this.dispose();
    }//GEN-LAST:event_bttnUsersActionPerformed

    private void bttnMedicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnMedicsActionPerformed
        // TODO add your handling code here:
        Employees employeesWindow;
        employeesWindow = new Employees(uType);
        employeesWindow.show();
        this.dispose();
    }//GEN-LAST:event_bttnMedicsActionPerformed

    private void bttonPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttonPatientsActionPerformed
        // TODO add your handling code here:
        Patients patientsWindow;
        patientsWindow = new Patients(uType);
        patientsWindow.show();
        this.dispose();
    }//GEN-LAST:event_bttonPatientsActionPerformed

    private void bttonAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttonAppointmentsActionPerformed
        Appointments appointmentWindow;
                appointmentWindow = new Appointments(uType);
                appointmentWindow.show();
                this.dispose();
    }//GEN-LAST:event_bttonAppointmentsActionPerformed

    private void bttnServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnServicesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnServicesActionPerformed

    private void bttnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnStockActionPerformed
        // TODO add your handling code here:
        Stock stockWindow;
        stockWindow = new Stock();
        stockWindow.show();
        this.dispose();
    }//GEN-LAST:event_bttnStockActionPerformed

    private void bttnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnLogoutActionPerformed
        // TODO add your handling code here:
        Login loginWindow = new Login();
        loginWindow.show();
        this.dispose();
    }//GEN-LAST:event_bttnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(Navigation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Navigation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Navigation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Navigation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Navigation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HCLabel;
    private javax.swing.JButton bttnLogout;
    private javax.swing.JButton bttnMedicalH;
    private javax.swing.JButton bttnMedics;
    private javax.swing.JButton bttnQuit;
    private javax.swing.JButton bttnServices;
    private javax.swing.JButton bttnStock;
    private javax.swing.JButton bttnUsers;
    private javax.swing.JButton bttonAppointments;
    private javax.swing.JButton bttonPatients;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator separator;
    // End of variables declaration//GEN-END:variables
}
