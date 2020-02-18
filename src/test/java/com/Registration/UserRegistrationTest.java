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
        boolean valid=RegisterValidation.validFirstName("ma");
        Assert.assertEquals(false,valid);
    }

}
