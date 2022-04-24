package practicaMultiverse;
import imonsh.Screen;

import java.awt.*;

public class Spiderman {
    String name;
    String gender;
    String species;
    String description;

    public Spiderman(String name, String gender, String species, String description){
        this.name = name;
        this.gender = gender;
        this.species = species;
        this.description = description;
    }

    public String getName(){ return name;}
    public String getGender(){ return gender;}
    public String getSpecies(){ return species;}
    public String getDescription(){ return species;}

    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }

    public boolean setGender( String gender){
        if(!gender.isEmpty()){
            this.gender = gender;
            return true;
        }else
            return false;
    }

    public boolean setSpecies(String species){
        if(!species.isEmpty()){
            this.species = species;
            return true;
        }else
            return false;
    }

    public boolean setDescription(String description){
        if(!description.isEmpty()){
            this.description = description;
            return true;
        }else
            return false;
    }

    public void shootWeb(Screen s){
        s.out("\nShootWeb: Can shoot web to defeat enemies and swing in the air","Helvetica",20, Color.black);
    }

    public void spiderSense(Screen s){
        s.out("\nSpiderSense: Developed sense to detect incoming danger","Helvetica",20,Color.black);
    }

    public void show(Screen s){
        s.out("\n\nName: "+name+"\nGender: "+gender+
                "\nSpecies: "+species+" Description: "+description+"\n");
    }

}
