package exercises.chapter8;

import java.util.Scanner;

// TODO:  Refactor to try and use OOP like the teacher solution

public class PasswordValidator {

    public static void main(String[] args){
        int MIN_PASSWORD_LENGTH = 8;
        String CURRENT_USERNAME = "test";
        String CURRENT_PASSWORD = "123456A!";

        boolean valid = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Password Validator.");
        System.out.println("Current Username: " + CURRENT_USERNAME);
        System.out.println("Current Password: " + CURRENT_PASSWORD);

        while(!valid){
            valid = true;
            System.out.println("Supply a new password");
            String newPassword = scanner.next();
            if(!checkPasswordLength(newPassword, MIN_PASSWORD_LENGTH)){
                valid = false;
                System.out.println("Your password must be at least " + MIN_PASSWORD_LENGTH + " characters.");
            }

            if(!checkPasswordContainsUpperCase(newPassword)){
                valid = false;
                System.out.println("Your password must include an uppercase letter.");
            }

            if(!checkPasswordContainsSpecialCharacter(newPassword)){
                valid = false;
                System.out.println("Your password must include a special character.");
            }

            if(checkPasswordContainsUsername(newPassword, CURRENT_USERNAME)){
                valid = false;
                System.out.println("Your password must not include your username");
            }

            if(checkPasswordContainsOldPassword(newPassword, CURRENT_PASSWORD)){
                valid = false;
                System.out.println("Your password must not include your previous password");
            }
        }


//        while(!valid){
//            System.out.println("Supply a new password");
//            String newPassword = scanner.next();
//            if (checkPasswordLength(newPassword, MIN_PASSWORD_LENGTH)
//                    && checkPasswordContainsUpperCase(newPassword)
//                    && checkPasswordContainsSpecialCharacter(newPassword)
//                    && !checkPasswordContainsUsername(newPassword, CURRENT_USERNAME)
//                    && !checkPasswordContainsOldPassword(newPassword, CURRENT_PASSWORD)) {
//                valid = true;
//            }
//        }

        scanner.close();
    }

    public static boolean checkPasswordLength(String password, int minLength){
        return password.length() >= minLength;
    }

    public static boolean checkPasswordContainsUpperCase(String password){
        for(int i=0; i<password.length(); i++){
            if(Character.isUpperCase(password.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static boolean checkPasswordContainsSpecialCharacter(String password){
        return !password.matches("[a-zA-Z0-9 ]*");
    }

    public static boolean checkPasswordContainsUsername(String password, String username){
        return password.toLowerCase().contains(username.toLowerCase());
    }

    public static boolean checkPasswordContainsOldPassword(String password, String oldPassword){
        return password.contains(oldPassword);
    }
}
