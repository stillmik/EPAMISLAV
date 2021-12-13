package by.neuhen.task01javabasic.view;

import java.util.Scanner;

public class MyIO {

    private Scanner scanner;

    public MyIO() {
        scanner = new Scanner(System.in);
    }

    public void showResult(String res) {
        System.out.println("result is: " + res);
    }

    public void showResult(boolean res) {
        System.out.println("result is: " + res);
    }
    public void showResult(int res) {
        System.out.println("result is: " + res);
    }

    public void showResult(long res) {
        System.out.println("result is: " + res);
    }
    public void showResult(double res) {
        System.out.println("result is: " + res);
    }

    public void showResult(double[] res) {
        int i = 0;
        System.out.print("result is: ");
        for (double result : res) {
            i++;
            System.out.println(result +", ");
            if (i == 0)
            System.out.println();
        }
    }

    public double[] getDoubleArguments(int quant) {
        boolean correctInput = false;
        int i = 0;
        double[] args = new double[quant];
        while (!correctInput) {
            correctInput = true;
            if (!scanner.hasNextDouble()) {
                correctInput = false;
                System.out.println("Please, input the digit");
                scanner.next();
                continue;
            }
            args[i] = scanner.nextDouble();
            i++;
            if (i != quant)
                correctInput = false;
        }
        return args;
    }

    public String getString() {
        return scanner.nextLine();
    }

    public int[] getIntegerArguments(int quant) {
        boolean correctInput = false;
        int i = 0;
        int[] args = new int[quant];
        while (!correctInput) {
            correctInput = true;
            if (!scanner.hasNextInt()) {
                correctInput = false;
                System.out.println("Please, input the digit");
                scanner.next();
                continue;
            }
            args[i] = scanner.nextInt();
            i++;
            if (i != quant)
                correctInput = false;
        }
        return args;
    }

    public int getIntegerArgument() {
        boolean correctInput = false;
        int retValue = 0;
        while (!correctInput) {
            correctInput = true;
            if (!scanner.hasNextInt()) {
                correctInput = false;
                System.out.println("Please, input the digit");
                scanner.next();
                continue;
            }
            retValue = scanner.nextInt();
        }
        return retValue;
    }

    public double getDoubleArgument() {
        boolean correctInput = false;
        double retValue = 0;
        while (!correctInput) {
            correctInput = true;
            if (!scanner.hasNextDouble()) {
                correctInput = false;
                System.out.println("Please, input the digit");
                scanner.next();
                continue;
            }
            retValue = scanner.nextDouble();
        }
        return retValue;
    }
}
