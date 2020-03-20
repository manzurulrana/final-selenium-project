package javaCodes.ClassworkCodes;

import java.util.Arrays;

public class JavaMidterm {

    //Write a Java program to remove a specific element from an array.

    public String removeElement(int[] userArray, int removeIndex) {

        String message = "";

        System.out.println("Original Array: " + Arrays.toString(userArray));

        for(int i = removeIndex; i < userArray.length -1; i++) {

            userArray[i] = userArray[i];

        } message = "After removing the second element: "+ Arrays.toString(userArray); {

            return message;
        }
    }

    //Create a method to return missing smallest positive integer (greater than 0) from given array.

    public int missingInteger(int[] myArray) {

        int maxNum = myArray[0];
        int minNum = myArray[0];

        for (int i = 1; i < myArray.length; i++) {

            if (myArray[i] > maxNum) {
                maxNum = myArray[i];
            }
            else if (myArray[i] < minNum) {
                minNum = myArray[i];
            }
        }
        return minNum;
    }

    //Scenario: Traffic ticketing system
    public String licensePointCalculator(int speedLimit, int userSpeed) {

        int milesOver = userSpeed - speedLimit;
        int licensePoints = Math.floorDiv(milesOver,5);
        String message = "";

        if (userSpeed < speedLimit) {
            message = "You're driving below the speed limit, please increase speed for better traffic flow.";
        } else if (licensePoints < 1) {
            message = "Your current speed limit of: " + userSpeed + " is within the legal speed limit";
        } else if (licensePoints >= 1 && licensePoints < 12) {
            message = "You have a total of " + licensePoints + " points.";
        } else if (licensePoints >= 12) {
            message = "You have reached: " + licensePoints + " points. Your license will be suspended.";
        }
        return message;
    }
}