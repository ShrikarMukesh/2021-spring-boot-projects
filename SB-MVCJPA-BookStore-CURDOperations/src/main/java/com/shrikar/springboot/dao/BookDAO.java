package com.shrikar.springboot.dao;

import java.util.List;

import com.shrikar.springboot.entity.Book;

public interface BookDAO {
	public List<Book> getAllBooks();
	public Book getBookById(Integer bid);
	public void addBook(Book book);
	public void updateBook(Book book);
	public void deleteBook(Integer bid);
}
