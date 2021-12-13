package by.neuhen.task01javabasic.controller.command;

import by.neuhen.task01javabasic.service.cycling.NumbersToString;
import by.neuhen.task01javabasic.view.MyIO;

public class EvenStringCommand implements Command {

    @Override
    public void execute() {
        var evenString = new NumbersToString();
        MyIO myIO = new MyIO();
        int from =myIO.getIntegerArgument();
        int to = myIO.getIntegerArgument();
        if (from+2>to){
            myIO.showResult("Error, incorrect input");
        }else {
            myIO.showResult(evenString.getEvenString(from,to));
        }
    }
}
