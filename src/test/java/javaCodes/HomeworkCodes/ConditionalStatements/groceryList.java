package javaCodes.HomeworkCodes.ConditionalStatements;

import java.util.Scanner;

public class groceryList {
    public static void main(String[] args) {

        String [] groceryList = {"milk", "eggs", "donuts", "french fries", "frozen pizza", "candy",
                "diapers", "apple", "orange"};

        Scanner newScan = new Scanner(System.in);
        System.out.println("Welcome to the Kwik-E-Mart");
        System.out.println("What grocery item would you like to know information about?");
        String userInput = newScan.nextLine();

        if (userInput.equalsIgnoreCase("milk") || userInput.equalsIgnoreCase("eggs")
                || userInput.equalsIgnoreCase("Donuts")) {
            System.out.println("Please check Aisle Eight");

        } else if (userInput.equalsIgnoreCase("french fries")
                || userInput.equalsIgnoreCase("frozen pizza")) {
            System.out.println("Please check Aisle Seven");

        } else if (userInput.equalsIgnoreCase("candy")) {
            System.out.println("Please check Aisle Three");

        } else if (userInput.equalsIgnoreCase("diapers")) {
            System.out.println("Please check Aisle One");

        } else if (userInput.equalsIgnoreCase("apple")
                || userInput.equalsIgnoreCase("orange")) {
            System.out.println("Please check Aisle Two");

        } else {
            System.out.println("Error: Please enter valid item");
        }
    }
}
