package day2_q3;



import java.util.Random;

public class Account {
private String memberName;
private String accountNumber;
private Double accountBalance;
public Account(String memberName, Double accountBalance) {
	Random rand=new Random();
	accountNumber=10000+rand.nextInt(89999)+"";
	this.memberName = memberName;
	this.accountBalance = accountBalance;
}
public void deposit(double amt) {
	accountBalance+=amt;
}

}