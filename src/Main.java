import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean done = false;

        do {
            int score = 0;
            System.out.println("Please enter a password you would like to have checked.");

            String password = scan.nextLine();  // Store the entered password

            if (get12LengthString(password)) {
                score++;
            }

            if (containsUppercase(password)) {
                score++;
            }

            if (containsLowercase(password)) {
                score++;
            }

            if (containsNumber(password)) {
                score++;
            }

            if (containsSpecialCharacter(password)) {
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
    public static boolean get12LengthString(String password) {
        return password.length() >= 12;
    }

    public static boolean containsUppercase(String password) {
        return password.matches(".*[A-Z].*");
    }

    public static boolean containsLowercase(String password) {
        return password.matches(".*[a-z].*");
    }

    public static boolean containsNumber(String password) {
        return password.matches(".*[0-9].*");
    }

    public static boolean containsSpecialCharacter(String password) {
        return password.matches(".*[!#$%].*");
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
