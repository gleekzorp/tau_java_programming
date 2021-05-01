package exercises.chapter14;

import java.util.Scanner;

//TODO: Possibly refactor to something similar to teacher solution with methods
public class CoinTossGame {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Coin coin = new Coin();
        System.out.println("Welcome to the Coin Toss Game");

        // Create two players
        System.out.println("Name for Player One?");
        Player playerOne = new Player(scanner.next());
        System.out.println("Name for Player One?");
        Player playerTwo = new Player(scanner.next());


        // Ask player 1 to choose heads or tails
        //  - Ensure its a valid guess
        //  - Automatically assign player 2's guess to opposite of player 1 guess
        String guess;
        do {
            System.out.println("Player One, Guess " + coin.getHEADS() + " or " + coin.getTAILS());
            guess = scanner.next();
        } while (!(guess.equals(coin.getHEADS()) | guess.equals(coin.getTAILS())));

        if(guess.equals(coin.getHEADS())){
            playerOne.setGuess(coin.getHEADS());
            playerTwo.setGuess(coin.getTAILS());
        } else {
            playerOne.setGuess(coin.getTAILS());
            playerTwo.setGuess(coin.getHEADS());
        }

        // Flip the coin
        coin.flip();
        System.out.println("Flipping the coin...");

        // Determine winner based on coin side
        if (coin.getSide().equals(playerOne.getGuess())){
            System.out.println(playerOne.getName() + " Guessed correctly and Wins! The coin was " + coin.getSide());
        } else {
            System.out.println(playerTwo.getName() + " Wins!  The coin was " + coin.getSide());
        }

        scanner.close();
    }
}
