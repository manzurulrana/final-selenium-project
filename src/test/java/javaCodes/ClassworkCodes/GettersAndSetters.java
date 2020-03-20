package javaCodes.ClassworkCodes;

public class GettersAndSetters {

    private String name = "";
    private int age;
    private double income;
    private double expense;
    private double balance;


    public void printSummary() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Income: " + income);
        System.out.println("Expense: " + expense);
        System.out.println("Account Balance: " + balance);
    }

    public double getAccountBalance() {
        double balance = income - expense;
        return balance;
    }

    public void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setExpense(double expense) {
        this.expense = this.expense + expense;
    }

    public void setIncome (double income) {
        this.income = this.income + income;
    }



}

