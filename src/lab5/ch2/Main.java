package lab5.ch2;

public class Main {
    public static void main(String[] args) {


        Boot boot1 =  new Boot(20, "red");
        Boot boot2 =  new Boot(20, "red");
        Shoe running1 =  new Running("red", 20);
        Running running2 = new Running("red", 22);

        try {
        Pair<Boot> pair1 = new Pair<Boot>(boot1, boot2);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
