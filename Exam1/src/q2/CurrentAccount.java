package q2;

public class CurrentAccount extends Account {
  float minBalance;
  
	public CurrentAccount() {
	super();
}
	public CurrentAccount(CurrentAccount sac)
	 {
		 sac.minBalance=minBalance;
	 }
    
	  
	 float getCharges()
	 {
		return minBalance;
		 
		
	 }
	public float getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(float minBalance) {
		this.minBalance = minBalance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
