package com.Registration;

import java.util.regex.Pattern;

public class RegisterValidation {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
    }
    private static final String FIRST_NAME="^[A-Z]{1}[a-zA-Z]{3,}$";
    private static final String LAST_NAME="^[A-Z]{1}[a-zA-Z]{3,}$";
    private static final String EMAIL_ADDRESS="^[a-zA-Z0-9]{3,}([.-]{1}[a-zA-Z0-9]{3,}+)?[@]{1}[a-zA-Z0-9]+[.]{1}[a-zA-Z]{2,3}([.]{1}[a-zA-Z]{2,3})?";
    private static final String MOBILE_NUMBER="^[0-9]{2}[ ][0-9]{10}";
    private static final String PASSWORD= "^((?=[^\\W]*[\\W][^\\W]*$))(?=.*[A-Z])(?=.*[\\d])[A-Za-z0-9\\W].{8,}$";


    public static boolean validFirstName(String firstName) { return Pattern.matches(FIRST_NAME,firstName); }

    public static boolean validLastName(String lastName) { return Pattern.matches(LAST_NAME,lastName); }

    public static boolean validEmailAddress(String emailAddress) { return Pattern.matches(EMAIL_ADDRESS,emailAddress); }

    public static boolean validMobileNumber(String countryCodeWithMobileNumber) { return Pattern.matches(MOBILE_NUMBER,countryCodeWithMobileNumber); }

    public static boolean validPasswordRuleOne(String passwordRuleOne) { return Pattern.matches(PASSWORD,passwordRuleOne); }

    public static boolean validPasswordWithOneCapitalLetter(String passwordWithCapital) { return Pattern.matches(PASSWORD,passwordWithCapital); }

    public static boolean validPasswordWithOneNumber(String passwordWithNumber) { return Pattern.matches(PASSWORD,passwordWithNumber); }

    public static boolean validPasswordWithSpecialCharacter(String passwordWithSpecialCharacter) { return Pattern.matches(PASSWORD,passwordWithSpecialCharacter);}
}

