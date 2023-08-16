import java.util.HashMap;
import java.util.Scanner;

public class AtbashCipher17 
{
	// Map to lookup various alphabets
	static HashMap<Character, Character> lookup_table = new HashMap<Character, Character>(){{
		put('A', 'Z'); put('B', 'Y'); put('C', 'X'); put('D', 'W'); put('E', 'V'); put('F', 'U');
		put('G', 'T'); put('H', 'S'); put('I', 'R'); put('J', 'Q'); put('K', 'P'); put('L', 'O');
		put('M', 'N'); put('N', 'M'); put('O', 'L'); put('P', 'K'); put('Q', 'J'); put('R', 'I');
		put('S', 'H'); put('T', 'G'); put('U', 'F'); put('V', 'E'); put('W', 'D'); put('X', 'C');
		put('Y', 'B'); put('Z', 'A');
	}};

	// Function to implement Atbash Cipher
	public static String atbash(String message)
	{
		StringBuilder cipher = new StringBuilder();

		for (char letter : message.toCharArray())
		{
			if (Character.isLetter(letter)) // Check if it's a letter
			{
				char encryptedChar = lookup_table.get(Character.toUpperCase(letter));

				if (Character.isUpperCase(letter)) // Check if input is upper case
				{
					cipher.append(encryptedChar);
				}
				else // Input is lower case
				{
					cipher.append(Character.toLowerCase(encryptedChar));
				}
			}
			else // Not a letter (e.g., space)
			{
				cipher.append(letter);
			}
		}

		return cipher.toString();
	}

	// Driver function to run the program
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

		// Encrypt the given message
        System.out.println("Enter a string: ");
		String message = sc.nextLine();
		System.out.println(atbash(message));

        sc.close();
	}
}
