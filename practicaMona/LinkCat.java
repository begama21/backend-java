package practicaMona;

public class LinkCat extends OctoCat    {
    public LinkCat(int id, String name, String description, String creator){
        super(id,name,description,creator);
    }

    public void slashes(){
        System.out.println("\n"+name+ " slashes grass looking for rupees..");
    }

    @Override
    public void moves(){
        System.out.println("\n"+name+ " calls a horse and rides to the sunset.");
    }

}
