package by.neuhen.task01javabasic.controller.command;

import by.neuhen.task01javabasic.service.linearprogramming.FuncC;

public class FuncCCommand implements Command {
    public void execute() {
        FuncC funcC = new FuncC();
        funcC.setA(funcC.inputArgs());
        System.out.println(funcC.getResult());
    }
}
