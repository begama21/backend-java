package practicaHarry;
/*
   class "WizardCreate" that creates "Wizard" objects and calls the show method
   Author: Alberto Garcia
   Date: 20-04-2022
 */

public class WizardCreate {
    public static void main(String[] args) {

        //Creating 5 different objects using the constructor form "Wizard" class
        Wizard Harry = new Wizard(
                "Harry James Potter","31-07-1980","Male","Half-Blood","Gryffindor",
                "Dementor","Stag");
        Wizard Hermione = new Wizard(
                "Hermione Jean Granger","19-09-1979","Female","Muggle-Born","Gryffindor",
                "Professor McGonagall","Otter");
        Wizard Ron = new Wizard(
                "Ronald Bilius Weasley","01-03-1980","Male","Pure-Blood",
                "Gryffindor","Aragog","Jack Russel Terrier");
        Wizard Dumbledore = new Wizard(
                "Albus P.W.B. Dumbledore","??-08-1881","Male","Half-Blood",
                "Gryffindor","Ariana","Phoenix");
        Wizard Draco = new Wizard(
                "Draco Lucius Malfoy","05-06-1980","Male","Pure-Blood",
                "Slytherin","Voldemort","Unknown");

        //Calling the show method for each object
        System.out.println(Harry.show());
        System.out.println(Hermione.show());
        System.out.println(Ron.show());
        System.out.println(Dumbledore.show());
        System.out.println(Draco.show());
    }
}
