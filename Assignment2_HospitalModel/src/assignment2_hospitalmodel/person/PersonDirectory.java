/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2_hospitalmodel.person;

import java.util.ArrayList;
/**
 *
 * @author ksiec
 */
public class PersonDirectory {
    private ArrayList<Person> persons;
    
    
    public PersonDirectory(){
        persons = new ArrayList<Person>();
}
    
   //method to create instane of a new person
    public Person newPerson(){
        Person p = new Person();
        persons.add(p);
        return p;
    }
    
    public Person findPerson(String name){
        for(Person p : persons){
            if(p.nameIsMatch(name)){
                return p;
            }
        }
        return null; //not found after going through the whole list
}
}
