/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2_hospitalmodel.system;

import assignment2_hospitalmodel.Hospital.HospitalDirectory;
import assignment2_hospitalmodel.Patient.PatientDirectory;
import assignment2_hospitalmodel.doctor.DoctorDirectory;
import assignment2_hospitalmodel.encounter.EncounterHistory;
import assignment2_hospitalmodel.locationManagement.CityDirectory;
import assignment2_hospitalmodel.locationManagement.Community;
import assignment2_hospitalmodel.person.PersonDirectory;

/**
 *
 * @author ksiec
 */
public class HospitalSystem {
    private String name; //name of system
    private PatientDirectory patients;
    private DoctorDirectory doctors;
    private PersonDirectory persons;
    private HospitalDirectory hospitals;
    private CityDirectory cities;
    private Community communities;
    private EncounterHistory encounters;

   
    
    public HospitalSystem(String name){
       this.name = name;
       hospitals = new HospitalDirectory();
       cities = new CityDirectory();
       communities = new Community();
       doctors = new DoctorDirectory();
       patients = new PatientDirectory();
       persons = new PersonDirectory();
       encounters = new EncounterHistory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PatientDirectory getPatients() {
        return patients;
    }

    public void setPatients(PatientDirectory patients) {
        this.patients = patients;
    }

    public DoctorDirectory getDoctors() {
        return doctors;
    }

    public void setDoctors(DoctorDirectory doctors) {
        this.doctors = doctors;
    }

    public PersonDirectory getPersons() {
        return persons;
    }

    public void setPersons(PersonDirectory persons) {
        this.persons = persons;
    }

    public HospitalDirectory getHospitals() {
        return hospitals;
    }

    public void setHospitals(HospitalDirectory hospitals) {
        this.hospitals = hospitals;
    }

    public CityDirectory getCities() {
        return cities;
    }

    public void setCities(CityDirectory cities) {
        this.cities = cities;
    }

    public Community getCommunities() {
        return communities;
    }

    public void setCommunities(Community communities) {
        this.communities = communities;
    }

    public EncounterHistory getEncounters() {
        return encounters;
    }

    public void setEncounters(EncounterHistory encounters) {
        this.encounters = encounters;
    }

    

    
}
