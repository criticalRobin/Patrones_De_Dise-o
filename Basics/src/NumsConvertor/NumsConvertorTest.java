package NumsConvertor;

import org.junit.Assert;
import org.junit.Test;

public class NumsConvertorTest {
    @Test
    public void numberOneToRomanTest() {
        NumsConvertor num = new NumsConvertor(1);
        String roman = num.convertToRomanNumber();

        Assert.assertEquals("I", roman);
    }

    @Test
    public void numberFiveToRomanTest() {
        NumsConvertor num = new NumsConvertor(5);
        String roman = num.convertToRomanNumber();

        Assert.assertEquals("V", roman);
    }
}
