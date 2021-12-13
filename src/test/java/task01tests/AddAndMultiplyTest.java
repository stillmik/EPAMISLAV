package task01tests;

import by.neuhen.task01javabasic.service.cycling.AddAndMultiply;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddAndMultiplyTest {

    @Test(description = "lowLength, length =3")
    private void lowLength(){
        AddAndMultiply addAndMultiply = new AddAndMultiply();
        int length =3;
        long expected = 18;
        long actual = addAndMultiply.getResult(length);
        Assert.assertEquals(expected,actual);
    }

    @Test(description = "long Length, length =10")
    private void longLength(){
        AddAndMultiply addAndMultiply = new AddAndMultiply();
        int length =10;
        long expected = 141455160000L;
        long actual = addAndMultiply.getResult(length);
        Assert.assertEquals(expected,actual);
    }

    @Test(description = "zero Length, length =10")
    private void zeroLength(){
        AddAndMultiply addAndMultiply = new AddAndMultiply();
        int length =0;
        long expected = 1L;
        long actual = addAndMultiply.getResult(length);
        Assert.assertEquals(expected,actual);
    }
}
