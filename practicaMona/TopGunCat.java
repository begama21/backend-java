package practicaMona;

public class TopGunCat extends  OctoCat{
    public TopGunCat (int id, String name, String description, String creator){
        super(id,name,description,creator);
    }

    @Override
    public void moves() {
        System.out.println("\n"+name+" goes everywhere in its jet.");
    }
}
