package lab1.ch3;

import java.util.ArrayList;

public class Main {

    public static void main (String [] args) {

        ArrayList<Integer> array = new ArrayList<Integer>();


        array.add(5);
        array.add(9);
        array.add(-5);
        array.add(7);
        array.add(-5);
        //array.add(0);


        Pairs pairs = new Pairs();

        System.out.println(pairs.count(array));
    }
}
