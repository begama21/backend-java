package practicaComic;

import imonsh.Screen;

import java.util.Arrays;
import java.util.List;

public class ComicRun {

    public static void main(String[] args) throws InterruptedException {
        startComic();
    }

    public static void startComic() throws InterruptedException{
        Screen s = new Screen();

        SpongebobComic spongebob = new SpongebobComic("Spongebob Freestyle Funnies",2014,"Graham Annable",
                "C:\\Users\\makar\\IdeaProjects\\PracticasSemana3\\src\\practicaComic\\img\\");

        //An array to declare the panel after which we need to create a new page
        int[] ranges = new int[]{1,4,7,10,13,16,19,22,24,28,30};

        //The panels where the comic doesn't need to introduce a lineBreak
        int[] breaksException ={2,3,15,27};

        //Changed array of breaks to use contain method inside the for cycle
        List<Integer> breakList =  Arrays.stream(breaksException).boxed().toList();

        //Beginning the thread
        Runnable begin = new Runnable() {

            @Override
            public void run() {
                try{
                    //Establishes the size of the window
                    s.setBounds(200,100,700,1000);
                    int j=1;
                    //For cycle to control the pages and the panels to be displayed
                    for( int i =1; i < ranges.length;i++){ //Ranges.length control when a new page needs to be created
                        for (; j<=ranges[i];j++){  //ranges[] control the number of panels that are displayed per page
                            spongebob.displayPanel(s,j);
                            Thread.sleep(5200);
                            if(!(breakList.contains(j))){  //If j is on breakList, then it displays on the same row
                                spongebob.changeRow(s);
                            }
                        }//End of second for
                        spongebob.changePage(s);  //Calls function to delete and start in new page
                    }//End of first for
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };

        //Creating the new story
        Thread story =new Thread(begin);
        story.start();
    }


}
