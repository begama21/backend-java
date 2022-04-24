package practicaMultiverse;

import imonsh.Screen;

import java.awt.*;

public class SpiderGwen extends Spiderman implements GwenActions {

    public SpiderGwen(String name, String gender, String species, String description){
        super(name,gender,species,description);
    }

    @Override
    public void specialWeb(Screen s) {
        s.setVisible(true);
        s.out("\nSpecial 1: Special Webbing\n","Helvetica",20, Color.magenta);
        s.showImage("C:\\Users\\makar\\IdeaProjects\\PracticasSemana3\\src\\practicaMultiverse\\img\\gwen(1).jpg");
        s.setBounds(200,100,1100,900);

    }

    @Override
    public void dimensionTravel(Screen s) {
        s.out("\nSpecial 2: Dimensional Travel\n");
        s.showImage("C:\\Users\\makar\\IdeaProjects\\PracticasSemana3\\src\\practicaMultiverse\\img\\gwen2.jpg");
    }
}
