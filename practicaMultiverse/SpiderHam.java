package practicaMultiverse;

import imonsh.Screen;

import java.awt.*;

public class SpiderHam extends Spiderman implements SpiderHamAttacks{

    public SpiderHam(String name, String gender, String species, String description){
        super(name,gender,species,description);
    }

    @Override
    public void hammer(Screen s) {
        s.setVisible(true);
        s.out("\nAttack 1: Hammer\n","Helvetica",20, Color.blue);
        s.showImage("C:\\Users\\makar\\IdeaProjects\\PracticasSemana3\\src\\practicaMultiverse\\img\\hammer(1).jpg");
        //s.setBounds(200,100,1100,900);
    }

    @Override
    public void snack(Screen s) {
        s.out("\nAttack 2:Snack Attack\n");
        s.showImage("C:\\Users\\makar\\IdeaProjects\\PracticasSemana3\\src\\practicaMultiverse\\img\\snack (2).jpg");

    }
}
