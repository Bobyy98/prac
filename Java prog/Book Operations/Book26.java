public class Book26 
{
    private String title;
    private String author;
    private int yearOfPublication;

    public Book26(String title, String author, int yearOfPublication) 
    {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() 
    {
        return title;
    }

    public String getAuthor() 
    {
        return author;
    }

    public int getYearOfPublication() 
    {
        return yearOfPublication;
    }

    public void displayBookDetails() 
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year of Publication: " + yearOfPublication);
    }

    public boolean equals(Object other) 
    {
        if (this == other) 
        {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Book26 otherBook26 = (Book26) other;
        return yearOfPublication == otherBook26.yearOfPublication &&
               title.equals(otherBook26.title) &&
               author.equals(otherBook26.author);
    }

    public int hashCode() 
    {
        int result = title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + yearOfPublication;
        return result;
    }

    public static void main(String[] args) 
    {
        Book26 book1 = new Book26("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book26 book2 = new Book26("To Kill a Mockingbird", "Harper Lee", 1960);

        book1.displayBookDetails();
        System.out.println();

        book2.displayBookDetails();
        System.out.println();

        System.out.println("Are the books the same? " + book1.equals(book2));
    }
}
