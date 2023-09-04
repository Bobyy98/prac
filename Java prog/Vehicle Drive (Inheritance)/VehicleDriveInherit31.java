// Parent class
class Vehicle31 {
    // Method to drive the vehicle
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

// Subclass
class Car31 extends Vehicle31 {
    // Override the drive() method to specify car behavior
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}

public class VehicleDriveInherit31 {
    public static void main(String[] args) {
        // Create an instance of the Vehicle class
        Vehicle31 vehicle = new Vehicle31();
        
        // Create an instance of the Car class
        Car31 car = new Car31();
        
        // Call the drive() method on the Vehicle object
        vehicle.drive(); // Output: Driving a vehicle
        
        // Call the drive() method on the Car object
        car.drive(); // Output: Repairing a car
    }
}
