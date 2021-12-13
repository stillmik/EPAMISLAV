package by.neuhen.task01javabasic.view;
import by.neuhen.task01javabasic.controller.CommandType;

import java.util.Scanner;

public class TaskManagerInputImpl implements TaskManagerInput {

    private Scanner scanner;
    public TaskManagerInputImpl() {
        scanner = new Scanner(System.in);
    }

    public CommandType getTask() {

        int taskDigit = 0;
        boolean correctInput = false;

        chooseOutput();
        while (!correctInput) {
            correctInput = true;
            if (!scanner.hasNextInt()) {
                correctInput = false;
                System.out.println("Please, input the digit");
                scanner.next();
                continue;
            }
            taskDigit = scanner.nextInt();
            if (taskDigit > CommandType.values().length || taskDigit < 0) {
                System.out.println("Please, input the correct digit");
                correctInput = false;
            }
        }

        return CommandType.values()[taskDigit];
    }

    private void chooseOutput(){
        System.out.println("Enter the task digit:");
        System.out.println("0 - execute Z function");
        System.out.println("1 - execute C function");
        System.out.println("2 - execute resistance function");
        System.out.println("3 - execute multiplication the digits of number function");
        System.out.println("4 - calculations of cube parameters function");
        System.out.println("-------------------------------------------------------------");
        System.out.println("5 - get dot location");
        System.out.println("6 - double numbers or ABS");
        System.out.println("7 - is first number lesser than second");
        System.out.println("8 - are numbers equal");
        System.out.println("9 - count negatives");
        System.out.println("-------------------------------------------------------------");
        System.out.println("10 - (1)*(1+2)*(1+2+3)*...*(1+2+...+n)");
        System.out.println("11 - get sum of number series? if member is bigger");
        System.out.println("12 - get descending string");
        System.out.println("13 - get even string");
        System.out.println("14 - convert rome numbers to arabic");
        System.out.println("-------------------------------------------------------------");
        System.out.println("15 - exit");
    }
}
