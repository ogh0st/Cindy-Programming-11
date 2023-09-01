import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

import java.util.ArrayList;
import java.util.Date;

public class tests {

    Customer customer;
    Date date = new Date();
    Withdraw withdraw;
    Deposit deposit;

    @Before
    public void setUp(){
        customer = new Customer("Guy");
        deposit = new Deposit(100, date, Customer.CHECKING, customer);
        withdraw = new Withdraw(10, date, Customer.CHECKING, customer);

    }
    @Test
    public void testWithdrawalToString(){

        customer.deposit(100, date, Customer.CHECKING, customer);
        customer.withdraw(10, date, Customer.CHECKING, customer);
        String expectedOutput = "Withdraw:\n" + "Withdrawal of: 10.0 Date: " + date + " from account: Checking\n" + "Current balance in Checking is: $90.0";
        String actualOutput = withdraw.toString();
        Assert.assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void testDepositToString(){
        customer.deposit(100, date, Customer.CHECKING, customer);
        String expectedOutput = "Deposit: \n" + "Deposit of: $100.0 Date: " + date + " into account: Checking\n" + "Current balance in Checking is: $100.0";
        String actualOutput = deposit.toString();
        Assert.assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void testDeposit(){
        Double expectedOutput = 100.0;
        Double actualOutput = customer.deposit(100, date, Customer.CHECKING, customer);
        Assert.assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void testWithdrawal() {
        customer.deposit(200, date, Customer.CHECKING, customer);
        Double expectedOutput = 100.0;
        Double actualOutput = customer.withdraw(100, date, Customer.CHECKING, customer);
        Assert.assertEquals(expectedOutput, actualOutput);
    }






}
