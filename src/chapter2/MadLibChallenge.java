package chapter2;

import java.util.Scanner;

public class MadLibChallenge {

    public static void main(String[] arg) {
        // 1. Ask for season of the year
        System.out.print("Pick a season of the year: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        // 2. Ask for a whole number
        System.out.print("Pick a whole number: ");
        int number = scanner.nextInt();

        // 3. Ask for an adjective
        System.out.print("Pick an Adjective: ");
        String adjective = scanner.next();
        scanner.close();

        // 4. Display the madlib
        System.out.println("One a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee");
    }

}
