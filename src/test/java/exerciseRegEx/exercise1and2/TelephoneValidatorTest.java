package exerciseRegEx.exercise1and2;

import org.junit.Assert;
import org.junit.Test;

public class TelephoneValidatorTest {
    TelephoneValidator telephoneValidator = new TelephoneValidator();
    @Test
    public void validateNineDigits() {
        Assert.assertTrue(telephoneValidator.validate("505879357"));
    }
    @Test
    public void validateWithSpaces() {
        Assert.assertTrue(telephoneValidator.validate("505 879 357"));
    }
    @Test
    public void validateWithDashes() {
        Assert.assertTrue(telephoneValidator.validate("505-879-357"));
    }
    @Test
    public void validateWithDirection() {
        Assert.assertTrue(telephoneValidator.validate("+48505879357"));
    }
    @Test
    public void validateWrongSpaces() {
        Assert.assertFalse(telephoneValidator.validate("50 58 79 35 7"));
    }
    @Test
    public void validateTooShort() {
        Assert.assertFalse(telephoneValidator.validate("5058794"));
    }
    @Test
    public void validateTooLong() {
        Assert.assertFalse(telephoneValidator.validate("44505879357"));
    }
}