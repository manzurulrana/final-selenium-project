package javaCodes.ClassworkCodes;

public class MonthsCode {
    public static void main(String[] args) {

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};

        for (String month : months) {

            boolean isDecember = month.equalsIgnoreCase("december");

            if (isDecember) {
                System.out.println(month + " is here");
                break;
            } else {
                System.out.println("Try again");
                break;
            }
        }
    }
}
