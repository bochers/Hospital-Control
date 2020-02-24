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
public class Employee extends Person{
    
    private String occupation;
    private String degree;
    
    public String getOccupation()
    {
        return occupation;
    }
    
    public void setOccupation(String value)
    {
        occupation = value;
    }
    
    public String getDegree()
    {
        return degree;
    }
    
    public void setDegree(String value)
    {
        occupation = degree;
    }
    
    public void equalsOverload(Employee e)
    {
        this.setName(e.getName());
        this.setUsername(e.getUsername());
        this.setAge(e.getAge());
        this.setDegree(e.getDegree());
        this.setPhone(e.getPhone());
        this.setSurname(e.getSurname());
        this.setAddress(e.getAddress());
        this.setEmail(e.getEmail());
        this.setPassword(e.getPassword());
        this.setOccupation(e.getOccupation());
        
        
    }
}
