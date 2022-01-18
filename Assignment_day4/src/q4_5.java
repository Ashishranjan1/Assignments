

import java.util.InputMismatchException;
import java.util.Scanner;

public class q4_5 {
	
	private static void checkNum(int num) throws Exception {
		if(num > 100) throw new Exception();
		if(num%2==0) System.out.println("You have entered an even number.");
		else System.out.println("You have entered an odd number.");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			int number=0;
			while(number!=-1) {
				System.out.println("Please enter a number or enter ‘-1’ if you want to quit.");
				number = sc.nextInt();
				if(number == -1) break;
				checkNum(number);
			}
		}
		catch(InputMismatchException e) {
			System.out.println("You must enter an integer.");
		}
		catch(Exception e) {
			System.out.println("Number can't be greater than 100.");
		}
		finally {
			sc.close();
		}
	}

}