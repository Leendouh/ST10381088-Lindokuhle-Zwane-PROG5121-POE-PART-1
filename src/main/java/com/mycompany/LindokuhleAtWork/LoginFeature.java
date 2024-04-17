
package com.mycompany.LindokuhleAtWork;

import java.util.Scanner;

/**
 *
 * @author Lindokuhle Zwane
 */
public class LoginFeature {

    public static void main(String[] args) {
        CreateAccount objCreateAccount = new CreateAccount();
        Scanner sc = new Scanner(System.in);

        // Register a new user
        System.out.println("+++++++++++++++++ REGISTRATION ++++++++++++++++++");
        System.out.print("Enter your first name: ");
        String newName = sc.nextLine();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Enter your last name: ");
        String newSurname = sc.nextLine();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Enter a username: ");
        String newUsername = sc.nextLine();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Enter a password: ");
        String newPassword = sc.nextLine();

        String registrationResult = objCreateAccount.registerUser(newName, newSurname, newUsername, newPassword);
        System.out.println(registrationResult);

        // Login
        System.out.println("+++++++++++++++++ LOGIN FEATURE +++++++++++++++++");
        System.out.print("Enter your username: ");
        String inputUsername = sc.nextLine();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Enter your password: ");
        String inputPassword = sc.nextLine();

        String loginStatus = objCreateAccount.returnLoginStatus(inputUsername, inputPassword);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(loginStatus);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        sc.close();
    }
}
