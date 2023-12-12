import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean done = false;

        do {
            int score = 0;
            System.out.println("Please enter a password you would like to have checked.");

            if (get12LengthString(scan)) {
                score++;
            }

            if (containsUppercase(scan)) {
                score++;
            }

            if (containsLowercase(scan)) {
                score++;
            }

            if (containsNumber(scan)) {
                score++;
            }

            if (containsSpecialCharacter(scan)) {
                score++;
            }

            System.out.println("Your score is " + score + ".");

            if (score >= 4) {
                System.out.println("Great Score! Your password is strong.");
            } else if (score == 3) {
                System.out.println("Good Score! Your password is of medium strength.");
            } else {
                System.out.println("Weak Score! Your password is weak.");
            }

            boolean doneYN = false;
            do {
                boolean YN = getYNConfirm(scan, "Would you like to check another password? (Y/N)");

                if (!YN) {
                    doneYN = true;
                    done = true;
                } else {
                    doneYN = true;
                }
            } while (!doneYN);

        } while (!done);
    }

    // FUNCTIONS
    public static boolean get12LengthString(Scanner in) {
        boolean done = false;
        String input;

        System.out.println();
        do {
            input = in.nextLine();
            if (input.length() >= 12) {
                done = true;
     
