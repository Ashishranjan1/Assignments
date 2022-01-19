package q2;

public class Account {

	Owner owner;
	 private float Balance;
	 private String number;
	 
	 
	public Account() {
		super();
	}

	public Account(Owner owner, float balance, String number) {
		super();
		this.owner = owner;
		Balance = balance;
		this.number = number;
	}
	public Account(Account ac)
	{
		ac.owner=owner;
		ac.Balance=Balance;
		ac.number=number;
	}
	

	@Override
	public String toString() {
		return "Account [owner=" + owner + ", Balance=" + Balance + ", number=" + number + "]";
	}
	
	public void withDraw(float amt) {
			this.Balance = (this.Balance - amt);
			System.out.println("amt " + amt + " has been withdrawn");
		
	}

	public void deposit(float amt) {
		this.Balance += amt;
	}
	protected double getAccountBalance() {
		return Balance;
	}
	public static void main(String[] args) {
	 

	}

}
