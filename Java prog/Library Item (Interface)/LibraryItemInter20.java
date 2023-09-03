// Define the LibraryItem interface
interface LibraryItem {
    void checkout();
    void returnItem();
}

// Implement the Book class
class Book20 implements LibraryItem {
    private String title;
    private boolean isCheckedOut;

    public Book20(String title) {
        this.title = title;
        this.isCheckedOut = false;
    }

    @Override
    public void checkout() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println("Book '" + title + "' has been checked out.");
        } else {
            System.out.println("Book '" + title + "' is already checked out.");
        }
    }

    @Override
    public void returnItem() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println("Book '" + title + "' has been returned.");
        } else {
            System.out.println("Book '" + title + "' is already in the library.");
        }
    }
}

// Implement the DVD class
class DVD20 implements LibraryItem {
    private String title;
    private boolean isCheckedOut;

    public DVD20(String title) {
        this.title = title;
        this.isCheckedOut = false;
    }

    @Override
    public void checkout() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println("DVD '" + title + "' has been checked out.");
        } else {
            System.out.println("DVD '" + title + "' is already checked out.");
        }
    }

    @Override
    public void returnItem() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println("DVD '" + title + "' has been returned.");
        } else {
            System.out.println("DVD '" + title + "' is already in the library.");
        }
    }
}

public class LibraryItemInter20 {
    public static void main(String[] args) {
        // Create instances of Book and DVD
        Book20 book1 = new Book20("Introduction to Java");
        DVD20 dvd1 = new DVD20("The Matrix");

        // Simulate checking out and returning items
        book1.checkout();
        dvd1.checkout();

        book1.returnItem();
        dvd1.returnItem();
    }
}
