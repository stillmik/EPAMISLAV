package by.neuhen.task01javabasic.controller.command;

import by.neuhen.task01javabasic.service.cycling.AddAndMultiply;
import by.neuhen.task01javabasic.view.MyIO;

public class AddAndMultiplyCommand implements Command {

    @Override
    public void execute() {
        int limit = 10;
        MyIO myIO = new MyIO();
        var addAndMultiply = new AddAndMultiply();
        myIO.showResult(addAndMultiply.getResult(limit));
    }
}
