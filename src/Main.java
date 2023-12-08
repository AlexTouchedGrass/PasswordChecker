import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int score = 0;
        boolean done = false;

        do {
            System.out.println("Please enter a password you would like to have checked.");
            boolean need12Length = get12LengthString(scan);
            if (need12Length) {
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
                System.out.println("You Failed!");
            }

            boolean doneYN = false;
            do {
                boolean YN = getYNConfirm(scan,"Would you like to play again? (Y/N)");

                if (!YN) {
                    doneYN = true;
                } else {
                    done = true;
                    doneYN = true;
                }
            } while (!doneYN); //I know this is seen as unnecessary but I feel safer with it and I don't think it impacts the code.
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

    public static boolean getYNConfirm(Scanner in, String prompt){
        boolean done = false;
        String input;
        boolean YN = false;

        System.out.println(prompt);
        do{
            input = in.nextLine();
            if(input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")){
                System.out.println("You will continue.");
                input = "YES";
                done = true;
                YN = true;
            } else if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")) {
                System.out.println("You will not continue.");
                input = "NO";
                done = true;
            }
            //in.nextLine(); //not needed rn.
        }while(!done);
        return YN;
    }
}

