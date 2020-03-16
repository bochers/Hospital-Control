package views;

import classes.Database;
import classes.Item;
import classes.Service;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author isaac
 */
public class Services extends javax.swing.JFrame {

    /**
     * Creates new form Services
     */
    Database db;
    String uType;
    
    public Services(String userType) {
        uType = userType;
        initComponents();
        db = new Database();
        this.setLocationRelativeTo(null);
        clearTxt();
    }

    public Services() {
        uType = "";
        initComponents();
        db = new Database();
        this.setLocationRelativeTo(null);
        clearTxt();
    }

    public void clearTxt() {
        textId.setText(Integer.toString(autoId()));
        textPrice.setText("");
        textClient.setText("");
        textDescription.setText("");
        comboBox.setSelectedIndex(-1);
    }

    public int autoId() {
        int size = db.getServices().size();
        return size + 1;
    }

    public Service createService(Service service) {
        int price;
        try {
            price = Integer.parseInt(textPrice.getText());
        } catch (NumberFormatException e) {
            throw new RuntimeException("Price must be a number");
        }
        if (comboBox.getSelectedIndex() == -1) {
            throw new RuntimeException("Combobox must have a value");
        }
        service.setId(Integer.parseInt(textId.getText()));
        service.setClientName(textClient.getText());
        service.setType((String) comboBox.getSelectedItem());
        service.setPrice(price);
        service.setDescription(textDescription.getText().equals("") ? "none" : textDescription.getText());
        if (service.getClientName().equals("")) {
            throw new RuntimeException("Name cannot be null");
        }
        if (service.getType().equals("")) {
            throw new RuntimeException("Type cannot be null");
        }
        if (price < 0) {
            throw new RuntimeException("Price cannot be negative");
        }

        return service;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textPrice = new javax.swing.JTextField();
        textClient = new javax.swing.JTextField();
        textDescription = new javax.swing.JTextField();
        textId = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Numero de servicio");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        comboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consulta", "Abulancia", "Operacion", "Examenes" }));
        getContentPane().add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Tipo de servicio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Cliente");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Descripcion");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Precio");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        textPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(textPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 160, -1));

        textClient.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(textClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 400, -1));

        textDescription.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(textDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 620, 150));

        textId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(textId, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 50, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBack.setText("Regresar");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, -1));

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoGris.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        Navigation navigationWindow;
        navigationWindow = new Navigation(uType);
        navigationWindow.show();
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try {
            Service service = new Service();
            service = createService(service);
            db.newService(service);
            clearTxt();
            JOptionPane.showMessageDialog(null, "Service saved succesfully");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        clearTxt();
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Services().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField textClient;
    private javax.swing.JTextField textDescription;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textPrice;
    // End of variables declaration//GEN-END:variables
}
