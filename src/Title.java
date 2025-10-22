public abstract class Title {

    //Tittle class attributes
    private String title;
    private String literatureType;
    //The reason this attribute is final, is because it is a fixed RATE
    private static final double RATE = 0.067574;

    //Title class constructor
    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    //Getter so i can use it inside the audio book and book classes, when i am looking for Literature Type
    public String getLiteratureType() {
        return literatureType;
    }

    //Method to calculate the royalties
    public double calculateRoyalty(){
        return 0;
    }



    //Abstract method that will(must) be implemented in the inheriting sub classes
    public abstract double calculatePoints();

    public abstract double convertLiteratureType();



}
