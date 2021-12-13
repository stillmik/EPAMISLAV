package task01tests;

import by.neuhen.task01javabasic.service.branching.ExerciseOne;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExerciseOneTest {

    @Test(description = "first digit is lesser")
    private void firstIsLesserTest(){
        ExerciseOne exerciseOne = new ExerciseOne();
        double firstDigit =27;
        double secondDigit = 54;
        exerciseOne.setFirstDigit(firstDigit);
        exerciseOne.setSecondDigit(secondDigit);
        String expected = "yes";
        String actual = exerciseOne.getResult();
        Assert.assertEquals(expected,actual);
    }

    @Test(description = "first digit is equals to second")
    private void firstIsEqualsTest(){
        ExerciseOne exerciseOne = new ExerciseOne();
        double firstDigit =27;
        double secondDigit = 27;
        exerciseOne.setFirstDigit(firstDigit);
        exerciseOne.setSecondDigit(secondDigit);
        String expected = "no";
        String actual = exerciseOne.getResult();
        Assert.assertEquals(expected,actual);
    }

    @Test(description = "first digit is bigger than second")
    private void firstIsBiggerTest(){
        ExerciseOne exerciseOne = new ExerciseOne();
        double firstDigit =54;
        double secondDigit = 27;
        exerciseOne.setFirstDigit(firstDigit);
        exerciseOne.setSecondDigit(secondDigit);
        String expected = "no";
        String actual = exerciseOne.getResult();
        Assert.assertEquals(expected,actual);
    }

    @Test(description = "negative first digit is lesser")
    private void negativeFirstIsLesserTest(){
        ExerciseOne exerciseOne = new ExerciseOne();
        double firstDigit =-54;
        double secondDigit = -27;
        exerciseOne.setFirstDigit(firstDigit);
        exerciseOne.setSecondDigit(secondDigit);
        String expected = "yes";
        String actual = exerciseOne.getResult();
        Assert.assertEquals(expected,actual);
    }

    @Test(description = "negative first digit is equals to second")
    private void negativeFirstIsEqualsTest(){
        ExerciseOne exerciseOne = new ExerciseOne();
        double firstDigit =-27;
        double secondDigit = -27;
        exerciseOne.setFirstDigit(firstDigit);
        exerciseOne.setSecondDigit(secondDigit);
        String expected = "no";
        String actual = exerciseOne.getResult();
        Assert.assertEquals(expected,actual);
    }

    @Test(description = "negative first digit is bigger than second")
    private void negativeFirstIsBiggerTest(){
        ExerciseOne exerciseOne = new ExerciseOne();
        double firstDigit =-27;
        double secondDigit = -57;
        exerciseOne.setFirstDigit(firstDigit);
        exerciseOne.setSecondDigit(secondDigit);
        String expected = "no";
        String actual = exerciseOne.getResult();
        Assert.assertEquals(expected,actual);
    }

    @Test(description = "both digits are zero")
    private void bothZeroTest(){
        ExerciseOne exerciseOne = new ExerciseOne();
        double firstDigit =0;
        double secondDigit = 0;
        exerciseOne.setFirstDigit(firstDigit);
        exerciseOne.setSecondDigit(secondDigit);
        String expected = "no";
        String actual = exerciseOne.getResult();
        Assert.assertEquals(expected,actual);
    }
}
