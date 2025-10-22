import java.util.ArrayList;

public class Author {


    //Author class Attributes
    private String name;
    private ArrayList<Title> titles;


    //Author Class constructor
    public Author(String name) {
        this.name = name;
    }

    //Getters
    public String getName() {
        return name;
    }


    //Method to add titles
    public void addTitle(Title title){
        //Will add some audiobooks first
        titles.add(new AudioBook("The Secret Of The Universe", "LYRIK", 120, 5));

    }


    public double calculateRoyalties(){
        //For each loop to loop through the titles array and return the overall royalties for the author




        for(Title title : titles){

        }
    }








}
