import java.util.Scanner;

// Define the Shape interface
interface Shape3 {
    double getArea();
}

// Implement the Rectangle class
class Rectangle10 implements Shape3 {
    private double width;
    private double height;

    public Rectangle10(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

// Implement the Circle class
class Circle10 implements Shape3 {
    private double radius;

    public Circle10(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Implement the Triangle class
class Triangle10 implements Shape3 {
    private double base;
    private double height;

    public Triangle10(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

public class ShapeAreaInter10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for shape choice
        System.out.println("Choose a shape:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        Shape3 shape = null;

        // Use a switch case to create the corresponding shape based on the user's choice
        switch (choice) {
            case 1:
                System.out.print("Enter width of the rectangle: ");
                double width = scanner.nextDouble();
                System.out.print("Enter height of the rectangle: ");
                double height = scanner.nextDouble();
                shape = new Rectangle10(width, height);
                break;
            case 2:
                System.out.print("Enter radius of the circle: ");
                double radius = scanner.nextDouble();
                shape = new Circle10(radius);
                break;
            case 3:
                System.out.print("Enter base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height of the triangle: ");
                double triangleHeight = scanner.nextDouble();
                shape = new Triangle10(base, triangleHeight);
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(1);
        }

        // Calculate and display the area of the chosen shape
        double area = shape.getArea();
        System.out.println("Area: " + area);

        scanner.close();
    }
}
