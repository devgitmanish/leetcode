package com.passwordGenerator;

import java.util.Random;

public class PasswordGenerator {

    public static String generatePassword(int passwordLength){

        String lowerAlpha = "qwertyuiopasdfghjklzxcvbnm";
        String upperAlpha = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String number = "1234567890";
        String specialChar = "!@#$%^&*?";
        String combination = lowerAlpha+upperAlpha+number+specialChar+number;

        char [] password = new char[passwordLength];
        Random random = new Random();

        for(int i=0; i<passwordLength; i++){
            password[i] = combination.charAt(random.nextInt(combination.length()));
        }
        return new String(password);
    }


    public static String passwordGen(int passwordLength){
        String lowerCaseChar="qwertyuiopasdfghjklzxcvbnm";
        String upperCaseChar="QWERTYUIOPASDFGHJKLZXCVBNM";
        String num = "1234567890";
        String specialChar="!@#$%^&*?/+-";

        String combination = lowerCaseChar+upperCaseChar+specialChar+num;
        Random random = new Random();

        char [] ch = new char[passwordLength];

        for(int i=0; i<passwordLength; i++){
            ch[i] = combination.charAt(random.nextInt(combination.length()));
        }
        return new String(ch);
    }





    public static void main(String[] args) {
        System.out.println(generatePassword(8));
    }
}
