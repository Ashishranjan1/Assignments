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

class Bank {

}

public class q3 {

	public static void main(String[] args) {

		System.out.println("Press 1 if you wan't to form an account else press any other number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		if (n == 1) {

			System.out.println("press 1 for saving account and 2 for the current account");
			int choice = scn.nextInt();
			Account a = null;
			System.out.println("give your name");
			String memName = scn.next();
			System.out.println("give your initial balance");
			double initialBalance = scn.nextDouble();
			if (choice == 1) {
				double maxWithdrawLimit = 500;
				a = new SavingsAccount(initialBalance, memName, maxWithdrawLimit);

			} else if (choice == 2) {
				System.out.println("give your trade license number");
				String tln = scn.next();
				a = new CurrentAccount(initialBalance, memName, tln);
			}

			System.out.println("Now you can check your details");
			int ch = -1;
			do {
				ch = scn.nextInt();
				if (ch == 1) {

					System.out.println("give the amount of money you wan't to deposit");
					double dep = scn.nextDouble();
					a.setAccountBalance(a.getAccountBalance() + dep);
					System.out.println("press 1 to know the account balance and any other number to skip");
					int chh = scn.nextInt();
					if (chh == 1) {
						System.out.println("Account balance before depositing is " + (a.getAccountBalance() - dep));
						System.out.println("Account balance after depositing is " + a.getAccountBalance());
					}
				} else if (ch == 2) {

					System.out.println("Enter the amount of money you wan't to withdraw");
					double moneyToBeWithdrawn = scn.nextDouble();
					if (choice == 1) {
						SavingsAccount b = (SavingsAccount) a;
						b.withDraw(moneyToBeWithdrawn);
					} else {
						CurrentAccount b = (CurrentAccount) a;
						b.withDraw(moneyToBeWithdrawn);
					}

					System.out.println("press 1 to know the account balance and any other number to skip");
					int chh = scn.nextInt();
					if (chh == 1) {
						System.out.println("Account balance before withdrawing is "
								+ (a.getAccountBalance() + moneyToBeWithdrawn));
						System.out.println("Account balance after depositing is " + a.getAccountBalance());
					}

				} else if (ch == 3) {
					System.out.println("Your Account balance is " + a.getAccountBalance());

				} else if (ch != 0) {
					System.out.println("sorry you have pressed a wrong input ");
				}
			} while (ch != 0);
		}
	}

}