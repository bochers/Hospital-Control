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
public class Person {
    
    private String ID;
    private String name;
    private String surname;
    private String address;
    private String username;
    private String password;
    private String phone;
    private String email;
    private int age;
    
    //yiiiiiiiiiiiiii
   public void init(String valueID, String valueName, String valueSurname, String valueAddress, String valueUsername, String valuePassword, String valuePhone, int valueAge)
    {
        this.ID = valueID;
        this.name = valueName;
        this.surname = valueSurname;
        this.address = valueAddress;
        this.username = valueUsername;
        this.phone = valuePhone;
        this.password = valuePassword; 
        this.age = valueAge;        
    }
    
    public void setID(String value)
    {
        ID = value;
    }
    
    public String getID()
    {
        return ID;
    }
    
    public void setName(String value)
    {
        name = value;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setSurname(String value)
    {
        surname = value;
    }
    
    public String getSurname()
    {
        return surname;
    }
    
    public void setAddress(String value)
    {
        address = value;
    }
    
    public String getAddress()
    {
        return address;
    }
    
     public void setUsername(String value)
    {
        username = value;
    }
    
    public String getUsername()
    {
        return username;
    }
    
     public void setPassword(String value)
    {
        password = value;
    }
    
    public String getPassword()
    {
        return password;
    }
         
    public void setPhone(String value)
    {
        phone = value;
    }
    
    public String getPhone()
    {
        return phone;
    }
    
    public void setEmail(String value)
    {
        email = value;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setAge(int value)
    {
        age = value;
    }
    
    public int getAge()
    {
        return age;
    }
    
}
