// Define the Product interface
interface Product18 {
    double getPrice();
    String getDescription();
}

// Implement the Electronics class
class Electronics implements Product18 {
    private String name;
    private double price;

    public Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Electronics: " + name;
    }
}

// Implement the Clothing class
class Clothing implements Product18 {
    private String name;
    private double price;

    public Clothing(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Clothing: " + name;
    }
}

// Implement the Books class
class Books implements Product18 {
    private String title;
    private String author;
    private double price;

    public Books(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Book: " + title + " by " + author;
    }
}

public class ProductInter18 {
    public static void main(String[] args) {
        // Create instances of different products
        Electronics laptop = new Electronics("Laptop", 999.99);
        Clothing shirt = new Clothing("T-Shirt", 19.99);
        Books novel = new Books("The Great Gatsby", "F. Scott Fitzgerald", 12.99);

        // Display product details
        displayProductDetails(laptop);
        displayProductDetails(shirt);
        displayProductDetails(novel);
    }

    // Method to display product details
    public static void displayProductDetails(Product18 product) {
        System.out.println("Description: " + product.getDescription());
        System.out.println("Price: $" + product.getPrice());
        System.out.println();
    }
}
