package day6_q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class BookSortingTitleAuthor implements Comparator<Book> {
	@Override
	public int compare(Book b1, Book b2) {
		int val = (b1.getTitle().toLowerCase()).compareTo(b2.getTitle().toLowerCase());
		if (val == 0) {
			val = (b1.getAuthor().toLowerCase()).compareTo(b2.getAuthor().toLowerCase());
		}
		return val;
	}
}

public class BookCollection {
	private String ownerName;
	private ArrayList<Book> books;

	public BookCollection(String ownerName, ArrayList<Book> bookArray) {
		super();
		this.ownerName = ownerName;
		this.books = bookArray;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BookCollection [ownerName=").append(ownerName).append(", books=").append(books).append("]");
		return builder.toString();
	}

	public boolean hasBook(Book b) {
		boolean bool = false;
		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(b.getTitle()) && book.getAuthor().equalsIgnoreCase(b.getAuthor())) {
				bool = true;
				break;
			}
		}
		return bool;
	}

	public void sort() {
		Collections.sort(books, new BookSortingTitleAuthor());
		System.out.println("----Sorted book list----");
		for(Book book: books) {
			System.out.println(book);
		}
	}
}