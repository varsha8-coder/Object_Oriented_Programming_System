import java.util.*;
class InsBalEx extends Exception {
public InsBalEx(String msg) {
super(msg);
}
}
class Acc<T> {
private T accNo;
private String n;
private double bal;
public Acc(T accNo, String n, double bal) {
this.accNo = accNo;
this.n = n;
this.bal = bal;
}
public T getAccNo() {
return accNo;
}
public double getBal() {
return bal;
}
public void dep(double amt) {
bal += amt;
System.out.println("Dep: " + amt);
}
public void wit(double amt) throws InsBalEx {
if (amt >bal) {
throw new InsBalEx("Low bal!");
}
bal -= amt;
System.out.println("Wit: " + amt);
}
public void show() {
System.out.println("No: " + accNo + ", Name: " + n + ", Bal: " + bal);
}
}
class Bank {
private Map<Object, Acc<?>>accs = new HashMap<>();
public void add(Acc<?> a) {
accs.put(a.getAccNo(), a);
}
public Acc<?>get(Object no) {
return accs.get(no);
}
public void showAll() {
for (Acc<?>a :accs.values()) {
a.show();
}
}
}
public class BankingSystem {
public static void main(String[] args) {
Bank b = new Bank();
Acc<Integer> a1 = new Acc<>(101, "Alice", 5000);
Acc<String> a2 = new Acc<>("A202", "Bob", 3000);
b.add(a1);
b.add(a2);
try {
a1.dep(1000);
a1.wit(2000);
a1.wit(10000);
} catch (InsBalEx e) {
System.out.println("Err: " + e.getMessage());
}
b.showAll();
}
}
class CurrentAccount extends BankAccount {
CurrentAccount(String accountNumber, String accountHolderName, double balance)
{ super(accountNumber, accountHolderName, balance);
}
void deposit(double amount) { if(amount
<= 0){
System.out.println("Invalid deposit amount");
} else {
balance += amount;
System.out.printf("Deposit Successful. Updated Balance: $%.2f\n", balance);
}
}
void withdraw(double amount) { if(amount
<= 0 || amount >balance){
System.out.println("Invalid withdrawal");
} else {
balance -= amount;
System.out.printf("Withdrawal Successful. Updated Balance: $%.2f\n", balance);
}
}
void displayInfo() {
System.out.println("Account Type: Current Account");
System.out.println("Account Number: " + accountNumber);
System.out.println("Account Holder: " + accountHolderName);
System.out.printf("Balance: $%.2f\n", balance);
}
}
public class Main { public static void
main(String[] args) {
Scanner S = new Scanner(System.in);
System.out.println("Enter account type (1 for Savings, 2 for Current):"); int
d = S.nextInt();
S.nextLine();
System.out.println("Enter account number:");
String accountNumber = S.nextLine();
System.out.println("Enter account holder name:");
String accountHolder = S.nextLine();
System.out.println("Enter balance:");
double balance = S.nextDouble();
BankAccount A;
if(d == 1){
A = new SavingsAccount(accountNumber,accountHolder, balance);
} else {
A = new CurrentAccount(accountNumber,accountHolder,balance);
}
A.displayInfo();
System.out.println("\nEnter deposit amount:");
doubledepositAmount = S.nextDouble();
A.deposit(depositAmount);
System.out.println("\nEnter withdrawal amount:");
doublewithdrawAmount = S.nextDouble();
A.withdraw(withdrawAmount);
}
System.out.println("\nUpdated Account Details:");
A.displayInfo();
}