//Подсчитать количество отрицательных среди чисел а, b, с

package by.neuhen.task01javabasic.service.branching;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class NegativeNumberCounter {

    private double[] nums;

    public NegativeNumberCounter(int quantOfNums) {
        nums = new double[quantOfNums];
    }

    public void addNumber(int pos, double num) {
        nums[pos] = num;
    }

    //TODO test
    public void addNumbers(double[] nums) {//можно подменять без размерного знания
        if (this.nums.length == nums.length)
            this.nums = nums;
    }

    public long countNegatives() {
        return DoubleStream.of(nums).filter((num) -> num < 0).count();
    }
}
