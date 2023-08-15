import java.util.Scanner;

public class CppInventorQuiz10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String correctAnswer = "Bjarne Stroustrup";
        int maxAttempts = 3;
        int attempts = 0;

        System.out.println("\nWho is the inventor of C++?");

        while(attempts < maxAttempts)
        {
            System.out.print("Your answer: ");
            String userAnswer = sc.nextLine();

            if (userAnswer.equalsIgnoreCase(correctAnswer))
            {
                System.out.println("Good");
                break;
            }
            else
            {
                attempts++;
                if (attempts < maxAttempts)
                {
                    System.out.println("Try again");
                }
                else
                {
                    System.out.println("Incorrect answer. The correct answer is: " + correctAnswer);
                }
            }
        }

        sc.close();
    }
}
