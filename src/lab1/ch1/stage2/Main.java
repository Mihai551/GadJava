package lab1.ch1.stage2;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        while (i < 101) {
            if (i % 15==0) {
                System.out.println("FizzBuzz");
            } else if (i % 11==0) {
                System.out.println("Jazz");
            } else if (i % 7==0) {
                System.out.println("Rizz");
            } else if (i % 5==0) {
                System.out.println("Buzz");
            } else if (i % 3==0) {
                System.out.println("Fizz");
            }

            else
                System.out.println(i);
            i++;

        }
    }
}
