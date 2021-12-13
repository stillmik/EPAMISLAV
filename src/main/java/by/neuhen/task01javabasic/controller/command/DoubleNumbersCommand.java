package by.neuhen.task01javabasic.controller.command;

import by.neuhen.task01javabasic.service.branching.DoubleNumbers;
import by.neuhen.task01javabasic.view.MyIO;

public class DoubleNumbersCommand implements Command {
    @Override
    public void execute() {
        MyIO myIO = new MyIO();

        var doubleNumbers = new DoubleNumbers();
        doubleNumbers.setNumberOne(myIO.getDoubleArgument());
        doubleNumbers.setNumberTwo(myIO.getDoubleArgument());
        doubleNumbers.setNumberThree(myIO.getDoubleArgument());
        doubleNumbers.tryDoubleNumbers();

        double[] result = {doubleNumbers.getNumberOne(),
                doubleNumbers.getNumberTwo(),
                doubleNumbers.getNumberThree()};
        myIO.showResult(result);
    }
}
