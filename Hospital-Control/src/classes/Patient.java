/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author isaac
 */
public class Patient extends Person{
    
    private String medic;
    private String appointment;
    
    public String getMedic()
    {
        return medic;
    }
    
    public void setMedic(String value)
    {
        medic = value;
    }
    
    public String getAppointment()
    {
        return appointment;
    }
    
    public void setAppointment(String value)
    {
        appointment = value;
    }
}
