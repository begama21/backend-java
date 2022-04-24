package practicaMona;

public class IronCat extends OctoCat {

    public IronCat (int id, String name, String description, String creator){
        super(id,name,description,creator);
    }

    public void defends(){
        System.out.println("\n"+name+" flies around shooting lasers ");
    }

    public void quotes(){
        System.out.println("\n"+name+ " says 'I love you 3,000. ");
    }

    @Override
    public void moves(){
        System.out.println("\n"+ name+ " hovers and flies");
    }
}
