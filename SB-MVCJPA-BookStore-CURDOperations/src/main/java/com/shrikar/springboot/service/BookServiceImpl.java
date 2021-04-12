package com.shrikar.springboot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shrikar.springboot.dao.BookDAO;
import com.shrikar.springboot.entity.Book;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookDAO bookDAO;
	
	@Override
	public List<Book> getAllBooks() {
		System.out.println("-----BookServiceImpl--getAllBooks()---------");
		return bookDAO.getAllBooks();
	}
	
	@Override
	public Book getBookById(Integer bid) {
		System.out.println("-----BookServiceImpl--getBookById()---------");
		return bookDAO.getBookById(bid);
	}
	
	@Override
	public void addBook(Book book) {
		System.out.println("-----BookServiceImpl--addBook()---------");
		bookDAO.addBook(book);
	}
	
	@Override
	public void updateBook(Book book) {
		System.out.println("-----BookServiceImpl--updateBook()---------");
		bookDAO.updateBook(book);
	}
	
	@Override
	public void deleteBook(Integer bid) {
		System.out.println("-----BookServiceImpl--deleteBook()---------");
		bookDAO.deleteBook(bid);
	}
}