package views;

import classes.Database;
import classes.Person;

import java.awt.Image;
import static java.awt.image.ImageObserver.WIDTH;
import java.text.ParseException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isaac
 */
public class Patients extends javax.swing.JFrame {
    
    Database d;
    SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
    String uType;

    /**
     * Creates new form Patients
     * @param userType
     */
    public Patients(String userType) {
        initComponents();
        d = new Database();
        deactivate();
        uType = userType;
        Image img;
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/assets/Zoom-icon.png"));
        img = icon.getImage();
        btnBuscar.setIcon(new ImageIcon(img.getScaledInstance(btnBuscar.getWidth(), btnBuscar.getHeight(), WIDTH)));        
    }
    
    public Patients() {
        initComponents();
        d = new Database();
        deactivate();
        uType = "";
        Image img;
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/assets/Zoom-icon.png"));
        img = icon.getImage();
        btnBuscar.setIcon(new ImageIcon(img.getScaledInstance(btnBuscar.getWidth(), btnBuscar.getHeight(), WIDTH)));
    }
    
    public void activate(){
        //IDText.setEnabled(true);
        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(true);
        NameText.setEnabled(true);
        APText.setEnabled(true);
        AMText.setEnabled(true);
        PhoneText.setEnabled(true);
        sexComboBox.setEnabled(true);
        ComboBoxESTADO.setEnabled(true);
        CityText.setEnabled(true);
        CalendarFecha.setEnabled(true);
        CBSangre.setEnabled(true);
    }
    
    public void deactivate(){
        IDText.setEnabled(false);
        btnSave.setEnabled(false);
        btnCancel.setEnabled(false);
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        NameText.setEnabled(false);
        APText.setEnabled(false);
        AMText.setEnabled(false);
        PhoneText.setEnabled(false);
        sexComboBox.setEnabled(false);
        ComboBoxESTADO.setEnabled(false);
        CityText.setEnabled(false);
        CalendarFecha.setEnabled(false);
        CBSangre.setEnabled(false);
}
    
    public void clearTxt() {
        IDText.setText("");
        NameText.setText("");
        APText.setText("");
        AMText.setText("");
        PhoneText.setText("");
        BuscarText.setText("");
        sexComboBox.setSelectedIndex(-1);
        ComboBoxESTADO.setSelectedIndex(-1);
        CityText.setText("");
        CBSangre.setSelectedIndex(-1);
        CalendarFecha.setDate(null);
        BuscarText.setEnabled(true);
        btnBuscar.setEnabled(true);
    }
    
    public int ID(){
        int size = d.lastPatientID();
            size++;
            return size;   
};
    
  
    public boolean isValidPatient(){
        boolean valid = false;
        
           if(NameText.getText().length() > 0){
                if(APText.getText().length() > 0){
                    if(AMText.getText().length() > 0){
                        if(PhoneText.getText().length() > 0 && PhoneText.getText().length() == 10){
                            if(sexComboBox.getSelectedIndex() != -1){
                                if(ComboBoxESTADO.getSelectedIndex() != -1){
                                    if(CityText.getText().length() > 0){
                                        if(CBSangre.getSelectedIndex() != -1){
                                            if(CalendarFecha.getDate() != null){
                                                valid = true;
                                            }else{ JOptionPane.showMessageDialog(null, "Error en Fecha");
                                                   CalendarFecha.requestFocusInWindow();}
                                        }else{ JOptionPane.showMessageDialog(null, "Error en Sangre");
                                               CBSangre.requestFocusInWindow();}
                                    }else{ JOptionPane.showMessageDialog(null, "Error en Ciudad");
                                           CityText.requestFocusInWindow();}
                                }else{  JOptionPane.showMessageDialog(null, "Error en Estado");
                                        ComboBoxESTADO.requestFocusInWindow();}
                            }else{  JOptionPane.showMessageDialog(null, "Error en Sexo");
                                    sexComboBox.requestFocusInWindow();}  
                        }else{  JOptionPane.showMessageDialog(null, "Error en Teléfono");
                                PhoneText.requestFocusInWindow();}
                    }else{  JOptionPane.showMessageDialog(null, "Error en Apellido Materno");
                            AMText.requestFocusInWindow();}
                }else{  JOptionPane.showMessageDialog(null, "Error en Apellido Paterno");
                        APText.requestFocusInWindow();}
            }else{  JOptionPane.showMessageDialog(null, "Error en Nombre"); 
                    NameText.requestFocusInWindow();}
        
        return valid;
    }
    
