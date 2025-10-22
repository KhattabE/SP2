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


    //The method will be used to check which type of literature the audio book is, and it will give points according to that
    //Override the abstract calculatePoints() from the parent class
    @Override
    public double convertLiteratureType() {
        //Will use enhanced switch case to go through every type of literature type, and will make it return the correct one
        return switch (getLiteratureType()) {
            case "BI", "TE" -> 3.0;
            case "LYRIK" -> 6.0;
            case "SKØN" -> 1.7;
            case "FAG" -> 1.0;
            default -> 0.0;
        };
    }


    //The method for calculating the points of the audio books, with the use of the duration length and the copies of the audio book
    //Overriding the abstract calculatePoints() method from the super class
    @Override
    public double calculatePoints(){
        return (durationInMinutes * 0.5 ) * convertLiteratureType() * copies;
    }


}
