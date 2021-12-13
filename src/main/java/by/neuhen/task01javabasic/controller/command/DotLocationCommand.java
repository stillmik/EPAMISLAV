package by.neuhen.task01javabasic.controller.command;

import by.neuhen.task01javabasic.entity.Point;
import by.neuhen.task01javabasic.service.branching.DotLocation;
import by.neuhen.task01javabasic.view.MyIO;

public class DotLocationCommand implements Command {

    @Override
    public void execute() {
        MyIO myIO = new MyIO();

        DotLocation dotLocation = new DotLocation();
        dotLocation.setDot(initDOtWithIO(myIO));
        dotLocation.defineDotLocation();
        myIO.showResult(dotLocation.getDotLocation());
    }

    private Point initDOtWithIO(MyIO myIO){
        Point dot = new Point();
        dot.setX(myIO.getDoubleArgument());
        dot.setY(myIO.getDoubleArgument());
        return dot;
    }
}
