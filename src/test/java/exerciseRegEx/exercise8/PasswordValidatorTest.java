package exerciseRegEx.exercise8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordValidatorTest {
    PasswordValidator passwordValidator = new PasswordValidator();
    @Test
    public void validatePassword() {
        Assert.assertTrue(passwordValidator.validate("aeraeraA1+AaAER"));
    }
    @Test
    public void validatePasswordTrue() {
        Assert.assertTrue(passwordValidator.validate("1Hania+Ala"));
    }
    @Test
    public void validateTwoLowerCase() {
        Assert.assertFalse(passwordValidator.validate("aaA"));
    }
    @Test
    public void validateTwoUpperCase() {
        Assert.assertFalse(passwordValidator.validate("AAeraeraer"));
    }
    @Test
    public void validateNumber() {
        Assert.assertFalse(passwordValidator.validate("aaaa1aaaaaa"));
    }
    @Test
    public void validateSpecial() {
        Assert.assertFalse(passwordValidator.validate("aaaa+aaaaaa"));
    }
    @Test
    public void validateLowerUpperCase() {
        Assert.assertFalse(passwordValidator.validate("aAaA"));
    }
}