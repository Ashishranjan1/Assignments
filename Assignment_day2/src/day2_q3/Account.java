package day2_q3;




import java.util.Random;
import java.util.Scanner;

class Account {

	private String memberName;
	private String accountNumber;
	private double accountBalance;

	protected double getAccountBalance() {
		return accountBalance;
	}

	protected void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	protected Account(double initialBalance, String memberName) {
		Random rand = new Random();
		String num = 10000 + rand.nextInt(89999) + "";
		accountNumber = num;
		this.accountBalance = initialBalance;
		this.memberName = memberName;
	}

	public void deposit(double amt) {
		this.accountBalance += amt;
	}

}

class SavingsAccount extends Account {
	double minimumBalance = 500.0;
	int interest;
	double maxWithdrawLimit;

	SavingsAccount(double initialBalance, String memName, double maxWithdrawLimit) {
		super(initialBalance, memName);
		interest = 5;
		this.maxWithdrawLimit = maxWithdrawLimit;
	}

	@Override
	protected double getAccountBalance() {
		double totalBalance = (super.getAccountBalance() + (interest * super.getAccountBalance() / 100.0));

		return totalBalance;
	}

	public void withDraw(double amt) {
		if (amt < this.maxWithdrawLimit && ((this.getAccountBalance() - amt) >= 500)) {
			this.setAccountBalance(this.getAccountBalance() - amt);
			System.out.println("amt " + amt + " has been withdrawn");
		} else {
			System.out.println("you can't withdraw from grater than your limit");
		}
	}
}

class CurrentAccount extends Account {
	String tradeLicenceNumber;

	CurrentAccount(double initialBalance, String memName, String tln) {
		super(initialBalance, memName);
		this.tradeLicenceNumber = tln;
	}

	public double getBalance() {
		return this.getAccountBalance();
	}

	public void withDraw(double amt) {
		System.out.println("amt: " + amt + " balance:" + this.getAccountBalance());
		if (amt > this.getAccountBalance()) {
			System.out.println("amt " + amt + " has been withdrawn");
			this.setAccountBalance(this.getAccountBalance() - amt);
		} else {
			System.out.println("you can't withdraw grater than your account balance");
		}
	}

}

