import java.util.Scanner;

// Define the Drawable interface
interface Drawable {
    void draw();
}

// Create a Circle class that implements the Drawable interface
class Circle implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
        // Add code here to draw a circle
    }
}

// Create a Rectangle class that implements the Drawable interface
class Rectangle implements Drawable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
        // Add code here to draw a rectangle
    }
}

// Create a Triangle class that implements the Drawable interface
class Triangle implements Drawable {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle with base " + base + " and height " + height);
        // Add code here to draw a triangle
    }
}

public class DrawableInter5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double rectangleWidth = scanner.nextDouble();

        System.out.print("Enter the height of the rectangle: ");
        double rectangleHeight = scanner.nextDouble();

        System.out.print("Enter the base of the triangle: ");
        double triangleBase = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double triangleHeight = scanner.nextDouble();

        // Create instances of the shapes with user input and call their draw() methods
        Circle circle = new Circle(circleRadius);
        Rectangle rectangle = new Rectangle(rectangleWidth, rectangleHeight);
        Triangle triangle = new Triangle(triangleBase, triangleHeight);

        circle.draw();
        rectangle.draw();
        triangle.draw();

        // Close the scanner
        scanner.close();
    }
}
