import java.util.Scanner;

public class AdmissionCriteria1
{
    public static void main(String[] args)
    {
        int math, phy, chem;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks in Maths: ");
        math = sc.nextInt();

        System.out.println("Enter marks in Physics: ");
        phy = sc.nextInt();

        System.out.println("Enter marks in Chemistry: ");
        chem = sc.nextInt();

        if ((math >= 60) && (phy >= 50) && (chem >= 40))
        {
            System.out.println("Eligible");
        }
        else if ((math + phy) >= 150)
        {
            System.out.println("Eligible");
        }
        else
        {
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}
