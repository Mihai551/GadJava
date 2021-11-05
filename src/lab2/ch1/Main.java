package lab2.ch1;

import lab2.ch1.BoxingMatch;
import lab2.ch1.Fighter;

public class Main {

    public static void main(String[] args) {
        Fighter f1 =  new Fighter("f1", 100, 10);
        Fighter f2 =  new Fighter("f1", 100, 10);
        BoxingMatch match =  new BoxingMatch(f1,f2);
        //match.fight();
        System.out.println(match.fight());
    }
}
