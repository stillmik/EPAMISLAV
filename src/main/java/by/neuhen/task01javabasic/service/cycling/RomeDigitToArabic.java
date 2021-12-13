//30. Написать программу, переводящую римские цифры в арабские.
package by.neuhen.task01javabasic.service.cycling;

public class RomeDigitToArabic {

    /*private int I = 1;
    private int V = 5;
    private int X = 10;
    private int L = 50;
    private int C = 100;
    private int D = 500;
    private int M = 1000;*/

    public int getArabicNumber(String digit) {

        int sum = 0;
        for (int i = 0; i < digit.length() - 1; i++) {
            sum+=checkTwoNumbers(digit.charAt(i),digit.charAt(i+1));
        }
        return sum;
    }

    private int checkTwoNumbers(char first, char second) {//TODO test XIV

        int firstDigit = getArabicDigit(first);
        int secondDigit = getArabicDigit(second);

        if(firstDigit==secondDigit || firstDigit>secondDigit){
            return firstDigit+secondDigit;
        }else {
            return secondDigit-firstDigit;
        }
    }

    private int getArabicDigit(char symbol) {
        switch (symbol) {
            case 'I': {
                return 1;
            }
            case 'V': {
                return 5;
            }
            case 'X': {
                return 10;
            }
            case 'L': {
                return 50;
            }
            case 'C': {
                return 100;
            }
            case 'D': {
                return 500;
            }
            case 'M': {
                return 1000;
            }
        }
        return -1;
    }

}
