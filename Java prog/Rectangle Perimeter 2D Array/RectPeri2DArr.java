import java.util.Scanner;

public class RectPeri2DArr16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the coordinates of four points
        double[][] points = new double[4][2];
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter x-coordinate for point " + (i + 1) + ": ");
            points[i][0] = scanner.nextDouble();
            System.out.print("Enter y-coordinate for point " + (i + 1) + ": ");
            points[i][1] = scanner.nextDouble();
        }

        // Calculate the perimeter of the rectangle
        double perimeter = calculateRectanglePerimeter(points);

        // Display the result
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        scanner.close();
    }

    public static double calculateRectanglePerimeter(double[][] points) {
        // Check if the given points form a valid rectangle
        if (!isValidRectangle(points)) {
            System.out.println("Invalid input. The given points do not form a rectangle.");
            return 0.0;
        }

        // Calculate the side lengths of the rectangle
        double side1 = distanceBetweenPoints(points[0], points[1]);
        double side2 = distanceBetweenPoints(points[1], points[2]);

        // Calculate the perimeter
        double perimeter = 2 * (side1 + side2);
        return perimeter;
    }

    public static boolean isValidRectangle(double[][] points) {
        // Check if the given points form a rectangle by checking angles between sides
        for (int i = 0; i < 4; i++) {
            double[] current = points[i];
            double[] next1 = points[(i + 1) % 4];
            double[] next2 = points[(i + 2) % 4];

            double dotProduct = (next1[0] - current[0]) * (next2[0] - current[0]) +
                                (next1[1] - current[1]) * (next2[1] - current[1]);

            if (dotProduct != 0.0) {
                return false; // Angles between sides are not 90 degrees
            }
        }

        return true;
    }

    public static double distanceBetweenPoints(double[] point1, double[] point2) {
        double dx = point1[0] - point2[0];
        double dy = point1[1] - point2[1];
        return Math.sqrt(dx * dx + dy * dy);
    }
}
