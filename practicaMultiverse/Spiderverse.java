package practicaMultiverse;

import imonsh.Screen;

import java.awt.*;

public class Spiderverse {
    public static void main(String[] args) {
        Screen s = new Screen();
        SpiderHam s1 = new SpiderHam("Spider-Ham(Peter Porker)", "Male", "Animal", "" +
                "Peter Porker was born a spider (simply named Peter). He resided in the basement lab of May Porker, a slightly goofy animal scientist" +
                " May Porker accidentally irradiated herself, and in a fit of delusion, bit Peter, who then found himself transformed into an anthropomorphic swine much like May Porker herself.");
        s.setVisible(true);
        s.changeStyle("Helvetica",15,Color.white, Color.red);
        s1.show(s);
        s1.shootWeb(s);
        s1.spiderSense(s);
        s1.hammer(s);
        s1.snack(s);



        SpiderGwen s2 = new SpiderGwen("Spider-Gwen (Gwen-Stacy)", "Female", "Human",
                "Spider-Woman is a variant of Spider-Man and an alternate-universe version of Gwen Stacy. She lives on Earth-65, where Gwen Stacy is bitten " +
                        "by a radioactive spider and becomes a superhero instead of Peter Parker becoming Spider-Man");
        s2.show(s);
        s2.shootWeb(s);
        s2.spiderSense(s);
        s2.specialWeb(s);
        s2.dimensionTravel(s);

        PeniParker s3 = new PeniParker("Peni Parker & SP//dr","Female","Human/MechSuit",
                "14-year-old high school student who was adopted by Aunt May and Uncle Ben following the death of her father/caretaker. " +
                        "She pilots a psychically-powered mech suit built by her father known as the SP//dr," +
                        "which is partially controlled by a radioactive spider that also shares a psychic link with her.");
        s3.show(s);
        s3.shootWeb(s);
        s3.spiderSense(s);
        s3.slash(s);
        s3.hacks(s);
    }
}
