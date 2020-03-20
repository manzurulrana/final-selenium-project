package javaCodes.ClassworkCodes;

import java.util.Scanner;

public class ChildOrAdult {
    public static void main(String[] args) {

        int myAge;

        Scanner newScan = new Scanner(System.in);

        System.out.println("How old are you?");
        myAge = newScan.nextInt();

        //Calculate if they are a child (True if they are age 7 or under)
        boolean isChild = myAge <= 7;

        //Calculate if they are senior (True if they are 65 or older)
        boolean isSenior = myAge >= 65;

        //Print both values
        System.out.println("You're a child: " + isChild);
        System.out.println();
        System.out.println("You're a senior: " + isSenior);

    }
}
