//4. Составить программу: равны ли два числа а и b?

package by.neuhen.task01javabasic.service.branching;

public class ExerciseTwo {

    private double secondNumber;
    private double firstNumber;

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public boolean getResult() {
        return firstNumber == secondNumber;
    }
}