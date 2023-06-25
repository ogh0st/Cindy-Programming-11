import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;

    private Customer customer;

    Withdraw(double amount, Date date, String account, Customer customer){
        this.amount = amount;
        this.date = date;
        this.account = account;
        this.customer = customer;
    }

    public String toString(){
        //Requires: None
        //Modifies: None
        //Effects: Returns a string that represents the withdrawal, including the amount, date, account, and the balance after withdrawal
        double balance = customer.getBalance(account);
        return "Withdraw:\n" + "Withdrawal of: " + amount + " Date: " + date + " from account: " + account + "\nCurrent balance in " + account + " is: $" + balance;
    }
}
