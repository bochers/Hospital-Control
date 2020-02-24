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
    
    public Patient searchPatient(int id) 
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
}
