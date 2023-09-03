public class ConfidentialDocClone19 implements Cloneable {
    private String title;
    private String content;
    private String securityLevel;

    // Constructor
    public ConfidentialDocClone19(String title, String content, String securityLevel) {
        this.title = title;
        this.content = content;
        this.securityLevel = securityLevel;
    }

    // Clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Create a new ConfidentialDocClone object and set its properties
        ConfidentialDocClone19 clonedDocument = (ConfidentialDocClone19) super.clone();
        
        // Set the securityLevel of the cloned object to a default value
        clonedDocument.securityLevel = "Default Security Level";
        
        return clonedDocument;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "ConfidentialDocClone{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", securityLevel='" + securityLevel + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Create a ConfidentialDocClone
        ConfidentialDocClone19 originalDocument = new ConfidentialDocClone19("Top Secret", "This is confidential content.", "High Security");

        try {
            // Clone the original document
            ConfidentialDocClone19 clonedDocument = (ConfidentialDocClone19) originalDocument.clone();

            // Print the original and cloned documents
            System.out.println("Original Document: " + originalDocument);
            System.out.println("Cloned Document: " + clonedDocument);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
