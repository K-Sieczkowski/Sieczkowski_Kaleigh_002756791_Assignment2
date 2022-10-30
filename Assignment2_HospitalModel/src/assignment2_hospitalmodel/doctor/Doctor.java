/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2_hospitalmodel.doctor;

import assignment2_hospitalmodel.Hospital.Hospital;
import assignment2_hospitalmodel.Patient.Patient;
import assignment2_hospitalmodel.person.Person;


/**
 *
 * @author ksiec
 */
public class Doctor {
    private String jobTitle;
    private Person person;
    private Patient patient;
    private Hospital hospital;
  
    
    
    public Doctor(Person p){
        person = p;
    }
    
    public void assignToHospital(Hospital h){
        this.hospital = h;
    }
    
    public void assignPatient(Patient pt){
        pt.assignToDoctor(this); // link back to patient
    }
    
    
    public boolean nameIsMatch(String name) {
        if (getPerson().getPersonName().equals(name)) {
            return true;
        }
        return false;
    }

    /**
     * @return the person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * @param person the person to set
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     * @return the patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * @param patient the patient to set
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    
    @Override
    public String toString(){
        return jobTitle;
    }
}
