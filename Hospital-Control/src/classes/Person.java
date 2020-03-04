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
    private String last = ""; //first last name
    private String sLast = ""; //second last name
    private String surname = "";
    private String address = "";
    private String phone = "";
    private String email = "";
    private int age = 0;
    private String sex = "";
    private String state = "";
    private String city = "";
    private String bloodType = "";
    private String date = "";
    private String stateAppointment = "";
    private String hour = "";
    
    
    public void fakeOverload(Person p)
    {
        this.setID(p.getID());
        this.setName(p.getName());
        this.setLast(p.getLast());
        this.setSLast(p.getSLast());
        this.setSurname(p.getSurname());
        this.setAddress(p.getAddress());
        this.setPhone(p.getPhone());
        this.setEmail(p.getEmail());
        this.setAge(p.getAge());
        this.setSex(p.getSex());
        this.setState(p.getState());
        this.setCity(p.getCity());
        this.setBlood(p.getBlood());
        this.setDate(p.getDate());
        this.setStateAppointment(p.getStateAppointment());
        this.setHour(p.getHour());
    }
    
    
    public void setStateAppointment(String value)
    {
        stateAppointment = value;
    }
    
    public String getStateAppointment()
    {
        return stateAppointment;
    }
    
    public void setHour(String value)
    {
        hour = value;
    }
    
    public String getHour()
    {
        return hour;
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
    public void setLast(String value)
    {
        last = value;
    }
    
    public String getLast(){
        return last;
    }
    
    public void setSLast(String value)
    {
        sLast = value;
    }
    
    public String getSLast(){
        return sLast;
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
    
    public void setCity(String value){
        city = value;
    }
    
    public String getCity(){
        return city;
    }
    
   
    public void setBlood(String value){
        bloodType = value; 
    }
    public String getBlood(){
        return bloodType;
    }
    
    public void setDate(String value){
        date = value; 
    }
    public String getDate(){
        return date;
    }
    

    
    
}
