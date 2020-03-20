package javaCodes.ClassworkCodes;

public class CountDown {
    public static void main(String[] args) {

        int count = 10;

        while (count >= 0) {
            System.out.println("Count " + count);
            count--;
        }

        for (int i = 10; i >= 0; i--) {
            System.out.println("Count " + i);
        }
    }
}
