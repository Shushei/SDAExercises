package exerciseRegEx.exercise4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlateValidatorTest {
    PlateValidator plateValidator = new PlateValidator();
    @Test
    public void validate4DigitsLetter() {
        Assert.assertTrue(plateValidator.validate("CB3456J"));
    }
    @Test
    public void validateDigits() {
        Assert.assertTrue(plateValidator.validate("CB34212"));
    }
    @Test
    public void validate3Digits2Letters() {
        Assert.assertTrue(plateValidator.validate("WY640WI"));
    }
    @Test
    public void validate3Letters() {
        Assert.assertFalse(plateValidator.validate("CBS3456"));
    }
    @Test
    public void validateOneLetter() {
        Assert.assertFalse(plateValidator.validate("W1234YU"));
    }
    @Test
    public void validateDigits3Letters() {
        Assert.assertFalse(plateValidator.validate("CC14WYG"));
    }
}