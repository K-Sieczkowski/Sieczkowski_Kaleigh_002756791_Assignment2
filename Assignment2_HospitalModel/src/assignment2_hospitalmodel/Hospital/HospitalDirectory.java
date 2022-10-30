/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2_hospitalmodel.Hospital;

import assignment2_hospitalmodel.doctor.DoctorDirectory;
import assignment2_hospitalmodel.system.HospitalSystem;
import java.util.ArrayList;

/**
 *
 * @author ksiec
 */
public class HospitalDirectory {
    private ArrayList<Hospital> hospitals;
    private DoctorDirectory doctorDirectory;
    
    
    public HospitalDirectory(){
        this.hospitals = new ArrayList<Hospital>();
    }
    
    public Hospital addNewHospital(){
        Hospital newHospital = new Hospital();
        hospitals.add(newHospital);
        return newHospital;
    }
   
    
    /**
     * @return the hospitals
     */
    public ArrayList<Hospital> getHospitals() {
        return hospitals;
    }

    /**
     * @param hospitals the hospitals to set
     */
    public void setHospitals(ArrayList<Hospital> hospitals) {
        this.hospitals = hospitals;
    }
    
    
    
    public void printHospitalInfo(){
        for(Hospital hospitalsInLoop : hospitals){
            hospitalsInLoop.printHospitalName();
        }
    }
    
    
    public Hospital getHospitalByName(String name){
        for(Hospital h : hospitals){
            if(h.nameIsMatch(name)){
                return h;
            }
        }   
        
        return null; // not found after going through the whole list
    }
    
        
    public void deleteHospital(Hospital h){
        hospitals.remove(h);
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    
}
