package task01tests;

import by.neuhen.task01javabasic.service.branching.ExerciseOne;
import by.neuhen.task01javabasic.service.branching.ExerciseTwo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExerciseTwoTest {

    @Test(description = "first digit is lesser")
    private void firstIsLesserTest(){
        ExerciseTwo exerciseTwo = new ExerciseTwo();
        double firstDigit =27;
        double secondDigit = 54;
        exerciseTwo.setFirstNumber(firstDigit);
        exerciseTwo.setSecondNumber(secondDigit);
        String expected = "false";
        String actual = String.valueOf(exerciseTwo.getResult());
        Assert.assertEquals(expected,actual);
    }

    @Test(description = "first digit is equals to second")
    private void firstIsEqualsTest(){
        ExerciseTwo exerciseTwo = new ExerciseTwo();
        double firstDigit =27;
        double secondDigit = 27;
        exerciseTwo.setFirstNumber(firstDigit);
        exerciseTwo.setSecondNumber(secondDigit);
        String expected = "true";
        String actual = String.valueOf(exerciseTwo.getResult());
        Assert.assertEquals(expected,actual);
    }

    @Test(description = "first digit is bigger than second")
    private void firstIsBiggerTest(){
        ExerciseTwo exerciseTwo = new ExerciseTwo();
        double firstDigit =54;
        double secondDigit = 27;
        exerciseTwo.setFirstNumber(firstDigit);
        exerciseTwo.setSecondNumber(secondDigit);
        String expected = "false";
        String actual = String.valueOf(exerciseTwo.getResult());
        Assert.assertEquals(expected,actual);
    }

    @Test(description = "negative first digit is lesser")
    private void negativeFirstIsLesserTest(){
        ExerciseTwo exerciseTwo = new ExerciseTwo();
        double firstDigit =-54;
        double secondDigit = -27;
        exerciseTwo.setFirstNumber(firstDigit);
        exerciseTwo.setSecondNumber(secondDigit);
        String expected = "false";
        String actual = String.valueOf(exerciseTwo.getResult());
        Assert.assertEquals(expected,actual);
    }

    @Test(description = "negative first digit is equals to second")
    private void negativeFirstIsEqualsTest(){
        ExerciseTwo exerciseTwo = new ExerciseTwo();
        double firstDigit =-27;
        double secondDigit = -27;
        exerciseTwo.setFirstNumber(firstDigit);
        exerciseTwo.setSecondNumber(secondDigit);
        String expected = "true";
        String actual = String.valueOf(exerciseTwo.getResult());
        Assert.assertEquals(expected,actual);
    }

    @Test(description = "negative first digit is bigger than second")
    private void negativeFirstIsBiggerTest(){
        ExerciseTwo exerciseTwo = new ExerciseTwo();
        double firstDigit =-27;
        double secondDigit = -54;
        exerciseTwo.setFirstNumber(firstDigit);
        exerciseTwo.setSecondNumber(secondDigit);
        String expected = "false";
        String actual = String.valueOf(exerciseTwo.getResult());
        Assert.assertEquals(expected,actual);
    }

    @Test(description = "both digits are zero")
    private void bothZeroTest(){
        ExerciseTwo exerciseTwo = new ExerciseTwo();
        double firstDigit =0;
        double secondDigit = 0;
        exerciseTwo.setFirstNumber(firstDigit);
        exerciseTwo.setSecondNumber(secondDigit);
        String expected = "true";
        String actual = String.valueOf(exerciseTwo.getResult());
        Assert.assertEquals(expected,actual);
    }
}
