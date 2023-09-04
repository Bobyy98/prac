import java.util.Scanner;

abstract class Shape32 {
    abstract double getPerimeter();
    abstract double getArea();
}

class Circle32 extends Shape32 {
    private double radius;

    public Circle32(double radius) {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

public class ShapeOverAbs32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Create a Circle object with the user-provided radius
        Circle32 circle = new Circle32(radius);

        // Calculate and print the perimeter and area of the circle
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Area: " + circle.getArea());

        // Close the scanner
        scanner.close();
    }
}
