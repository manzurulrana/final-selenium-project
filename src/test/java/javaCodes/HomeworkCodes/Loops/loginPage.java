package javaCodes.HomeworkCodes.Loops;

import java.util.Scanner;

public class loginPage {

    public static String loginPage() {

        String inputID;
        String actualUserID = "rana";
        String inputPassword;
        String actualPassword = "rana";
        String invalidCredentials = "";
        String remainingAttempts = "";
        String passwordReset = "";
        String userEmail = "";
        String combineMsg = "";
        String emailSent = "";

        Scanner newScan = new Scanner(System.in);

        //Ask user to enter username
        System.out.println("Please enter your username");
        inputID = newScan.nextLine();
        //Ask user to enter password
        System.out.println("Please enter your password");
        inputPassword = newScan.nextLine();

        for (int i = 1; i < 6; i++) {

            int remaining = 5 - i;

            if ((!actualPassword.equals(inputPassword) || !actualUserID.equals(inputID)) && (remaining != 0)) {

                //printing out error message for invalid inputs
                invalidCredentials = "Please try your credentials again";

                //Notifying user of remaining attempts
                remainingAttempts = "You have " + remaining + " attempts left";

                System.out.println(combineMsg = invalidCredentials + ". " + remainingAttempts);

                //Entering login information again
                System.out.println("Please Enter your userid again");
                inputID = newScan.nextLine();
                System.out.println("Please enter your password again.");
                inputPassword = newScan.nextLine();

            } else if (remaining == 0 && !actualPassword.equals(inputPassword) || !actualUserID.equals(inputID)) {

                System.out.println("Your account will be locked out for 10 minutes, would you like to reset your password?");

                passwordReset = newScan.nextLine();

                if (passwordReset.equalsIgnoreCase("yes")) {

                    System.out.println("Enter your email address");
                    userEmail = newScan.nextLine();

                    System.out.println("An email has been sent to: " + userEmail + "." + " Please follow instructions to unlock account");

                } else if (passwordReset.equalsIgnoreCase("no")) {

                    System.out.println("Your account is locked out, please contact customer service to unlock account");
                }

            } else {
                System.out.println("Welcome to the homepage");
                break;
            }
        }
        return combineMsg;
    }
}

