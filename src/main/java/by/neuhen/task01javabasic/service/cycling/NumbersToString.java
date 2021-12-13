//2. Необходимо вывести на экран числа от 5 до 1. 

//4. С помощью оператора while напишите программу вывода всех четных чисел
// в диапазоне от 2 до 100 включительно.

package by.neuhen.task01javabasic.service.cycling;

public class NumbersToString {

    private StringBuilder sB = new StringBuilder();

    public String getDescendingString(int num) {

        for (int i = num; i > 0; i--) {
            sB.append(i).append(", ");
        }
        sB.append(0);
        return String.valueOf(sB);
    }

    public String getEvenString(int from, int to) {
        while (from <= to) {
            sB.append(from).append(", ");
            from = from + 2;
        }
        return String.valueOf(sB);
    }
}

