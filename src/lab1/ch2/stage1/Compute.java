package lab1.ch2.stage1;

public class Compute {

    public String ifContains (int x) {

        int i = x;
        String string = new String("");

        while (i > 0) {
            if (i%10==3) {
                string += "Foo";
            }
            if (i%10==5) {
                string += "Bar";
            }
            if (i%10==7) {
                string += "Qix";
            }

            i/=10;

        }

        return string;

    }

    public String compute (int x) {

        int i = x;
        String string = new String("");

        if (i%3==0) {
            string += "Foo";
        }
        if (i%5==0) {
            string += "Bar";
        }
        if (i%7==0) {
            string += "Qix";
        }

        string = string.concat(ifContains(i));

        if (string.compareToIgnoreCase("")==0) {
            return x + "";
        } else
            return string;

    }
}
