package javaCodes.ClassworkCodes;

public class Account {

    private double balance;
    private String accountId;
    private static int NEXTID = 0;
    public static final int ROUTING_NUMBER = 12345;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void displayAccountDetails() {
        System.out.println("****** Account Information ******");
        System.out.println("ID: " + accountId);
        System.out.println("Balance: " + balance);
        System.out.println("Routing Number: " + ROUTING_NUMBER);
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public static String getNextId() {
        return "ACCT# " + Account.NEXTID++;
    }

    public static String newUserID (String userInputID) {

        if (userInputID.length() < 3) {
            System.out.println("Your userid must contain at least 3 characters");
        }
        return userInputID;
    }

    public static String newUserPassword (String userInputPassword) {

        if (userInputPassword.contains(userInputPassword)) {
            System.out.println("Please try a new password, you cannot have your userid as part of your password");
        } else if (userInputPassword.length() < 8) {
            System.out.println("Please try a new password, it cannot be less than 8 characters");
        }
        return userInputPassword;
    }
}