package by.neuhen.task01javabasic.controller.command;

import by.neuhen.task01javabasic.service.linearprogramming.FuncZ;

public class FuncZCommand implements Command {
    public void execute() {
        FuncZ funcZ = new FuncZ();//TODO service
        funcZ.setArgs(funcZ.inputArgs());
        System.out.println(funcZ.getResult());
        //TODO out of func
    }
}
