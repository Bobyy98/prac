import java.util.Scanner;

// Abstract Shape class
abstract class Shape24 {
    // Abstract method to calculate the area
    public abstract double calculateArea();
}

// Circle subclass
class Circle24 extends Shape24 {
    private double radius;

    public Circle24(double radius) {
        this.radius = radius;
    }

    // Implementation of calculateArea() for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle subclass
class Rectangle24 extends Shape24 {
    private double length;
    private double width;

    public Rectangle24(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of calculateArea() for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class ShapeAbsPoly24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();

        System.out.print("Enter the length of the rectangle: ");
        double rectangleLength = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double rectangleWidth = scanner.nextDouble();

        // Create instances of Circle and Rectangle
        Circle24 circle = new Circle24(circleRadius);
        Rectangle24 rectangle = new Rectangle24(rectangleLength, rectangleWidth);

        // Close the scanner
        scanner.close();

        // Demonstrate polymorphism by calling calculateArea() on both objects
        Shape24 shape1 = circle;
        Shape24 shape2 = rectangle;

        System.out.println("Area of Circle: " + shape1.calculateArea());
        System.out.println("Area of Rectangle: " + shape2.calculateArea());
    }
}
