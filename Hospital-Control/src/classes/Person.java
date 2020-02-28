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
    
    private int ID = 0;
    private String name = "";
    private String surname = "";
    private String address = "";
    private String phone = "";
    private String email = "";
    private int age = 0;
    private String sex = "";
    private String state = "";
    
    
    public void fakeOverload(Person p)
    {
        this.setID(p.getID()+1);
        this.setName(p.getName());
        this.setSurname(p.getSurname());
        this.setAddress(p.getAddress());
        this.setPhone(p.getPhone());
        this.setEmail(p.getEmail());
        this.setAge(p.getAge());
        this.setSex(p.getSex());
        this.setState(p.getState());
    }
    
    public void setID(int value)
    {
        ID = value;
    }
    
    public int getID()
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
    
    public void setSex(String value)
    {
        sex = value;
    }
    
    public String getSex()
    {
        return sex;
    }
    
    public void setState(String value)
    {
        state = value;
    }
    
    public String getState()
    {
        return state;
    }
    
}
