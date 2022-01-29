package com.bookstore.model.service;

import java.util.List;

import com.bookstore.model.persistence.Book;
import com.bookstore.model.persistence.BookDao;
import com.bookstore.model.persistence.BookDaoImpl;

public class BookServiceImpl implements BookService{

	private BookDao bookDao;
	
	
	public BookServiceImpl()
	{
		bookDao=new BookDaoImpl();
	}
	
	@Override
	public List<Book> getAllBooks() {
		
		return bookDao.getAllBooks();
	}

	@Override
	public Book getBookById(int bookId) {
		// TODO Auto-generated method stub
		return bookDao.getBookById(bookId);
	}

	@Override
	public void addBook(Book book) {
		bookDao.addBook(book);
		
	}

	@Override
	public void updateBook(Book book) {
		bookDao.updateBook(book);
		
	}

	@Override
	public void removeBook(int bookId) {
		bookDao.removeBook(bookId);
		
	}

}
}
