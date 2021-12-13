package by.neuhen.task01javabasic.controller.command;

import by.neuhen.task01javabasic.service.branching.NegativeNumberCounter;
import by.neuhen.task01javabasic.view.MyIO;

public class NegativeNumbersCounterCommand implements Command{

    @Override
    public void execute() {
        MyIO myIO = new MyIO();
        int quantOfNums = 10;
        var negNumCounter = new NegativeNumberCounter(quantOfNums);
        fillCounter(quantOfNums,negNumCounter);
        myIO.showResult(negNumCounter.countNegatives());
    }

    private void fillCounter(int quantOfNums,NegativeNumberCounter neg){
        for (int i=0;i<quantOfNums;i++){
            neg.addNumber(i,(Math.random()-1)*10000);
        }
    }
}
