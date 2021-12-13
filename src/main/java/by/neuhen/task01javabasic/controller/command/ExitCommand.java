package by.neuhen.task01javabasic.controller.command;

import by.neuhen.task01javabasic.controller.TaskManager;

public class ExitCommand implements Command {

    private TaskManager taskManager;

    public ExitCommand(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    @Override
    public void execute() {
        taskManager.stop();
    }
}
