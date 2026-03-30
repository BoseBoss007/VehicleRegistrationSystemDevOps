/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vrs.vehicleregistration;

/**
 *
 * @author ramit071
 */
public class LoginSignUp {
    protected String name;
    public String emailId;
    private String password;

    public LoginSignUp(String name, String emailId, String password) {
        this.name = name;
        this.emailId = emailId;
        this.password = password;
    }

    public boolean login(String email, String pwd) {
        if (this.emailId.equals(email) && this.password.equals(pwd)) {
            System.out.println("Login successful for: " + name);
            return true;
        }
        System.out.println("Invalid credentials.");
        return false;
    }

    public void signUp() {
        System.out.println("User registered: " + name + " | Email: " + emailId);
    }

    public String getName() { return name; }
    public String getEmailId() { return emailId; }
}
