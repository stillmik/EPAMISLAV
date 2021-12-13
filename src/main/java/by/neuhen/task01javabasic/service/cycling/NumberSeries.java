package by.neuhen.task01javabasic.service.cycling;

public class NumberSeries {

    public double getComparedSum(double compareNum, int quantOfMembers) {
        double sum = 0;
        double member;
        for (int i = 1; i <= quantOfMembers; i++) {
            member = getMember(i);
            if (memberIsBigger(compareNum, member))
                sum += member;
        }
        return sum;
    }

    private double getMember(int n) {
        return Math.pow(-1, n - 1) / n;
    }

    private boolean memberIsBigger(double compareNum, double member) {
        return Math.abs(member) > compareNum;
    }
}
