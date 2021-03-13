package ex1;

public class AccountRunner {

public static void main(String[] args) {

Exercise p1 = new Exercise("Smith", 20);
Account account1 = new Account(2000, p1);
Exercise p2 = new Exercise("Kathy", 30);
Account account2 = new Account(3000, p2);
account1.deposit(2000);
account2.withdraw(2000);

AccountRunner account = new AccountRunner();

SavingAccount accountSaving1 = new SavingAccount(2000, p1);
account.accountTransaction(accountSaving1);

CurrentAccount accountCurrent1 = new CurrentAccount(1000, p1);
account.accountTransaction(accountCurrent1);

}

public void accountTransaction(Account account) {
if (account instanceof SavingAccount) {
// SavingAccount accountSaving1 = (SavingAccount) account;
account.deposit(2000);

}

if (account instanceof CurrentAccount) {
CurrentAccount accountCurrent1 = (CurrentAccount) account;

accountCurrent1.withdraw(4000);
accountCurrent1.withdraw(1000);

}

}
}

