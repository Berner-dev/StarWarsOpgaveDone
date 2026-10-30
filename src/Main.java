
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Jedi luke = new Jedi("Luke Skywalker", 24);
        Sith vader = new Sith("Darth Vader", 45);
        Droid r2d2 = new Droid("R2-D2", 125);
        CloneTrooper appo = new CloneTrooper("Appo", 30);
        BountyHunter boba = new BountyHunter("Boba Fett", 41);

        List<Character> characters = new ArrayList<>();

        characters.add(luke);
        characters.add(vader);
        characters.add(r2d2);
        characters.add(appo);
        characters.add(boba);

        System.out.println("=== ALL CHARACTERS ===");

        for (Character character : characters) {
            character.action();
            System.out.println();
        }

        System.out.println("=== JEDI MEDITATION ===");

        for (Character character : characters) {

            if (character instanceof Jedi) {
                ((Jedi) character).meditate();
            }
        }

        System.out.println();
        System.out.println("=== USE FORCE ===");

        luke.useForce();
        vader.useForce();

        System.out.println();
        System.out.println("=== BOUNTY HUNTER ===");

        boba.hunt();
    }
}


