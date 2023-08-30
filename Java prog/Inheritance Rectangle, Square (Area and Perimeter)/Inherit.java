import java.util.Scanner;

class Rectangle
{
    public double length;
    public double breadth;
;
    public Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public double Area()
    {
        return length * breadth;
    }

    public double Perimeter()
    {
        return 2 * (length + breadth);
    }
}

class Square extends Rectangle
{
    public Square(double side)
    {
        super(side, side);
    }
}

public class Inherit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double b = sc.nextDouble();

        System.out.print("Enter side of square: ");
        double s = sc.nextDouble();


        Rectangle rect = new Rectangle(l, b);
        Square sq = new Square(s);

        System.out.println("Area of Rectangle: " + rect.Area());
        System.out.println("Perimeter of Rectangle: " + rect.Perimeter());
        
        System.out.println("Area of Square: " + sq.Area());
        System.out.println("Perimeter of Square: " + sq.Perimeter());

        sc.close();
    }
}
