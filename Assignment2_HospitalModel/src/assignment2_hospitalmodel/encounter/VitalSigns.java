/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2_hospitalmodel.encounter;

/**
 *
 * @author ksiec
 */
public class VitalSigns {

    private int respiratoryRate;
    private int heartRate;
    private double temperature; //decimal
    private double bloodPressure; //decimal
    private int weightInPounds;
    private boolean patientIsNormal;

    public VitalSigns(int r, int h, double t, double bp, int wp, boolean pn) {
        respiratoryRate = r;
        heartRate = h;
        temperature = t;
        bloodPressure = bp;
        weightInPounds = wp;
        patientIsNormal = pn;
    }

    /**
     * @return the respiratoryRate
     */
    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    /**
     * @param respiratoryRate the respiratoryRate to set
     */
    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    /**
     * @return the heartRate
     */
    public int getHeartRate() {
        return heartRate;
    }

    /**
     * @param heartRate the heartRate to set
     */
    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    /**
     * @return the temperature
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /**
     * @return the bloodPressure
     */
    public double getBloodPressure() {
        return bloodPressure;
    }

    /**
     * @param bloodPressure the bloodPressure to set
     */
    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    /**
     * @return the weightInPounds
     */
    public int getWeightInPounds() {
        return weightInPounds;
    }

    /**
     * @param weightInPounds the weightInPounds to set
     */
    public void setWeightInPounds(int weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public boolean isPatientIsNormal() {
        return patientIsNormal;
    }

    public void setPatientIsNormal(boolean patientIsNormal) {
        this.patientIsNormal = patientIsNormal;
    }

    public String normalToString() {
        String isNormal = String.valueOf(patientIsNormal);
        return isNormal;
    }
}
