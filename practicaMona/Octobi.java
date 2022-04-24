package practicaMona;

public class Octobi extends OctoCat{

    //Constructor call super class to assign the attributes in parent class
    public Octobi(int id, String name, String description, String creator){
        super(id,name,description,creator);
    }

    public void useForce(){
        System.out.println("\n"+name+" says: 'These are not the (cat)Droids you're looking for...");
    }
}
