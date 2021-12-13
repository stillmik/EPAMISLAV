package by.neuhen.task01javabasic.service.linearprogramming;

import by.neuhen.task01javabasic.service.Function;
import by.neuhen.task01javabasic.view.MyIO;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MultDigitsOfNumber extends Function {

    private int number;
    private int digitSize=4;
    private int[] digits=new int[digitSize];
    private MyIO myIO = new MyIO();

    public MultDigitsOfNumber() {
        QUANTITY_OF_ARGUMENTS = 1;
    }

    public int getResult() {
        getDigitsOfNumber();
        int prod = IntStream.of(digits).reduce(1,(x,y)->x*y);
        System.out.println(prod);
        return  prod;
    }

    public int inputNumber(){
        int[] args;
        do {
            args = myIO.getIntegerArguments(QUANTITY_OF_ARGUMENTS);
        } while (!checkNumber(args[0]));
        return args[0];
    }

    private boolean checkNumber(int num){
        if (num<999|| num>9999){
            System.out.println("The number is incorrect, enter correct number");
            return false;
        }
        return true;
    }

    public void setNumber(int number){
        this.number=number;
    }

    private void getDigitsOfNumber(){
        int numberTemp=number;
        int digitSizeTemp = digitSize;
        while(numberTemp>0) {
            digits[--digitSizeTemp]=numberTemp%10;
            numberTemp = numberTemp / 10;
        }
        System.out.println(Arrays.toString(digits));
    }
}
