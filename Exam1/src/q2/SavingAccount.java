package q2;

public class SavingAccount extends Account {
 float interestRate;
 
 
 
	public SavingAccount() {
	super();
}
 public SavingAccount(SavingAccount sac)
 {
	 sac.interestRate=interestRate;
 }
  
 float getInterest()
 {
	float interest = (float)((interestRate * super.getAccountBalance() / 100.0));

		return interest;
	 
 }
 
	
	public static void main(String[] args) {
	
	}

}
