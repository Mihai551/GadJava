package lab1.ch1.stage1;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        while (i < 101) {
            if (i % 15==0) {
                System.out.println("FizzBuzz");
            } else if (i % 3==0) {
                System.out.println("Fizz");
            } else if (i % 5==0) {
                System.out.println("Buzz");
            } else
                System.out.println(i);
            i++;

        }
    }
}
