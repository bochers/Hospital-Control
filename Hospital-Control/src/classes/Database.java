/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author isaac
 */
public class Database {

    ArrayList<User> users;
    ArrayList<Person> medics;
    ArrayList<Person> patients;

    DataInputStream inputPatients;
    DataOutputStream outputPatients;
    DataInputStream inputMedics;
    DataOutputStream outputMedics;
    DataInputStream inputUsers;
    DataOutputStream outputUsers;

    public Database() {

        users = new ArrayList<>();
        medics = new ArrayList<>();
        patients = new ArrayList<>();

        try {

            outputUsers = new DataOutputStream(new FileOutputStream("users.txt", true));
            outputPatients = new DataOutputStream(new FileOutputStream("patients.txt", true));
            outputMedics = new DataOutputStream(new FileOutputStream("medics.txt", true));

            outputUsers.close();
            outputPatients.close();
            outputMedics.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        loadDB();
    }

    public void loadDB() {

        User u = new User();
        Person p = new Person();

        try {

            inputUsers = new DataInputStream(new FileInputStream("users.txt"));
            inputPatients = new DataInputStream(new FileInputStream("patients.txt"));
            inputMedics = new DataInputStream(new FileInputStream("medics.txt"));

            while (inputUsers.available() > 0) {
                u.setUsername(inputUsers.readUTF());
                u.setEmail(inputUsers.readUTF());
                u.setPassword(inputUsers.readUTF());
                u.setEditUsers(inputUsers.readBoolean());
                u.setEditPatients(inputUsers.readBoolean());
                u.setEditMedics(inputUsers.readBoolean());

                users.add(u);
            }

            while (inputPatients.available() > 0) {

                p.setID(inputPatients.readUTF());
                p.setName(inputPatients.readUTF());
                p.setSurname(inputPatients.readUTF());
                p.setEmail(inputPatients.readUTF());
                p.setAddress(inputPatients.readUTF());
                p.setPhone(inputPatients.readUTF());
                p.setAge(inputPatients.readInt());
                p.setSex(inputPatients.readUTF());
                p.setState(inputPatients.readUTF());

                patients.add(p);
            }

            while (inputMedics.available() > 0) {

                p.setID(inputMedics.readUTF());
                p.setName(inputMedics.readUTF());
                p.setSurname(inputMedics.readUTF());
                p.setEmail(inputMedics.readUTF());
                p.setAddress(inputMedics.readUTF());
                p.setPhone(inputMedics.readUTF());
                p.setAge(inputMedics.readInt());
                p.setSex(inputMedics.readUTF());
                p.setState(inputMedics.readUTF());

                medics.add(p);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateUsers() {
        try {
            outputUsers = new DataOutputStream(new FileOutputStream("users.txt", true));
            FileOutputStream clearUsers = new FileOutputStream("users.txt");

            for (User u : users) {
                outputUsers.writeUTF(u.getUsername());
                outputUsers.writeUTF(u.getEmail());
                outputUsers.writeUTF(u.getPassword());
                outputUsers.writeBoolean(u.getEditUsers());
                outputUsers.writeBoolean(u.getEditPatients());
                outputUsers.writeBoolean(u.getEditMedics());

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updatePatients() {
        try {
            outputPatients = new DataOutputStream(new FileOutputStream("patients.txt", true));
            FileOutputStream clearPatients = new FileOutputStream("patients.txt");

            for (Person p : patients) {
                
                outputPatients.writeUTF(p.getID());
                outputPatients.writeUTF(p.getName());
                outputPatients.writeUTF(p.getSurname());
                outputPatients.writeUTF(p.getEmail());
                outputPatients.writeUTF(p.getAddress());
                outputPatients.writeUTF(p.getPhone());
                outputPatients.writeInt(p.getAge());
                outputPatients.writeUTF(p.getSex());
                outputPatients.writeUTF(p.getState());
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateMedics() {
        try {
            outputMedics = new DataOutputStream(new FileOutputStream("medics.txt", true));
            FileOutputStream clearMedics = new FileOutputStream("medics.txt");

            for (Person p : medics) {
                
                outputMedics.writeUTF(p.getID());
                outputMedics.writeUTF(p.getName());
                outputMedics.writeUTF(p.getSurname());
                outputMedics.writeUTF(p.getEmail());
                outputMedics.writeUTF(p.getAddress());
                outputMedics.writeUTF(p.getPhone());
                outputMedics.writeInt(p.getAge());
                outputMedics.writeUTF(p.getSex());
                outputMedics.writeUTF(p.getState());
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void newUser(User u)
    {
        
        users.add(u);
        updateUsers();
    }

    public void newPatient(Person p) {

        patients.add(p);
        updatePatients();
    }
    
    public void newMedic(Person p) {

        medics.add(p);
        updateMedics();
    }
    
    public Person searchPatient(String id) {
        
        Person notFound = new Person();
        
        for (Person p : patients) {
            
            if (p.getID().equals(id)) {
                return p;
            }
        }
        return notFound;
    }
    
    public Person searchMedic(String id) {
        
        Person notFound = new Person();
        
        for (Person p : medics) {
            
            if (p.getID().equals(id)) {
                return p;
            }
        }
        return notFound;
    }
    
    public User searchUser(String username)
    {
        User notFound = new User();
        
        for(User u: users)
        {
            if(u.getUsername().equals(username))
            {
                return u;
            }
        }
        return notFound;
    }

    public void modifyPatient(Person pat) {
       
        for (Person p : patients) {
            
            if (p.getID().equals(pat.getID())) {
                p.fakeOverload(pat);
                break;
            }
        }
        updatePatients();
    }
    
    public void modifyMedics(Person med) {
       
        for (Person m : patients) {
            
            if (m.getID().equals(med.getID())) {
                m.fakeOverload(med);
                break;
            }
        }
        updateMedics();
    }
    
    public void modifyUsers(User user) {
       
        for (User u : users) {
            
            if (u.getUsername().equals(user.getUsername())) {
                u.fakeOverload(user);
                break;
            }
        }
        updateUsers();
    }

    public void deletePatient(String id) {
        
        int i = 0;
        for (Person p : patients) {
            
            if (p.getID().equals(id)) {
                patients.remove(i);
                break;
            }
            ++i;
        }
        updatePatients();
    }
    
    public void deleteMedic(String id) {
        
        int i = 0;
        for (Person p : medics) {
            
            if (p.getID().equals(id)) {
                medics.remove(i);
                break;
            }
            ++i;
        }
        updateMedics();
    }
    
    public void deleteUser(String username) {
        
        int i = 0;
        for (User u : users) {
            
            if (u.getUsername().equals(username)) {
                users.remove(i);
                break;
            }
            ++i;
        }
        updateUsers();
    }

    public int validateUser(String username, String password) {
        
        for(User u: users)
        {
            if(u.getUsername().equals(username))
            {
                if(u.getPassword().equals(password))
                {
                    //ADMIN
                    if(u.getEditMedics() && u.getEditPatients() && u.getEditUsers())
                    {
                        return 1;
                    }
                    //SUPERVISOR
                    else if(u.getEditMedics() && u.getEditPatients())
                    {
                        return 2;
                    }
                    //SECRETARY
                    else if(u.getEditPatients())
                    {
                        return 3;
                    }
                    
                }
            }
        }
        return 0;
    }
}
