package by.neuhen.task01javabasic.service.linearprogramming;

import by.neuhen.task01javabasic.service.Function;
import by.neuhen.task01javabasic.view.MyIO;

public class Resistance extends Function {
    private double fstRes;
    private double secRes;
    private double thdRes;
    private MyIO myIO = new MyIO();

    public Resistance() {
        QUANTITY_OF_ARGUMENTS = 3;
    }

    public double getResult() {
        double result;
        result = (1 / fstRes) + (1 / secRes) + (1 / thdRes);
        return 1 / result;
    }

    public double[] inputResistances() {
        double[] args;
        do {
            args = myIO.getDoubleArguments(QUANTITY_OF_ARGUMENTS);
        } while (!checkNumber(args));
        return args;
    }

    public void initResistors(double[] resistors){
        fstRes = resistors[0];
        secRes = resistors[1];
        thdRes= resistors[2];
        //System.out.println(fstRes +" " + secRes + " " + thdRes);
    }

    public void setFstRes(double fstRes) {
        this.fstRes = fstRes;
    }

    public void setSecRes(double secRes) {
        this.secRes = secRes;
    }

    public void setThdRes(double thdRes) {
        this.thdRes = thdRes;
    }

    private boolean checkNumber(double[] nums) {
        for (double num : nums) {
            if (num < 0) {
                System.out.println("The number is incorrect, enter correct number");
                return false;
            }
        }
        return true;
    }
}
