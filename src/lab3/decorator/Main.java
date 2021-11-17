package lab3.decorator;

public class Main {
    public static void main (String [] args) {
       Coffee coffee = new Coffee();
        Topping milk = new Milk(coffee);
        Beverage whip = new Whip(milk);

        System.out.println(whip.getDescription());

    }
}
