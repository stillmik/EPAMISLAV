package by.neuhen.task01javabasic.controller.command;

import by.neuhen.task01javabasic.service.cycling.NumberSeries;
import by.neuhen.task01javabasic.view.MyIO;

public class NumberSeriesCommand implements Command {

    @Override
    public void execute() {
        MyIO myIO = new MyIO();
        var numberSeries = new NumberSeries();
        myIO.showResult(numberSeries.getComparedSum(myIO.getDoubleArgument(),myIO.getIntegerArgument()));
    }
}
