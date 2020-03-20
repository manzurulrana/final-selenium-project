package javaCodes.HomeworkCodes.ConditionalStatements;

import java.util.Scanner;

public class divisible15 {
    public static void main(String[] args) {

        int number;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please select a number");
        number = scanner1.nextInt();

        if (number % 15 == 0) {
            System.out.println("The number you selected is divisible by 15");
        } else {
            System.out.println("The remainder when you divide the two numbers are : " + number % 15);
            System.out.println();

        }
    }
}
