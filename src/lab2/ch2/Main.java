package lab2.ch2;

public class Main {

    public static void main (String [] args) {


        Premiu oscar1990 = new Premiu ("Oscar",1990);
        Premiu oscar2000 = new Premiu ("Oscar",2000);
        Premiu oscar2010 = new Premiu ("Oscar",2010);
        Premiu oscar2018 = new Premiu ("Oscar",2018);

        Actor actorOscar1990 = new Actor("Actor cu 2 oscaruri", 35, new Premiu[]{oscar1990,oscar2000});
        Actor actorOscar2010 = new Actor("Actor cu oscar din 2000", 55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("Actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01= new Actor("Actor fara oscar 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("Actor fara oscar 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("Actor fara oscar 03", 20, new Premiu[]{});

        Film film1 = new Film(1990, "Film cu actori de oscar", new Actor[]{actorOscar1990,actorFaraPremii01});
        Film film2 = new Film(2010, "Film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film(1990, "Film cu actori fara premii 3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film(1990, "Film cu actori de oscar", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
        Film film5 = new Film(1990, "Film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4,film5});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};

        for (int i = 0; i < studioDatabase.length; i++) {
            if (studioDatabase[i].getFilme().length > 2) {
                System.out.println(studioDatabase[i].getNume());

            }
        }
    }
}
