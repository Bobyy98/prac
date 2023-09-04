import java.util.Scanner;

// Shape interface
interface Shape30 {
    double calculateArea();
    void displayInfo();
}

// Circle class implementing Shape
class Circle30 implements Shape30, CloneableShape {
    private double radius;

    public Circle30(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("Circle: Radius = " + radius);
        System.out.println("Area = " + calculateArea());
    }

    @Override
    public Circle30 cloneShape() {
        return new Circle30(this.radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

// Rectangle class implementing Shape
class Rectangle30 implements Shape30, CloneableShape {
    private double width;
    private double height;

    public Rectangle30(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void displayInfo() {
        System.out.println("Rectangle: Width = " + width + ", Height = " + height);
        System.out.println("Area = " + calculateArea());
    }

    @Override
    public Rectangle30 cloneShape() {
        return new Rectangle30(this.width, this.height);
    }

    public void setDimensions(double width, double height) {
        this.width = width;
        this.height = height;
    }
}

// CloneableShape interface
interface CloneableShape extends Shape30 {
    Shape30 cloneShape();
}

// Main class
public class ShapeCloneInter30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user inputs for Circle dimensions
        System.out.print("Enter the radius of the Circle: ");
        double circleRadius = scanner.nextDouble();

        // Take user inputs for Rectangle dimensions
        System.out.print("Enter the width of the Rectangle: ");
        double rectangleWidth = scanner.nextDouble();
        System.out.print("Enter the height of the Rectangle: ");
        double rectangleHeight = scanner.nextDouble();

        // Create instances of Circle and Rectangle with user inputs
        Circle30 originalCircle = new Circle30(circleRadius);
        Rectangle30 originalRectangle = new Rectangle30(rectangleWidth, rectangleHeight);

        // Display information about the original shapes
        System.out.println("Original Shapes:");
        originalCircle.displayInfo();
        originalRectangle.displayInfo();

        // Clone the shapes
        Circle30 clonedCircle = (Circle30) originalCircle.cloneShape();
        Rectangle30 clonedRectangle = (Rectangle30) originalRectangle.cloneShape();

        // Modify cloned shapes
        System.out.print("Enter the new radius of the Circle: ");
        double newCircleRadius = scanner.nextDouble();
        clonedCircle.setRadius(newCircleRadius);

        System.out.print("Enter the new width of the Rectangle: ");
        double newRectangleWidth = scanner.nextDouble();
        System.out.print("Enter the new height of the Rectangle: ");
        double newRectangleHeight = scanner.nextDouble();
        clonedRectangle.setDimensions(newRectangleWidth, newRectangleHeight);

        // Display information about the cloned shapes
        System.out.println("\nCloned Shapes:");
        clonedCircle.displayInfo();
        clonedRectangle.displayInfo();

        scanner.close();
    }
}
