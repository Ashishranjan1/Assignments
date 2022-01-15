package day2_q2;

import java.util.Scanner;

public class MainClass {
	private static BookStore raj = new BookStore();

	public static void menue() {
		int opt;
		Scanner scn = new Scanner(System.in);
		while (true) {
			
			System.out.println("Enter “1”, to display the Books: Title – Author – ISBN - Quantity.\n"
					+ "Enter “2”, to order new books.\n" + "Enter “3”, to sell books.\n"
					+ "Enter “0”, to exit the system");
			opt = scn.nextInt();
			switch (opt) {
			case 1:
				raj.display();
				break;
			case 2:
				String isbn;
				int qty;
				System.out.println("Enter ISBN:");
				isbn = scn.next();
				System.out.println("Enter QTY:");
				qty = scn.nextInt();
				raj.order(isbn, qty);
				break;
			case 3:
				String title;
				int qt;
				System.out.println("Enter Title:");
				title = scn.next();
				System.out.println("Enter QTY:");
				qt = scn.nextInt();
				raj.sell(title, qt);
				break;
			case 0:
				scn.close();
				System.exit(0);
			}
		}
	}

	public static void main(String args[]) {

		menue();

	}

}