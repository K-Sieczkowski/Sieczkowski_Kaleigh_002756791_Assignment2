/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2_hospitalmodel.locationManagement;

import java.util.ArrayList;

/**
 *
 * @author ksiec
 */
public class City {
    private String name;
    private String zipcode;
    private ArrayList<Community> communityList;
    
    
    
    public City(){
        communityList = new ArrayList<Community>();
    }
    
    public Community addNewCommunity(){
        Community cm = new Community();
        getCommunityList().add(cm);
        return cm;
    }
    
    public boolean nameIsMatch(String name) {
        if (getName().equals(name)) {
            return true;
        }
        return false;
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

    /**
     * @return the zip code
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * @param zipcode the zip code to set
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }

    
    
}
