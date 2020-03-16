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
    ArrayList<Person> appointments;
    ArrayList<Person> patientToApp;
    ArrayList<Item> stockItems;
    ArrayList<Service> services;

    DataInputStream inputPatients;
    DataOutputStream outputPatients;

    DataInputStream inputMedics;
    DataOutputStream outputMedics;

    DataInputStream inputUsers;
    DataOutputStream outputUsers;

    DataInputStream inputAppointments;
    DataOutputStream outputAppointments;

    DataInputStream inputStock;
    DataOutputStream outputStock;

    DataInputStream inputServices;
    DataOutputStream outputServices;

    public Database() {

        users = new ArrayList<>();
        medics = new ArrayList<>();
        patients = new ArrayList<>();
        patientToApp = new ArrayList<>();
        appointments = new ArrayList<>();
        stockItems = new ArrayList<>();
        services = new ArrayList<>();

        try {

            outputUsers = new DataOutputStream(new FileOutputStream("users.txt", true));
            outputPatients = new DataOutputStream(new FileOutputStream("patients.txt", true));
            outputMedics = new DataOutputStream(new FileOutputStream("medics.txt", true));
            outputAppointments = new DataOutputStream(new FileOutputStream("appointments.txt", true));
            outputStock = new DataOutputStream(new FileOutputStream("stock.txt", true));
            outputServices = new DataOutputStream(new FileOutputStream("services.txt", true));

            outputUsers.close();
            outputPatients.close();
            outputMedics.close();
            outputAppointments.close();
            outputStock.close();
            outputServices.close();

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
        Item item = new Item();
        Service service = new Service();

        try {

            inputUsers = new DataInputStream(new FileInputStream("users.txt"));
            inputPatients = new DataInputStream(new FileInputStream("patients.txt"));
            inputMedics = new DataInputStream(new FileInputStream("medics.txt"));
            inputAppointments = new DataInputStream(new FileInputStream("appointments.txt"));
            inputStock = new DataInputStream(new FileInputStream("stock.txt"));
            inputServices = new DataInputStream(new FileInputStream("services.txt"));

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
                patientToApp.add(p);
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

            while (inputAppointments.available() > 0) {

                p = new Person();

                p.setID(inputAppointments.readInt());
                p.setName(inputAppointments.readUTF());
                p.setHour(inputAppointments.readUTF());
                p.setStateAppointment(inputAppointments.readUTF());
                p.setDate(inputAppointments.readUTF());
                appointments.add(p);
            }

            while (inputStock.available() > 0) {

                item = new Item();

                item.setId(inputStock.readInt());
                item.setName(inputStock.readUTF());
                item.setType(inputStock.readUTF());
                item.setPrice(inputStock.readInt());
                item.setAmount(inputStock.readInt());
                item.setExpiration(inputStock.readUTF());

                stockItems.add(item);
            }

            while (inputServices.available() > 0) {

                service = new Service();

                service.setId(inputServices.readInt());
                service.setType(inputServices.readUTF());
                service.setPrice(inputServices.readInt());
                service.setClientName(inputServices.readUTF());
                service.setDescription(inputServices.readUTF());
                services.add(service);
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

    public void updateAppointments() {
        try {
            outputAppointments = new DataOutputStream(new FileOutputStream("appointments.txt", true));
            FileOutputStream clearAppointment = new FileOutputStream("appointments.txt");

            for (Person p : appointments) {

                outputAppointments.writeInt(p.getID());
                outputAppointments.writeUTF(p.getName());
                outputAppointments.writeUTF(p.getHour());
                outputAppointments.writeUTF(p.getStateAppointment());
                outputAppointments.writeUTF(p.getDate());

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateStock() {
        try {
            outputStock = new DataOutputStream(new FileOutputStream("stock.txt", true));
            FileOutputStream clearStock = new FileOutputStream("stock.txt");

            for (Item item : stockItems) {
                outputStock.writeInt(item.getId());
                outputStock.writeUTF(item.getName());
                outputStock.writeUTF(item.getType());
                outputStock.writeInt(item.getPrice());
                outputStock.writeInt(item.getAmount());
                outputStock.writeUTF(item.getExpiration());
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateServices() {
        try {
            outputServices = new DataOutputStream(new FileOutputStream("services.txt", true));
            FileOutputStream clearServices = new FileOutputStream("services.txt");

            for (Service service : services) {
                outputServices.writeInt(service.getId());
                outputServices.writeUTF(service.getType());
                outputServices.writeInt(service.getPrice());
                outputServices.writeUTF(service.getClientName());
                outputServices.writeUTF(service.getDescription());
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

    public void newAppointment(Person p) {
        appointments.add(p);
        updateAppointments();
    }

    public void newStockItem(Item item) {
        stockItems.add(item);
        updateStock();
    }

    public void newService(Service service) {
        services.add(service);
        updateServices();
    }

    public Person searchAppointement(String find) {
        Person notFound = new Person();

        for (Person p : patientToApp) {
            String isThere = p.getName() + " " + p.getLast() + " " + p.getSLast();
            if (isThere.equals(find)) {
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

    public Item searchStockItem(int id) {
        Item found = new Item();
        for (Item item : stockItems) {
            if (item.getId() == id) {
                found = item;
                break;
            }
        }
        return found;
    }

    public ArrayList<Person> getAppointments() {
        return appointments;
    }

    public ArrayList<Item> getStock() {
        return stockItems;
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public boolean verifyAppointment(String date, String hour) {
        for (Person p : appointments) {
            if (p.getDate().equals(date) && p.getHour().equals(hour)) {
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

    public void modifyAppointment(Person app) {
        for (Person p : appointments) {
            if (p.getName().equals(app.getName())) {
                p.fakeOverload(app);
                break;
            }
        }
        updateAppointments();
    }

    public boolean availableModification(String date, String hour, int id) {
        for (Person p : appointments) {
            if (p.getDate().equals(date) && p.getHour().equals(hour)) {
                if (p.getID() == id) {

                } else {
                    return false;
                }
            }
        }
        return true;
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

    public void modifyStockItem(Item item) {
        for (Item i : stockItems) {
            if (item.getId() == i.getId()) {
                i.set(item);
                break;
            }
        }
        updateStock();
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

    public void deleteAppointment(int id) {

        int i = 0;
        for (Person p : appointments) {

            if (p.getID() == id) {
                appointments.remove(i);
                break;
            }
            ++i;
        }
        updateAppointments();
    }

    public void deleteStockItem(int id) {
        for (int i = 0; i < stockItems.size(); i++) {
            if (stockItems.get(i).getId() == id) {
                stockItems.remove(i);
                break;
            }
        }
        updateStock();
    }

    public int validateUser(String username, String password) {

        for (User u : users) {
            if (u.getUsername().equals(username)) {
                if (u.getPassword().equals(password)) {
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

    public Boolean clientExists(String name) {
        /// ehhh pense que teniamos un arraylist con el nombre de todos los clientes xD
        //dejare esto por si algun dia se implementa
        return true;
    }

    public boolean availableUsername(String un) {
        boolean available = true;

        for (User u : users) {
            if (u.getUsername().equals(un)) {
                available = false;
                break;
            }
        }
        return available;
    }

    public int lastPatientID() {

        return patients.get(patients.size() - 1).getID();
    }

    public int lastMedicID() {

        return medics.get(medics.size() - 1).getID();
    }

    public int lastAppointmenID() {

        return appointments.get(appointments.size() - 1).getID();
    }
            
    
    
    
}
