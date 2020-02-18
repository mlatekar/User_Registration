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
    @Test
    public void givenPreDefinedMobileNumber_IsProper_ShouldReturnTrue(){
        boolean valid=RegisterValidation.validMobileNumber("91 8097118449");
        Assert.assertEquals(true,valid);
    }
    @Test
    public void givenPreDefinedMobileNumber_IsUnProper_ShouldReturnTrue(){
        boolean valid=RegisterValidation.validMobileNumber("91_0971084");
        Assert.assertEquals(false,valid);
    }
    @Test
    public void givenPasswordRuleOne_IsProper_ThenReturnTrue(){
        boolean valid=RegisterValidation.validPasswordRuleOne("aefysfty");
        Assert.assertEquals(true,valid);
    }
    @Test
    public void givenPasswordRuleOne_IsUnProper_ThenReturnTrue(){
        boolean valid=RegisterValidation.validPasswordRuleOne("adsfty");
        Assert.assertEquals(false,valid);
    }
    @Test
    public void givenPasswordHaveOneCapitalLetter_IsProper_ThenReturnTrue(){
        boolean valid=RegisterValidation.validPasswordWithOneCapitalLetter("hEyyPassword");
        Assert.assertEquals(true,valid);
    }
    @Test
    public void givenPasswordHaveOneCapitalLetter_IsUnProper_ThenReturnTrue(){
        boolean valid=RegisterValidation.validPasswordWithOneCapitalLetter("heypassword");
        Assert.assertEquals(false,valid);
    }
    @Test
    public void givenPasswordHaveOneCapitalAndOneNumber_IsProper_ThenReturnTrue(){
        boolean valid=RegisterValidation.validPasswordWithOneNumber("Hiiii5Brooo");
        Assert.assertEquals(true,valid);
    }
    @Test
    public void givenPasswordHaveOneCapitalAndOneNumber_IsUnProper_ThenReturnTrue(){
        boolean valid=RegisterValidation.validPasswordWithOneNumber("HiibRooo");
        Assert.assertEquals(false,valid);
    }
}
