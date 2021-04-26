package exercises.chapter7;

import java.util.Scanner;

public class DayOfTheWeek {

    private static final String[] DAYS_OF_THE_WEEK_ARRAY = {
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public static void main(String[] args){
        System.out.println("Give me a number between 1 and 7 and I will tell you the day of the week, " +
                "assuming the week starts on Monday: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        scanner.close();
        System.out.println(DAYS_OF_THE_WEEK_ARRAY[number - 1]);
    }
}
