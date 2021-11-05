package lab1.ch2.stage2;

public class Compute {

    public String ifContains (Integer x, boolean y) {
        String theNumber = x.toString();
        theNumber = theNumber.replaceAll("3","Foo");
        theNumber = theNumber.replaceAll("5","Bar");
        theNumber = theNumber.replaceAll("7","Qiz");
        theNumber = theNumber.replaceAll("0","*");

        if (y) {
            theNumber = theNumber.replaceAll("1","");
            theNumber = theNumber.replaceAll("2","");
            theNumber = theNumber.replaceAll("4","");
            theNumber = theNumber.replaceAll("6","");
            theNumber = theNumber.replaceAll("8","");
            theNumber = theNumber.replaceAll("9","");


        }
        return theNumber;

    }

    public String compute (Integer x) {
        boolean y = true; //daca numarul e multiplu de 3 5 sau 7
        int i = x.intValue();
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

        if (string.compareToIgnoreCase("")==0) {
            y = false;
        }

        string = string.concat(ifContains(i,y));

        if (string.compareToIgnoreCase("")==0) {
            return x + "";
        } else
            return string;

    }
}
