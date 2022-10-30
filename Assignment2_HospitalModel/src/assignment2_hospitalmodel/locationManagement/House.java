/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2_hospitalmodel.locationManagement;

/**
 *
 * @author ksiec
 */
public class House {
    private String address;
    private City city;
    private Community community;
    
  
    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    
    public void addToCommunity(Community cm){
        this.community = cm;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void addCity(City c){
       this.city = c;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }
    
    
    
    @Override
    public String toString(){
        return address;
    }
    
}
