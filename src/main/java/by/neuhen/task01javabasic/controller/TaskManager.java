package by.neuhen.task01javabasic.controller;

import by.neuhen.task01javabasic.controller.command.*;
import by.neuhen.task01javabasic.view.TaskManagerInput;

public class TaskManager {

    private TaskManagerInput taskManagerInput;
    private boolean globalRun = true;//<- rename isRunnable

    TaskManager(TaskManagerInput input) {
        taskManagerInput = input;
    }

    void run() {
        do {
            chooseCommand(taskManagerInput.getTask()).execute();
        } while (globalRun);
    }

    private Command chooseCommand(CommandType commandType) {
        Command command = new ExitCommand(this);
        switch (commandType) {
            case FUNC_Z: {
                command = new FuncZCommand();
                break;
            }
            case FUNC_C: {
                command = new FuncCCommand();
                break;
            }
            case RESISTANCE: {
                command = new ResistanceCommand();
                break;
            }
            case MULT_DIGITS_OF_NUMBER: {
                command = new MultDigitsOfNumberCommand();
                break;
            }
            case CUBE_ARITHMETIC: {
                command = new CubeArithmeticCommand();
                break;
            }
            case DOT_LOCATION: {
                command = new DotLocationCommand();
                break;
            }
            case DOUBLE_NUMBERS: {
                command = new DoubleNumbersCommand();
                break;
            }
            case EXERCISE_ONE: {
                command = new ExerciseOneCommand();
                break;
            }
            case EXERCISE_TWO: {
                command = new ExerciseTwoCommand();
                break;
            }
            case NEGATIVE_NUMBER_COUNT: {
                command = new NegativeNumbersCounterCommand();
                break;
            }
            case ADD_AND_MULTIPLY: {
                command = new AddAndMultiplyCommand();
                break;
            }
            case NUMBER_SERIES: {
                command = new NumberSeriesCommand();
                break;
            }
            case DESCENDING_STRING: {
                command = new DescendingStringCommand();
                break;
            }
            case EVEN_STRING: {
                command = new EvenStringCommand();
                break;
            }
            case ROME_DIGITS_TO_ARABIC: {
                command = new RomeDigitsToArabicCommand();
                break;
            }
        }
        return command;
    }
    public void stop() {
        globalRun = false;
    }
}


