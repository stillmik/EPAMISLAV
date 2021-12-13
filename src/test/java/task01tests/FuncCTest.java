package task01tests;

import by.neuhen.task01javabasic.service.linearprogramming.FuncC;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FuncCTest {

    @Test
    public void funkCMinusDouble() {
        double expected;
        double actual;
        double a;
        FuncC funcC = new FuncC();
        a = -27.54;
        expected = -24.54;
        funcC.setA(a);
        actual = funcC.getResult();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void funkCMinusInt() {
        double expected;
        double actual;
        double a;
        FuncC funcC = new FuncC();
        a = -27;
        expected = -24;
        funcC.setA(a);
        actual = funcC.getResult();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void funkCZero() {
        double expected;
        double actual;
        double a;
        FuncC funcC = new FuncC();
        a = 0;
        expected = 3;
        funcC.setA(a);
        actual = funcC.getResult();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void funkCDouble() {
        double expected;
        double actual;
        double a;
        FuncC funcC = new FuncC();
        a = 27.54;
        expected = 30.54;
        funcC.setA(a);
        actual = funcC.getResult();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void funkCInt() {
        double expected;
        double actual;
        double a;
        FuncC funcC = new FuncC();
        a = 27;
        expected = 30;
        funcC.setA(a);
        actual = funcC.getResult();
        Assert.assertEquals(actual, expected);
    }
}
