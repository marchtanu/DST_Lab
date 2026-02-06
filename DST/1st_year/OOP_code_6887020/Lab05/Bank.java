import java.util.ArrayList;
import java.util.List;
//Name: Tanuphat Sojindamanee
//ID: 6887020
//Section: 1
public class Bank {
  // 1.variable
  private ArrayList<BankAccount> accounts;
  // 2.constructor
  public Bank() {
    accounts = new ArrayList<BankAccount>();
  }
  // 3.methods
  // add an account to this bank
  public void addAccount(BankAccount a) {
    accounts.add(a);
  }
  // gets the sum of the balances of all accounts in this bank
  public double getTotalBalance() {
    double total = 0;
    // **************** YOUR CODE HERE****************
    for (int i = 0; i < accounts.size(); i++) {
      total += accounts.get(i).getBalance();
    }
    return total;
    // *********************************************
  }
  // counts the number of bank account whose balance is at least given value.
  public int countBalanceAtLeast(double atLeast) {
    int counter = 0;
    // **************** YOUR CODE HERE****************
    for (int i = 0; i < accounts.size(); i++) {
      if (accounts.get(i).getBalance() > atLeast) {
        counter++;
      }
    }
    return counter;
    // *********************************************
  }
  // finds a bank account with a given number
  public BankAccount find(int accountNumber) {
    // **************** YOUR CODE HERE****************
    for (int i = 0; i < accounts.size(); i++) {
      if (accounts.get(i).getAccountNumber() == accountNumber) {
        return accounts.get(i);
      }
    }
    return null;
    // *********************************************
  }
  // gets the bank account with the largest balance.
  public BankAccount getMax() {
    int maxIndex = 0;
    // **************** YOUR CODE HERE****************
    for (int i = 1; i < accounts.size(); i++) {
      if (accounts.get(i).getBalance() == accounts.get(maxIndex).getBalance()) {
        return null;
      }
      if (accounts.get(i).getBalance() > accounts.get(maxIndex).getBalance()) {
        maxIndex = i;
      }
    }
    return accounts.get(maxIndex);
    // *********************************************
  }
  // gets the bank account with the minimum balance.
  public BankAccount getMin() {
    int minIndex = 0;
    // **************** YOUR CODE HERE****************
    for (int i = 1; i < accounts.size(); i++) {
      if (accounts.get(i).getBalance() == accounts.get(minIndex).getBalance()) {
        return null;
      }
      if (accounts.get(i).getBalance() < accounts.get(minIndex).getBalance()) {
        minIndex = i;
      }
    }
    return accounts.get(minIndex);
    // *********************************************
  }
}