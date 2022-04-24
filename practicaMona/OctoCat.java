package practicaMona;

public class OctoCat {
    int id;
    String name;
    String description;
    String creator;

    //Constructor
    public OctoCat(int id, String name, String description, String creator) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.creator = creator;
    }

    //Getters
    public int getId(){  return id; }
    public String getName(){  return name; }
    public String getDescription(){  return description;}
    public String getCreator(){  return creator;}

    //Setters
    public boolean setId( int id){
        if(id>0){
            this.id = id;
            return true;
        }
        else
            return false;
    }

    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        }
        else
            return false;
    }

    public boolean setDescription(String description){
        if(!description.isEmpty()){
            this.description = description;
            return true;
        }
        else
            return false;
    }

    public boolean setCreator(String creator){
        if(!creator.isEmpty()){
            this.creator = creator;
            return true;
        }
        else
            return false;
    }

    //This method tires to explain how each octoCat moves. Other cats might override this method
    public void moves(){

        System.out.println("\nThe cat moves using its OctoArms");
    }
    //Method to show the attributes
    public String show(){
        return
                "\nOctocat #"+id+ "\nName: "+name+"\n-------------"+
                        "\nDescription: "+description+
                        "\nCreated by: "+creator;
    }

}
