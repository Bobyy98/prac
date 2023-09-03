// Abstract class Person
abstract class Person9 {
    // Abstract method eat()
    public abstract void eat();

    // Abstract method exercise()
    public abstract void exercise();
}

// Subclass Athlete
class Athlete extends Person9 {
    @Override
    public void eat() {
        System.out.println("An athlete eats a balanced diet with lots of protein.");
    }

    @Override
    public void exercise() {
        System.out.println("An athlete exercises rigorously, including strength training and cardio workouts.");
    }
}

// Subclass LazyPerson
class LazyPerson extends Person9 {
    @Override
    public void eat() {
        System.out.println("A lazy person often eats unhealthy fast food and snacks.");
    }

    @Override
    public void exercise() {
        System.out.println("A lazy person rarely exercises and prefers a sedentary lifestyle.");
    }
}

public class PersonAthLazyAbsIn9 {
    public static void main(String[] args) {
        // Create an Athlete and a LazyPerson
        Athlete athlete = new Athlete();
        LazyPerson lazyPerson = new LazyPerson();

        // Describe how each person eats and exercises
        System.out.println("Athlete:");
        athlete.eat();
        athlete.exercise();

        System.out.println("\nLazy Person:");
        lazyPerson.eat();
        lazyPerson.exercise();
    }
}
