package demo;
import java.awt.print.Book;
import java.util.LinkedList;

public class library
{
	private String libraryname;
	private LinkedList<Book>book;
	
	public library(String libraryName)
	{
		this.libraryname=libraryName;
		this.book=new LinkedList<Book>();
		
	}
	public void addnewBook(Book p)
	{
		book.add(p);
		
	}
	public void printlibraryDetails()
	{
		System.out.println("..........");
		System.out.println("library name..:" + libraryname);
		System.out.println("..bookllist....");
		for(Book b:book)
		{
			System.out.println(b.getBookid());
			
		}
		}
		
	}

