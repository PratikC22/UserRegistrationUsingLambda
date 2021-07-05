/**********************************************************************
 * This code implements user registration program and gives custom
 * exception if user input is wrong. it also utilizes Lambda function.
 *
 * @author Pratik Chaudhari
 * @since 04/07/2021
 **********************************************************************/
package com.pratik;

public class userMain extends Exception {
    /**
     *
     * UC12: exception handling
     *
     * creating objects for every method in the user registration.
     *
     * @param args
     */
    public static void main(String args[]) {
        UserValidation userValidation = new UserValidation();
        userValidation.userValidate();
    }
}
