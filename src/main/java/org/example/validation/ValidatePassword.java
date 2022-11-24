package org.example.validation;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

public class ValidatePassword {


    public static boolean isPassword(String password){
       return matches("[A-Za-z0-9!@#$%^&*]{10,20}",password);
    }

}

