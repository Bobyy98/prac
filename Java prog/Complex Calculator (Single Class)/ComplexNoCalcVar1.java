import java.util.Scanner;

public class ComplexNoCalcVar1 
{

    public static void main(String args[]) 
    {
        double r1, r2, i1, i2, radd, iadd, rsub, isub, rmul, imul, rdiv, idiv, den;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter real 1: ");
        r1 = sc.nextDouble();
        System.out.println("Enter imaginary 1: ");
        i1 = sc.nextDouble();
        System.out.println("Enter real 2: ");
        r2 = sc.nextDouble();
        System.out.println("Enter imaginary 2: ");
        i2 = sc.nextDouble();

        radd = r1 + r2;
        iadd = i1 + i2;

        rsub = r1 - r2;
        isub = i1 - i2;

        rmul = r1 * r2 - i1 * i2;
        imul = r1 * i2 + i1 * r2;

        den = r2 * r2 + i2 * i2;
        rdiv = (r1 * r2 + i1 * i2) / den;
        idiv = (i1 * r2 - r1 * i2) / den;

        if (iadd >= 0) 
        {
            System.out.println("Sum is: " + radd + " + " + iadd + "i");
        } 
        else 
        {
            System.out.println("Sum is: " + radd + " - " + (-iadd) + "i");
        }

        if (isub >= 0) 
        {
            System.out.println("Difference: " + rsub + " + " + isub + "i");
        } 
        else 
        {
            System.out.println("Difference: " + rsub + " - " + (-isub) + "i");
        }

        if (imul >= 0) 
        {
            System.out.println("Product is: " + rmul + " + " + imul + "i");
        } 
        else 
        {
            System.out.println("Product is: " + rmul + " - " + (-imul) + "i");
        }

        if (idiv >= 0) 
        {
            System.out.println("Division is: " + rdiv + " + " + idiv + "i");
        } 
        else 
        {
            System.out.println("Division is: " + rdiv + " - " + (-idiv) + "i");
        }

        sc.close();
    }
}
