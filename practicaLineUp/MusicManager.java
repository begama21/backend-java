package practicaLineUp;

import jaco.mp3.player.MP3Player;
import java.io.File;

/*Class that controls reproduction of music files*/
public class MusicManager {

    public static void main(String[] args) throws Exception {
        //play(path);
    }

    public static void play(String path){
        new MP3Player(new File(path)).play();
    }

    public static void stop(String path){
        new MP3Player(new File(path)).stop();
    }
}

