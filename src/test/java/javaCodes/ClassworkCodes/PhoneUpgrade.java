package javaCodes.ClassworkCodes;

import java.util.Scanner;

public class PhoneUpgrade {
    public static void main(String[] args) {

        int checkingAccount;
        int iPhoneInventory = 10;
        int aCustomerCreditScore;

        Scanner newScan = new Scanner(System.in);

        System.out.println("How much money do you have in your checking account?");
        checkingAccount = newScan.nextInt();

        System.out.println("what is your credit score?");
        aCustomerCreditScore = newScan.nextInt();

        if (checkingAccount >= 1000 && iPhoneInventory > 0) {
            System.out.println("You can go to store and purchase the iPhone");
        } else if (aCustomerCreditScore >= 600 || checkingAccount >= 1000) {
            System.out.println("You're eligible to purchase the iPhone");
        } else {
            System.out.println("you're not eligible");
        }
    }
}
