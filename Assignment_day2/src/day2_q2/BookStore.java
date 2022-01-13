package day2_q2;

import java.util.Scanner;

public class BookStore {
	private Book[] book=new Book[10];
	private  int noOfBooks;
	
	BookStore() {
		noOfBooks=0;
	}
	public void sell(String title,int no) {
		if(noOfBooks!=0) {
			for(int i=0;i<noOfBooks;i++) {
				if(book[i].getBookTitle().equals(title)) {
					if(book[i].getNumOfCopies()>=no) {
					book[i].setNumOfCopies(book[i].getNumOfCopies()-no);
					System.out.println("Sold Sucessfully \n Remaning Copies are :"+book[i].getNumOfCopies());
					}
					else
						System.out.println("Insufficient Copies available");
				}
				else
					System.out.println("Book Not Available");
			}
			
		}
		else
		System.out.println("No Books Available in store");
	}
	public void order(String isbn,int qty) {
		{
			int foundFlag=0;
			if(noOfBooks>0) {
			for(int i=0;i<noOfBooks;i++){
				if(book[i].getIsbn().contentEquals(isbn)) {
					foundFlag=1;
					book[i].setNumOfCopies(book[i].getNumOfCopies()+qty);
				}
			}
			}
			if(foundFlag==0 && noOfBooks<10  ) {
				System.out.println("No Books Available");
				addbook();
			}
			
		}
		
	}
	private void addbook() {
		String bookName;
		String author;
		String isbn;
		int noOfCopies;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book Title");
		bookName=sc.next();
		System.out.println("Enter Book Author");
		author=sc.next();
		System.out.println("Enter Book ISBN");
		isbn=sc.next();
		System.out.println("Enter Book Qty");
		noOfCopies=sc.nextInt();
		book[noOfBooks]=new Book(bookName,author,isbn,noOfCopies);
		noOfBooks+=1;
	}
	public void display() {
		if(noOfBooks>0) {
		for(int i=0;i<noOfBooks;i++) {
			book[i].display();
		}
		}
		else {
			System.out.println("No Books Available");
		}
	}

}

