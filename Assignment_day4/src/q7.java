

import java.io.IOException;
import java.util.Scanner;

import day4_q6.InputException;

public class q7 {
	
	public static void throwException() throws IOException,InputException {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num>100) throw new InputException(100);
		else throw new IOException();
	}

	public static void main(String[] args) {
		try {
			throwException();
		}
		catch(IOException e) {
			System.out.println(e.getStackTrace());
		}
		catch(InputException e) {
			System.out.println(e.getMessage());
		}
	}

}