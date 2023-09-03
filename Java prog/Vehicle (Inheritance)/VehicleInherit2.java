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

    public double calculateFuelEfficiency() {
        // Implement fuel efficiency calculation logic for a generic vehicle
        return 0.0;
    }

    public double calculateDistanceTraveled(double fuelConsumed) {
        // Implement distance traveled calculation logic for a generic vehicle
        return 0.0;
    }

    public int calculateMaxSpeed() {
        // Implement max speed calculation logic for a generic vehicle
        return 0;
    }
}

class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(String make, String model, int year, String fuelType, double cargoCapacity) {
        super(make, model, year, fuelType);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public double calculateFuelEfficiency() {
        // Implement fuel efficiency calculation logic for a truck
        return 5.0; // Example value in miles per gallon (MPG)
    }

    @Override
    public int calculateMaxSpeed() {
        // Implement max speed calculation logic for a truck
        return 80; // Example value in miles per hour (MPH)
    }
}

class Car extends Vehicle {
    private int passengerCapacity;

    public Car(String make, String model, int year, String fuelType, int passengerCapacity) {
        super(make, model, year, fuelType);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public double calculateFuelEfficiency() {
        // Implement fuel efficiency calculation logic for a car
        return 25.0; // Example value in MPG
    }

    @Override
    public int calculateMaxSpeed() {
        // Implement max speed calculation logic for a car
        return 120; // Example value in MPH
    }
}

class Motorcycle extends Vehicle {
    private boolean hasHelmet;

    public Motorcycle(String make, String model, int year, String fuelType, boolean hasHelmet) {
        super(make, model, year, fuelType);
        this.hasHelmet = hasHelmet;
    }

    public boolean hasHelmet() {
        return hasHelmet;
    }

    @Override
    public double calculateFuelEfficiency() {
        // Implement fuel efficiency calculation logic for a motorcycle
        return 50.0; // Example value in MPG
    }

    @Override
    public int calculateMaxSpeed() {
        // Implement max speed calculation logic for a motorcycle
        return 150; // Example value in MPH
    }
}

public class VehicleInherit2 {
    public static void main(String[] args) {
        // Example usage of the Vehicle hierarchy
        Truck truck = new Truck("Ford", "F-150", 2022, "Diesel", 2000.0);
        Car car = new Car("Toyota", "Camry", 2022, "Gasoline", 5);
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR600RR", 2022, "Gasoline", true);

        System.out.println("Truck Make: " + truck.getMake());
        System.out.println("Truck Fuel Efficiency: " + truck.calculateFuelEfficiency() + " MPG");
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Max Speed: " + car.calculateMaxSpeed() + " MPH");
        System.out.println("Motorcycle Year: " + motorcycle.getYear());
        System.out.println("Motorcycle Has Helmet: " + motorcycle.hasHelmet());
    }
}
