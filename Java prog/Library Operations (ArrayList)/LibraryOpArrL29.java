import java.util.ArrayList;

public class LibraryOpArrL29 {
    // Inner Book class
    public class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return "Title: " + title + ", Author: " + author;
        }
    }

    private ArrayList<Book> bookList;

    public LibraryOpArrL29() {
        bookList = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        bookList.add(book);
    }

    // Method to display all books in the library
    public void displayBooks() {
        if (bookList.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("Library Books:");
            for (Book book : bookList) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        LibraryOpArrL29 library = new LibraryOpArrL29();

        // Adding books to the library
        library.addBook("Book 1", "Author 1");
        library.addBook("Book 2", "Author 2");
        library.addBook("Book 3", "Author 3");

        // Displaying the list of books
        library.displayBooks();
    }
}
