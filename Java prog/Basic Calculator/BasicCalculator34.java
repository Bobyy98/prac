import java.util.Scanner;

public class BasicCalculator34 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Basic Calculator!");
        System.out.println("Operations:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter the operation number (1-4): ");
        int operation = scanner.nextInt();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        double result = 0;
        
        switch (operation) 
        {
            case 1:
                result = num1 + num2;
                break;

            case 2:
                result = num1 - num2;
                break;

            case 3:
                result = num1 * num2;
                break;

            case 4:
                if (num2 != 0) 
                {
                    result = num1 / num2;
                } 
                else 
                {
                    System.out.println("Cannot divide by zero!");
                }
                break;

            default:
                System.out.println("Invalid operation number.");
        }
        
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}
