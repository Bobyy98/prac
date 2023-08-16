import java.util.Scanner;

public class NoSystemConverter22
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number System Converter");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        System.out.println("3. Decimal to Hexadecimal");
        System.out.println("4. Hexadecimal to Decimal");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice)
        {
            case 1:
            System.out.print("Enter a binary number: ");
            String binaryInput = sc.next();
            int binaryToDecimal = Integer.parseInt(binaryInput, 2);
            System.out.println("Decimal representation: " + binaryToDecimal);
            break;

            case 2:
            System.out.print("Enter a decimal number: ");
            int decimalInput = sc.nextInt();
            String decimalToBinary = Integer.toBinaryString(decimalInput);
            System.out.println("Binary representation: " + decimalToBinary);
            break;

            case 3: 
            System.out.print("Enter a decimal number: ");
            int decimalInputHex = sc.nextInt();
            String decimalToHex = Integer.toHexString(decimalInputHex);
            System.out.println("Hexadecimal representation: " + decimalToHex);
            break;

            case 4:
            System.out.print("Enter a hexadecimal number: ");
            String hexInput = sc.next();
            int hexToDecimal = Integer.parseInt(hexInput, 16);
            System.out.println("Decimal representation: " + hexToDecimal);
            break; 

            default:
            System.out.println("Invalid choice.");
            break;
        }

        sc.close();
    }
}
