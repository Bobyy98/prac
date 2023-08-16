import java.util.Scanner;

public class CharacterCounter23
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        int letterCount = 0;
        int spaceCount = 0;
        int numberCount = 0;
        int specialCharCount = 0;

        for (char ch : input.toCharArray())
        {
            if (Character.isLetter(ch))
            {
                letterCount++;
            }
            else if (Character.isDigit(ch))
            {
                numberCount++;
            }
            else if (Character.isWhitespace(ch))
            {
                spaceCount++;
            }
            else
            {
                specialCharCount++;
            }
        }

        System.out.println("Letter count: " + letterCount);
        System.out.println("Number count: " + numberCount);
        System.out.println("Space count: " + spaceCount);
        System.out.println("Special character count: " + specialCharCount);

        sc.close();
    }
}
