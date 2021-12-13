package by.neuhen.task01javabasic.controller.command;

import by.neuhen.task01javabasic.service.branching.ExerciseTwo;
import by.neuhen.task01javabasic.view.MyIO;

public class ExerciseTwoCommand implements Command {

    @Override
    public void execute() {
        MyIO myIO = new MyIO();
        var exerciseTwo = new ExerciseTwo();
        exerciseTwo.setFirstNumber(myIO.getDoubleArgument());
        exerciseTwo.setSecondNumber(myIO.getDoubleArgument());
        myIO.showResult(exerciseTwo.getResult());
    }
}
