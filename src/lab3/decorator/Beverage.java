package lab3.decorator;

public class Beverage {

    public String getDescription() {
        return description;
    }

    private String description;
    private int cost;

    public int getCost() {
        return cost;
    }

    public Beverage(String description, int cost) {
        this.description=description;
        this.cost=cost;
    }
}
