package javaCodes.HomeworkCodes.Loops;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {

        Scanner newScan = new Scanner(System.in);

        System.out.println("Please enter a number");
        int userNumber = newScan.nextInt();

        System.out.println("What number do you want the multiplication table up to?");
        int maxNumber = newScan.nextInt();

        System.out.println("Multiplication table for: " + userNumber);
        System.out.println();

        for (int i = 0; i <= maxNumber; i++) {

            System.out.println(userNumber + " x " + (i) + " = " + (userNumber * i));
        }
    }
}
