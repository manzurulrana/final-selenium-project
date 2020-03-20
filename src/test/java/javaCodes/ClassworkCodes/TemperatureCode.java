package javaCodes.ClassworkCodes;

import java.util.Scanner;

public class TemperatureCode {
    public static void main(String[] args) {

        int temp;

        Scanner newScan = new Scanner(System.in);

        System.out.println("what is the temperature outside?");
        temp = newScan.nextInt();

        if (temp <= 32) {
            System.out.println("It is freezing outside!!");
        } else if (temp >= 100) {
            System.out.println("It is hot outside");
        } else {
            System.out.println("Go for it, it is pretty outside");
        }
    }
}
