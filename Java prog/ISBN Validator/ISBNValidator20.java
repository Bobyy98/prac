import java.util.Scanner;

public class ISBNValidator20
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ISBN number: "); // 0545010225
        String isbn = sc.nextLine();

        if (isValidISBN(isbn))
        {
            System.out.println("The ISBN is valid.");
        }
        else
        {
            System.out.println("The ISBN is invalid.");
        }

        sc.close();
    }

    public static boolean isValidISBN(String isbn)
    // Remove any non-digit characters
    {
        isbn = isbn.replaceAll("[^0-9]", "");

        if (isbn.length() != 10)
        {
            return false;
        }

        int sum = 0;
        for (int i = 0; i < 10 ; i++)
        {
            int dig = Character.getNumericValue(isbn.charAt(i));
            sum += (i + 1) * dig;
        }

        return sum % 11 == 0;
    }
}
