
package com.mycompany.LindokuhleAtWork;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lindokuhle Zwane
 */
public class CreateAccountTest {

    /**
     * Test of checkUsername method, of class CreateAccount.
     */
    @Test
    public void testCheckUsername() {
        System.out.println("kyl_1");
        CreateAccount instance = new CreateAccount();
        System.out.println("Welcome it is great to see you");
        boolean expResult = false;
        System.out.println("kyle!!!!!!");
        boolean result = instance.checkUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
    }

    /**
     * Test of checkPasswordComplexity method, of class CreateAccount.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("Ch&&sec@ke99!");
        CreateAccount instance = new CreateAccount();
        System.out.println("Password successfully captured");
        boolean expResult = false;
        System.out.println("password");
        boolean result = instance.checkPasswordComplexity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
    }

}
