package practicaMona;

public class MegaCat extends OctoCat{
    public MegaCat(int id, String name, String description, String creator){
        super(id,name,description,creator);
    }

    public void fights(){
        System.out.println("\n"+name+" shoots from a pistol and jumps.");
    }
}
