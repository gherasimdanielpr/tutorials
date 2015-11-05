package BookJDBC;

import BookJDBC.dao.BookDAO;
import BookJDBC.daoimpl.BookDAOImpl;
import BookJDBC.daoimpl.DBConnection;
import BookJDBC.entities.Book;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestBookDAOImpl {
	
	BookDAO bookDao = new BookDAOImpl();
	@Before
	public void setUp() {
		
		DBConnection instance = DBConnection.getInstance();
		
		ReflectionTestUtils.setField(bookDao, "DBConn", instance);
	}

	@Test
	public void testGetBookList() {

		String bookName = "tttt";
		String bookStatus = "RESERVED";
		List<Book> bookList1 = bookDao.getBookList();
		int addBook = bookDao.addBook(bookName, bookName, bookStatus);
		
		List<Book> bookList = bookDao.getBookList();
		
		

		int rating = 0;
		int nrOfRatings = 0;
		Book expectedBook = new Book(addBook, bookName, bookName, bookStatus, rating, nrOfRatings);
		
		Assert.assertEquals(bookList1.size() + 1, bookList.size());
		
		bookDao.deleteBook(expectedBook);
		List<Book> bookList2 = bookDao.getBookList();
		Assert.assertEquals(bookList1.size(), bookList2.size());
	}
	
	@Test
	public void testAddBook() {

		
		String bookName = "tttt";
		String bookStatus = "RESERVED";
		List<Book> bookList1 = bookDao.getBookList();
		int addBook = bookDao.addBook(bookName, bookName, bookStatus);
		
		
		

		int rating = 0;
		int nrOfRatings = 0;
		Book expectedBook = new Book(addBook, bookName, bookName, bookStatus, rating, nrOfRatings);
		
		Book book = bookDao.getBook(addBook);
		
		Assert.assertEquals(book.getBookId(), addBook);
		
		bookDao.deleteBook(expectedBook);
		List<Book> bookList2 = bookDao.getBookList();
		Assert.assertEquals(bookList1.size(), bookList2.size());
	}
	
	@Test
	public void testAddComment() {
		
		String bookName = "tttt";
		String bookStatus = "RESERVED";
		List<Book> bookList1 = bookDao.getBookList();
		int addBook = bookDao.addBook(bookName, bookName, bookStatus);
		
		String userName = "user";
		String text = "text";
		int rating = 0;
		int nrOfRatings = 0;

		Book expectedBook = new Book(addBook, bookName, bookName, bookStatus, rating, nrOfRatings);
		List<Book> books = bookDao.getBookList();
		
		Book foundBook = null;
		for (Book book : books) {
			if(book.getBookId() == addBook) {
				foundBook = book;
			}
		}
		
		bookDao.deleteBook(expectedBook);
		List<Book> bookList2 = bookDao.getBookList();
		Assert.assertEquals(bookList1.size(), bookList2.size());
	}
	

	@Test
	public void testGetByAuthor() {

		String bookName = "tttt";
		String author = "tttt1";
		String bookStatus = "RESERVED";
		List<Book> bookList1 = bookDao.getBookList();
		int addBook = bookDao.addBook(bookName, author, bookStatus);
		
		HashMap<String,Book> bookHashByAuthor = bookDao.bookHashByAuthor();
		
		
		Assert.assertTrue(bookHashByAuthor.containsKey(author));
		

		int rating = 0;
		int nrOfRatings = 0;
		Book expectedBook = new Book(addBook, bookName, bookName, bookStatus, rating, nrOfRatings);
		
		Book book = bookDao.getBook(addBook);
		
		Assert.assertEquals(book.getBookId(), addBook);
		
		bookDao.deleteBook(expectedBook);
		List<Book> bookList2 = bookDao.getBookList();
		Assert.assertEquals(bookList1.size(), bookList2.size());
	}
	
	@Test
	public void testGetByName() {

		
		String bookName = "tttt";
		String author = "tttt1";
		String bookStatus = "RESERVED";
		List<Book> bookList1 = bookDao.getBookList();
		int addBook = bookDao.addBook(bookName, author, bookStatus);
		
		HashMap<String,Book> bookHashByName = bookDao.bookHashByName();
		
		
		Assert.assertTrue(bookHashByName.containsKey(bookName));
		
		

		int rating = 0;
		int nrOfRatings = 0;
		Book expectedBook = new Book(addBook, bookName, bookName, bookStatus, rating, nrOfRatings);
		
		Book book = bookDao.getBook(addBook);
		
		Assert.assertEquals(book.getBookId(), addBook);
		
		bookDao.deleteBook(expectedBook);
		List<Book> bookList2 = bookDao.getBookList();
		Assert.assertEquals(bookList1.size(), bookList2.size());
	}
	
	@Test
	public void testReserveBook() {

		String bookName = "tttt";
		String author = "tttt1";
		String bookStatus = "AVAILABLE";
		String bookStatus1 = "RESERVED";
		List<Book> bookList1 = bookDao.getBookList();
		int addBook = bookDao.addBook(bookName, author, bookStatus);
		
		Assert.assertTrue(bookDao.reserveBook(addBook, bookStatus));
		
		List<Book> books = bookDao.getBookList();
		
		Book foundBook = null;
		for (Book book : books) {
			if(book.getBookId() == addBook) {
				foundBook = book;
			}
		}
		
		Assert.assertEquals(foundBook.getBookStatus(), bookStatus1);
		
		

		int rating = 0;
		int nrOfRatings = 0;
		Book expectedBook = new Book(addBook, bookName, bookName, bookStatus, rating, nrOfRatings);
		
		Book book = bookDao.getBook(addBook);
		
		Assert.assertEquals(book.getBookId(), addBook);
		
		bookDao.deleteBook(expectedBook);
		List<Book> bookList2 = bookDao.getBookList();
		Assert.assertEquals(bookList1.size(), bookList2.size());
	}
	
	@Test
	public void testUpdateRating() {

		
		String bookName = "tttt";
		String author = "tttt1";
		String bookStatus = "AVAILABLE";
		String bookStatus1 = "RESERVED";
		List<Book> bookList1 = bookDao.getBookList();
		int addBook = bookDao.addBook(bookName, author, bookStatus);
		
		Assert.assertTrue(bookDao.updateBookRating(addBook, 3, 4));
		
		List<Book> books = bookDao.getBookList();
		
		Book foundBook = null;
		for (Book book : books) {
			if(book.getBookId() == addBook) {
				foundBook = book;
			}
		}
		
		Assert.assertEquals(foundBook.getRating(), 3);
		Assert.assertEquals(foundBook.getNrOfRatings(), 4);
		
		

		int rating = 0;
		int nrOfRatings = 0;
		Book expectedBook = new Book(addBook, bookName, bookName, bookStatus, rating, nrOfRatings);
		
		Book book = bookDao.getBook(addBook);
		
		Assert.assertEquals(book.getBookId(), addBook);
		
		bookDao.deleteBook(expectedBook);
		List<Book> bookList2 = bookDao.getBookList();
		Assert.assertEquals(bookList1.size(), bookList2.size());
	}

}
