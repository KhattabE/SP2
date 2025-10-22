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

    //The method for calculating the points of the PrintedBook, with the use of the pages and the copies of the PrintedBook
    //Overriding the abstract calculatePoints() method from the super class
    @Override
    public double calculatePoints(){
        return pages * convertLiteratureType() * copies;
    }




}
