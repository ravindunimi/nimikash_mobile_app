package com.nimikash.utils;

import com.github.javafaker.Faker;

import java.util.Random;

public class StringUtils {

    public static String randomAlphanumericString(int length) {
        String alphanumericCharacters = "abcdefghijklmnopqrstuv";

        StringBuffer randomString = new StringBuffer(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(alphanumericCharacters.length());
            char randomChar = alphanumericCharacters.charAt(randomIndex);
            randomString.append(randomChar);
        }

        return randomString.toString();
    }

    public static String generateFirstName() {

        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        return firstName;
    }

    public static String generateLastName() {

        Faker faker = new Faker();
        String lastName = faker.name().firstName();
        return lastName;
    }

    public static String generateNumber(int length) {

        String alphanumericCharacters = "0123456789";

        StringBuffer randomString = new StringBuffer(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(alphanumericCharacters.length());
            char randomChar = alphanumericCharacters.charAt(randomIndex);
            randomString.append(randomChar);
        }
        return randomString.toString();
    }

    public static String generateMobileNumber(){

        String number = "7" + generateNumber(8);
        return number;
    }
}
