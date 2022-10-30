/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2_hospitalmodel.locationManagement;

import assignment2_hospitalmodel.Hospital.Hospital;
import java.util.ArrayList;

/**
 *
 * @author ksiec
 */
public class Community {
    private ArrayList<House> houseList;
    private Hospital hospital;
    private String name;
    
    
    public Community(){
        houseList = new ArrayList<House>();
    }
    
    
    public Community(String n){
        name = n;
    }
    
    public House addNewHouse(){
        House h = new House();
        getHouseList().add(h);
        return h;
    }
    
    public void deleteHouse(House h){
        houseList.remove(h);
    }
    
    public void addHouseToCommunity(House h){
        this.houseList.add(h);
    }
    
    public void addHospitalToCommunity(Hospital h){
        this.hospital = h;
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

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    
    
    @Override
    public String toString(){
        return name;
    }
    
}
