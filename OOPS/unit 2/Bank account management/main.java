import java.util.Scanner;
interface BankOperations {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}
abstract class Account {
    protected int accountNumber;
    protected double balance;
    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber; 
        this.balance = balance;
    }
    abstract void accountType();
}
class Customer {
    private String name;
    private String city;
    Customer() {
        name = "Unknown";
        city = "Not Provided";
    }
    Customer(String name, String city) {
        this.name = name;
        this.city = city;
    }
    void showCustomer() {
        System.out.println("Customer Name : " + name);
        System.out.println("City          : " + city);
    }
}
class SavingsAccount extends Account implements BankOperations {

    private Customer customer;
    SavingsAccount(int accNo, double bal, Customer customer) {
        super(accNo, bal);  
        this.customer = customer;
    }

    void accountType() {
        System.out.println("Account Type  : Savings Account");
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited Successfully!");
    }

    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    void showDetails() {
        System.out.println(" ACCOUNT DETAILS");
        customer.showCustomer();
        System.out.println("Account Number: " + accountNumber);
        accountType();
        checkBalance();
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        Customer c1 = new Customer(name, city);
        SavingsAccount acc = new SavingsAccount(accNo, bal, c1);

        int choice;
        do {
            System.out.println("\n1.Show 2.Deposit 3.Withdraw 4.Balance 5.Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1: acc.showDetails(); break;
                case 2:
                    System.out.print("Amount: ");
                    acc.deposit(sc.nextDouble());
                    break;
                case 3:
                    System.out.print("Amount: ");
                    acc.withdraw(sc.nextDouble());
                    break;
                case 4: acc.checkBalance(); break;
                case 5: System.out.println("Thank You"); break;
                default: System.out.println("Invalid Choice");
            }

        } while(choice != 5);
    }
}
