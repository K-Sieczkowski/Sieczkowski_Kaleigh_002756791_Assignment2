/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2_hospitalmodel.Patient;

import assignment2_hospitalmodel.person.Person;
import java.util.ArrayList;

/**
 *
 * @author ksiec
 */
public class PatientDirectory {
    private ArrayList<Patient> patients;
    
    public PatientDirectory(){
        patients = new ArrayList<Patient>();
    }
    
    public Patient newPatient(Person p){
        Patient pt = new Patient(p);
        patients.add(pt);
        return pt;
    }
    
    public Patient getPatientByName(String name){
        for(Patient p : patients){
            if(p.nameIsMatch(name)){
                return p;
            }
        }   
        
        return null; // not found after going through the whole list
    }
    
    public boolean findPatient(String name) {
        for (Patient pt : patients) {
            if (pt.nameIsMatch(name)) {
                return true;
            }
        }
        return false; // not found after going through the whole list
    }
    
    
    public void deletePatient(Patient pt){
        patients.remove(pt);
    }
    
    public void printPatientDocInfo(){
        for(Patient patientsInLoop : patients){
            patientsInLoop.printPatinetDoctor();
        }
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    
    
}
