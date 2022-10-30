/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2_hospitalmodel.person;

import assignment2_hospitalmodel.locationManagement.House;

/**
 *
 * @author ksiec
 */
public class Person {

    private String name;
    private String id;
    private String dob;
    private int age;
    private String phoneNumber;
    private String emailAddress;
    private String role; 
    private House house;

    
    public void addHouse(House hs){
        this.house = hs;
    }
    
    public Person updatePerson(String n, String i, String db, int a, String pn){
        setName(n);
        setId(i);
        setDob(db);
        setAge(a);
        setPhoneNumber(pn);
        return this; //returns itself
    }
    
    public boolean nameIsMatch(String name){
        if (getPersonName().equals(name))
            return true;
        else return false;
    }
    
    public String getPersonName(){
        return getName();
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
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the gender
     */

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
}
