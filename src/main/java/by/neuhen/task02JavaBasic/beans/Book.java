package by.neuhen.task02JavaBasic.beans;

public class Book {
    private String title;
    private String author;
    private double price;

    private String text;

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
}
