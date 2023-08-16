import java.util.Scanner;

public class VowelConsCounter33 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;

        input = input.toLowerCase(); // Convert input to lowercase for case-insensitive matching

        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) 
            {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } 
                else 
                {
                    consonantCount++;
                }
            }
        }

        System.out.println("Total vowels: " + vowelCount);
        System.out.println("Total consonants: " + consonantCount);

        scanner.close();
    }
}
