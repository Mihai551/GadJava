package lab1.ch2.stage2;

public class Main {


    public static void main (String [] args) {
        int i = 1;

        Compute compute = new Compute();

        while(i<10012) {

            System.out.println(compute.compute(i));
            i++;
        }

    }

}
