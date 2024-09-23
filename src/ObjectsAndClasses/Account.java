package ObjectsAndClasses;

import static java.lang.System.*;

public class Account {

    int accountNumber;
    String accountName;
    double balance;

// no parameters
    public Account(){
        this.accountName = null;
        this.accountNumber = 0;
        this.balance = 0.0;
    }
// with account number and name
    public Account(int accountNumber, String accountName) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
// with all parameters
    public Account(int accountNumber, String accountName, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    //get methods

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getAccountName(){
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    // set methods

    public void setAccountNumber(int setAccountNumber){
        accountNumber = setAccountNumber;
    }

    public void setAccountName(String setAccountName){
        accountName = setAccountName;
    }

    public void setBalance(double setBalance){
        balance = setBalance;
    }

    // other methods
    // to deposit money on the account

    public void Deposit(double amount){
        balance += amount;
        out.println(STR."your new balance is: \{balance}");

    }
    // withdraw money on the account

    public double Withdraw(double amount) {
        if (balance < amount) {
            return -1;
        } else {
            balance -= amount;
            return amount;

        }
    }

    public String toString() {
        return "Name of the account: " + accountName + "\n Number of the account: " + accountNumber;
    }
}
