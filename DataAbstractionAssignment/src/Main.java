import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Customer customer = new Customer("John Smith");
        Date date = new Date();

        customer.deposit(1000, date, Customer.CHECKING, customer);

        customer.deposit(500, date, Customer.SAVING, customer);

        customer.displayDeposits();

        customer.withdraw(200, date, Customer.CHECKING, customer);

        customer.displayWithdraws();

        customer.withdraw(100000, date, Customer.SAVING, customer);


    }
}