package javaCodes.HomeworkCodes.ConditionalStatements;

import java.util.Scanner;

public class nameLength {
    public static void main(String[] args) {

        String myName;
        System.out.println("What is your name?");

        Scanner scan = new Scanner(System.in);
        myName = scan.nextLine();

        if (myName.length() > 8) {
            System.out.println(myName.replace('a', 'A'));

        } else System.out.println(myName.toUpperCase());
    }
}
