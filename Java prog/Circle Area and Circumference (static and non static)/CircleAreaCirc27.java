import java.util.Scanner;

public class CircleAreaCirc27
{
    private double radius;

    public CircleAreaCirc27(double radius)
    {
        this.radius = radius;
    }

    public double calcArea()
    {
        return Math.PI * radius * radius;
    }

    public static double calcCirc(double radius)
    {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        CircleAreaCirc27 circle = new CircleAreaCirc27(radius);

        double area = circle.calcArea();
        System.out.println("Area of the circle: " + area);

        double circ = CircleAreaCirc27.calcCirc(radius);
        System.out.println("Circumference of the circle: " + circ);

        sc.close();
    }
}
