// Define the Flyable interface
interface Flyable {
    void fly_obj();
}

// Implement the Flyable interface in the Spacecraft class
class Spacecraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Spacecraft is flying through space.");
    }
}

// Implement the Flyable interface in the Airplane class
class Airplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Airplane is flying through the air.");
    }
}

// Implement the Flyable interface in the Helicopter class
class Helicopter implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Helicopter is flying in the sky.");
    }
}

public class FlyableInter34 {
    public static void main(String[] args) {
        // Create instances of the Spacecraft, Airplane, and Helicopter classes
        Spacecraft spacecraft = new Spacecraft();
        Airplane airplane = new Airplane();
        Helicopter helicopter = new Helicopter();

        // Call the fly_obj() method on each object
        spacecraft.fly_obj();
        airplane.fly_obj();
        helicopter.fly_obj();
    }
}
