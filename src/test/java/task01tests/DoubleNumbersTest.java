package task01tests;

import by.neuhen.task01javabasic.service.branching.DoubleNumbers;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleNumbersTest {

    //TODO data provider
    //TODO compare objects, not primitives assertEquals(obj1,obj2)
    @Test(description = "correct double positive arguments")
    private void correctTest(){
        DoubleNumbers doubleNumbers = new DoubleNumbers();
        double numOne = 54.54;
        double numTwo = 27.54;
        double numThree = 10;
        double doubledNumOne = 109.08;
        double doubledNumTwo = 55.08;
        double doubledNumThree = 20;

        doubleNumbers.setNumberOne(numOne);
        doubleNumbers.setNumberTwo(numTwo);
        doubleNumbers.setNumberThree(numThree);
        doubleNumbers.tryDoubleNumbers();
        Assert.assertEquals(doubledNumOne,doubleNumbers.getNumberOne());
        Assert.assertEquals(doubledNumTwo,doubleNumbers.getNumberTwo());
        Assert.assertEquals(doubledNumThree,doubleNumbers.getNumberThree());
    }

    @Test(description = "correct double negative arguments")
    private void correctNegativeTest(){
        DoubleNumbers doubleNumbers = new DoubleNumbers();
        double numOne = -4.54;
        double numTwo = -7.54;
        double numThree = -10;
        double doubledNumOne = -9.08;
        double doubledNumTwo = -15.08;
        double doubledNumThree = -20;
        doubleNumbers.setNumberOne(numOne);
        doubleNumbers.setNumberTwo(numTwo);
        doubleNumbers.setNumberThree(numThree);
        doubleNumbers.tryDoubleNumbers();
        Assert.assertEquals(doubledNumOne,doubleNumbers.getNumberOne());
        Assert.assertEquals(doubledNumTwo,doubleNumbers.getNumberTwo());
        Assert.assertEquals(doubledNumThree,doubleNumbers.getNumberThree());
    }

    @Test(description = "correct double mixed arguments")
    private void correctMixedTest(){
        DoubleNumbers doubleNumbers = new DoubleNumbers();
        double numOne = 4.54;
        double numTwo = 0;
        double numThree = -10;
        double doubledNumOne = 9.08;
        double doubledNumTwo = 0;
        double doubledNumThree = -20;
        doubleNumbers.setNumberOne(numOne);
        doubleNumbers.setNumberTwo(numTwo);
        doubleNumbers.setNumberThree(numThree);
        doubleNumbers.tryDoubleNumbers();
        Assert.assertEquals(doubledNumOne,doubleNumbers.getNumberOne());
        Assert.assertEquals(doubledNumTwo,doubleNumbers.getNumberTwo());
        Assert.assertEquals(doubledNumThree,doubleNumbers.getNumberThree());
    }

    @Test(description = "incorrect double positive arguments")
    private void incorrectMixedTest(){
        DoubleNumbers doubleNumbers = new DoubleNumbers();
        double numOne = 24.54;
        double numTwo = 27.27;
        double numThree = 10;
        double absNumOne = 24.54;
        double absNumTwo = 27.27;
        double absNumThree = 10;
        doubleNumbers.setNumberOne(numOne);
        doubleNumbers.setNumberTwo(numTwo);
        doubleNumbers.setNumberThree(numThree);
        doubleNumbers.tryDoubleNumbers();
        Assert.assertEquals(absNumOne,doubleNumbers.getNumberOne());
        Assert.assertEquals(absNumTwo,doubleNumbers.getNumberTwo());
        Assert.assertEquals(absNumThree,doubleNumbers.getNumberThree());
    }

    @Test(description = "incorrect double negative arguments")
    private void incorrectNegativeTest(){
        DoubleNumbers doubleNumbers = new DoubleNumbers();
        double numOne = -27.54;
        double numTwo = -27.27;
        double numThree = -10;
        double absNumOne = 27.54;
        double absNumTwo = 27.27;
        double absNumThree = 10;
        doubleNumbers.setNumberOne(numOne);
        doubleNumbers.setNumberTwo(numTwo);
        doubleNumbers.setNumberThree(numThree);
        doubleNumbers.tryDoubleNumbers();
        Assert.assertEquals(absNumOne,doubleNumbers.getNumberOne());
        Assert.assertEquals(absNumTwo,doubleNumbers.getNumberTwo());
        Assert.assertEquals(absNumThree,doubleNumbers.getNumberThree());
    }

    @Test(description = "incorrect double positive arguments")
    private void incorrectPositiveTest(){
        DoubleNumbers doubleNumbers = new DoubleNumbers();
        double numOne = 24.54;
        double numTwo = 27.27;
        double numThree = 10;
        double absNumOne = 24.54;
        double absNumTwo = 27.27;
        double absNumThree = 10;
        doubleNumbers.setNumberOne(numOne);
        doubleNumbers.setNumberTwo(numTwo);
        doubleNumbers.setNumberThree(numThree);
        doubleNumbers.tryDoubleNumbers();
        Assert.assertEquals(absNumOne,doubleNumbers.getNumberOne());
        Assert.assertEquals(absNumTwo,doubleNumbers.getNumberTwo());
        Assert.assertEquals(absNumThree,doubleNumbers.getNumberThree());
    }
}
