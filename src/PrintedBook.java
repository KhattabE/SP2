public class PrintedBook extends Title{

    //Class Attributes
    private int pages;
    private int copies;


    //Constructor
    public PrintedBook(String title, String literatureType, int pages, int copies) {
        super(title, literatureType);
        this.pages = pages;
        this.copies = copies;
    }

    //The method will be used to check which type of literature the printed book is, and it will give points according to that
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


    //The method for calculating the points of the PrintedBook, with the use of the pages and the copies of the PrintedBook
    //Overriding the abstract calculatePoints() method from the super class
    @Override
    public double calculatePoints(){
        return pages * convertLiteratureType() * copies;
    }




}
