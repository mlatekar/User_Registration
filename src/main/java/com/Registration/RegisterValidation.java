package com.Registration;

import java.util.regex.Pattern;

public class RegisterValidation {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
    }
    private static final String FIRST_NAME="^[A-Z]{1}[a-zA-Z]{3,}$";
    private static final String LAST_NAME="^[A-Z]{1}[a-zA-Z]{3,}$";

    public static boolean validFirstName(String firstName) { return Pattern.matches(FIRST_NAME,firstName); }

    public static boolean validLastName(String lastName) {
        return Pattern.matches(LAST_NAME,lastName);
    }
}

