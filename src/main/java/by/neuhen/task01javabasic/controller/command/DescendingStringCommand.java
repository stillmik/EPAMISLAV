package by.neuhen.task01javabasic.controller.command;

import by.neuhen.task01javabasic.service.cycling.NumbersToString;
import by.neuhen.task01javabasic.view.MyIO;

public class DescendingStringCommand implements Command{
    @Override
    public void execute() {
        MyIO myIO = new MyIO();
        var numbersToString = new NumbersToString();
        myIO.showResult(numbersToString.getDescendingString(myIO.getIntegerArgument()));

    }
}
