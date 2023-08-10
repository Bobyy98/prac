import java.util.Scanner;

class meth 
{
    double r1, r2, i1, i2;

    void add() 
    {
        double rsum = r1 + r2;
        double isum = i1 + i2;
        if(isum >= 0)
        {
            System.out.println("\nSum is " + rsum + " + " + isum + "i");
        }
        else
        {
            System.out.println("Sum is " + rsum + " - " + (-isum) + "i");
        }
    }

    void sub()
    {
        double rsub = r1 - r2;
        double isub = i1 - i2;
        if(isub >= 0)
        {
            System.out.println("Difference is " + rsub + " + " + isub + "i");
        }
        else
        {
            System.out.println("Difference is " + rsub + " - " + (-isub) + "i");
        }
    }

    void mul()
    {
        double rmul = r1 * r2 - i1 * i2;
        double imul = r1 * r2 + i1 * i2;
        if(imul >= 0)
        {
            System.out.println("Product is " + rmul + " + " + imul + "i");
        }
        else
        {
            System.out.println("Product is " + rmul + " - " + (-imul) + "i");
        }
    }

    void div()
    {
        double den = r2 * r2 + i2 * i2;
        double rdiv = (r1 * r2 + i1 * i2) / den;
        double idiv = (i1 * i2 - r1 * r2) / den;
        if(idiv >= 0)
        {
            System.out.println("Sum is " + rdiv + " + " + idiv + "i");
        }
        else
        {
            System.out.println("Sum is " + rdiv + " - " + (-idiv) + "i");
        }
    }
}

public class ComplexNoCalcVar2 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        meth ComplexCalc = new meth(); 

        System.out.println("Enter real and imaginary parts for number 1: ");
        ComplexCalc.r1 = scanner.nextDouble();
        ComplexCalc.i1 = scanner.nextDouble();

        System.out.println("Enter real and imaginary parts for number 2: ");
        ComplexCalc.r2 = scanner.nextDouble();
        ComplexCalc.i2 = scanner.nextDouble();

        ComplexCalc.add();
        ComplexCalc.sub();
        ComplexCalc.mul();
        ComplexCalc.div();

        scanner.close();
    }
}
