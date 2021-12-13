package by.neuhen.task01javabasic.service.linearprogramming;

import by.neuhen.task01javabasic.service.Function;
import by.neuhen.task01javabasic.view.MyIO;

public class FuncZ extends Function {
    //Найдите значение функции: z = ( (a – 3 ) * b / 2) + c

    //args or !QUANTITY_OF_ARGUMENTS
    private double a;
    private double b;
    private double c;
    private MyIO myIO = new MyIO();

    public FuncZ() {
        QUANTITY_OF_ARGUMENTS =3;
    }

    public void setA(double a){
        this.a=a;
    }

    public void setB(double b){
        this.b=b;
    }

    public void setC(double c){
        this.c=c;
    }

    public void setArgs(double[] args){
        a=args[0];
        b=args[1];
        c=args[2];
    }

    public double[] inputArgs(){
        return myIO.getDoubleArguments(QUANTITY_OF_ARGUMENTS);
    }

    public double getResult() {
        return ((a - 3) * b / 2) + c;
    }

}
