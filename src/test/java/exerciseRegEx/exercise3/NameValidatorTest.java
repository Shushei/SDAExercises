package exerciseRegEx.exercise3;

import org.junit.Assert;
import org.junit.Test;

public class NameValidatorTest {
    NameValidator nameValidator = new NameValidator();

    @Test
    public void validateJan() {
        Assert.assertTrue(nameValidator.validate("Jan"));
    }
    @Test
    public void validateLukasz() {
        Assert.assertTrue(nameValidator.validate("Łukasz"));
    }
    @Test
    public void validateMonika() {
        Assert.assertTrue(nameValidator.validate("Monika"));
    }
    @Test
    public void validateKrzysztof() {
        Assert.assertTrue(nameValidator.validate("Krzysztof"));
    }
    @Test
    public void validatejan() {
        Assert.assertFalse(nameValidator.validate("jan"));
    }
    @Test
    public void validatemonika() {
        Assert.assertFalse(nameValidator.validate("monika"));
    }
    @Test
    public void validatejan87() {
        Assert.assertFalse(nameValidator.validate("jan87"));
    }
    @Test
    public void validateJan87() {
        Assert.assertFalse(nameValidator.validate("Jan87"));
    }
}