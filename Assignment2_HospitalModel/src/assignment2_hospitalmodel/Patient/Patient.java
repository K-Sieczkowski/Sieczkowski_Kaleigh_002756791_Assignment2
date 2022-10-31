/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2_hospitalmodel.Patient;

import assignment2_hospitalmodel.doctor.Doctor;
import assignment2_hospitalmodel.encounter.Encounter;
import assignment2_hospitalmodel.person.Person;
import assignment2_hospitalmodel.encounter.EncounterHistory;

/**
 *
 * @author ksiec
 */
public class Patient {

    private String title;
    private Person person;
    private EncounterHistory encounterHistory;
    private Doctor doctor;

    public Patient(Person p) {
        this.person = p;
        this.encounterHistory = new EncounterHistory();
    }
    

    public void assignToDoctor(Doctor d) {
        doctor = d;

    }

    public EncounterHistory addEncounterHistoryToPatient() {
        EncounterHistory eh = new EncounterHistory(this);
        addEncounterHistory(eh);
        return eh;
    }

   public void addEncounterHistory(EncounterHistory eh) {
        this.encounterHistory = eh;
    }

    public void addNewEncounter(Encounter e) {
        encounterHistory.newEncounter();
    }
    
    public Encounter deleteEncounter(){
        Encounter e = encounterHistory.getCurrentEncounter();
        encounterHistory.deleteEncounter(e);
        return e;
    }
    
    
//method to search name
    public boolean nameIsMatch(String name) {
        if (getPerson().getPersonName().equals(name)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return title;
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
     * @return the encounterHistory
     */
    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    /**
     * @param eh the encounterHistory to set
     */
    public void setEncounterHistory(EncounterHistory eh) {
        this.encounterHistory = eh;
    }

    /**
     * @return the doctor
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    

    public void printPatinetDoctor() {
        System.out.println("Patient: " + person.getName() + " Assigned Doctor: " + doctor.getPerson().getName());
    }
    
    
}
