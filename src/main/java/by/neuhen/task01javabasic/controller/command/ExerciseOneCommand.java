package by.neuhen.task01javabasic.controller.command;

import by.neuhen.task01javabasic.service.branching.ExerciseOne;
import by.neuhen.task01javabasic.view.MyIO;

public class ExerciseOneCommand implements Command {

    @Override
    public void execute() {
        MyIO myIO = new MyIO();
        var exerciseOne = new ExerciseOne();
        exerciseOne.setFirstDigit(myIO.getDoubleArgument());
        exerciseOne.setSecondDigit(myIO.getDoubleArgument());
        myIO.showResult(exerciseOne.getResult());
    }
}
