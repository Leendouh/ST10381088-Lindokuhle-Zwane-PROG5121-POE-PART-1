/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LindokuhleAtWork;

import java.util.Scanner;

/**
 *
 * @author Lindokuhle Zwane
 */
public class CreateAccount {
    // declare the private variables   

    private String name;
    private String surname;
    private String username;
    private String password;

    // Constructor method
    public CreateAccount() {
        this.name = "";
        this.surname = "";
        this.username = "";
        this.password = "";

    }

    // This method ensures that any username contains an underscore(_) and is no more than 
    public boolean checkUsername() {
        return username.length() <= 5 && username.contains("_");

    }

    //This method ensures that passwords meet the following password complexity rules
    public boolean checkPasswordComplexity() {
        // Password must be at least 8 characters with a capital letter, number, and special character
        return password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!]).{8,}$");

    }

    // A constructor method
    public String registerUser(String name, String surname, String username, String password) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;

        /*
        Your code is mostly correct, but there's a logical issue in your registerUser method. 
        Using return inside a loop will exit the loop immediately, which doesn't allow the user to re-enter values. 
        Instead, you need to prompt the user to enter values again inside the loop. Here's the corrected version:
         */
        Scanner sc = new Scanner(System.in);
        while (!checkUsername()) {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Invalid Username! Username is not correctly formatted,\nPlease ensure that your username contains an underscore(_) and is no more than 5 characters in length.");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.print("Enter a username: ");
            this.username = sc.nextLine();
        }

        while (!checkPasswordComplexity()) {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Invalid Password! Password is not correctly formatted,\nPlease ensure that the password contains at least \n8 characters, a capital letter, a number and a special character.");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.print("Enter a password: ");
            this.password = sc.nextLine();
        }
        /**
         * The code you provided is correct in terms of registering a user and
         * logging in. However, there's a logical error in the registerUser
         * method. After checking the validity of the username and password,
         * you're closing the Scanner object within the method. This can cause
         * issues if the same Scanner object is used elsewhere in the program,
         * especially when trying to read input from the console.
         */
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        return "Registration successful!";
    }

    // This method verifies that the login details entered matches the login details stored when the user registers.
    public boolean loginUser(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    // This method returns the necessary messaging for:
    public String returnLoginStatus(String username, String password) {
        if (loginUser(username, password)) {
            return "Successful to Login! Welcome " + name + " " + surname + ", it is great to see you again.";
        } else {
            return "Failed to Login";
        }
    }

}
