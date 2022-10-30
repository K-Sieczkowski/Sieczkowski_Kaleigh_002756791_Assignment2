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
public class CityDirectory {
    private ArrayList<City> cityList;
    
    
    
    public CityDirectory(){
        cityList = new ArrayList<City>();
    }
    
    
     public City addNewCity(){
        City c = new City();
        getCityList().add(c);
        return c;
    }
     
    public City getCityByName(String name){
        for(City c : cityList){
            if(c.nameIsMatch(name)){
                return c;
            }
        }   
        
        return null; // not found after going through the whole list
    }
     
     public void deleteCity(City c){
        cityList.remove(c);
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }
     
     
     
}
