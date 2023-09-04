// Define the Playable interface
interface Playable {
    void play();
}

// Football class implementing the Playable interface
class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football");
    }
}

// Volleyball class implementing the Playable interface
class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Volleyball");
    }
}

// Basketball class implementing the Playable interface
class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Basketball");
    }
}

public class PlayableSportsInter35 {
    public static void main(String[] args) {
        // Create instances of the sports and call the play() method
        Football football = new Football();
        Volleyball volleyball = new Volleyball();
        Basketball basketball = new Basketball();

        football.play();
        volleyball.play();
        basketball.play();
    }
}
