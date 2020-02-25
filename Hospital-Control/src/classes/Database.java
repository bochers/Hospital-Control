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

    ArrayList<Patient> patients;
    ArrayList<Employee> employees;
    DataInputStream inputPatients;
    DataOutputStream outputPatients;
    DataInputStream inputEmployees;
    DataOutputStream outputEmployees;

    public Database() {

        patients = new ArrayList<>();
        employees = new ArrayList<>();
        try {
            
            outputPatients = new DataOutputStream(new FileOutputStream("patients.txt", true));
            outputEmployees = new DataOutputStream(new FileOutputStream("employees.txt", true));
            outputPatients.close();
            outputEmployees.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void loadDB() {
        Patient pat = new Patient();
        Employee emp = new Employee();

        try {

            inputPatients = new DataInputStream(new FileInputStream("patients.txt"));
            inputEmployees = new DataInputStream(new FileInputStream("employees.txt"));

            while (inputPatients.available() > 0) {

                pat.setID(inputPatients.readUTF());
                pat.setName(inputPatients.readUTF());
                pat.setSurname(inputPatients.readUTF());
                pat.setUsername(inputPatients.readUTF());
                pat.setEmail(inputPatients.readUTF());
                pat.setPassword(inputPatients.readUTF());
                pat.setAddress(inputPatients.readUTF());
                pat.setPhone(inputPatients.readUTF());
                pat.setAge(inputPatients.readInt());
                pat.setSex(inputPatients.readUTF());
                pat.setMedic(inputPatients.readUTF());
                pat.setAppointment(inputPatients.readUTF());

                patients.add(pat);

            }

            while (inputEmployees.available() > 0) {

                emp.setID(inputEmployees.readUTF());
                emp.setName(inputEmployees.readUTF());
                emp.setSurname(inputEmployees.readUTF());
                emp.setUsername(inputEmployees.readUTF());
                emp.setEmail(inputEmployees.readUTF());
                emp.setPassword(inputEmployees.readUTF());
                emp.setAddress(inputEmployees.readUTF());
                emp.setPhone(inputEmployees.readUTF());
                emp.setAge(inputEmployees.readInt());
                emp.setSex(inputEmployees.readUTF());
                emp.setOccupation(inputEmployees.readUTF());
                emp.setDegree(inputEmployees.readUTF());

                employees.add(emp);

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateDB() {

        try {

            outputPatients = new DataOutputStream(new FileOutputStream("patients.txt", true));
            outputEmployees = new DataOutputStream(new FileOutputStream("employees.txt", true));

            FileOutputStream clearPatients = new FileOutputStream("patients.txt");
            FileOutputStream clearEmployees = new FileOutputStream("employees.txt");

            for (Patient p : patients) {
                outputPatients.writeUTF(p.getID());
                outputPatients.writeUTF(p.getName());
                outputPatients.writeUTF(p.getSurname());
                outputPatients.writeUTF(p.getUsername());
                outputPatients.writeUTF(p.getEmail());
                outputPatients.writeUTF(p.getPassword());
                outputPatients.writeUTF(p.getAddress());
                outputPatients.writeUTF(p.getPhone());
                outputPatients.writeInt(p.getAge());
                outputPatients.writeUTF(p.getSex());
                outputPatients.writeUTF(p.getMedic());
                outputPatients.writeUTF(p.getAppointment());
            }
            outputPatients.close();

            for (Employee e : employees) {
                outputEmployees.writeUTF(e.getID());
                outputEmployees.writeUTF(e.getName());
                outputEmployees.writeUTF(e.getSurname());
                outputEmployees.writeUTF(e.getUsername());
                outputEmployees.writeUTF(e.getEmail());
                outputEmployees.writeUTF(e.getPassword());
                outputEmployees.writeUTF(e.getAddress());
                outputEmployees.writeUTF(e.getPhone());
                outputEmployees.writeInt(e.getAge());
                outputEmployees.writeUTF(e.getSex());
                outputEmployees.writeUTF(e.getOccupation());
                outputEmployees.writeUTF(e.getDegree());
            }

            outputEmployees.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void newPatient(Patient p) {

        patients.add(p);
        updateDB();
    }

    public Patient searchPatient(String id) {
        Patient c = new Patient();

        for (Patient p : patients) {
            if (p.getID().equals(id)) {
                return p;
            }
        }
        return c;
    }

    public void modifyPatient(Patient pat) {
        for (Patient p : patients) {
            if (p.getID().equals(pat.getID())) {
                p.equalsOverload(pat);
                break;
            }
        }

        updateDB();
    }

    public void newEmployee(Employee e) {
        employees.add(e);
        updateDB();
    }

    public Employee searchEmployee(String id) {
        Employee c = new Employee();
        for (Employee e : employees) {
            if (e.getID().equals(id)) {
                return e;
            }
        }
        return c;
    }
}
