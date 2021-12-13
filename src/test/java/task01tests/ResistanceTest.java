package task01tests;

import by.neuhen.task01javabasic.service.linearprogramming.Resistance;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResistanceTest {

    @Test
    public void resistDouble(){
        double expected;
        double actual;
        double res1;
        double res2;
        double res3;
        Resistance resistance = new Resistance();
        res1=14.88;
        res2=228.1;
        res3=27.54;
        expected=9.267912418465048;
        resistance.initResistors(new double[]{res1, res2, res3});
        actual = resistance.getResult();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void resistDoubleZero(){
        double expected;
        double actual;
        double res1;
        double res2;
        double res3;
        Resistance resistance = new Resistance();
        res1=0.88;
        res2=0.1;
        res3=0.54;
        expected=0.07699287103046014;
        resistance.initResistors(new double[]{res1, res2, res3});
        actual = resistance.getResult();
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void resistInt(){double expected;
        double actual;
        double res1;
        double res2;
        double res3;
        Resistance resistance = new Resistance();
        res1=14;
        res2=88;
        res3=228;
        expected=11.47076118915387;
        resistance.initResistors(new double[]{res1, res2, res3});
        actual = resistance.getResult();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void resistOneZero1(){
        double expected;
        double actual;
        double res1;
        double res2;
        double res3;
        Resistance resistance = new Resistance();
        res1=0;
        res2=228.1;
        res3=27.54;
        expected=0.0;
        resistance.initResistors(new double[]{res1, res2, res3});
        actual = resistance.getResult();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void resistOneZero2(){
        double expected;
        double actual;
        double res1;
        double res2;
        double res3;
        Resistance resistance = new Resistance();
        res1=14.88;
        res2=0.0;
        res3=27.54;
        expected=0.0;
        resistance.initResistors(new double[]{res1, res2, res3});
        actual = resistance.getResult();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void resistOneZero3(){
        double expected;
        double actual;
        double res1;
        double res2;
        double res3;
        Resistance resistance = new Resistance();
        res1=14.88;
        res2=228.1;
        res3=0;
        expected=0.0;
        resistance.initResistors(new double[]{res1, res2, res3});
        actual = resistance.getResult();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void resistAllZero(){
        double expected;
        double actual;
        double res1;
        double res2;
        double res3;
        Resistance resistance = new Resistance();
        res1=0;
        res2=0;
        res3=0;
        expected=0.0;
        resistance.initResistors(new double[]{res1, res2, res3});
        actual = resistance.getResult();
        Assert.assertEquals(actual,expected);
    }
}
