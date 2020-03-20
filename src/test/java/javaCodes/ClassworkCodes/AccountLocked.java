package javaCodes.ClassworkCodes;

public class AccountLocked {
    public static void main(String[] args) {

        boolean isAccountlocked = false;
        String userRole = "User";

        if (isAccountlocked == true) {
            System.out.println("Account is locked");
        } else if (userRole.equals("admin")) {
            System.out.println("Welcome Admin User");
        } else {
            System.out.println("Welcome to account");

        }
    }
}
