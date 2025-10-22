public class AudioBook extends Title{

    //AudioBook class attributes
    private int durationInMinutes;
    private int copies;

    //Class Constructor
    public AudioBook(String title, String literatureType, int durationInMinutes, int copies) {
        //Super keyword so i can get the constructor from the parent class (Title)
        super(title, literatureType);
        this.durationInMinutes = durationInMinutes;
        this.copies = copies;
    }



    //The method for calculating the points of the audio books, with the use of the duration length and the copies of the audio book
    //Overriding the abstract calculatePoints() method from the super class
    @Override
    public double calculatePoints(){
        return (durationInMinutes * 0.5 ) * convertLiteratureType() * copies;
    }


}
