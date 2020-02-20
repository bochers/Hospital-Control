package views;

import java.awt.Image;
import javax.swing.ImageIcon;

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

    /**
     * Creates new form Users
     */
    public Users() {
        initComponents();
        Image img;
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/assets/chayanne2.png"));
        img = icon.getImage();
        godButton.setIcon(new ImageIcon(img.getScaledInstance(godButton.getWidth(), godButton.getHeight(), WIDTH)));
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
        separator = new javax.swing.JSeparator();
        cityLabel = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        surnameText = new javax.swing.JTextField();
        surnameLabel = new javax.swing.JLabel();
        addressText = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        passwordText = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        phoneText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        godLabel = new javax.swing.JLabel();
        profileComboBox = new javax.swing.JComboBox<>();
        sexComboBox = new javax.swing.JComboBox<>();
        stateComboBox = new javax.swing.JComboBox<>();
        idLabel = new javax.swing.JLabel();
        sexLabel = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        profileLabel = new javax.swing.JLabel();
        cityComboBox = new javax.swing.JComboBox<>();
        modifyButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        godButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        bgd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usersLabel.setFont(new java.awt.Font("DFMincho-UB", 1, 36)); // NOI18N
        usersLabel.setText("Users");
        jPanel1.add(usersLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 140, 60));

        separator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel1.add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 740, 4));

        cityLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cityLabel.setText("Ciudad:");
        jPanel1.add(cityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        idText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextActionPerformed(evt);
            }
        });
        jPanel1.add(idText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 80, 30));

        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        jPanel1.add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 230, 30));

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameLabel.setText("Nombre:");
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        surnameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameTextActionPerformed(evt);
            }
        });
        jPanel1.add(surnameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 230, 30));

        surnameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        surnameLabel.setText("Apellidos:");
        jPanel1.add(surnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        addressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextActionPerformed(evt);
            }
        });
        jPanel1.add(addressText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 230, 30));

        addressLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addressLabel.setText("Dirección:");
        jPanel1.add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        jPanel1.add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 230, 30));

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordLabel.setText("Password:");
        jPanel1.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        phoneLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        phoneLabel.setText("Teléfono:");
        jPanel1.add(phoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        phoneText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextActionPerformed(evt);
            }
        });
        jPanel1.add(phoneText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 230, 30));

        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });
        jPanel1.add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 230, 30));

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emailLabel.setText("Email:");
        jPanel1.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 50, -1));

        searchButton.setText("Buscar");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 130, -1));

        godLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/chayanne (1).png"))); // NOI18N
        jPanel1.add(godLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 310, 350));

        profileComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(profileComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        sexComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(sexComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        stateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(stateComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        idLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idLabel.setText("ID:");
        jPanel1.add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        sexLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sexLabel.setText("Sexo:");
        jPanel1.add(sexLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        stateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stateLabel.setText("Estado:");
        jPanel1.add(stateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        profileLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        profileLabel.setText("Perfil:");
        jPanel1.add(profileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        cityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cityComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        modifyButton.setText("Modificar");
        jPanel1.add(modifyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, -1));

        updateButton.setText("Actualizar");
        jPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, -1, -1));

        godButton.setText("Chayanne");
        godButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                godButtonActionPerformed(evt);
            }
        });
        jPanel1.add(godButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, -1, -1));

        deleteButton.setText("Eliminar");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));

        saveButton.setText("Guardar");
        jPanel1.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        bgd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/UsersBGD.jpeg"))); // NOI18N
        jPanel1.add(bgd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void surnameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surnameTextActionPerformed

    private void addressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed

    private void phoneTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTextActionPerformed

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void godButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_godButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_godButtonActionPerformed

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
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressText;
    private javax.swing.JLabel bgd;
    private javax.swing.JComboBox<String> cityComboBox;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JButton godButton;
    private javax.swing.JLabel godLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modifyButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordText;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneText;
    private javax.swing.JComboBox<String> profileComboBox;
    private javax.swing.JLabel profileLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JSeparator separator;
    private javax.swing.JComboBox<String> sexComboBox;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JComboBox<String> stateComboBox;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JTextField surnameText;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel usersLabel;
    // End of variables declaration//GEN-END:variables
}