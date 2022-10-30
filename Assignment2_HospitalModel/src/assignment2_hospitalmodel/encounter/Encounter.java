/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2_hospitalmodel.encounter;

/**
 * m
 *
 * @author ksiec
 */
public class Encounter {

    private Diagnosis diagnosis;
    private VitalSigns vitalSigns;
    private ChiefComplaint chiefComplaint;
    private EncounterHistory encounterHistory;
    private String date;
    private int id;

    public void newChiefComplaint(String s) {
        chiefComplaint = new ChiefComplaint(s);
    }

    public void newVitalSigns(int respiratoryRate, int heartRate, double temperature, double bloodPressure, int weightInPounds, boolean patientIsNormal) {
        vitalSigns = new VitalSigns(respiratoryRate, heartRate, temperature, bloodPressure, weightInPounds, patientIsNormal);
    }

    public void newDiagnosis(String d) {
        diagnosis = new Diagnosis(d);
    }

    public void getCurrentEncounter() {
        this.getDate();
        this.chiefComplaint.getComplaintDescription();
        this.vitalSigns.getBloodPressure();
        this.vitalSigns.getHeartRate();
        this.vitalSigns.getRespiratoryRate();
        this.vitalSigns.getTemperature();
        this.vitalSigns.getWeightInPounds();
        this.vitalSigns.isPatientIsNormal();
        this.diagnosis.getDiagnosis();
    }

    /**
     * @return the diagnosis
     */
    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    /**
     * @param diagnosis the diagnosis to set
     */
    public void setDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

    /**
     * @return the vitalSigns
     */
    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    /**
     * @param vitalSigns the vitalSigns to set
     */
    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    /**
     * @return the chiefComplaint
     */
    public ChiefComplaint getChiefComplaint() {
        return chiefComplaint;
    }

    /**
     * @param chiefComplaint the chiefComplaint to set
     */
    public void setChiefComplaint(ChiefComplaint chiefComplaint) {
        this.chiefComplaint = chiefComplaint;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return date;
    }

}
