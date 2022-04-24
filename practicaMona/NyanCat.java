package practicaMona;

public class NyanCat extends OctoCat {

    public NyanCat(int id, String name, String description, String creator){
        super(id,name,description,creator);
    }

    public void sings(){
        System.out.println("\n"+name+" starts singing an endless catchy song...");
    }

    @Override
    public void moves() {
        System.out.println("\n"+name+" hovers up and down leaving a rainbow behind it..");
    }
}
