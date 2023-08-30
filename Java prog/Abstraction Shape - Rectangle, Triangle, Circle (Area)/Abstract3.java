import java.util.Scanner;

abstract class Shape
{
    public abstract double calculateArea();
}

class Rectangle3 extends Shape
{
    public double length;
    public double breadth;

    public Rectangle3(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea()
    {
        return length * breadth;
    }
}

class Triangle3 extends Shape
{
    public double base;
    public double height;

    public Triangle3(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea()
    {
        return 0.5 * base * height;
    }
}

class Circle3 extends Shape
{
    public double radius;

    public Circle3(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double calculateArea()
    {
        return Math.PI * radius * radius;
    }
}

public class Abstract3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and breadth of rectangle: ");
        double rectLength = sc.nextDouble();
        double rectBreadth = sc.nextDouble();
        Shape rect = new Rectangle3(rectLength, rectBreadth);

        System.out.println("Enter base and height of triangle: ");
        double triangle3Base = sc.nextDouble();
        double triangle3Height = sc.nextDouble();
        Shape triangle3 = new Triangle3(triangle3Base, triangle3Height);

        System.out.print("Enter radius of circle: ");
        double circle3Radius = sc.nextDouble();
        Shape circle3 = new Circle3(circle3Radius);

        System.out.println("Area of Rectangle: " + rect.calculateArea());
        System.out.println("Area of Triangle: " + triangle3.calculateArea());
        System.out.println("Area of Circle: " + circle3.calculateArea());

        sc.close();
    }
}
