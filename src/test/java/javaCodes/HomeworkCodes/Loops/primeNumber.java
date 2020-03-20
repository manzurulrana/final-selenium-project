package javaCodes.HomeworkCodes.Loops;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {

        int inputNumber;
        boolean truePrime = true;

        System.out.println("Enter a number");
        Scanner newScan = new Scanner(System.in);
        inputNumber = newScan.nextInt();

        for (int x = 2; x < inputNumber; x++) {
            if (inputNumber % x == 0) {
                truePrime = false;
                break;
            }
        }
        if (truePrime == true) {
            System.out.println(inputNumber + " is a prime number.");
        } else {
            System.out.println(inputNumber + " is not a prime number");
        }
    }
}