import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int score = 0;
        boolean done = false;

        do {
            System.out.println("Please enter a password you would like to have checked.");
            boolean need12Length = get12LengthString();
            if (need12Length = true) {
                score++;
            }

            if () {

            }

            if () {

            }

            if () {

            }

            if () {

            }

            if (score > 4) {
                System.out.println("Your score is " + score + ".");
                System.out.println("Great Score!");
            } else if (score == 3) {
                System.out.println("Your score is " + score + ".");
                System.out.println("Good Score!");
            } else if (score == 2) {
                System.out.println("Your score is " + score + ".");
                System.out.println("Okay Score!");
            } else if (score == 1) {
                System.out.println("Your score is " + score + ".");
                System.out.println("Poor Score!");
            } else {
                System.out.println("Your score is " + score + ".");
                System.out.println("Try again!");
            }
        } while (!done);
    }





    //FUNCTIONS
    public static boolean get12LengthString(Scanner in){
        boolean done = false;
        String input;

        System.out.println();
        do{
            input = in.nextLine();
            if(input.length() > 12){
                done = true;
            }
            // in.nextLine(); // could be use for buffer
        }while(!done);
        return done;
    }
}

