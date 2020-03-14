package views;

import classes.Database;
import classes.User;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author isaac
 */
public class Users extends javax.swing.JFrame {

    Database d;
    String uType;
    /**
     * Creates new form Users
     *
     * @param userType
     */
    public Users(String userType) {
        initComponents();
        d = new Database();
        uType = userType;
        this.setLocationRelativeTo(null);
    }

    public Users() {
        d = new Database();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        usersLabel = new javax.swing.JLabel();
        godLabel = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        emailText = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        profileComboBox = new javax.swing.JComboBox<>();
        profileLabel = new javax.swing.JLabel();
        modifyButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        passwordLabel = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        usernameLabel = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        bgd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usersLabel.setFont(new java.awt.Font("DFMincho-UB", 1, 36)); // NOI18N
        usersLabel.setText("Usuarios");
        jPanel1.add(usersLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 180, 60));

        godLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        godLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/chayanne (2).png"))); // NOI18N
        jPanel1.add(godLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 400, 470));

        separator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel1.add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 740, 4));

        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });
        jPanel1.add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 230, 30));

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emailLabel.setText("Email:");
        jPanel1.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        searchButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchButton.setText("Buscar");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 110, 40));

        profileComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Supervisor", "Secretari@" }));
        profileComboBox.setSelectedIndex(-1);
        jPanel1.add(profileComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, 30));

        profileLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        profileLabel.setText("Perfil:");
        jPanel1.add(profileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        modifyButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        modifyButton.setText("Modificar");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });
        jPanel1.add(modifyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 110, 40));

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteButton.setText("Eliminar");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 110, 40));

        saveButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        saveButton.setText("Guardar");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 110, 40));

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordLabel.setText("Contraseña:");
        jPanel1.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        passwordText.setPreferredSize(new java.awt.Dimension(230, 30));
        jPanel1.add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        usernameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usernameLabel.setText("Username:");
        jPanel1.add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });
        jPanel1.add(usernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 230, 30));

        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnBack.setText("Regresar");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 110, 40));

        newButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newButton.setText("Nuevo");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });
        jPanel1.add(newButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 110, 40));

        bgd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/UsersBGD.jpg"))); // NOI18N
        jPanel1.add(bgd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void clearTxt() {

        usernameText.setText("");
        emailText.setText("");
        passwordText.setText("");
        profileComboBox.setSelectedIndex(-1);
    }

    public boolean isValidUser() {
        boolean valid;

        valid = usernameText.getText().length() > 0 && emailText.getText().length() > 0
                && passwordText.getText().length() > 0 && profileComboBox.getSelectedIndex() != -1;

        return valid;
    }

    public void displayUser(User user) {

        usernameText.setText(user.getUsername());
        emailText.setText(user.getEmail());
        passwordText.setText(user.getPassword());

        //Profile Selection
        if (user.getEditUsers() && user.getEditMedics() && user.getEditPatients()) {
            profileComboBox.setSelectedItem("Administrador");
        } else if (user.getEditMedics() && user.getEditPatients()) {
            profileComboBox.setSelectedItem("Supervisor");
        } else if (user.getEditPatients()) {
            profileComboBox.setSelectedItem("Secretari@");
        }
    }

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        User u;
        u = d.searchUser(usernameText.getText());
        displayUser(u);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        d.deleteUser(usernameText.getText());
        clearTxt();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        User u = new User();

        if (isValidUser()) {

            u.setUsername(usernameText.getText());
            u.setEmail(emailText.getText());
            u.setPassword(passwordText.getText());

            if (profileComboBox.getSelectedItem().equals("Administrador")) {
                u.setEditMedics(true);
                u.setEditPatients(true);
                u.setEditUsers(true);
            } else if (profileComboBox.getSelectedItem().equals("Supervisor")) {
                u.setEditMedics(true);
                u.setEditPatients(true);
                u.setEditUsers(false);
            } else if (profileComboBox.getSelectedItem().equals("Secretari@")) {
                u.setEditMedics(false);
                u.setEditPatients(true);
                u.setEditUsers(false);
            }
            d.newUser(u);
            JOptionPane.showMessageDialog(null, "Guardado con éxito.");
            clearTxt();

        } else {
            JOptionPane.showMessageDialog(null, "Datos incompletos.");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed

        User u = new User();

        if (isValidUser()) {

            u.setUsername(usernameText.getText());
            u.setEmail(emailText.getText());
            u.setPassword(passwordText.getText());

            if (profileComboBox.getSelectedItem().equals("Administrador")) {
                u.setEditMedics(true);
                u.setEditPatients(true);
                u.setEditUsers(true);
            } else if (profileComboBox.getSelectedItem().equals("Supervisor")) {
                u.setEditMedics(true);
                u.setEditPatients(true);
                u.setEditUsers(false);
            } else if (profileComboBox.getSelectedItem().equals("Secretari@")) {
                u.setEditMedics(false);
                u.setEditPatients(true);
                u.setEditUsers(false);
            }

            d.modifyUsers(u);
            JOptionPane.showMessageDialog(null, "Modificado con éxito.");
            clearTxt();
        } else {
            JOptionPane.showMessageDialog(null, "Datos incompletos.");
        }
    }//GEN-LAST:event_modifyButtonActionPerformed

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        Navigation navigationWindow = new Navigation(uType);
        navigationWindow.show();
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel godLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modifyButton;
    private javax.swing.JButton newButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JComboBox<String> profileComboBox;
    private javax.swing.JLabel profileLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameText;
    private javax.swing.JLabel usersLabel;
    // End of variables declaration//GEN-END:variables
}
