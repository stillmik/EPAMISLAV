package by.neuhen.task01javabasic.controller.command;

import by.neuhen.task01javabasic.service.linearprogramming.MultDigitsOfNumber;

public class MultDigitsOfNumberCommand implements Command {
    public void execute() {
        MultDigitsOfNumber multDigitsOfNumber = new MultDigitsOfNumber();
        multDigitsOfNumber.setNumber(multDigitsOfNumber.inputNumber());
        System.out.println(multDigitsOfNumber.getResult());
    }
}
