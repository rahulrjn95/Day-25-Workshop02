package org.example.validation;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateFirstNameTest {
    @Test
    public void givenFirstName_WhenValid_ThenTrue(){
        boolean result = ValidateFirstName.isFirstName("Rambabu");
        Assert.assertTrue(result);
        System.out.println(result);
    }
    @Test
    public void givenFirstName_WhenInValid_ThenFalse(){
        boolean result = ValidateFirstName.isFirstName("rambabu");
        Assert.assertFalse(result);
        System.out.println(result);
    }
}