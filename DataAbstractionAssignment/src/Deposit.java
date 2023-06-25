import java.util.Date;

public class Deposit {
    private double amount;
    private Date date;
    private String account;

    private Customer customer;

    Deposit(double amount, Date date, String account, Customer customer){
        this.amount = amount;
        this.date = date;
        this.account = account;
        this.customer = customer;
    }

    public String toString() {
        //Requires: None
        //Modifies: None
        //Effects: Returns a string that represents the deposit, including the amount, date, account, and the balance after the deposit
        double balance = customer.getBalance(account);
        return "Deposit: \n" + "Deposit of: $" + this.amount + " Date: " + this.date + " into account: " + account + "\nCurrent balance in " + this.account + " is: $" + balance;
    }
    }

