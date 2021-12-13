package by.neuhen.task01javabasic.controller.command;

import by.neuhen.task01javabasic.service.linearprogramming.Resistance;

public class ResistanceCommand implements Command{
    public void execute() {
        var resistance = new Resistance();
        resistance.initResistors(resistance.inputResistances());
        System.out.println(resistance.getResult());
    }
}
