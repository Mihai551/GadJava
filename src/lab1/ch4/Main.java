package lab1.ch4;

import java.util.ArrayList;

public class Main {

    public static void main (String [] args) {

        ArrayList<Integer> array = new ArrayList<Integer>();


        array.add(-1);
        array.add(-1);
        array.add(-1);
        array.add(2);
        //array.add(-5);
        //array.add(0);


        Pairs pairs = new Pairs();

        System.out.println(pairs.count(array));
    }
}
