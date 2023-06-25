import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

import java.util.Date;

public class tests {

    private Customer customer;
    Date date;
    Withdraw withdraw;
    Deposit deposit;

    @Before
    public void setUp(){
        customer = new Customer("Guy");
        Date date = new Date();
        withdraw = new Withdraw(10, date, Customer.CHECKING,customer);
        deposit = new Deposit(100, date, Customer.CHECKING, customer);
        Assert.assertEquals(customer.getBalance(Customer.CHECKING), 0.0);

    }
    @Test
    public void testWithdrawalToString(){

        double checkBalance = 200;
        String expectedOutput = "Withdraw:\n" + "Withdrawal of: 10.0 Date: " + date + " from account: Checking\n" + "Current balance in Checking is: $190.0";
        String actualOutput = withdraw.toString();
        Assert.assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void testDepositToString(){
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
    public void testWithdrawal(){
        double checkBalance = 200;
        Double expectedOutput = 100.0;
        Double actualOutput = customer.withdraw(100,date,Customer.CHECKING, customer);
        Assert.assertEquals(expectedOutput, actualOutput);
        //Testing if you can withdraw beyond limit
        Assert.assertEquals("Insufficient funds in saving account.", customer.withdraw(10000, date, Customer.CHECKING, customer));
    }




}
