package task01tests;

import by.neuhen.task01javabasic.service.branching.NegativeNumberCounter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeNumberCounterTest {

    @Test(description = "all are positive")
    private void posTest(){
        var negativeNumberCounter = new NegativeNumberCounter(5);
        double[] allPos = {27,54,228,1488,1337};
        negativeNumberCounter.addNumbers(allPos);
        int expected =0;
        long actual = negativeNumberCounter.countNegatives();
        Assert.assertEquals(expected,actual);
    }

    @Test(description = "all are negative")
    private void negativeTest(){
        var negativeNumberCounter = new NegativeNumberCounter(5);
        double[] allPos = {-27,-54,-228,-1488,-1337};
        negativeNumberCounter.addNumbers(allPos);
        int expected =5;
        long actual = negativeNumberCounter.countNegatives();
        Assert.assertEquals(expected,actual);
    }

    @Test(description = "all are zero")
    private void zeroTest(){
        var negativeNumberCounter = new NegativeNumberCounter(5);
        double[] allPos = {0,0,0,0,0};
        negativeNumberCounter.addNumbers(allPos);
        int expected =0;
        long actual = negativeNumberCounter.countNegatives();
        Assert.assertEquals(expected,actual);
    }

    @Test(description = "mixed digits")
    private void mixedTest(){
        var negativeNumberCounter = new NegativeNumberCounter(5);
        double[] allPos = {0,-27,54,-2,5};
        negativeNumberCounter.addNumbers(allPos);
        int expected =2;
        long actual = negativeNumberCounter.countNegatives();
        Assert.assertEquals(expected,actual);
    }
}
