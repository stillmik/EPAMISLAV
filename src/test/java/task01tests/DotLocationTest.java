package task01tests;

import by.neuhen.task01javabasic.entity.Point;
import by.neuhen.task01javabasic.service.branching.DotLocation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DotLocationTest {

    @Test(description = "dot located in first Quarter")
    private void firstQuarter(){
        var dotLocation = new DotLocation();
        double x = 1488;
        double y = 228;
        dotLocation.setDot(new Point(x,y));
        String expected = "dot is on the first quarter";
        dotLocation.defineDotLocation();
        String actual = dotLocation.getDotLocation();
        Assert.assertEquals(actual,expected);
    }
    @Test(description = "dot located in second Quarter")
    private void secondQuarter(){
        var dotLocation = new DotLocation();
        double x = -1488;
        double y = 228;
        dotLocation.setDot(new Point(x,y));
        String expected = "dot is on the second quarter";
        dotLocation.defineDotLocation();
        String actual = dotLocation.getDotLocation();
        Assert.assertEquals(actual,expected);
    }
    @Test(description = "dot located in third Quarter")
    private void thirdQuarter(){
        var dotLocation = new DotLocation();
        double x = -1488;
        double y = -228;
        dotLocation.setDot(new Point(x,y));
        String expected = "dot is on the third quarter";
        dotLocation.defineDotLocation();
        String actual = dotLocation.getDotLocation();
        Assert.assertEquals(actual,expected);
    }
    @Test(description = "dot is on the fourth quarter")
    private void fourthQuarterTest(){
        var dotLocation = new DotLocation();
        double x = 1488;
        double y = -228;
        dotLocation.setDot(new Point(x,y));
        String expected = "dot is on the fourth quarter";
        dotLocation.defineDotLocation();
        String actual = dotLocation.getDotLocation();
        Assert.assertEquals(actual,expected);
    }
    @Test(description = "dot is on the X quarter")
    private void xAxisTest(){
        var dotLocation = new DotLocation();
        double x = 1488;
        double y = 0;
        dotLocation.setDot(new Point(x,y));
        String expected = "dot is on the Y axis";
        dotLocation.defineDotLocation();
        String actual = dotLocation.getDotLocation();
        Assert.assertEquals(actual,expected);
    }
    @Test(description = "dot is on the Y axis")
    private void yAxisTest(){
        var dotLocation = new DotLocation();
        double x = 0;
        double y = 228;
        dotLocation.setDot(new Point(x,y));
        String expected = "dot is on the X axis";
        dotLocation.defineDotLocation();
        String actual = dotLocation.getDotLocation();
        Assert.assertEquals(actual,expected);
    }
    @Test(description = "dot is on the origin of the coordinate axis")
    private void originTest(){
        var dotLocation = new DotLocation();
        double x = 0;
        double y = 0;
        dotLocation.setDot(new Point(x,y));
        String expected = "dot is on the origin of the coordinate axis";
        dotLocation.defineDotLocation();
        String actual = dotLocation.getDotLocation();
        Assert.assertEquals(actual,expected);
    }

}
