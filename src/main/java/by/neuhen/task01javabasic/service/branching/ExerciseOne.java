//2. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран слово «yes», в противном
//случае – слово «no»

package by.neuhen.task01javabasic.service.branching;

public class ExerciseOne {

    private double secondDigit;
    private double firstDigit;

    public void setSecondDigit(double secondDigit) {
        this.secondDigit = secondDigit;
    }

    public void setFirstDigit(double firstDigit) {
        this.firstDigit = firstDigit;
    }

    public String getResult() {
        if (firstDigit < secondDigit) {
            return "yes";
        }
        return  "no";
    }
}
