package exercises.chapter3;

/*
 - Enter enough change to equal exactly $1
   - ask user
     - How many pennies
     - How many nickels
     - How many dimes
     - How many quarters
   - Count up the value of all the change.
     - if its exactly $1 they win!
     - if its more than $1, tell them how much over
     - if its less than $1, tell them how much under
 */

import java.util.Scanner;

public class ChangeForADollarGame {

    public static void main(String[] args) {
        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Change for a Dollar Game!");
        System.out.println("I will ask you to enter quantities for the following coins:\n" +
                "Pennies, Nickels, Dimes, and Quarters");

        System.out.print("How many pennies? ");
        int numOfPennies = scanner.nextInt();

        System.out.print("How many Nickels? ");
        int numOfNickels = scanner.nextInt();

        System.out.print("How many Dimes? ");
        int numOfDimes = scanner.nextInt();

        System.out.print("How many Quarters? ");
        int numOfQuarters = scanner.nextInt();

        scanner.close();

        double totalChange = numOfPennies * penny + numOfNickels * nickel + numOfDimes * dime + numOfQuarters * quarter;

        if (totalChange > dollar) {
            double amountOver = totalChange - dollar;
            System.out.println("Sorry, you lose! You were over " + amountOver + " cents.");

            //Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose! You were over " + String.format("%.2f", amountOver) + " cents.");
        }
        else if (totalChange < dollar) {
            double amountUnder = dollar - totalChange;
            System.out.println("Sorry, you lose! You were short " + amountUnder + " cents.");

            //Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose! You were short " + String.format("%.2f", amountUnder) + " cents.");
        }
        else {
            System.out.println("You win!");
        }
    }

}
