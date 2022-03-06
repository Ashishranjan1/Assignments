package inputDate;

import com.Date;

import validation.ValidateNumberOfDays;

public class Main {
	
	public static void main(String[] args) {
		
		Date d=new Date(31,5,2022);
		System.out.println(d);
		System.out.println(ValidateNumberOfDays.tester.checkNumberOfDaysToBEeAdded(28));
		
	}

}
