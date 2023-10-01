import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileDoesNotExistException extends Exception {
    public FileDoesNotExistException(String message) {
        super(message);
    }
}

public class LongestWordFinder39 {
    public static void main(String[] args) {
        try {
            String fileName = "text.txt"; // Replace with the actual file name
            String longestWord = findLongestWord(fileName);
            System.out.println("Longest word in the file: " + longestWord);
        } catch (FileDoesNotExistException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static String findLongestWord(String fileName) throws FileDoesNotExistException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            String longestWord = "";

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }

            reader.close();
            return longestWord;
        } catch (IOException e) {
            throw new FileDoesNotExistException("The file '" + fileName + "' does not exist or cannot be read.");
        }
    }
}
