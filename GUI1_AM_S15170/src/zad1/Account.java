package zad1;

public class Account {
	private double balance;
	private static double interestrate;

	public Account() {
		balance = 0;
	}

	public Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double x) {
		if (x >= 0)
			this.balance += x;

	}

	public void withdraw(double x) {
		if (x >= 0 && this.getBalance() >= x && x<this.getBalance())
			this.balance -= x;

	}

	public void transfer(Account acc, double x) {
		if (x >= 0 && this.getBalance() >= x) {
			acc.balance += x;
			this.balance = this.balance - x;
		}

	}

	public static void setInterestRate(double x) {
		if (x >= 0)
			interestrate = x;

	}

	public void addInterest() {
		this.balance += this.balance * interestrate / 100;
	}

}
