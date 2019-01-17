package exerciseRegEx.exercise7;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IpValidatorTest {
    IpValidator ipValidator = new IpValidator();
    @Test
    public void validate1() {
        Assert.assertTrue(ipValidator.validate("192.168.1.10"));
    }
    @Test
    public void validate2() {
        Assert.assertTrue(ipValidator.validate("10.10.48.1"));
    }
    @Test
    public void validate3() {
        Assert.assertFalse(ipValidator.validate("192.168.256.20"));
    }
    @Test
    public void validate4() {
        Assert.assertFalse(ipValidator.validate("192.168.2"));
    }
}