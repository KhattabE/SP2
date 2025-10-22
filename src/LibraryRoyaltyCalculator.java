public class LibraryRoyaltyCalculator {

    public static void main(String[] args) {

        //Author objects
        Author author1 = new Author("H.C MoaF");
        Author author2 = new Author("J.k Amandnu");
        Author author3 = new Author("RH");


            //Will add some audiobooks
            author1.addTitle(new AudioBook("The Secret Of The Universe", "LYRIK", 120, 320));
            author3.addTitle(new AudioBook("Coding ourselfs to the future", "FAG", 450, 23500));
            author1.addTitle(new AudioBook("MoaF The Strongest Man", "LYRIK", 25, 5436));

            //Will add some PrintedBooks
            author1.addTitle(new PrintedBook("MoaF and the little The Little Mermaid", "BI", 365, 35451));
            author2.addTitle(new PrintedBook("Amandnu and the Seven Dwarfs", "TE", 545, 12000));
            author3.addTitle(new PrintedBook("Learn Java", "FAG", 954, 34200));

        //To print out the information
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%s: %.2fkr\n", author1.getName(), author1.calculateRoyalties());
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%s: %.2fkr\n", author2.getName(), author2.calculateRoyalties());
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%s: %.2fkr\n", author3.getName(), author3.calculateRoyalties());
        System.out.println("-----------------------------------------------------------------");
    }





    }


