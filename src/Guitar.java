import java.util.Arrays;

/**
 * Created by Thomas Hodges on 6/25/2015.
 * CMIS 141 - Homework 3b
 * This class is for the guitar
 */
public class Guitar {

    // Constant data fields
    final int LOWE = 6;
    final int A = 5;
    final int D = 4;
    final int G = 3;
    final int B = 2;
    final int HIGHE = 1;

    // Strings and frets are represented by this array
    private String[][] frets = new String[24][6];

    // Data fields to tune the guitar
    private int pitchLowE = LOWE;
    private int pitchA = A;
    private int pitchD = D;
    private int pitchG = G;
    private int pitchB = B;
    private int pitchHighE = HIGHE;


    // No-argument constructor
    public Guitar() {
        // Creates a new grid of strings and frets
        this.frets = new String[24][6];
        // Initializes the array with blank spaces
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 6; j++) {
                if (true) this.frets[i][j] = " ";
            }
        }
    }

    // Drop tune method
    public int dropTuneLowE() {
        this.pitchLowE = 7;
        return pitchLowE;
    }

    // Lifting your fingers resets the guitar matrix
    public void lift() {
        // Blanks out all the positions with spaces
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 6; j++) {
                if (true) this.frets[i][j] = " ";
            }
        }

    }

    // Prints the A chord when called.
    // [0, 1, 2, 3, 4, 5]

    public void aChord() {
        this.frets[0][5] = "O";
        this.frets[2][4] = "X";
        this.frets[2][3] = "X";
        this.frets[2][2] = "X";
        this.frets[0][1] = "O";

        System.out.println("\nA Chord:");

        for (String[] fret : this.frets) {
            System.out.println(Arrays.toString(fret));
        }

    }

    // Prints the C chord when called.
    // [0, 1, 2, 3, 4, 5]

    public void cChord() {
        this.frets[3][1] = "X";
        this.frets[2][2] = "X";
        this.frets[0][3] = "O";
        this.frets[1][4] = "X";
        this.frets[0][5] = "O";

        System.out.println("\nC Chord:");

        for (String[] fret : this.frets) {
            System.out.println(Arrays.toString(fret));
        }

    }

    // Prints the D chord when called.
    // [0, 1, 2, 3, 4, 5]

    public void dChord() {
        this.frets[0][2] = "O";
        this.frets[2][3] = "X";
        this.frets[3][4] = "X";
        this.frets[2][5] = "X";

        System.out.println("\nD Chord:");

        for (String[] fret : this.frets) {
            System.out.println(Arrays.toString(fret));
        }
    }

    // Prints the E chord when called.
    // [0, 1, 2, 3, 4, 5]

    public void eChord() {
        this.frets[0][0] = "O";
        this.frets[2][1] = "X";
        this.frets[2][2] = "X";
        this.frets[1][3] = "X";
        this.frets[0][4] = "O";
        this.frets[0][5] = "O";

        System.out.println("\nE Chord:");

        for (String[] fret : this.frets) {
            System.out.println(Arrays.toString(fret));
        }
    }

    // Prints the G chord when called.
    // [0, 1, 2, 3, 4, 5]

    public void gChord() {
        this.frets[3][0] = "X";
        this.frets[2][1] = "X";
        this.frets[0][2] = "O";
        this.frets[0][3] = "O";
        this.frets[0][4] = "O";
        this.frets[3][5] = "X";

        System.out.println("\nG Chord:");

        for (String[] fret : this.frets) {
            System.out.println(Arrays.toString(fret));
        }
    }

    public String toString() {
        return "\nCurrent Tune:" +
                "\nLow E: \t" + this.pitchLowE +
                "\nA: \t\t" + this.pitchA +
                "\nD: \t\t" + this.pitchD +
                "\nG: \t\t" + this.pitchG +
                "\nB: \t\t" + this.pitchB +
                "\nHigh E: " + this.pitchHighE;
    }

    public void setTuned() {
        this.pitchLowE = LOWE;
        this.pitchA = A;
        this.pitchD = D;
        this.pitchG = G;
        this.pitchB = B;
        this.pitchHighE = HIGHE;
    }

    // Generated getters and setters

    public int getPitchLowE() {
        return pitchLowE;
    }

    public void setPitchLowE(int pitchLowE) {
        this.pitchLowE = pitchLowE;
    }

    public int getPitchA() {
        return pitchA;
    }

    public void setPitchA(int pitchA) {
        this.pitchA = pitchA;
    }

    public int getPitchD() {
        return pitchD;
    }

    public void setPitchD(int pitchD) {
        this.pitchD = pitchD;
    }

    public int getPitchG() {
        return pitchG;
    }

    public void setPitchG(int pitchG) {
        this.pitchG = pitchG;
    }

    public int getPitchB() {
        return pitchB;
    }

    public void setPitchB(int pitchB) {
        this.pitchB = pitchB;
    }

    public int getPitchHighE() {
        return pitchHighE;
    }

    public void setPitchHighE(int pitchHighE) {
        this.pitchHighE = pitchHighE;
    }

}
