package practicaLineUp;

import imonsh.Screen;

/*This class controls the actions of the concert like showing artist, information, and music*/

public class Presentation implements ConcertActions {

    String artistName;
    String time;
    String stage;
    String mediaFile;


    public Presentation(String artistName, String time, String stage, String mediaFile){
        this.artistName = artistName;
        this.time = time;
        this.stage = stage;
        this.mediaFile = mediaFile;
    }

    @Override
    public void showInformation(Screen s){
        s.out(
                "  Now watching: " +artistName.toUpperCase()+
                "   Time: "+time+
                "   Stage: "+stage.toUpperCase()+"\n\n");

    }
    @Override
    public void showArtist(Screen s, String video){
        s.showImage(video);
    }


    @Override
    public void startMusic(Screen s,String audio) {
        MusicManager ex1 = new MusicManager();
        ex1.play(audio);
    }

}
