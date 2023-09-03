import java.util.Scanner;

abstract class GeometricFigure13 {
    protected int dimension;

    public GeometricFigure13(int dimension) {
        this.dimension = dimension;
    }

    public abstract double area();

    public abstract void magnify(double scale);
}

class Point13 extends GeometricFigure13 {
    private int x;
    private int y;

    public Point13(int x, int y) {
        super(0);
        this.x = x;
        this.y = y;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public void magnify(double scale) {
        // No effect on a point when magnified
    }
}

class Ellipse13 extends GeometricFigure13 {
    private int a;
    private int b;

    public Ellipse13(int a, int b) {
        super(2);
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return Math.PI * a * b;
    }

    @Override
    public void magnify(double scale) {
        this.a *= scale;
        this.b *= scale;
    }
}

class Circle13 extends Ellipse13 {
    public Circle13(int radius) {
        super(radius, radius);
    }
}

class Rectangle13 extends GeometricFigure13 {
    private int length;
    private int width;

    public Rectangle13(int length, int width) {
        super(2);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void magnify(double scale) {
        this.length *= scale;
        this.width *= scale;
    }
}

class Square13 extends Rectangle13 {
    public Square13(int side) {
        super(side, side);
    }
}

public class GeometricFigureMagnifyAbsIn13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a geometric figure:");
        System.out.println("1. Point");
        System.out.println("2. Ellipse");
        System.out.println("3. Circle");
        System.out.println("4. Rectangle");
        System.out.println("5. Square");
        int choice = scanner.nextInt();

        GeometricFigure13 figure = null;

        switch (choice) {
            case 1:
                System.out.print("Enter x coordinate for Point: ");
                int x = scanner.nextInt();
                System.out.print("Enter y coordinate for Point: ");
                int y = scanner.nextInt();
                figure = new Point13(x, y);
                break;
            case 2:
                System.out.print("Enter major axis (a) for Ellipse: ");
                int a = scanner.nextInt();
                System.out.print("Enter minor axis (b) for Ellipse: ");
                int b = scanner.nextInt();
                figure = new Ellipse13(a, b);
                break;
            case 3:
                System.out.print("Enter radius for Circle: ");
                int radius = scanner.nextInt();
                figure = new Circle13(radius);
                break;
            case 4:
                System.out.print("Enter length for Rectangle: ");
                int length = scanner.nextInt();
                System.out.print("Enter width for Rectangle: ");
                int width = scanner.nextInt();
                figure = new Rectangle13(length, width);
                break;
            case 5:
                System.out.print("Enter side length for Square: ");
                int side = scanner.nextInt();
                figure = new Square13(side);
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        System.out.println("Area of the selected figure: " + figure.area());

        System.out.print("Enter the magnification scale: ");
        double scale = scanner.nextDouble();
        figure.magnify(scale);

        System.out.println("Magnified Area of the figure: " + figure.area());

        scanner.close();
    }
}
