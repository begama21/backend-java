package practicaMultiverse;

import imonsh.Screen;

import java.awt.*;

public class PeniParker extends Spiderman implements PeniAttacks{

    public PeniParker(String name, String gender, String species, String description){
        super(name,gender,species,description);
    }

    @Override
    public void slash(Screen s) {
        s.setVisible(true);
        s.out("\nSpecial 1: Cool Slash\n","Helvetica",20,Color.BLACK);
        s.showImage("C:\\Users\\makar\\IdeaProjects\\PracticasSemana3\\src\\practicaMultiverse\\img\\cool.gif");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void hacks(Screen s) {
        s.out("\nSpecial 2: Hacking\n");
        s.showImage("C:\\Users\\makar\\IdeaProjects\\PracticasSemana3\\src\\practicaMultiverse\\img\\hacking.gif");
        s.out("\n\n");
    }
}

