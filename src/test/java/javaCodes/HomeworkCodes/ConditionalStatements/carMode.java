package javaCodes.HomeworkCodes.ConditionalStatements;

import java.util.Scanner;

public class carMode {
    public static void main(String[] args) {

        Scanner newScan = new Scanner(System.in);

        String carMode;
        String driveType;
        String parkingType = "Parallel";

        System.out.println("what is your car mode? (P, D, N, R)");
        carMode = newScan.nextLine();

        if (carMode.equalsIgnoreCase("p") && parkingType.equalsIgnoreCase("parallel")) {
            System.out.println("You can park between two cars");

        } else if (carMode.equalsIgnoreCase("d")) {

            System.out.println("What is your drive type? (Snow, Sport, Regular)");
            driveType = newScan.nextLine();

            if (driveType.equalsIgnoreCase("snow")) {
                System.out.println("Your drive type is set to snow");

            } else if (driveType.equalsIgnoreCase("sport")) {
                System.out.println("Your drive type is set to sport");

            } else if (driveType.equalsIgnoreCase("regular")) {
                System.out.println("Your drive type is set to regular");

            } else {
                System.out.println("Select valid drive type");
            }
        } else if (carMode.equalsIgnoreCase("N")) {
            System.out.println("Please put your car in the car washer");

        } else if (carMode.equalsIgnoreCase("R")) {
            System.out.println("You're now able to reverse your car");
            System.out.println("back camera activated");

        } else {
            System.out.println("Error: the mode you selected is invalid");
        }
    }
}
