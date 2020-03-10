package views;

import classes.Person;
import classes.Database;

import java.awt.Image;
import static java.awt.image.ImageObserver.WIDTH;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author isaac
 */
public final class Employees extends javax.swing.JFrame {

    Database d;
    String uType;

    /**
     * Creates new form Employees
     */
    public Employees(String userType) {
        initComponents();
        d = new Database();
        deactivate();
        uType = userType;
        Image img;
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/assets/Zoom-icon.png"));
        img = icon.getImage();
        btnBuscar.setIcon(new ImageIcon(img.getScaledInstance(btnBuscar.getWidth(), btnBuscar.getHeight(), WIDTH)));

        //Image img1;
        //ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/assets/newbutton.png"));
        //img1 = icon1.getImage();
        //btnNew.setIcon(new ImageIcon(img1.getScaledInstance(btnNew.getWidth(), btnNew.getHeight(), WIDTH)));
    }

    public Employees() {
        initComponents();
        deactivate();
    }

    public void deactivate() {
        IDText.setEnabled(false);
        btnSave.setEnabled(false);
        btnCancel.setEnabled(false);
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        NameText.setEnabled(false);
        APText.setEnabled(false);
        AMText.setEnabled(false);
        DireccionText.setEnabled(false);
        PhoneText.setEnabled(false);
        EmailText.setEnabled(false);
        sexComboBox.setEnabled(false);
        ComboBoxESTADO.setEnabled(false);
        CityText.setEnabled(false);
    }

    public void activate() {
        //IDText.setEnabled(true);
        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(true);
        NameText.setEnabled(true);
        APText.setEnabled(true);
        AMText.setEnabled(true);
        DireccionText.setEnabled(true);
        PhoneText.setEnabled(true);
        EmailText.setEnabled(true);
        sexComboBox.setEnabled(true);
        ComboBoxESTADO.setEnabled(true);
        CityText.setEnabled(true);
    }

    public void clearTxt() {
        IDText.setText("");
        NameText.setText("");
        APText.setText("");
        AMText.setText("");
        DireccionText.setText("");
        PhoneText.setText("");
        EmailText.setText("");
        sexComboBox.setSelectedIndex(-1);
        ComboBoxESTADO.setSelectedIndex(-1);
        CityText.setText("");
    }

