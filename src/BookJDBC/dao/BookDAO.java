package BookJDBC.dao;

import BookJDBC.entities.Book;

import java.util.HashMap;
import java.util.List;

public interface BookDAO {
	public List<Book> getBookList();
	public HashMap<String, Book> bookHashByName();
	public HashMap<String, Book> bookHashByAuthor();
	public boolean reserveBook(int bookId, String bookStatus);
	public void deleteBook(Book book);
	public boolean addComment(int bookId, String comment, String username);
	public int addBook(String title, String author, String status);
	public Book getBook(int bookId);
	public boolean updateBookRating(int bookId, int rating, int nrOfRatings);
	
}
