package NumsConvertor;

import org.junit.Assert;
import org.junit.Test;

public class NumsConvertorTest {
    @Test
    public void numberOneToRomanTest() {
        NumsConvertor num = new NumsConvertor(1);
        String roman = num.convertToRomanNumber();
        System.out.println(roman);

        Assert.assertEquals("I", roman);
    }

    @Test
    public void numberFiveToRomanTest() {
        NumsConvertor num = new NumsConvertor(5);
        String roman = num.convertToRomanNumber();
        System.out.println(roman);
        Assert.assertEquals("V", roman);
    }

    @Test
    public void bigNumberToTomanTest() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            NumsConvertor num = new NumsConvertor(40000000);
            num.convertToRomanNumber();
        });
    }

    @Test
    public void numberZeroToRomanTest() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            NumsConvertor num = new NumsConvertor(0);
            num.convertToRomanNumber();
        });
    }
}
