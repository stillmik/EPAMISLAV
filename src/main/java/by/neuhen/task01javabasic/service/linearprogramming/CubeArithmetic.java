package by.neuhen.task01javabasic.service.linearprogramming;

import by.neuhen.task01javabasic.service.Function;
import by.neuhen.task01javabasic.view.MyIO;

public class CubeArithmetic extends Function {
    private double side;
    private double rectangleSquare;
    private double cubeSquare;
    private double cubeVolume;
    private MyIO myIO = new MyIO();

    public CubeArithmetic() {
        QUANTITY_OF_ARGUMENTS = 1;
    }

    public double[] getResult() {
        makeCalculations();
        return new double[]{rectangleSquare,cubeSquare,cubeVolume};
    }

    private void makeCalculations(){
        rectangleSquare=side*side;
        cubeSquare=rectangleSquare*6;
        cubeVolume=Math.pow(side,3);
    }

    public void setSide(double side) {
            this.side=side;
    }

    public double getSide() {
        return side;
    }

    public double inputSide(){
        double[] args;
        do {
            args = myIO.getDoubleArguments(QUANTITY_OF_ARGUMENTS);
        } while (!checkNumber(args[0]));
        return args[0];
    }

    private boolean checkNumber(double num){
        if (num<0){
            System.out.println("The number is incorrect, enter correct number");
            return false;
        }
        return true;
    }
}
