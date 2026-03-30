/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vrs.vehicleregistration;

/**
 *
 * @author ramit071
 */
public class VehicleRegistration {
    private String vehicleDetails;
    public String owner;

    public VehicleRegistration(String vehicleDetails, String owner) {
        this.vehicleDetails = vehicleDetails;
        this.owner = owner;
    }

    public void registerVehicle() {
        System.out.println("Vehicle registered: " + vehicleDetails + " | Owner: " + owner);
    }

    public String getDetails() {
        return "Vehicle: " + vehicleDetails + ", Owner: " + owner;
    }

    public boolean verifyDetails() {
        boolean valid = vehicleDetails != null && !vehicleDetails.isEmpty()
                     && owner != null && !owner.isEmpty();
        System.out.println("Verification status: " + valid);
        return valid;
    }

    public String getVehicleDetails() { return vehicleDetails; }
    public void setVehicleDetails(String v) { this.vehicleDetails = v; }
    public void setOwner(String o) { this.owner = o; }
}
