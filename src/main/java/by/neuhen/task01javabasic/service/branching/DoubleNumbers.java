//30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с,
// и заменить их абсолютными значениями, если это не так. 10 7 5

package by.neuhen.task01javabasic.service.branching;

public class DoubleNumbers {

    private double numberOne;
    private double numberTwo;
    private double numberThree;

    public double getNumberOne() {
        return numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public double getNumberThree() {
        return numberThree;
    }

    public void setNumberOne(double num) {
        numberOne = num;
    }

    public void setNumberTwo(double num) {
        numberTwo = num;
    }

    public void setNumberThree(double num) {
        numberThree = num;
    }

    public void tryDoubleNumbers() {
        if (nextIsBigger(numberOne, numberTwo, numberThree)) {
            numberOne *= 2;
            numberTwo *= 2;
            numberThree *= 2;
        } else {
            numberOne = Math.abs(numberOne);
            numberTwo = Math.abs(numberTwo);
            numberThree = Math.abs(numberThree);
        }
    }

    private boolean nextIsBigger(double numberOne, double numberTwo, double numberThree) {
        if (numberOne > numberTwo)
            return numberTwo > numberThree;
        return false;
    }
}
