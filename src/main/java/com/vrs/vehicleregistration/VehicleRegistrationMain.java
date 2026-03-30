/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vrs.vehicleregistration;


/**
 *
 * @author ramit071
 */
public class VehicleRegistrationMain {

     public static void main(String[] args) {

       
        LoginSignUp user = new LoginSignUp("Ganesh", "ganesh@vit.ac.in", "pass123");
        user.signUp();
        user.login("ganesh@vit.ac.in", "pass123");

        
        VehicleRegistration reg = new VehicleRegistration("TN07AB1234", "Ganesh");
        reg.registerVehicle();
        System.out.println(reg.getDetails());
        reg.verifyDetails();

    
        VehiclePermit permit = new VehiclePermit("PERM-001", "TN07AB1234");
        permit.issuePermit();

    
        Finance finance = new Finance(50000, "VRS_DB");
        finance.poolingOfFunds(15000);
        finance.economicDevelopment();
        finance.betterDecisionMaking();

        VehicleLicensing license = new VehicleLicensing(21, "Ganesh", "Chennai");
        license.provideLicenseToDrive();

        Examination exam = new Examination("Ganesh", "GaneshSignature");
        exam.figureOutEligibleCandidates(22);
    }
}
