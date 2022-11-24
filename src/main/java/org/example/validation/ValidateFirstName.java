package org.example.validation;

import java.util.regex.Pattern;

public class ValidateFirstName {
    public static boolean isFirstName(String firstName){
        return Pattern.matches("[A-Z][a-z]{2,}",firstName);
    }
}