    public boolean isValidPatient() {
        boolean valid = false;

        if (NameText.getText().length() > 0) {
            if (APText.getText().length() > 0) {
                if (AMText.getText().length() > 0) {
                    if (DireccionText.getText().length() > 0) {
                        if (PhoneText.getText().length() > 0 && PhoneText.getText().length() == 10) {
                            if (EmailText.getText().length() > 0) {
                                if (sexComboBox.getSelectedIndex() != -1) {
                                    if (ComboBoxESTADO.getSelectedIndex() != -1) {
                                        if (CityText.getText().length() > 0) {
                                            valid = true;
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Error en Ciudad");
                                            CityText.requestFocusInWindow();
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Error en Estado");
                                        ComboBoxESTADO.requestFocusInWindow();
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Error en Sexo");
                                    sexComboBox.requestFocusInWindow();
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Error en Email");
                                EmailText.requestFocusInWindow();
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Error en Teléfono");
                            PhoneText.requestFocusInWindow();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Error en Dirección");
                        DireccionText.requestFocusInWindow();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error en Apellido Materno");
                    AMText.requestFocusInWindow();
                    
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error en Apellido Paterno");
                APText.requestFocusInWindow();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error en Nombre");
            NameText.requestFocusInWindow();
        }

        return valid;
    }
    
    public static boolean validEmail(String input){
        //String input = EmailText.getText();
        String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }
    
    public static boolean validateAddress( String address )
   {
      return address.matches( 
         "\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" );
   } // end method validateAddress
    
    public Person addPerson(Person p) {
        p.setID(Integer.parseInt(IDText.getText()));
        p.setName(NameText.getText());
        p.setLast(APText.getText());
        p.setSLast(AMText.getText());
        p.setAddress(DireccionText.getText());
        p.setPhone(PhoneText.getText());
        p.setEmail(EmailText.getText());
        p.setSex((String) sexComboBox.getSelectedItem());
        p.setState((String) ComboBoxESTADO.getSelectedItem());
        p.setCity(CityText.getText());

        return p;
    }

    public void displayPerson(Person person) {
        if (person.getID() != 0) {
            IDText.setText(String.valueOf(person.getID()));
            NameText.setText(person.getName());
            APText.setText(person.getLast());
            AMText.setText(person.getSLast());
            DireccionText.setText(person.getAddress());
            PhoneText.setText(person.getPhone());
            EmailText.setText(person.getEmail());
            sexComboBox.setSelectedItem(person.getSex());
            ComboBoxESTADO.setSelectedItem(person.getState());
            CityText.setText(person.getCity());
        } else {
            JOptionPane.showMessageDialog(null, "Paciente no encontrado.");
        }

    }

    public static boolean isNumeric(String strNum) {
    if (strNum == null) {
        return false;
    }
    try {
        double d = Double.parseDouble(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}
    
    public boolean checkNum(){
        if(isNumeric(NameText.getText())){
            JOptionPane.showMessageDialog(null, "No se adminten numeros.");
            return false;
        }
        if(isNumeric(APText.getText())){
            JOptionPane.showMessageDialog(null, "No se adminten numeros.");
            return false;
        }
        if(isNumeric(AMText.getText())){
            JOptionPane.showMessageDialog(null, "No se adminten numeros.");
            return false;
        }
        return true;
    }
    
    public int ID() {
        int size = d.medicsSize();
        size++;
        return size;
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
        BuscarText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        IDText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AMText = new javax.swing.JTextField();
        NameText = new javax.swing.JTextField();
        DireccionText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        APText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PhoneText = new javax.swing.JTextField();
        EmailText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ComboBoxESTADO = new javax.swing.JComboBox<>();
        sexComboBox = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        btnBack = new javax.swing.JButton();
        CityText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(BuscarText, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 65, 260, 30));

        jLabel1.setText("ID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 80, -1, 20));

        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 60, 60));
        jPanel1.add(IDText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 190, 30));

        jLabel2.setText("Dirección:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 200, -1, -1));

        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        jPanel1.add(AMText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 190, 30));
        jPanel1.add(NameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 190, 30));
        jPanel1.add(DireccionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 190, 30));

        jLabel4.setText("A. Paterno:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 140, 70, -1));
        jPanel1.add(APText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 190, 30));

        jLabel5.setText("A. Materno:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 170, 80, -1));

        jLabel6.setText("Teléfono:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 230, 70, -1));
        jPanel1.add(PhoneText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 190, 30));
        jPanel1.add(EmailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 190, 30));

        jLabel7.setText("E-mail:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 250, 50, 30));

        jLabel8.setText("Estado:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 316, -1, -1));

        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 80, 50));

        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 80, 50));

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 80, 50));

        btnNew.setText("NEW");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel1.add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 80, 50));

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 80, 50));

        jLabel12.setText("Ciudad:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 347, -1, -1));

        jLabel13.setText("Sexo:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 279, -1, 30));

        ComboBoxESTADO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua", "Coahuila", "Colima", "Distrito Federal", "Durango", "Estado de México", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas" }));
        ComboBoxESTADO.setSelectedIndex(-1);
        jPanel1.add(ComboBoxESTADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 193, 30));
        ComboBoxESTADO.getAccessibleContext().setAccessibleName("");
        ComboBoxESTADO.getAccessibleContext().setAccessibleDescription("");

        sexComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer", "Otro" }));
        sexComboBox.setSelectedIndex(-1);
        jPanel1.add(sexComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 193, 30));

        jLabel14.setFont(new java.awt.Font("Phosphate", 1, 36)); // NOI18N
        jLabel14.setText("Médicos");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 290, -1));

        separator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel1.add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, 4));

        btnBack.setText("BACK TO MENU");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));
        jPanel1.add(CityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 190, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/doctor.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 440, 450));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondoGreen.jpg"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        activate();
        clearTxt();
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        //btnBuscar.setEnabled(false);
        //BuscarText.setEnabled(false);
        IDText.setText(String.valueOf(ID()));
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        Person p;

        p = d.searchMedic(BuscarText.getText());
        displayPerson(p);
        //BuscarText.setText("");
        if (p.getID() != 0) {
            activate();
            btnSave.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if(checkNum() == true){
            if (isValidPatient() == true) {
                if(validateAddress(DireccionText.getText()) == true){
                    if(validEmail(EmailText.getText()) == true){
                        Person m = new Person();
                        d.modifyMedics(addPerson(m));
                        JOptionPane.showMessageDialog(null, "Modificado con éxito.");
                        clearTxt();
                        deactivate();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Correo inválido.");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Direccion inválida."); 
                }
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        Navigation navigationWindow;
        navigationWindow = new Navigation(uType);
        navigationWindow.show();
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        deactivate();
        clearTxt();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(checkNum() == true){
            if (isValidPatient() == true) {
                if(validateAddress(DireccionText.getText()) == true){
                    if(validEmail(EmailText.getText()) == true){
                        Person p = new Person();
                        d.newMedic(addPerson(p));
                        JOptionPane.showMessageDialog(null, "Guardado con éxito.");
                        clearTxt();
                        deactivate();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Correo inválido.");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Direccion inválida.");
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        d.deleteMedic(Integer.parseInt(IDText.getText()));
        deactivate();
        clearTxt();
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employees().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AMText;
    private javax.swing.JTextField APText;
    private javax.swing.JTextField BuscarText;
    private javax.swing.JTextField CityText;
    private javax.swing.JComboBox<String> ComboBoxESTADO;
    private javax.swing.JTextField DireccionText;
    private javax.swing.JTextField EmailText;
    private javax.swing.JTextField IDText;
    private javax.swing.JTextField NameText;
    private javax.swing.JTextField PhoneText;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator separator;
    private javax.swing.JComboBox<String> sexComboBox;
    // End of variables declaration//GEN-END:variables
}
