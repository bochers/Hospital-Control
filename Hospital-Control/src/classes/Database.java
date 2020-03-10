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
    ArrayList<Person> appointment;

    DataInputStream inputPatients;
    DataOutputStream outputPatients;
    
    DataInputStream inputMedics;
    DataOutputStream outputMedics;
    
    DataInputStream inputUsers;
    DataOutputStream outputUsers;
    
    DataInputStream inputAppointment;
    DataOutputStream outputAppointment;

    public Database() {
        
        users = new ArrayList<>();
        medics = new ArrayList<>();
        patients = new ArrayList<>();
        appointment = new ArrayList<>();

        try {

            outputUsers = new DataOutputStream(new FileOutputStream("users.txt", true));
            outputPatients = new DataOutputStream(new FileOutputStream("patients.txt", true));
            outputMedics = new DataOutputStream(new FileOutputStream("medics.txt", true));
            outputAppointment = new DataOutputStream(new FileOutputStream("appointments.txt", true));

            outputUsers.close();
            outputPatients.close();
            outputMedics.close();
            outputAppointment.close();

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
            inputAppointment = new DataInputStream(new FileInputStream("appointments.txt"));

            while (inputUsers.available() > 0) {

                u = new User();

                u.setUsername(inputUsers.readUTF());
                u.setEmail(inputUsers.readUTF());
                u.setPassword(inputUsers.readUTF());
                u.setEditUsers(inputUsers.readBoolean());
                u.setEditPatients(inputUsers.readBoolean());
                u.setEditMedics(inputUsers.readBoolean());

                users.add(u);

            }

            while (inputPatients.available() > 0) {

                p = new Person();

                p.setID(inputPatients.readInt());
                p.setName(inputPatients.readUTF());
                p.setLast(inputPatients.readUTF());
                p.setSLast(inputPatients.readUTF());
                p.setPhone(inputPatients.readUTF());
                p.setSex(inputPatients.readUTF());
                p.setState(inputPatients.readUTF());
                p.setCity(inputPatients.readUTF());
                p.setBlood(inputPatients.readUTF());
                p.setDate(inputPatients.readUTF());

                patients.add(p);
            }

            while (inputMedics.available() > 0) {

                p = new Person();

                p.setID(inputMedics.readInt());
                p.setName(inputMedics.readUTF());
                p.setLast(inputMedics.readUTF());
                p.setSLast(inputMedics.readUTF());
                p.setAddress(inputMedics.readUTF());
                p.setPhone(inputMedics.readUTF());
                p.setEmail(inputMedics.readUTF());
                p.setSex(inputMedics.readUTF());
                p.setState(inputMedics.readUTF());
                p.setCity(inputMedics.readUTF());

                medics.add(p);
            }
            
            while (inputAppointment.available() > 0) {

                p = new Person();
                
                p.setID(inputAppointment.readInt());
                p.setName(inputAppointment.readUTF());
                p.setHour(inputAppointment.readUTF());
                p.setStateAppointment(inputAppointment.readUTF());
                p.setDate(inputAppointment.readUTF());
                
                appointment.add(p);
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

                outputPatients.writeInt(p.getID());
                outputPatients.writeUTF(p.getName());
                outputPatients.writeUTF(p.getLast());
                outputPatients.writeUTF(p.getSLast());
                outputPatients.writeUTF(p.getPhone());
                outputPatients.writeUTF(p.getSex());
                outputPatients.writeUTF(p.getState());
                outputPatients.writeUTF(p.getCity());
                outputPatients.writeUTF(p.getBlood());
                outputPatients.writeUTF(p.getDate());
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

                outputMedics.writeInt(p.getID());
                outputMedics.writeUTF(p.getName());
                outputMedics.writeUTF(p.getLast());
                outputMedics.writeUTF(p.getSLast());
                outputMedics.writeUTF(p.getAddress());
                outputMedics.writeUTF(p.getPhone());
                outputMedics.writeUTF(p.getEmail());
                outputMedics.writeUTF(p.getSex());
                outputMedics.writeUTF(p.getState());
                outputMedics.writeUTF(p.getCity());
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateAppointment() {
        try {
            outputAppointment = new DataOutputStream(new FileOutputStream("appointments.txt", true));
            FileOutputStream clearAppointment = new FileOutputStream("appointments.txt");

            for (Person p : appointment) {

                outputAppointment.writeInt(p.getID());
                outputAppointment.writeUTF(p.getName());
                outputAppointment.writeUTF(p.getHour());
                outputAppointment.writeUTF(p.getStateAppointment());
                outputAppointment.writeUTF(p.getDate());
               
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void newUser(User u) {
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
    
    public void newAppointment(Person p)
    {
        appointment.add(p);
        updateAppointment();
    }
    
        public Person searchAppointement(String name) {
        Person notFound = new Person();

        for (Person p : appointment) {
            if (p.getName().equals(name)){
                return p;
            }
        }

        return notFound;
    }

    public Person searchPatient(String find) {

        Person notFound = new Person();

        for (Person p : patients) {
            String isThere = p.getName() + " " + p.getLast() + " " + p.getSLast();
            if (isThere.equals(find)) {
                return p;
            }
        }
        return notFound;
    }

    public Person searchMedic(String find) {
        Person notFound = new Person();

        for (Person p : medics) {
            String isThere = p.getName() + " " + p.getLast() + " " + p.getSLast();
            if (isThere.equals(find)) {
                return p;
            }
        }
        return notFound;
    }

    public User searchUser(String username) {
        User notFound = new User();

        for (User u : users) {
            if (u.getUsername().equals(username)) {
                return u;
            }
        }

        return notFound;
    }
    
    public boolean verifyAppointment(String date, String hour){
        for(Person p: appointment){
           if(p.getDate().equals(date) && p.getHour().equals(hour)){
               return false;
           }
       }
        return true;
        
    }
    


    public void modifyPatient(Person pat) {

        for (Person p : patients) {

            if (p.getID() == pat.getID()) {
                p.fakeOverload(pat);
                break;
            }
        }
        updatePatients();
    }

    public void modifyMedics(Person med) {

        for (Person m : medics) {

            if (m.getID() == med.getID()) {
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

    public void deletePatient(int id) {

        int i = 0;
        for (Person p : patients) {

            if (p.getID() == id) {
                patients.remove(i);
                break;
            }
            ++i;
        }
        updatePatients();
    }

    public void deleteMedic(int id) {

        int i = 0;
        for (Person p : medics) {

            if (p.getID() == id) {
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

        for (User u : users) {
            if (u.getUsername().equals(username)) {
                if (u.getPassword().equals(password)) {
                    //ADMIN
                    if (u.getEditMedics() && u.getEditPatients() && u.getEditUsers()) {
                        return 1;
                    } //SUPERVISOR
                    else if (u.getEditMedics() && u.getEditPatients()) {
                        return 2;
                    } //SECRETARY
                    else if (u.getEditPatients()) {
                        return 3;
                    }

                }
            }
        }
        return 0;
    }

    public int patientsSize() {
        return patients.size();

    }

    public int medicsSize() {
        return medics.size();
    }

    public int usersSize() {
        return users.size();
    }
    
    public int appointmentSize(){
        return appointment.size();
    }
}
