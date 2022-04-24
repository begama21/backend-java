package practicaComic;

import imonsh.Screen;

import java.io.IOException;

public class SpongebobComic extends Comic implements Panels  {


    public SpongebobComic(String name, int year, String author,String path){
        super(name,year,author,path);
    }


    @Override
    public void displayPanel(Screen s, int i){
        s.setVisible(true);
        s.showImage(path+"panel"+i+".png");

    }

    @Override
    public void changePage(Screen s) {
        s.cls();
        s.repaint();
    }


    @Override
    public void changeRow(Screen s) {
        s.out("\n");
    }

}
