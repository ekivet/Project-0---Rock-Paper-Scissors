import java.util.*;

public class Main {public static int[] winArray = new int[3];

    public static void main(String[] args) {


        System.out.println("Main Menu -- Rock Paper Scissors");
        System.out.print("\n");
        System.out.println("Do You Want to Play? (Write : Yes, No, Help)");


        //Scanner input = new Scanner(System.in);

        menuInput();
        playGame(winArray);



    }

    public static void menuInput() {

        Scanner menuScanner = new Scanner(System.in);
        String menuString = menuScanner.next();
        menuString = menuString.toLowerCase();


        if (menuString.equals("help")) {
            System.out.println("At the prompt, type in 'rock' 'paper' or 'scissors'");
            System.out.println("Press Enter");
            System.out.println("The computer will randomly generate it's own choice");
            System.out.println("If both values are the same, it's a tie");
            System.out.println("If you pick rock, and the computer picks scissors, you win! (Rock smashes scissors)");
            System.out.println("If you pick rock, and the computer picks paper, you lose.  (Paper covers rock)");
            System.out.println("If you pick paper, and the computer picks rock, you win!");
            System.out.println("If you pick paper, and the computer picks scissors, you lose (Scissors cut paper)");
            System.out.println("If you pick scissors, and the computer picks rock, you lose");
        }

        if (menuString.equals("no")) {
            System.out.println("Thank you please play again.");
            System.exit(0);
        }

        if (menuString.equals("yes")) {
            playGame(winArray);
        }
        else {
            System.out.println("Not a valid input");
            System.exit(0);
        }
    }

        private static void playGame(int[] winArray) {
            Random ran = new Random();
            int compInt = ran.nextInt(3);

            System.out.println("Enter");
            System.out.println("(0) for Rock");
            System.out.println("(1) for Paper");
            System.out.println("(2) for Scissors");

            Scanner gameScanner = new Scanner(System.in);
            int userInt = gameScanner.nextInt();
            if (userInt==0 && compInt==0){
                winArray[2] += 1;
                System.out.println("You both picked rock. It's a tie!");
            }
            if (userInt==1 && compInt==1){
                winArray[2] += 1;
                System.out.println("You both picked paper.  It's a tie!");
            }
            if (userInt==2 && compInt==2){
                winArray[2] += 1;
                System.out.println("You both picked scissors.  It's a tie!");
            }
            if (userInt==0 && compInt==1){
                winArray[1] += 1;
                System.out.println("Computer picked paper.  You Lose!");
            }
            if (userInt==0 && compInt==2){
                winArray[0] += 1;
                System.out.println("Computer picked scissors.  You Win!");
            }
            if (userInt==1 && compInt==0){
                winArray[0] += 1;
                System.out.println("Computer picked rock.  You Win!");
            }
            if (userInt==1 && compInt==2){
                winArray[1] += 1;
                System.out.println("Computer picked scissors.  You Lose!");
            }
            if (userInt==2 && compInt==0){
                winArray[1] += 1;
                System.out.println("Computer picked rock.  You Lose!");
            }
            if (userInt==2 && compInt==1){
                winArray[2] += 1;
                System.out.println("Computer picked paper.  You win!");
            }
            winLossCounter(winArray);
            System.out.println("\n");
            playGame(winArray);

        }


        public static void winLossCounter(int [] winLossArray){
            System.out.println("You have " + winLossArray[0] + " wins, " + winLossArray[1] + " losses, and " + winLossArray[2] + " ties.");
        }

    }















