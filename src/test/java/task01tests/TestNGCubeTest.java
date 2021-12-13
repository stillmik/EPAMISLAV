package task01tests;

import by.neuhen.task01javabasic.service.linearprogramming.CubeArithmetic;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGCubeTest {

    @Test
    public void normalSideSquare() {
        double side;
        double expected;
        double real;
        CubeArithmetic cubeArithmetic = new CubeArithmetic();
        side=27.54;
        cubeArithmetic.setSide(side);
        expected=side*side;
        real = cubeArithmetic.getResult()[0];
        Assert.assertEquals(expected,real);
    }

    @Test
    public void oneSizeSquare() {
        double side;
        double expected;
        double real;
        CubeArithmetic cubeArithmetic = new CubeArithmetic();
        side=1;
        cubeArithmetic.setSide(side);
        expected=side*side;
        real = cubeArithmetic.getResult()[0];
        Assert.assertEquals(expected,real);
    }

    //////////////////////////////////////////////////////////////////////

    @Test
    public void normalCubeSquare() {
        double side;
        double expected;
        double real;
        CubeArithmetic cubeArithmetic = new CubeArithmetic();
        side=27.54;
        cubeArithmetic.setSide(side);
        expected=side*side*6;
        real = cubeArithmetic.getResult()[1];
        Assert.assertEquals(expected,real);
    }

    @Test
    public void oneCubeSquare() {
        double side;
        double expected;
        double real;
        CubeArithmetic cubeArithmetic = new CubeArithmetic();
        side=1;
        cubeArithmetic.setSide(side);
        expected=side*side*6;
        real = cubeArithmetic.getResult()[1];
        Assert.assertEquals(expected,real);
    }

    //////////////////////////////////////////////////////////////////////

    @Test
    public void normalCubeVolume() {
        double side;
        double expected;
        double real;
        CubeArithmetic cubeArithmetic = new CubeArithmetic();
        side=27.54;
        cubeArithmetic.setSide(side);
        expected=side*side*side;
        real = cubeArithmetic.getResult()[2];
        Assert.assertEquals(expected,real);
    }

    @Test
    public void oneCubeVolume() {
        double side;
        double expected;
        double real;
        CubeArithmetic cubeArithmetic = new CubeArithmetic();
        side=1;
        cubeArithmetic.setSide(side);
        expected=side*side*side;
        real = cubeArithmetic.getResult()[2];
        Assert.assertEquals(expected,real);
    }
}