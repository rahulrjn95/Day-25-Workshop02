package org.example.validation;

import org.junit.Assert;
import org.junit.Test;


public class ValidatePasswordTest {
    @Test
    public void givenpassword_WhenValid_ThenTrue(){
        boolean result = ValidatePassword.isPassword("Rahul2022@");
        Assert.assertTrue(result);
        System.out.println(result);
    }
    @Test
    public void givenpassword_WhenInValid_ThenFalse(){
        boolean result = ValidatePassword.isPassword("rahul202@");
        Assert.assertFalse(result);
        System.out.println(result);
    }
}