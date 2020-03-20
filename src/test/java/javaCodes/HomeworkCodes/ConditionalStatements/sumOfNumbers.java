package javaCodes.HomeworkCodes.ConditionalStatements;

public class sumOfNumbers {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        int arrLength = numbers.length;
        int sum;
        int avg;

        //sum of array elements
        sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];

        //average
        avg = sum / arrLength;

        if (avg > 25) {

            System.out.println("Displaying Array from 0 to Last");
            System.out.println("Index[0]: " + numbers[0]);
            System.out.println("Index[1]: " + numbers[1]);
            System.out.println("Index[2]: " + numbers[2]);
            System.out.println("Index[3]: " + numbers[3]);
            System.out.println("Index[4]: " + numbers[4]);
        } else {
            System.out.println("Displaying Array from 0 to Last");
            System.out.println("Index[4]: " + numbers[4]);
            System.out.println("Index[3]: " + numbers[3]);
            System.out.println("Index[2]: " + numbers[2]);
            System.out.println("Index[1]: " + numbers[1]);
            System.out.println("Index[0]: " + numbers[0]);
        }
    }
}
