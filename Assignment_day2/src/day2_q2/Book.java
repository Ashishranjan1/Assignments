package day2_q2;

public class Book {
	private String bookTitle;
	private String author;
	private String isbn;
	private int numOfCopies;
	public Book(String bookTitle, String author, String isbn, int numOfCopies) {
		this.bookTitle = bookTitle;
		this.author = author;
		this.isbn = isbn;
		this.numOfCopies = numOfCopies;
	}
	public void display() {
		System.out.println("Title : "+bookTitle);
		System.out.println("Author : "+author);
		System.out.println("ISBN : "+isbn);
		System.out.println("Number Of copies : "+numOfCopies);
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public String getIsbn() {
		return isbn;
	}
	public int getNumOfCopies() {
		return numOfCopies;
	}
	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}
}