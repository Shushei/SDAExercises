package exerciseRegEx.exercise6;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmailValidatorTest {
    EmailValidator emailValidator = new EmailValidator();
    @Test
    public void validatePrettyAndSimple() {
        Assert.assertTrue(emailValidator.validate("prettyandsimple@example.com"));
    }
    @Test
    public void validateVeryCommon() {
        Assert.assertTrue(emailValidator.validate("very.common@example.com"));
    }
    @Test
    public void validateWithDots() {
        Assert.assertTrue(emailValidator.validate("disposable.style.email.with+symbol@example.com"));
    }
    @Test
    public void validateWithDotsNDashes() {
        Assert.assertTrue(emailValidator.validate("other.email-with-dash@example.com"));
    }
    @Test
    public void validateTwoDotHomeAdress() {
        Assert.assertFalse(emailValidator.validate("john.doe@example..com"));
    }
    @Test
    public void validateNoMonkey() {
        Assert.assertFalse(emailValidator.validate("Abc.example.com"));
    }
    @Test
    public void validateQuote() {
        Assert.assertFalse(emailValidator.validate("just\"not\"right@example.com "));
    }
    @Test
    public void validateTwoDotUserName() {
        Assert.assertFalse(emailValidator.validate("john..doe@example.com "));
    }
}