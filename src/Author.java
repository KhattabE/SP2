import java.util.ArrayList;

public class Author {


    //Author class Attributes
    private String name;
    private ArrayList<Title> titles;


    //Author Class constructor
    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }

    //Getters
    public String getName() {
        return name;
    }


    //Method to add titles
    public void addTitle(Title title){
        titles.add(title);
    }


    //Method for calculating the total royalties that the author will get from their audioBooks/PrintedBooks
    public double calculateRoyalties(){
        //For each loop to loop through the titles array and return the overall royalties for the author

        //total variable to hold the running sum
        double total = 0;

        //Goes through the arraylist and adds the royalties in total, for all the audoBooks/PrintedBooks that is in the arrayList
        for(Title title : titles){
            total += title.calculateRoyalty();
        }

        //Return the royalty total
        return total;

    }








}
