package exerciseRegEx.exercise5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WWWValidatorTest {
    WWWValidator wwwValidator = new WWWValidator();
    @Test
    public void validateCorrect() {
        Assert.assertTrue(wwwValidator.validate("www.wp.pl"));
    }
    @Test
    public void validateFalse() {
        Assert.assertFalse(wwwValidator.validate("http://"));
        Assert.assertFalse(wwwValidator.validate("http://-error-.invalid/"));
        Assert.assertFalse(wwwValidator.validate(" http://foo.bar/foo(bar)baz quux"));
        Assert.assertFalse(wwwValidator.validate(" http://foo.bar/foo(bar)baz quux"));
        Assert.assertFalse(wwwValidator.validate("http://www.wp.pl"));
    }
}