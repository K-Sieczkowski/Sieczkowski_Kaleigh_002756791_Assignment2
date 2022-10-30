/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2_hospitalmodel.Hospital;

import assignment2_hospitalmodel.doctor.Doctor;
import assignment2_hospitalmodel.locationManagement.City;
import assignment2_hospitalmodel.locationManagement.Community;
import assignment2_hospitalmodel.locationManagement.House;

/**

 * @author ksiec
 */
public class Hospital {
    private String name;
    private City city;
    private Doctor doctor;
    private Community community;
    private House house;
    
    //public Hospital(String n){
    //    name = n;
    //}
    
    public void assignDoctor(Doctor d){
        d.assignToHospital(this);
    }
    
    public void addHospitalCity(City c){
       this.city = c;
    }
    
    public void assignToCommunity(Community c){
        c.addHospitalToCommunity(this);
    }
    
    public void addAddress(House h){
        this.house = h;
    }
    
    public boolean nameIsMatch(String name){
        if (getName().equals(name))
            return true;
        else return false;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
    public void printHospitalName(){
        System.out.println("Hospital Name:" + name);
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }
    
    
    
}
