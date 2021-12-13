//16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10)
package by.neuhen.task01javabasic.service.cycling;

import java.util.stream.IntStream;

public class AddAndMultiply {

    public long getResult(int limit) {
        long res = 1;
        for (int i = 1; i <= limit; i++) {
            res *= sumTill(i);
        }
        return res;
    }

    private int sumTill(int limit) {
        return IntStream.iterate(1, i -> i + 1).limit(limit).sum();
    }
}
