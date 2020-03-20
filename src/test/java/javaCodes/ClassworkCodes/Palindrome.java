package javaCodes.ClassworkCodes;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner newScan = new Scanner(System.in);

        System.out.println("Type in a word");
        String palindrome = newScan.nextLine();

        String reversePalindrome = "";
        char [] strArr = palindrome.toCharArray();

        for (int i = strArr.length - 1; i >= 0; i--) {

            reversePalindrome = reversePalindrome + strArr[i];

        }if (palindrome.equals(reversePalindrome)) {

            System.out.println("This is a palindrome");

        } else
            System.out.println("This word is not a palindrome");
    }
}
