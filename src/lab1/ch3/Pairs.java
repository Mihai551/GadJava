package lab1.ch3;
import java.util.ArrayList;
import java.util.Arrays;

public class Pairs {

    public int count(ArrayList<Integer> array) {
        int counter = 0;
        for (int i = 0; i<array.size(); i++) {
            for (int j =0; j<array.size(); j++) {
                System.out.println(array.get(i).intValue() + " + " + array.get(j).intValue());
                if (array.get(i).intValue() + array.get(j).intValue() == 0) {
                    System.out.println("----------------");
                    array.remove(j);
                    array.remove(i);
                    counter++;
                    break;
                }

            }

        }

        return counter;
    }
}

