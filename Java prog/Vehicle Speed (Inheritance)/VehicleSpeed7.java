class Vehicle {
    private int speed;

    public Vehicle() {
        this.speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void speedUp() {
        System.out.println("The vehicle is speeding up.");
        speed += 10;
    }
}

class Car extends Vehicle {
    @Override
    public void speedUp() {
        System.out.println("The car is accelerating.");
        super.speedUp(); // Call the superclass (Vehicle) speedUp() method
    }
}

class Bicycle extends Vehicle {
    @Override
    public void speedUp() {
        System.out.println("The bicycle is pedaling faster.");
        super.speedUp(); // Call the superclass (Vehicle) speedUp() method
    }
}

public class VehicleSpeed7 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        System.out.println("Initial speeds:");
        System.out.println("Vehicle speed: " + vehicle.getSpeed());
        System.out.println("Car speed: " + car.getSpeed());
        System.out.println("Bicycle speed: " + bicycle.getSpeed());

        // Speed up each vehicle
        vehicle.speedUp();
        car.speedUp();
        bicycle.speedUp();

        System.out.println("\nUpdated speeds:");
        System.out.println("Vehicle speed: " + vehicle.getSpeed());
        System.out.println("Car speed: " + car.getSpeed());
        System.out.println("Bicycle speed: " + bicycle.getSpeed());
    }
}
