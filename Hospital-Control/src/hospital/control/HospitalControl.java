/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.control;
import classes.Person;
import classes.Patient;

/**
 *
 * @author isaac
 */
public class HospitalControl {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Person p = new Person();
        Patient k = new Patient();
        
         k.setMedic("EL erick");
        p.setAddress("en tu kasa");
        
        System.out.print(p.getAddress() + " " + k.getMedic());
        
    }
    
}
