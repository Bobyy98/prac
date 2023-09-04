class Vehicle22 {
    private String make;
    private String model;

    public Vehicle22(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}

class Car22 extends Vehicle22 {
    private int year;

    public Car22(String make, String model, int year) {
        super(make, model);
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}

public class VehicleCarInherit22 {
    public static void main(String[] args) {
        Car22 myCar = new Car22("Toyota", "Camry", 2023);

        System.out.println("Car Make: " + myCar.getMake());
        System.out.println("Car Model: " + myCar.getModel());
        System.out.println("Car Year: " + myCar.getYear());
    }
}
