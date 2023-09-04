// Base class
class Animal25 {
    protected String species;

    public Animal25(String species) {
        this.species = species;
    }

    public void makeSound() {
        System.out.println("The " + species + " makes a generic sound.");
    }
}

// Subclass of Animal
class Mammal25 extends Animal25 {
    private int numberOfLegs;

    public Mammal25(String species, int numberOfLegs) {
        super(species);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}

// Subclass of Mammal
class Dog extends Mammal25 {
    private String breed;

    public Dog(String species, int numberOfLegs, String breed) {
        super(species, numberOfLegs);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("The " + breed + " dog barks.");
    }

    public String getBreed() {
        return breed;
    }
}

public class AnimalSubMultiInherit25 {
    public static void main(String[] args) {
        // Creating instances of Animal, Mammal, and Dog
        Animal25 genericAnimal = new Animal25("Generic Animal");
        Mammal25 horse = new Mammal25("Horse", 4);
        Dog goldenRetriever = new Dog("Dog", 4, "Golden Retriever");

        // Demonstrating method overriding
        genericAnimal.makeSound(); // Output: The Generic Animal makes a generic sound.
        horse.makeSound();         // Output: The Horse makes a generic sound.
        goldenRetriever.makeSound(); // Output: The Golden Retriever dog barks.

        // Accessing attributes of Mammal and Dog
        System.out.println(horse.getNumberOfLegs());       // Output: 4
        System.out.println(goldenRetriever.getNumberOfLegs()); // Output: 4
        System.out.println(goldenRetriever.getBreed());        // Output: Golden Retriever
    }
}
