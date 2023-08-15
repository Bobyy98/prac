import java.util.Scanner;

public class WordCounter9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Read the input text
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Read the word to be counted
        System.out.print("Enter the word to count: ");
        String wordCount = sc.nextLine();

        int count = countOccur(text, wordCount);
        System.out.println("The word '" + wordCount + "' appears " + count + " times.");

        sc.close();
    }

    public static int countOccur(String text, String targetWord)
    {
        String[] words = text.split(" ");
        int count = 0;

        for (String word : words)
        {
            if(word.equalsIgnoreCase(targetWord))
            {
                count++;
            }
        }

        return count;
    }
}
