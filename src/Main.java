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
            }
        } while (!done);
        return done;
    }

    public static boolean containsUppercase(Scanner in) {
        boolean done = false;
        String input;

        System.out.println("Checking for at least one uppercase letter.");
        do {
            input = in.nextLine();
            if (input.matches(".*[A-Z].*")) {
                done = true;
            }
        } while (!done);
        return done;
    }

    public static boolean containsLowercase(Scanner in) {
        boolean done = false;
        String input;

        System.out.println("Checking for at least one lowercase letter.");
        do {
            input = in.nextLine();
            if (input.matches(".*[a-z].*")) {
                done = true;
            }
        } while (!done);
        return done;
    }

    public static boolean containsNumber(Scanner in) {
        boolean done = false;
        String input;

        System.out.println("Checking for at least one number [0-9].");
        do {
            input = in.nextLine();
            if (input.matches(".*[0-9].*")) {
                done = true;
            }
        } while (!done);
        return done;
    }

    public static boolean containsSpecialCharacter(Scanner in) {
        boolean done = false;
        String input;

        System.out.println("Checking for at least one special character [!#$%].");
        do {
            input = in.nextLine();
            if (input.matches(".*[!#$%].*")) {
                done = true;
            }
        } while (!done);
        return done;
    }

    public static boolean getYNConfirm(Scanner in, String prompt) {
        boolean done = false;
        String input;
        boolean YN = false;

        System.out.println(prompt);
        do {
            input = in.nextLine();
            if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
                System.out.println("You will continue.");
                input = "YES";
                done = true;
                YN = true;
            } else if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")) {
                System.out.println("You will not continue.");
                input = "NO";
                done = true;
            }
        } while (!done);
        return YN;
    }
}
