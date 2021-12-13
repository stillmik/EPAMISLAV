package by.neuhen.task01javabasic.controller.command;

import by.neuhen.task01javabasic.service.cycling.RomeDigitToArabic;
import by.neuhen.task01javabasic.view.MyIO;

import java.awt.*;
import java.util.ArrayList;

public class RomeDigitsToArabicCommand implements Command {
    @Override
    public void execute() {
        var romeDigitToArabic = new RomeDigitToArabic();
        MyIO myIO = new MyIO();
        String romeDigits = myIO.getString();
        if(!checkRomeDigits(romeDigits)){
            myIO.showResult("Error sequence");
            return;
        }
        myIO.showResult(romeDigitToArabic.getArabicNumber(romeDigits));
    }

    private boolean checkRomeDigits(String romeDigits){
        int quantOfL =0;
        int quantOfV =0;
        int quantOfD =0;
        for(int i=0;i<romeDigits.length();i++){
            quantOfL +=checkL(romeDigits.charAt(i));
            quantOfV +=checkV(romeDigits.charAt(i));
            quantOfD +=checkD(romeDigits.charAt(i));
        }
        boolean errorSequence;
        for(int i=3;i<romeDigits.length();i++){
            errorSequence =allCharsAreEqual(romeDigits.charAt(i-3),romeDigits.charAt(i-2),romeDigits.charAt(i-1),romeDigits.charAt(i));
            if(errorSequence)
                return false;
        }
        return quantOfLVDIsCorrect(quantOfL, quantOfV, quantOfD);
    }

    private boolean allCharsAreEqual(char first,char second,char third,char fourth){
        if(first==second)
            if (second==third)
                return third == fourth;
        return false;
    }
    
    private boolean quantOfLVDIsCorrect(int quantOfL, int quantOfV, int quantOfD){
        return quantOfD <= 1 && quantOfV <= 1 && quantOfL <= 1;
    }
    
    private int checkL(char rome){
        if(rome=='L')
            return 1;
        return 0;
    }
    private int checkV(char rome){
        if(rome=='L')
            return 1;
        return 0;
    }
    private int checkD(char rome){
        if(rome=='L')
            return 1;
        return 0;
    }
}
