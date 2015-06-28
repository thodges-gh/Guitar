/**
 * Created by Thomas Hodges on 6/25/2015.
 * CMIS 141 - Homework 3b
 * This program allows the display of guitar
 * chords and tuning from the Guitar class.
 */
public class TestGuitar {

    public static void main(String[] args) {

        System.out.println("=====Test 1=====");

        /// Test 1
        // Creates a new Guitar object
        Guitar gitty = new Guitar();
        // Fingers are off the strings to start
        gitty.lift();
        // Plays the G chord
        gitty.gChord();
        // Lifts the fingers
        gitty.lift();
        // Drop-tune Low E changes the pitch
        gitty.dropTuneLowE();
        // Displays the tune settings
        System.out.println(gitty.toString());
        // Resets the pitch of each string to default
        gitty.setTuned();
        // Displays the tune settings
        System.out.println(gitty.toString());

        System.out.println("\n=====Test 2=====");

        /// Test 2
        // Creates another guitar
        Guitar gitty2 = new Guitar();
        // Displays the tune
        System.out.println(gitty2.toString());
        // Plays the E chord
        gitty2.eChord();
        // Lifts fingers
        gitty2.lift();
        // Plays the G chord
        gitty2.gChord();

        System.out.println("\n=====Test 3=====");

        /// Test 3
        // Creates another guitar
        Guitar gitty3 = new Guitar();
        // Start off with a drop tune
        gitty3.dropTuneLowE();
        // Prints tune settings
        System.out.println(gitty3.toString());
        // Plays the C chord;
        gitty3.cChord();

        System.out.println("\n=====Test 4=====");

        /// Test 4
        // Creates yet another guitar
        Guitar gitty4 = new Guitar();
        // Play with the tune settings
        gitty4.setPitchLowE(9);
        gitty4.setPitchA(4);
        gitty4.setPitchD(8);
        gitty4.setPitchG(2);
        gitty4.setPitchB(5);
        gitty4.setPitchHighE(5);
        // Display tune settings
        System.out.println(gitty4.toString());
        // Now let's fix that
        gitty4.setTuned();
        // And verify
        System.out.println(gitty4.toString());

        System.out.println("\n=====Test 5=====");

        /// Test 5
        // Creates one last guitar
        Guitar gitty5 = new Guitar();
        // Let's just start playing
        gitty5.aChord();
        gitty5.dChord();
        // Now to manually use the getter methods
        System.out.println(
                "\nLow E: " + gitty5.getPitchLowE() +
                "\nA: " + gitty5.getPitchA() +
                "\nD: " + gitty5.getPitchD() +
                "\nG: " + gitty5.getPitchG() +
                "\nB: " + gitty5.getPitchB() +
                "\nHigh E: " + gitty5.getPitchHighE()
        );
    }
}
