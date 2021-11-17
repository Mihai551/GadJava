package lab5.ch2;

public abstract class AbstractShoe implements Shoe{
    private int size;
    private String color;

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public AbstractShoe(int size, String color) {
        this.size = size;
        this.color = color;
    }
}


