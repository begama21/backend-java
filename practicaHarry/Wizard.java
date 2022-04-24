package practicaHarry;

/*
   class "Wizard" that models characters from the Harry Potter Series
   Author: Alberto Garcia
   Date: 20-04-2022
 */

public class Wizard {
    //Defining Attributes
    private String name;
    private String birthDate;
    private String gender;
    private String bloodStatus;
    private String house;
    private String boggart;
    private String patronus;

    //Constructor
    public Wizard(String name, String birthDate, String gender, String bloodStatus, String house, String boggart, String patronus){
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.bloodStatus = bloodStatus;
        this.house = house;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    //Getters
    public String getName(){  return name; }
    public String getBirthDate(){  return birthDate; }
    public String getGender(){  return gender; }
    public String getBloodStatus() {  return bloodStatus;}
    public String getHouse(){  return house; }
    public String getBoggart(){  return boggart; }
    public String getPatronus(){  return  patronus; }

    //Setters
    public boolean setName(String name){
    if(!name.isEmpty()){
        this.name = name;
        return true;
    }else
        return false;
    }

    public boolean setBirthDate(String birthDate){
        if(!birthDate.isEmpty()){
            this.birthDate = birthDate;
            return true;
        }
        else
            return false;
    }

    public boolean setGender(String gender){
        if(!gender.isEmpty()){
            this.gender = gender;
            return true;
        }else
            return false;
    }

    public boolean setBloodStatus(String bloodStatus){
        if(!bloodStatus.isEmpty()){
            this.bloodStatus = bloodStatus;
            return true;
        }
        else
            return false;
    }

    public boolean setHouse(String house) {
        if(!house.isEmpty()){
            this.house = house;
            return true;
        }
        else
            return false;
    }


    public boolean setBoggart(String boggart) {
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }
        else
            return false;
    }

    public boolean setPatronus(String patronus) {
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        }
        else
            return false;
    }

    //Show method to display the object attributes
    public String show(){
    return
            "\nWizard: "+name+"\nBirth Date: "+birthDate+"\nGender: "+gender+"\nBloodStatus: "+bloodStatus+
                    "\nHouse: "+house+"\nBoggart: "+boggart+
                    "\nPatronus: "+patronus;
    }

}
