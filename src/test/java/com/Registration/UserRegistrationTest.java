package com.Registration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean valid=RegisterValidation.validFirstName("Mangesh");
        Assert.assertEquals(true,valid);
    }
    @Test
    public void givenFirstName_WhenUnProper_ShouldReturnFalse() {
        boolean valid=RegisterValidation.validFirstName("mangesh");
        Assert.assertEquals(false,valid);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue(){
        boolean valid=RegisterValidation.validLastName("Latekar");
        Assert.assertEquals(true,valid);
    }
    @Test
    public void givenLastName_WhenUnProper_ShouldReturnFalse(){
        boolean valid=RegisterValidation.validLastName("latekar");
        Assert.assertEquals(false,valid);
    }
    @Test
    public void givenEmailAddress_IsProper_ShouldReturnTrue(){
        boolean valid=RegisterValidation.validEmailAddress("mangesh.latekar@gmail.co.in");
        Assert.assertEquals(true,valid);
    }
    @Test
    public void givenEmailAddress_IsUnProper_ShouldReturnFalse(){
        boolean valid=RegisterValidation.validEmailAddress("mh.@.3co.in");
        Assert.assertEquals(false,valid);
    }
}
