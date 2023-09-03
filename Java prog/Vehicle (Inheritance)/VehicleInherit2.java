import java.util.Scanner;

class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    // Method to calculate fuel efficiency (in miles per gallon)
    public double calculateFuelEfficiency() {
        // Implement your logic here to calculate fuel efficiency
        // Placeholder value, replace with actual calculation
        return 25.0; // Example: 25 miles per gallon
    }

    // Method to calculate distance traveled (in miles) given fuel efficiency and fuel consumed
    public double calculateDistanceTraveled(double fuelConsumed) {
        // Implement your logic here to calculate distance traveled
        // Placeholder value, replace with actual calculation
        return fuelConsumed * calculateFuelEfficiency();
    }

    // Method to calculate maximum speed (in miles per hour)
    public int calculateMaximumSpeed() {
        // Implement your logic here to calculate maximum speed
        // Placeholder value, replace with actual calculation
        return 120; // Example: 120 mph
    }
}

// Other vehicle subclasses (Truck, Car, Motorcycle) can be added similarly

public class VehicleInherit2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter vehicle details:");
        System.out.print("Make: ");
        String make = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Fuel Type: ");
        String fuelType = scanner.nextLine();

        Vehicle vehicle = new Vehicle(make, model, year, fuelType);

        // Example usage of methods
        double fuelEfficiency = vehicle.calculateFuelEfficiency();
        double distanceTraveled = vehicle.calculateDistanceTraveled(100.0); // Assume 100 gallons of fuel consumed
        int maxSpeed = vehicle.calculateMaximumSpeed();

        System.out.println("\nVehicle Details:");
        System.out.println("Make: " + vehicle.getMake());
        System.out.println("Model: " + vehicle.getModel());
        System.out.println("Year: " + vehicle.getYear());
        System.out.println("Fuel Type: " + vehicle.getFuelType());

        System.out.println("\nFuel Efficiency: " + fuelEfficiency + " mpg");
        System.out.println("Distance Traveled: " + distanceTraveled + " miles");
        System.out.println("Maximum Speed: " + maxSpeed + " mph");

        scanner.close();
    }
}
