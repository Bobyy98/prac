import java.util.Scanner;

// Define the Searchable interface
interface Searchable {
    boolean search(String keyword);
}

// Create a Document class that implements the Searchable interface
class Document implements Searchable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public boolean search(String keyword) {
        return content.contains(keyword);
    }
}

// Create a WebPage class that implements the Searchable interface
class WebPage implements Searchable {
    private String url;
    private String pageContent;

    public WebPage(String url, String pageContent) {
        this.url = url;
        this.pageContent = pageContent;
    }

    @Override
    public boolean search(String keyword) {
        return pageContent.contains(keyword);
    }
}

public class SearchableInter6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the document content
        System.out.print("Enter document content: ");
        String documentContent = scanner.nextLine();
        Document document = new Document(documentContent);

        // Get user input for the web page content
        System.out.print("Enter web page content: ");
        String webPageContent = scanner.nextLine();
        WebPage webPage = new WebPage("https://www.example.com", webPageContent);

        // Get user input for the keyword to search
        System.out.print("Enter a keyword to search: ");
        String keyword = scanner.nextLine();

        // Search for the keyword in the Document
        boolean foundInDocument = document.search(keyword);
        if (foundInDocument) {
            System.out.println("Keyword '" + keyword + "' found in the document.");
        } else {
            System.out.println("Keyword '" + keyword + "' not found in the document.");
        }

        // Search for the keyword in the WebPage
        boolean foundInWebPage = webPage.search(keyword);
        if (foundInWebPage) {
            System.out.println("Keyword '" + keyword + "' found in the web page.");
        } else {
            System.out.println("Keyword '" + keyword + "' not found in the web page.");
        }

        // Close the scanner
        scanner.close();
    }
}
