/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2_hospitalmodel.encounter;

import assignment2_hospitalmodel.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author ksiec
 */
public class EncounterHistory {

    private Patient patient;
    private Encounter currentEncounter;
    private ArrayList<Encounter> encounters;

    public EncounterHistory() {
        this.encounters = new ArrayList<Encounter>();
    }

    public EncounterHistory(Patient p) {
        patient = p;
        patient.addEncounterHistory(this);//we link the history to the patient;
    }

    public Encounter newEncounter() {
        Encounter e = new Encounter(this);
        currentEncounter = e; // looking at the encoutner that is subject to the diagnosis
        this.encounters.add(e);
        return e;
    }
    

    public Encounter getCurrentEncounter() {
        return currentEncounter;
    }

    public void setCurrentEncounter(Encounter currentEncounter) {
        this.currentEncounter = currentEncounter;
    }

    public void deleteEncounter(Encounter e) {
        getEncounters().remove(e);
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

    /**
     * @return the encounters
     */
    public ArrayList<Encounter> getEncounters() {
        return encounters;
    }

    /**
     * @param encounters the encounters to set
     */
    public void setEncounters(ArrayList<Encounter> encounters) {
        this.encounters = encounters;
    }

}
