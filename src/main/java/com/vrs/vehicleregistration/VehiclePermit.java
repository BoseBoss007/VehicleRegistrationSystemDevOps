/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author raksh
 */
public class VehiclePermit {
    private String permitId;
    private String vehicleDetails;

    public VehiclePermit(String permitId, String vehicleDetails) {
        this.permitId = permitId;
        this.vehicleDetails = vehicleDetails;
    }

    public void issuePermit() {
        System.out.println("Permit issued [ID: " + permitId + "] for: " + vehicleDetails);
    }

    public String getPermitId() { return permitId; }
    public String getVehicleDetails() { return vehicleDetails; }
}
