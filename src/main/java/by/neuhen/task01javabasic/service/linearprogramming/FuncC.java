package by.neuhen.task01javabasic.service.linearprogramming;

import by.neuhen.task01javabasic.service.Function;
import by.neuhen.task01javabasic.view.MyIO;

public class FuncC extends Function {
    //Найдите значение функции: с = 3 + а.

    private double a;
    private MyIO myIO = new MyIO();

    public FuncC() {
        QUANTITY_OF_ARGUMENTS = 1;
    }

    public void setA(double a){
        this.a=a;
    }

    public double inputArgs(){
        double[] args = myIO.getDoubleArguments(QUANTITY_OF_ARGUMENTS);
        return args[0];
    }

    public double getResult() {
        return a + 3;
    }
}
