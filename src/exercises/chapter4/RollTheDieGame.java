package exercises.chapter4;

import java.util.Random;

// Roll the die
// advance the user that number of spaces
// after each roll tell user how many spaces
// repeat 5 rolls in total
// if > 20 or < 20 they lose
// message like "You advanced to space 22" is a bug

public class RollTheDieGame {

    public static void main(String[] arg) {
        int maxTurns = 5;
        int spaceOnBoard = 0;
        int winningSpaceOnBoard = 20;
        Random random = new Random();

        System.out.println("The objective of this game is to travel the entire game board of "
        + winningSpaceOnBoard + " spaces within " + maxTurns + " die rolls");
        System.out.println("If you go over or under you lose!  You only win if you hit " + winningSpaceOnBoard + "\n");

        for (int i = 1; i <= maxTurns; i++) {
            int die = random.nextInt(6) + 1;
            spaceOnBoard = spaceOnBoard + die;

            System.out.println("Roll #" + i + " You rolled a " + die);
            if (spaceOnBoard <= winningSpaceOnBoard) {
                System.out.println("This puts you at space #" + spaceOnBoard + " on the board");
                if (spaceOnBoard == winningSpaceOnBoard) {
                    System.out.println("You win!");
                    break;
                }
                System.out.println("You have " + (winningSpaceOnBoard - spaceOnBoard) + " more to go\n");
                if (i == maxTurns) {
                    System.out.println("Sorry, you ran out of turns");
                    System.out.println("You Lose!");
                }
            }
            else {
                int numberPassed = spaceOnBoard - winningSpaceOnBoard;
                System.out.println("This puts you " + numberPassed + " spaces passed the winning space of "
                        + winningSpaceOnBoard);
                System.out.println("You Lose!");
                break;
            }
        }
    }
}
