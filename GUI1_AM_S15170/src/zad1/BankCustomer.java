package zad1;

public class BankCustomer {
	private Person person;
	private Account account;

	public BankCustomer(Person person) {
		this.person = person;
		Account acc = new Account();
		account = acc;

	}

	public Account getAccount() {
		return this.account;

	}

	@Override
	public String toString() {
		String s = "Client: " + person.getName() + " account balance " + account.getBalance();
		return s;
	}
}