    public Person addPerson(Person p){
            p.setID(Integer.parseInt(IDText.getText()));
            p.setName(NameText.getText());
            p.setLast(APText.getText());
            p.setSLast(AMText.getText());
            p.setPhone(PhoneText.getText());    
            p.setSex((String) sexComboBox.getSelectedItem());
            p.setState((String) ComboBoxESTADO.getSelectedItem());
            p.setCity(CityText.getText());
            p.setBlood((String) CBSangre.getSelectedItem());
            p.setDate(dFormat.format(CalendarFecha.getDate()));

            return p;
    }
    
    public void displayPerson(Person person) {
   
        if(person.getID() != 0){
            try {
                IDText.setText(String.valueOf(person.getID()));
                NameText.setText(person.getName());
                APText.setText(person.getLast());
                AMText.setText(person.getSLast());
                PhoneText.setText(person.getPhone());
                sexComboBox.setSelectedItem(person.getSex());
                ComboBoxESTADO.setSelectedItem(person.getState());
                CityText.setText(person.getCity());
                CBSangre.setSelectedItem(person.getBlood());
                Date date = dFormat.parse(person.getDate());
                CalendarFecha.setDate(date);
            } catch (ParseException ex) {
                Logger.getLogger(Patients.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Paciente no encontrado.");  
        }
 
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
        jLabel3 = new javax.swing.JLabel();
        AMText = new javax.swing.JTextField();
        NameText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        APText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PhoneText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ComboBoxESTADO = new javax.swing.JComboBox<>();
        sexComboBox = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        btnBack = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        CBSangre = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        CalendarFecha = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        CityText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(BuscarText, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 260, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, 30));

        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 60, 60));
        jPanel1.add(IDText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 220, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, 30));
        jPanel1.add(AMText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 220, 30));
        jPanel1.add(NameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 220, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("A. Paterno:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 100, 30));
        jPanel1.add(APText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 220, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("A. Materno:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Teléfono:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 100, 30));
        jPanel1.add(PhoneText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 220, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Estado:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 100, 30));

        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 100, 40));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 100, 40));

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 100, 40));

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 100, 40));

        btnNew.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNew.setText("Nuevo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel1.add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 100, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Ciudad:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 100, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Sexo:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 100, 30));

        ComboBoxESTADO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua", "Coahuila", "Colima", "Distrito Federal", "Durango", "Estado de México", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas" }));
        ComboBoxESTADO.setSelectedIndex(-1);
        jPanel1.add(ComboBoxESTADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 220, 30));

        sexComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer", "Otro" }));
        sexComboBox.setSelectedIndex(-1);
        jPanel1.add(sexComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 220, 30));

        jLabel14.setFont(new java.awt.Font("DFMincho-UB", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Pacientes");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 180, 40));

        separator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel1.add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 750, 4));

        btnBack.setText("BACK TO MENU");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 12, -1, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Sangre:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 100, 30));

        CBSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "AB+", "AB-", "B+", "B-", "O+", "O-", " " }));
        CBSangre.setSelectedIndex(-1);
        jPanel1.add(CBSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 220, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Fecha Nacimiento:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 130, 30));

        CalendarFecha.setMaxSelectableDate(new java.util.Date(1577862117000L));
        CalendarFecha.setMinSelectableDate(new java.util.Date(-631126683000L));
        jPanel1.add(CalendarFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 180, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/juanga.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 470, 390));
        jPanel1.add(CityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 220, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/purple (1).png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        
        Person p;  
        
        p = d.searchPatient(BuscarText.getText());
            displayPerson(p);
            //BuscarText.setText("");
        if(p.getID()!= 0){
            activate();
            btnSave.setEnabled(false);
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if(isValidPatient()== true){
            Person p = new Person();
            d.modifyPatient(addPerson(p));

            JOptionPane.showMessageDialog(null, "Modificado con éxito.");
            deactivate();
            clearTxt();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        activate();
        clearTxt();
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        btnBuscar.setEnabled(false);
        BuscarText.setEnabled(false);
        IDText.setText(String.valueOf(ID()));
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        Navigation navigationWindow;
        navigationWindow = new Navigation(uType);
        navigationWindow.show();
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:   
        d.deletePatient(Integer.parseInt(IDText.getText()));
        deactivate();
        clearTxt();
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        deactivate();
        clearTxt();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(isValidPatient() == true){
            Person p = new Person();
            d.newPatient(addPerson(p));

            JOptionPane.showMessageDialog(null, "Guardado con éxito.");
            deactivate();
            clearTxt();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AMText;
    private javax.swing.JTextField APText;
    private javax.swing.JTextField BuscarText;
    private javax.swing.JComboBox<String> CBSangre;
    private com.toedter.calendar.JDateChooser CalendarFecha;
    private javax.swing.JTextField CityText;
    private javax.swing.JComboBox<String> ComboBoxESTADO;
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
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator separator;
    private javax.swing.JComboBox<String> sexComboBox;
    // End of variables declaration//GEN-END:variables
}
