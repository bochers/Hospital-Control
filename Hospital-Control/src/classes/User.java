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
public class User {
    
    private String username;
    private String password;
    private String email;
    private boolean editPatients;
    private boolean editMedics;
    private boolean editUsers;
    
    public User()
    {
        editPatients = false;
        editMedics = false;
        editUsers = false;
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
    
    public void setEmail(String value)
    {
        email = value;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEditPatients(boolean value)
    {
        editPatients = value;
    }
    
    public boolean getEditPatients()
    {
        return editPatients;
    }
    
    public void setEditMedics(boolean value)
    {
        editMedics = value;
    }
    
    public boolean getEditMedics()
    {
        return editMedics;
    }
    
    public void setEditUsers(boolean value)
    {
        editUsers = value;
    }
    
    public boolean getEditUsers()
    {
        return editUsers;
    }    
}