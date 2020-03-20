package javaCodes.ClassworkCodes;

public class IntArray {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.println("Element: " + numbers[i]);
            sum = sum + numbers[i];
        } System.out.println("the sum is: " + sum);
    }
}
