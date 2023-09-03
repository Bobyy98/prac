import java.util.Scanner;

abstract class Shape3D {
    abstract double calculateVolume();
    abstract double calculateSurfaceArea();
}

class Sphere extends Shape3D {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

class Cube extends Shape3D {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    double calculateVolume() {
        return Math.pow(side, 3);
    }

    @Override
    double calculateSurfaceArea() {
        return 6 * Math.pow(side, 2);
    }
}

public class Shape3DAbsIn3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double sphereRadius = scanner.nextDouble();

        System.out.print("Enter the side length of the cube: ");
        double cubeSide = scanner.nextDouble();

        Sphere sphere = new Sphere(sphereRadius);
        Cube cube = new Cube(cubeSide);

        System.out.println("\nSphere:");
        System.out.println("Volume: " + sphere.calculateVolume());
        System.out.println("Surface Area: " + sphere.calculateSurfaceArea());

        System.out.println("\nCube:");
        System.out.println("Volume: " + cube.calculateVolume());
        System.out.println("Surface Area: " + cube.calculateSurfaceArea());

        scanner.close();
    }
}
