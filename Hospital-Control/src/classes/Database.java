/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.*;
import java.util.*;

/**
 *
 * @author isaac
 */
public class Database {

    ArrayList<Patient> patients;
    ArrayList<Employee> employees;
    DataInputStream inputFile;
    DataOutputStream outputFile;

    public Database() {
        patients = new ArrayList<>();
        employees = new ArrayList<>();
    }

    public void newPatient(Patient p) 
    {    
        patients.add(p);
    }
    
    public Patient searchPatient(String id) 
    {    
        Patient c = new Patient();
        
        for(Patient p: patients)
        {
            if(p.getID().equals(id))
            {
                return p;
            }
        }
        return c;
    }
    
    public void modifyPatient(Patient pat)
    {
       for(Patient p : patients)
       {
            if(p.getID().equals(pat.getID()))
            {
                p = pat;
                break;
            }
       }
    }
    
    public void newEmployee(Employee e) 
    {    
        employees.add(e);
    }
    
    public Employee searchEmployee(String id) 
    {    
        Employee c = new Employee();
        for(Employee e: employees)
        {
            if(e.getID().equals(id))
            {
                return e;
            }
        }
        return c;
    }  
}
