package lab2.ch2;

public class Studio {

    private String name;
    private Film[] filme;

    public Studio(String name, Film[] filme) {
        this.name = name;
        this.filme = filme;
    }

    public Film[] getFilme() {
        return filme;
    }

    public String getNume() {
        return name;
    }

    private String nume;
}
