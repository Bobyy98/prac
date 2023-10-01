import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample37 {
    public static void main(String[] args) {
        String fileName = "output.txt"; // Specify the name of the file you want to write to

        try {
            // Create a FileWriter object with the specified file name
            FileWriter writer = new FileWriter(fileName);

            // Write data to the file
            writer.write("Hello, FileWriter!\n");
            writer.write("This is a sample text written to a file.\n");
            writer.write("You can write more lines like this.");

            // Close the FileWriter to release system resources
            writer.close();

            System.out.println("Data has been written to " + fileName);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
