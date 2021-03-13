package ex1;

import java.util.*;

public class Account {

private long accNum;
private double balance;
private Exercise person;

public long getAccNum() {
return accNum;
}

private void setAccNum() {
// this.accNum = ThreadLocalRandom.current().nextLong();
this.accNum = Math.abs(new Random().nextLong());
}

public double getBalance() {
return balance;
}

public void setBalance(double balance) {
this.balance = balance;
}

public Exercise getPerson() {
return person;
}

public void setPerson(Exercise person) {
this.person = person;
}

public void deposit(double depositAmount) {

this.balance += depositAmount;
System.out.println("Your updated balance of Account Number " + getAccNum() + " is : " + this.balance);
System.out.println();

}

public void withdraw(double withdrawAmount) {
this.balance -= withdrawAmount;
System.out.println("Your updated balance of Account Number " + getAccNum() + " is : " + this.balance);
System.out.println();

}

public Account(double balance, Exercise person) {
if (balance >= 500) {
setAccNum();
this.balance = balance;
this.person = person;

System.out.println("Account has been created! And your details are:");
System.out.println("Account Holder Name: " + getPerson().getName());
System.out.println("Account Number: " + getAccNum());
System.out.println("Account Balance: " + balance);

} else {
System.out.println("Account Declined. Minimum Balance should be Rs 500");
}
System.out.println();

}

}

class SavingAccount extends Account {

final private double minimumBalance = 500;

public SavingAccount(double balance, Exercise person) {
super(balance, person);
System.out.println("Saving Account has been created! And your details are mentioned above");

}

public void withdraw(double withdrawAmount) {
if (super.getBalance() - minimumBalance >= withdrawAmount) {

super.setBalance(super.getBalance() - withdrawAmount);
System.out.println(
"Your updated balance of Account Number " + super.getAccNum() + " is : " + super.getBalance());
System.out.println();
} else {
System.out.println("Money can not be withdrawn.");
System.out.println();

}
}

}

class CurrentAccount extends Account {
private int overdraftLimit = 5000;

public CurrentAccount(double balance, Exercise person) {
super(balance, person);
System.out.println("Current Account has been created! And your details are mentioned above");

}

public void withdraw(double withdrawAmount) {

// if (withdrawAmount <= overdraftLimit) {

if (overdraftLimit < withdrawAmount) {
System.out.println("Overdraft Limit exceeded");
} else {

overdraftLimit -= withdrawAmount;
super.setBalance(super.getBalance() - withdrawAmount);
System.out.println("Overdraft Limit Left: " + overdraftLimit);
if (overdraftLimit == 0) {
System.out.println("Overdraft Limit Reached");
}
System.out.println();

}

 }
}


