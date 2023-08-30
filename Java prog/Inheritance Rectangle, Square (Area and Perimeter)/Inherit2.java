import java.util.Scanner;

class Rectangle1 {
    public double length;
    public double breadth;

    public Rectangle1(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double Area() {
        return length * breadth;
    }

    public double Perimeter() {
        return 2 * (length + breadth);
    }
}

class Square1 extends Rectangle1 {
    public Square1(double side) {
        super(side, side);
    }
}

public class Inherit2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double b = sc.nextDouble();

        System.out.print("Enter side of square: ");
        double s = sc.nextDouble();

        Rectangle1 rect = new Rectangle1(l, b);
        Square1 sq = new Square1(s);

        System.out.println("Area of Rectangle: " + rect.Area());
        System.out.println("Perimeter of Rectangle: " + rect.Perimeter());

        System.out.println("Area of Square: " + sq.Area());
        System.out.println("Perimeter of Square: " + sq.Perimeter());

        Square1[] squares = new Square1[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter side of square " + (i + 1) + ": ");
            double side = sc.nextDouble();
            squares[i] = new Square1(side);
            System.out.println("Area of Square " + (i + 1) + ": " + squares[i].Area());
        }

        sc.close();
    }
}
