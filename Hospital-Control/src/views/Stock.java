package views;

import classes.Database;
import classes.Item;
import classes.Person;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
public class Stock extends javax.swing.JFrame {

    /**
     * Creates new form Stock
     */
    Database db;
    DefaultTableModel tb;
    SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
    ArrayList<Item> stockItems;
    boolean isUpdating;

    public Stock() {
        initComponents();
        String header[] = {"Id", "Nombre", "Cantidad", "Precio", "Caducidad"};
        String data[][] = {};
        tb = new DefaultTableModel(data, header);
        jTStock.setModel(tb);
        clearTxt();
        isUpdating = false;
        this.setLocationRelativeTo(null);
        db = new Database();
        stockItems = db.getStock();
        updateRows();
    }

    public void fillRow(Item item) {
        String id = String.valueOf(item.getId());
        String name = item.getName();
        String amount = String.valueOf(item.getAmount());
        String price = String.valueOf(item.getPrice());
        String expiration = item.getExpiration();
        String[] rowData = {id, name, amount, price, expiration};

        tb.addRow(rowData);
    }

    public void updateRows() {
        tb.setRowCount(0);
        stockItems = db.getStock();
        stockItems.forEach((item) -> {
            fillRow(item);
        });
    }

    public int autoId() {
        int size = db.getStock().size();
        return size + 1;
    }

    public void clearTxt() {
        dateChooser.setDate(null);
        priceText.setText("");
        nameText.setText("");
        amountText.setText("");
        priceText.setText("");
        idText.setText("");
        btnNew.setEnabled(true);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(false);
        idText.setEnabled(false);
        nameText.setEnabled(false);
        amountText.setEnabled(false);
        priceText.setEnabled(false);
        dateChooser.setEnabled(false);
        btnDelete.setEnabled(false);
        btnCancel.setEnabled(false);
    }

    public Item createItem(Item item) {
        String name = nameText.getText();
        int price = Integer.parseInt(priceText.getText());
        int amount = Integer.parseInt(amountText.getText());
        String date = dFormat.format(dateChooser.getDate());
        item.setId(Integer.parseInt(idText.getText()));
        item.setName(name);
        item.setPrice(price);
        item.setAmount(amount);
        item.setType("undefined");
        item.setExpiration(date);

        return item;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTStock = new javax.swing.JTable();
        searchItemText = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        priceText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        amountText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        getContentPane().add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 170, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, 30));

        jTStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Cantidad", "Precio", "Caducidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTStockMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTStock);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 307, 800, 190));

        searchItemText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchItemTextActionPerformed(evt);
            }
        });
        getContentPane().add(searchItemText, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 220, 30));

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Caducidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        priceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTextActionPerformed(evt);
            }
        });
        getContentPane().add(priceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 170, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Id");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        idText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextActionPerformed(evt);
            }
        });
        getContentPane().add(idText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 170, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Precio");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));
        getContentPane().add(dateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 170, 30));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdate.setText("Actualizar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, -1, -1));

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, -1));

        btnNew.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNew.setText("Nuevo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        getContentPane().add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        amountText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTextActionPerformed(evt);
            }
        });
        getContentPane().add(amountText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 170, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Cantidad");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoGris.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void searchItemTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchItemTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchItemTextActionPerformed

    private void priceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTextActionPerformed

    private void idTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Navigation navigationWindow;
        navigationWindow = new Navigation();
        navigationWindow.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        Item item;

        item = db.searchStockItem(Integer.parseInt(searchItemText.getText()));
        searchItemText.setText(item.getName());
        if (item.getId() != 0) {
            idText.setText(Integer.toString(item.getId()));
            nameText.setText(item.getName());
            priceText.setText(Integer.toString(item.getPrice()));
            amountText.setText(Integer.toString(item.getAmount()));
            searchItemText.setText(" ");
            btnDelete.setEnabled(true);
            btnUpdate.setEnabled(true);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        btnSave.setEnabled(true);
        btnSearch.setEnabled(true);
        nameText.setEnabled(true);
        amountText.setEnabled(true);
        priceText.setEnabled(true);
        searchItemText.setEnabled(true);
        dateChooser.setEnabled(true);
        idText.setText(String.valueOf(autoId()));
        btnCancel.setEnabled(true);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Item item = new Item();
        try {
            if (isUpdating) {
                db.modifyStockItem(createItem(item));
                isUpdating = false;
            } else {
                db.newStockItem(createItem(item));
                String auxId = String.valueOf(autoId());
                idText.setText(auxId);
            }
            JOptionPane.showMessageDialog(null, "Guardado con éxito.");
            updateRows();
            clearTxt();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Los objetos deben tener una fecha de expiración.");
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Los "
                    + "datos son incorrectos.");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void amountTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountTextActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (jTStock.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Datos insuficientes para cancelar.");
        } else {
            db.deleteStockItem((Integer.parseInt(idText.getText())));
            updateRows();
        }
        clearTxt();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jTStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTStockMouseClicked
        // TODO add your handling code here:
        clearTxt();
        btnDelete.setEnabled(true);
        btnUpdate.setEnabled(true);
        idText.setText((String) jTStock.getValueAt(jTStock.getSelectedRow(), 0));
        nameText.setText((String) jTStock.getValueAt(jTStock.getSelectedRow(), 1));
        amountText.setText((String) jTStock.getValueAt(jTStock.getSelectedRow(), 2));
        priceText.setText((String) jTStock.getValueAt(jTStock.getSelectedRow(), 3));
    }//GEN-LAST:event_jTStockMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        nameText.setEnabled(true);
        amountText.setEnabled(true);
        priceText.setEnabled(true);
        searchItemText.setEnabled(true);
        dateChooser.setEnabled(true);
        btnSave.setEnabled(true);
        btnNew.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        btnCancel.setEnabled(true);
        isUpdating = true;
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        clearTxt();
        isUpdating = false;
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
            java.util.logging.Logger.getLogger(Stock.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountText;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JTextField idText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTStock;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField priceText;
    private javax.swing.JTextField searchItemText;
    // End of variables declaration//GEN-END:variables
}
