/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vrs.vehicleregistration;

/**
 *
 * @author ganesh-kumar-r
 */
public class Examination {
    public String name;
    protected String signature;

    public Examination(String name, String signature) {
        this.name = name;
        this.signature = signature;
    }

    public void figureOutEligibleCandidates(int age) {
        if (age >= 18 && signature != null && !signature.isEmpty()) {
            System.out.println(name + " is ELIGIBLE for driving examination.");
        } else {
            System.out.println(name + " is NOT eligible.");
        }
    }

    
    public String getSignature() { return signature; }
    
}
