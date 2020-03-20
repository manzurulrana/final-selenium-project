package javaCodes.HomeworkCodes.ConditionalStatements;

import java.util.Scanner;

public class veganMenu {
    public static void main(String[] args) {

        Scanner newScan = new Scanner(System.in);

        boolean isGuestOneVegan;
        boolean isGuesttwoVegan;

        System.out.println("Hello Guest 1, are you vegan? (True or False)");
        isGuestOneVegan = newScan.nextBoolean();

        System.out.println("Hello Guest 1, are you vegan? (True or False)");
        isGuesttwoVegan = newScan.nextBoolean();

        if (isGuestOneVegan && isGuesttwoVegan) {
            System.out.println("Here is the vegan menu");

        } else if (isGuestOneVegan || isGuesttwoVegan) {
            System.out.println("Here is the vegan menu for the vegan guest");

        } else {
            System.out.println("Here is the rest of the menu");
        }
    }
}
