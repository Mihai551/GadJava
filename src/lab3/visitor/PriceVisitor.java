package lab3.visitor;

public class PriceVisitor implements Visitor{
    private int price;

    public void visit(Book book){
        price += book.getPrice();
    };

    public void visit(Video video){
        price += video.getPrice();
    };

    public void visit(Audio audio){
        price += audio.getPrice();
    };

    @Override
    public String toString() {
        return "Total price is " + price;
    }
}
