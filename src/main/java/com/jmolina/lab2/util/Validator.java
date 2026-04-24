package com.jmolina.lab2.util;

public class Validator {

    public static boolean isEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    public static boolean isValidPassword(String pass) {
        if (isEmpty(pass)) {
            return false;
        }
        return pass.length() >= 13
                && pass.matches(".*[A-Z].*")
                && pass.matches(".*[!@#$%^&*()].*");
    }
}
