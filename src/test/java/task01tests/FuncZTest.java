package task01tests;

import by.neuhen.task01javabasic.service.linearprogramming.FuncZ;
import org.testng.Assert;
import org.testng.annotations.Test;

//TODO xml with running classes (test suite)
public class FuncZTest {

    //TODO data provider
    @Test(description="negative double")
    public void funkCMinusDouble() {
        double expected;
        double actual;
        double a;
        double b;
        double c;
        FuncZ funcZ = new FuncZ();
        a = -27.54;
        b = -27.54;
        c = -27.54;
        expected = ((a - 3) * b / 2) + c;//only numbers
        funcZ.setA(a);
        funcZ.setB(b);
        funcZ.setC(c);
        actual = funcZ.getResult();
        Assert.assertEquals(actual, expected);
    }


    @Test(description="negative int")
    public void funkCMinusInt() {
        double expected;
        double actual;
        double a;
        double b;
        double c;
        FuncZ funcZ = new FuncZ();
        a = -27;
        b = -27;
        c = -27;
        expected = ((a - 3) * b / 2) + c;
        funcZ.setA(a);
        funcZ.setB(b);
        funcZ.setC(c);
        actual = funcZ.getResult();
        Assert.assertEquals(actual, expected);
    }

    @Test(description="zero test")
    public void funkCZero() {
        double expected;
        double actual;
        double a;
        double b;
        double c;
        FuncZ funcZ = new FuncZ();
        a = 0;
        b = 0;
        c = 0;
        expected = ((a - 3) * b / 2) + c;
        funcZ.setA(a);
        funcZ.setB(b);
        funcZ.setC(c);
        actual = funcZ.getResult();
        Assert.assertEquals(actual, expected);
    }

    @Test(description="double test")
    public void funkCDouble() {
        double expected;
        double actual;
        double a;
        double b;
        double c;
        FuncZ funcZ = new FuncZ();
        a = 27.54;
        b = 27.54;
        c = 27.54;
        expected = ((a - 3) * b / 2) + c;
        funcZ.setA(a);
        funcZ.setB(b);
        funcZ.setC(c);
        actual = funcZ.getResult();
        Assert.assertEquals(actual, expected);
    }

    @Test(description="int test")
    public void funkCInt() {
        double expected;
        double actual;
        double a;
        double b;
        double c;
        FuncZ funcZ = new FuncZ();
        a = 27;
        b = 27;
        c = 27;
        expected = ((a - 3) * b / 2) + c;
        funcZ.setA(a);
        funcZ.setB(b);
        funcZ.setC(c);
        actual = funcZ.getResult();
        Assert.assertEquals(actual, expected);
    }

    @Test(description="double all 3 test")
    public void funkCThree() {
        double expected;
        double actual;
        double a;
        double b;
        double c;
        FuncZ funcZ = new FuncZ();
        a = 3;
        b = 3;
        c = 3;
        expected = 3;
        funcZ.setA(a);
        funcZ.setB(b);
        funcZ.setC(c);
        actual = funcZ.getResult();
        Assert.assertEquals(actual, expected);
    }
}

