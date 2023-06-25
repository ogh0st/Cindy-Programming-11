import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;
    private static int nextAvailableNum = 0;

    Customer(String name){
        this.name = name;
        nextAvailableNum++;
        this.accountNumber = nextAvailableNum;
        savingBalance = 0;
        checkBalance = 0;
        this.deposits = new ArrayList<>();
        this.withdraws = new ArrayList<>();
    }

    public double deposit(double amt, Date date, String account, Customer customer){

        //Requires: amt > 0, the date is valid, and the account is Checking or Saving
        //Modifies: The balance of either Checking of Saving accounts and the list of deposits
        //Effects: Increase the balance by a specified amount and make a new deposit object and add it to a list of deposits. Display error messages if amount is < 0 and if the account is invalid.

        if (amt > 0){
        if (account.equals(CHECKING)){
        checkBalance += amt;
        deposits.add(new Deposit(amt, date, CHECKING, customer));
        }
        else if(account.equals(SAVING)){
        savingBalance += amt;
        deposits.add(new Deposit(amt, date, SAVING, customer));
        }
        else {
            System.out.println("Invalid input. Please try again.");
        }
        }
        else {
        System.out.println("Invalid input. Please try again.");
        }
        return getBalance(account);
    }

    public double withdraw(double amt, Date date, String account, Customer customer) {

        //Requires: amt > 0, the date is valid, the account is Checking or Saving, and that the amount withdrawn is >= the overdraft
        //Modifies: The balance of either Checking of Saving accounts and the list of deposits
        //Effects: Decrease the balance by a specified amount and make a new withdraw object and add it to a list of withdrawals. Display error messages if amount is < 0, if the account is invalid, and if there are insufficient funds.

        if (amt > 0){
        if (account.equals(CHECKING)) {
            if (checkBalance - amt >= OVERDRAFT) {
                checkBalance -= amt;
                withdraws.add(new Withdraw(amt, date, CHECKING, customer));
            } else {
                System.out.println("Insufficient funds in checking account.");
            }
        }
        else if (account.equals(SAVING)) {
            if (savingBalance - amt >= OVERDRAFT) {
                savingBalance -= amt;
                withdraws.add(new Withdraw(amt, date, SAVING, customer));
            } else {
                System.out.println("Insufficient funds in saving account.");
            }
        }
        else {
            System.out.println("Invalid input. Please try again.");
        }
    }
    else {
            System.out.println("Invalid input. Please try again.");
        }
    return getBalance(account);
    }

    private boolean checkOverdraft(double amt, String account){
        if (account.equals(CHECKING)){
            if(checkBalance - amt < OVERDRAFT){
                return true;
            }
            else{
                return false;
            }
        }
        else if(account.equals(SAVING)){
            if(savingBalance - amt < OVERDRAFT){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            System.out.println("Invalid input.");
            return false;
        }
    }

    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

    public double getBalance(String account) {
        if (account.equals(CHECKING)) {
            return checkBalance;
        } else if (account.equals(SAVING)) {
            return savingBalance;
        } else {
            System.out.println("Invalid input.");
            return 0;
        }
    }


}
