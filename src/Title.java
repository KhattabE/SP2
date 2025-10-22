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
        return calculatePoints() * RATE;
    }



    //Abstract method that will(must) be implemented in the inheriting sub classes
    protected abstract double calculatePoints();


    //The method will be used to check which type of literature the audioBook or PrintedBook is, and it will give points according to that
    protected double convertLiteratureType() {
        //Will use enhanced switch case to go through every type of literature type, and will make it return the correct one
        return switch (getLiteratureType()) {
            case "BI", "TE" -> 3.0;
            case "LYRIK" -> 6.0;
            case "SKØN" -> 1.7;
            case "FAG" -> 1.0;
            default -> 0.0;
        };
    }



}
