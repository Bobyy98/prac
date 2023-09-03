class Book17 {
    private String title;
    private String author;
    private double price;

    public Book17(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public void categorize() {
        System.out.println("This is a general book.");
    }
}

class FictionBook extends Book17 {
    private String genre;

    public FictionBook(String title, String author, double price, String genre) {
        super(title, author, price);
        this.genre = genre;
    }

    @Override
    public void categorize() {
        System.out.println("Category: Fiction");
        System.out.println("Genre: " + genre);
    }
}

class NonFictionBook extends Book17 {
    private String topic;

    public NonFictionBook(String title, String author, double price, String topic) {
        super(title, author, price);
        this.topic = topic;
    }

    @Override
    public void categorize() {
        System.out.println("Category: Non-Fiction");
        System.out.println("Topic: " + topic);
    }
}

public class BookInherit17 {
    public static void main(String[] args) {
        FictionBook fictionBook = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald", 15.99, "Classic");
        NonFictionBook nonFictionBook = new NonFictionBook("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 19.99, "History");

        System.out.println("Fiction Book Details:");
        fictionBook.displayBookDetails();
        fictionBook.categorize();

        System.out.println("\nNon-Fiction Book Details:");
        nonFictionBook.displayBookDetails();
        nonFictionBook.categorize();
    }
}
