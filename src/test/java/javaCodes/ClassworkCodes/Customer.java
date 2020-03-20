package javaCodes.ClassworkCodes;

/**
 * Homework:
 * 1. When opening account, customer must enter userID (Minimum 3 characters long,
 *    It cannot be one that which is already taken from userIDs list);
 * 2. User must select password which must follow following:
 *    A. Minimum 8 character long - (check second)
 *    B. Alpha Numeric
 *    c. Must not contain username (check first)
 * 3. Once account is created and initial balance is set, user should be able to withdraw
 *    Money from their account: (Note: They cannot withdraw more than what they have in the account
 *    For Example: If the balance is $300, they should not be allowed to withdraw anything greater than $300)
 * 4. Set Account creation date
 * 5. User should be able to delete an account
 */

public class Customer {

    private String firstName;
    private String lastName;
    private Account account;
    private String[] userIDs;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addAccount(double initialBalance) {
        account = new Account();
        account.setAccountId(Account.getNextId());
        account.deposit(initialBalance);
        customerDetails();
    }

    private void customerDetails() {
        account.displayAccountDetails();
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }
}