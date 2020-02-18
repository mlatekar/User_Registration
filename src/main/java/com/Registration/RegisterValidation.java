package com.Registration;

import java.util.regex.Pattern;

public class RegisterValidation {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
    }
    private static final String firstName="^[A-Z]{1}[a-zA-Z]{3,}$";

    public static boolean validFirstName(String fName) { return Pattern.matches(firstName,fName); }
}

