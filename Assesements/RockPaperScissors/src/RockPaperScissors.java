import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int maximumRounds = 10;
        int minimumRounds = 1;

        while(true) {
            try {
                System.out.println("How many rounds do you want to play? (1-10)");
                int numOfRounds = Integer.parseInt(scanner.nextLine());
                if (numOfRounds < minimumRounds || numOfRounds > maximumRounds){
                    System.out.println("Incorrect rounds entered! Enter between 1-10");
                    break;
                }
                Game(numOfRounds);
                break;

            } catch (NumberFormatException e) {
                System.out.println("Please enter a number!");
            }
        }



        }

    public  static void Game(int numOfRounds){
        Scanner scanner = new Scanner(System.in);
        int userWins = 0;
        int computerWins = 0;
        int ties = 0;
        int roundCounter =0;
        String overallWinner = "";

        while (roundCounter < numOfRounds) {

            System.out.println("Input 1 (Rock), 2 (Paper) or 3 (Scissors)");
            int userInput = scanner.nextInt();
            scanner.nextLine();

            if (userInput < 1 || userInput > 3) {
                System.out.println("Incorrect Input! Game Over");
                break;
            }
            String userMove = assignMove(userInput);

            Random rand = new Random();
            int randomMove = rand.nextInt() + 1;
            String computerMove = assignMove(randomMove);

            System.out.println(describeMoves(userMove, "User"));
            System.out.println(describeMoves(computerMove, "Computer"));

            if (userMove.equals(computerMove)) {
                System.out.println("It's a tie!");
                ties++;
            } else if (userWins(userMove, computerMove)) {
                System.out.println("User wins!");
                userWins++;
            } else {
                System.out.println("Computer wins!");
                computerWins++;
            }

            System.out.println("Number of ties: " + ties);
            System.out.println("Number of Computer Wins: " + computerWins);
            System.out.println("Number of User Wins: " + userWins);
            roundCounter++;
        }

        overallWinner = userWins == computerWins ? "NO ONE! IT'S A TIE!" : userWins > computerWins ? "USER!": "COMPUTER!";

        System.out.println("After " + numOfRounds + " exciting rounds, we have a winner!\n The winner is .... \n" + overallWinner);

        System.out.println("Do you want to play again? Type Yes or No");

        String playAgain = scanner.nextLine();

        restartGame(playAgain);

    }

    public static void restartGame(String playAgain){
        Scanner scanner = new Scanner(System.in);
        if(playAgain.equals("Yes")){
            System.out.println("How many rounds do you want to play? Please input a number 1-10");
           int numOfRounds = scanner.nextInt();
            Game(numOfRounds);
        }else if (playAgain.equals("No")){
            System.out.println("Thanks for playing!");
        }
    }



    public static String describeMoves(String moveChoice, String player){
        return moveChoice.equals("rock") ? player + " chose Rock" : moveChoice.equals("paper") ? player + " chose Paper":  player + " chose Scissors";
    }
    public static String assignMove(int num) {

        if (num == 1) {
            return "rock";
        } else if (num == 2) {
            return "paper";
        } else {
            return "scissors";
        }

    }

    static boolean userWins(String userMove, String computerMove) {
        if (userMove.equals("paper")) {
            return computerMove.equals("rock");
        } else if (userMove.equals("rock")) {
            return computerMove.equals("scissors");
        } else {
            return computerMove.equals("paper");
        }
    }
}