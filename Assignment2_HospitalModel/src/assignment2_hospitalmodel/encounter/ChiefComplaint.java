/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2_hospitalmodel.encounter;

/**
 *
 * @author ksiec
 */
public class ChiefComplaint {

    private String complaintDescription;

    public ChiefComplaint(String cd) {
        complaintDescription = cd;
    }

    /**
     * @return the description
     */
    public String getComplaintDescription() {
        return complaintDescription;
    }

    /**
     * @param complaintDescription the description to set
     */
    public void setComplaintDescription(String complaintDescription) {
        this.complaintDescription = complaintDescription;
    }

}
