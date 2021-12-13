package by.neuhen.task01javabasic.controller.command;

import by.neuhen.task01javabasic.service.linearprogramming.CubeArithmetic;

import java.util.Arrays;

public class CubeArithmeticCommand implements Command {
    public void execute(){
        var cubeArithmetic = new CubeArithmetic();
        cubeArithmetic.setSide(cubeArithmetic.inputSide());
        //todo log
        System.out.println(Arrays.toString(cubeArithmetic.getResult()));
    }
}
