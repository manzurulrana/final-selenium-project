package javaCodes.ClassworkCodes;

import java.util.Scanner;

public class TriangleCode {
    public static void main(String[] args) {

        int base;
        int height;
        int area;

        Scanner newScan = new Scanner(System.in);

        System.out.println("We are finding the area of a triangle");

        System.out.println("Enter the value of the base");
        base = newScan.nextInt();

        System.out.println("Enter the value of the height");
        height = newScan.nextInt();

        area = (base * height)/2;
        System.out.println("The area of the triangle is " + area);

    }
}
