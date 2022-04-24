package practicaLineUp;

import imonsh.Screen;

import java.awt.*;

public class BeginConcert {
    public static void main(String[] args) throws InterruptedException {
        stage1();
    }

    public static void stage1() throws  InterruptedException{

        /*Creates a new presentation for each object*/
        Presentation p1 = new Presentation("Run the Jewels","6:10","Mojave","rtj");
        Presentation p2 = new Presentation("Phoebe Bridgers","7:10","Outdoor Theatre","pb");
        Presentation p3 = new Presentation("Harry Styles","8:00","Stage 1","hs");
        Presentation p4 = new Presentation("Disclosure","9:10","Outdoor Theatre","ds");
        Presentation p5 = new Presentation("Caribou","10:30","Mojave","cb");
        Presentation p6 = new Presentation("Billie Eilish","11:40","Coachella","be");
        Presentation p7 = new Presentation("Jamie XX","00:30","Outdoor","jx");
        Presentation p8 = new Presentation("The Weekend","1:20","Coachella","tw");


        Screen s = new Screen();

        /*This thread controls the display of information and the gif of the artist*/
        Runnable performance = new Runnable() {
            @Override
            public void run() {
                try{
                    s.setBounds(200,100,600,500);
                    String videoPath="C:\\Users\\makar\\IdeaProjects\\PracticasSemana3\\src\\practicaLineUp\\img\\";
                    s.setVisible(true);

                    s.changeStyle("Helvetica",15,Color.white, Color.black);
                    s.out("\n\n   ");
                    s.showImage(videoPath+"coachella.gif");
                    Thread.sleep(5000);


                    s.cls();
                    p1.showInformation(s);
                    p1.showArtist(s,videoPath+p1.mediaFile+".gif");
                    Thread.sleep(20000);
                    s.cls();
                    p2.showInformation(s);
                    p2.showArtist(s,videoPath+p2.mediaFile+".gif");
                    Thread.sleep(20000);
                    s.cls();
                    p3.showInformation(s);
                    p3.showArtist(s,videoPath+p3.mediaFile+".gif");
                    Thread.sleep(20000);
                    s.cls();
                    p4.showInformation(s);
                    p4.showArtist(s,videoPath+p4.mediaFile+".gif");
                    Thread.sleep(20000);
                    s.cls();
                    p5.showInformation(s);
                    p5.showArtist(s,videoPath+p5.mediaFile+".gif");
                    Thread.sleep(20000);
                    s.cls();
                    p6.showInformation(s);
                    p6.showArtist(s,videoPath+p6.mediaFile+".gif");
                    Thread.sleep(20000);
                    s.cls();
                    p7.showInformation(s);
                    p7.showArtist(s,videoPath+p7.mediaFile+".gif");
                    Thread.sleep(20000);
                    s.cls();
                    p8.showInformation(s);
                    p8.showArtist(s,videoPath+p8.mediaFile+".gif");
                    Thread.sleep(20000);

                }catch(InterruptedException ie){
                    ie.printStackTrace();
                }

            }
        };

        /*This thread controls the music and changes it according to the artist*/
        Runnable music = new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(5000);
                    String soundPath="C:\\Users\\makar\\IdeaProjects\\PracticasSemana3\\src\\practicaLineUp\\sounds\\";
                    p1.startMusic(s,soundPath+p1.mediaFile+".mp3");
                    Thread.sleep(20000);
                    p2.startMusic(s, soundPath+p2.mediaFile+".mp3");
                    Thread.sleep(20000);
                    p3.startMusic(s,soundPath+p3.mediaFile+".mp3");
                    Thread.sleep(20000);
                    p4.startMusic(s,soundPath+p4.mediaFile+".mp3");
                    Thread.sleep(20000);
                    p5.startMusic(s,soundPath+p5.mediaFile+".mp3");
                    Thread.sleep(20000);
                    p6.startMusic(s,soundPath+p6.mediaFile+".mp3");
                    Thread.sleep(20000);
                    p7.startMusic(s,soundPath+p7.mediaFile+".mp3");
                    Thread.sleep(20000);
                    p8.startMusic(s,soundPath+p8.mediaFile+".mp3");
                    Thread.sleep(20000);
                }catch(InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };

        /*This thread is a loop that changes music for all the presentations*/
        Runnable lights = new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(5000);
                    for(int i = 0;i<=15;i++){
                        s.changeStyle("Helvetica",15,Color.white, Color.red);
                        Thread.sleep( 2000);
                        s.changeStyle("Helvetica",15,Color.white, Color.black);
                        Thread.sleep( 2000);
                        s.changeStyle("Helvetica",15,Color.white, Color.blue);
                        Thread.sleep( 2000);
                        s.changeStyle("Helvetica",15,Color.white, Color.darkGray);
                        Thread.sleep( 2000);
                        s.changeStyle("Helvetica",15,Color.white, Color.ORANGE);
                        Thread.sleep( 2000);

                    }
                }catch(InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };

        /*Creating 3 threads and starts them*/
        Thread s1 = new Thread(performance);
        Thread s2 = new Thread(lights);
        Thread s3 = new Thread(music);
        s1.start();
        s2.start();
        s3.start();

    }


}
