package javaCodes.ClassworkCodes;

public class TimeOfDay {
    public static void main(String[] args) {

        int hour = 0500;

        if (hour >= 0600 && hour < 1200) {
        System.out.println("Good Morning");
        } else if (hour >=1200 && hour < 1800) {
        System.out.println("Good Evening");
        } else System.out.println("Good Night");

    }
}
