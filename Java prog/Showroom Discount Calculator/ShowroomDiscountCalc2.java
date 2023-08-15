import java.util.Scanner;

public class ShowroomDiscountCalc2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter purchase amount: ");
        double purchaseAmount = sc.nextDouble();

        double clothingDiscount = 0;
        double footwearDiscount = 0;

        if (purchaseAmount <= 1000)
        {
            clothingDiscount = 0.05;
        }
        else if (purchaseAmount <= 2000)
        {
            clothingDiscount = 0.05;
            footwearDiscount = 0.075;
        }
        else if (purchaseAmount <= 3000)
        {
            clothingDiscount = 0.075;
            footwearDiscount = 0.1;
        }
        else
        {
            clothingDiscount = 0.1;
            footwearDiscount = 0.15;
        }

        double clothingAmount = purchaseAmount * (1 - clothingDiscount);
        double footwearAmount = purchaseAmount * (1 - footwearDiscount);

        System.out.println("CLothing amount after discount: " + clothingAmount);
        System.out.println("Footwear amount after discount: " + footwearAmount);
        
        sc.close();
    }
}
