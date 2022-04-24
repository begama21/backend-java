package practicaComic;

public class Comic {
    String name;
    int year;
    String author;
    String path;

    public Comic(String name,int year, String author, String path){
        this.name = name;
        this.year = year;
        this.author = author;
        this.path = path;
    }

    public String show(){
        return "Name: "+name+"\nYear: "+year+"\nAuthor: "+author;
    }


}
