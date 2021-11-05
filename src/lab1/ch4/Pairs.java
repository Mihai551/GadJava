package lab1.ch4;
import java.util.ArrayList;
import java.util.Arrays;

public class Pairs {

    public int count(ArrayList<Integer> array) {
        int counter = 0;
        for (int i = 0; i<array.size(); i++) {
            for (int j =0; j<array.size(); j++) {
                for (int k =0; j<array.size(); j++) {
                    System.out.println(array.get(i).intValue() + " + " + array.get(j).intValue() + " + " + array.get(k).intValue());
                    if (array.get(i).intValue() + array.get(j).intValue() + array.get(k).intValue() == 0) {
                        System.out.println("----------------");
                        array.remove(j);
                        array.remove(i);
                        array.remove(k);
                        counter++;
                        break;
                    }
                }


            }

        }

        return counter;
    }
}

