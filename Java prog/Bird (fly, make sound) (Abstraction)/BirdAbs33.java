// Abstract Bird class
abstract class Bird {
    // Abstract method for flying
    abstract void fly();

    // Abstract method for making a sound
    abstract void makeSound();
}

// Concrete Eagle class
class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle soars high in the sky.");
    }

    @Override
    void makeSound() {
        System.out.println("Eagle screeches loudly.");
    }
}

// Concrete Hawk class
class Hawk extends Bird {
    @Override
    void fly() {
        System.out.println("Hawk glides gracefully in the air.");
    }

    @Override
    void makeSound() {
        System.out.println("Hawk makes a sharp cry.");
    }
}

public class BirdAbs33 {
    public static void main(String[] args) {
        // Create an Eagle and demonstrate its behavior
        Bird eagle = new Eagle();
        System.out.println("Eagle Behavior:");
        eagle.fly();
        eagle.makeSound();

        // Create a Hawk and demonstrate its behavior
        Bird hawk = new Hawk();
        System.out.println("\nHawk Behavior:");
        hawk.fly();
        hawk.makeSound();
    }
}
