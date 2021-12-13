package task01tests;

import by.neuhen.task01javabasic.service.linearprogramming.MultDigitsOfNumber;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultDigitsOfNumberTest {

    @Test
    public void multNormal() {
        MultDigitsOfNumber multDigitsOfNumber = new MultDigitsOfNumber();
        int expected;
        int actual;
        int number;
        number = 1488;
        expected=256;
        multDigitsOfNumber.setNumber(number);
        actual =multDigitsOfNumber.getResult();
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void multZero() {
        MultDigitsOfNumber multDigitsOfNumber = new MultDigitsOfNumber();
        int expected;
        int actual;
        int number;
        number = 1000;
        expected=0;
        multDigitsOfNumber.setNumber(number);
        actual =multDigitsOfNumber.getResult();
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void multOne() {
        MultDigitsOfNumber multDigitsOfNumber = new MultDigitsOfNumber();
        int expected;
        int actual;
        int number;
        number = 1111;
        expected=1;
        multDigitsOfNumber.setNumber(number);
        actual =multDigitsOfNumber.getResult();
        Assert.assertEquals(actual,expected);
    }
}
