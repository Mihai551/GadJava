package lab4.io;

public class Contact {
    private String name;
    private String phoneNumebr;

    public Contact(String name, String phoneNumebr) {
        this.name = name;
        this.phoneNumebr = phoneNumebr;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumebr() {
        return phoneNumebr;
    }

    public String toString() {
        return "Phone number of " + name + " is " + phoneNumebr;
    }
}
