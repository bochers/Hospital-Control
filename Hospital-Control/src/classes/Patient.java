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
    
    private String medic = "";
    private String appointment = "";
    
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
    
    public void equalsOverload(Patient p)
    {
        this.setName(p.getName());
        this.setSurname(p.getSurname());
        this.setEmail(p.getEmail());
        this.setPassword(p.getPassword());
        this.setAddress(p.getAddress());
        this.setMedic(p.getMedic());
        this.setAppointment(p.getAppointment());
        this.setPhone(p.getPhone());
        this.setAge(p.getAge());
        this.setUsername(p.getUsername());
        this.setState(p.getState());
        this.setSex(p.getSex());
    }
}
