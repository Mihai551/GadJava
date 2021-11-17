package lab3.visitor;

public class Book implements Element {


    private String name;
    private int numberOfPages;
    private int price;

    public Book(String name, int numberOfPages, int price) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.price = price;


    }

    public String getName() {
        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public String toString() {
        return name + ", price " + price + ", numberOfPages " + numberOfPages;
    }



}

