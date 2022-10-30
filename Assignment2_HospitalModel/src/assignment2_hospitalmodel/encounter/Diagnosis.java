/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2_hospitalmodel.encounter;

/**
 *
 * @author ksiec
 */
public class Diagnosis {

    private String diagnosis;

    public Diagnosis(String d) {
        diagnosis = d;
    }

    /**
     * @return the description
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * @param diagnosis the description to set
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

}
