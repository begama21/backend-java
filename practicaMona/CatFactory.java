package practicaMona;


public class CatFactory {

    public static void main(String[] args) {

        createCats();
    }

    private static void createCats(){


        Octobi cat1 = new Octobi(3,"Octobi Wan Catnobi",
                "User of the Force. Known Jedi across the galaxy.",
                "@cameronmcefee");

        IronCat cat2 = new IronCat(24,"IronCat",
                "Superhero cat using suit with the most advanced suit. Also: millionare","@cameronmcefee");

        NyanCat cat3 = new  NyanCat(46, "NyantoCat",
                "Octocat like a poptart that moves and sings. A meme.","@cameronmcefee");

        LinkCat cat4 = new LinkCat(59,"Linktocat",
                "The catHero of time. Fights evil, plays instruments, and collects money.","@cameronmcefee");

        MegaCat cat5 = new MegaCat(60,"MegaCat",
                "He can absorb the powers of the enemies he defeats.","@jasoncostello");

        TopGunCat cat6 = new TopGunCat(111,"Topguntocat",
                "Specializes in aerial combat and flight maneuvers","leereilly");

        System.out.println(cat1.show());
        cat1.moves();
        cat1.useForce();

        System.out.println(cat2.show());
        cat2.moves();
        cat2.defends();
        cat2.quotes();

        System.out.println(cat3.show());
        cat3.moves();
        cat3.sings();

        System.out.println(cat4.show());
        cat4.moves();
        cat4.slashes();

        System.out.println(cat5.show());
        cat5.moves();
        cat5.fights();

        System.out.println(cat6.show());
        cat6.moves();
    }
}
