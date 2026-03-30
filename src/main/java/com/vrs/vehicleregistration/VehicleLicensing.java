/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vrs.vehicleregistration;

/**
 *
 * @author ganesh-kumar-r
 */
public class VehicleLicensing {
    public int age;
    public String name;
    public String address;

    public VehicleLicensing(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public void provideLicenseToDrive() {
        if (age >= 18) {
            System.out.println("License granted to " + name + " at " + address);
        } else {
            System.out.println("License denied. Age " + age + " is below 18.");
        }
    }

    
    
    
}
