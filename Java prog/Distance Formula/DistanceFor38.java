import java.util.Scanner;

public class DistanceFor38 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x1:");
        double x1 = scanner.nextDouble();

        System.out.println("Enter y1:");
        double y1 = scanner.nextDouble();

        System.out.println("Enter x2:");
        double x2 = scanner.nextDouble();

        System.out.println("Enter y2:");
        double y2 = scanner.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Distance between the points: " + distance);

        scanner.close();
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2) 
    {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        return distance;
    }
}
