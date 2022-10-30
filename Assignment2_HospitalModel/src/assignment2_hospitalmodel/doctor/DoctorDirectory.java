/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2_hospitalmodel.doctor;

import assignment2_hospitalmodel.person.Person;
import java.util.ArrayList;

/**
 *
 * @author ksiec
 */
public class DoctorDirectory {
    private ArrayList<Doctor> doctorList;
    
    public DoctorDirectory(){
        doctorList = new ArrayList<Doctor>();
    }
    //method for adding new Doctor
    
    public Doctor addNewDoctor(Person p){
        Doctor newDoctor = new Doctor(p);
        getDoctorList().add(newDoctor);
        return newDoctor;
    }
    
    public void deleteDoctor(Doctor d){
        doctorList.remove(d);
    }
    
    public Doctor getDoctorByName(String name){
        for(Doctor d : doctorList){
            if(d.nameIsMatch(name)){
                return d;
            }
        }
        return null; //not found after going through the whole list       
}
    
    
    public boolean findDoctor(String name) {
        for (Doctor d : doctorList) {
            if (d.nameIsMatch(name)) {
                return true;
            }
        }
        return false; // not found after going through the whole list
    }

    /**
     * @return the doctorList
     */
    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    /**
     * @param doctorList the doctorList to set
     */
    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    
    
    
    
}
