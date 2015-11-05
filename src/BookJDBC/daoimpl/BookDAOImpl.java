package BookJDBC.daoimpl;

import BookJDBC.dao.BookDAO;
import BookJDBC.entities.Book;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Manages any access and update of the books table in the DB
public class BookDAOImpl implements BookDAO {
	DBConnection DBConn;
	
	@Override
	public Book getBook(int bookId){
		try {
			ResultSet rs = DBConn.executeQuery("select * from test.books where id ='" + bookId + "'");
			while (rs.next()) {
				Book foundBook = new Book(rs.getInt("id"), rs.getString("title"), rs.getString("author"), rs.getString("status"), rs.getInt("rating"), rs.getInt("nr_of_ratings"));
				bookId = rs.getInt("id");
				return foundBook;
			}
			return null;
		} catch (SQLException e1) {
			e1.printStackTrace();
			return null;
		}
		
		
	}

	// Gets the book list from the DB and returns is as an ArrayList
	@Override
	public List<Book> getBookList() {
		List<Book> bookList = new ArrayList<Book>();
		int bookId, bookRating, bookNrOfRatings;
		String bookName, bookAuthor, bookStatus;
		try {
			ResultSet rs = DBConn.executeQuery("select * from test.books");
			while (rs.next()) {
				bookId = rs.getInt("id");
				bookName = rs.getString("title");
				bookAuthor = rs.getString("author");
				bookStatus = rs.getString("status");
				bookRating = rs.getInt("rating");
				bookNrOfRatings = rs.getInt("nr_of_ratings");
				ResultSet rs1 = DBConn.executeQuery("select * from test.comment where bookid = '" + bookId+"'");

						Book newBook = new Book(bookId, bookName, bookAuthor,
						bookStatus, bookRating, bookNrOfRatings);
				bookList.add(newBook);
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return bookList;
	}

	// Returns the list of books in a a HashMap - key = bookName, value = Book
	// Object
	public HashMap<String, Book> bookHashByName() {
		HashMap<String, Book> wordList = new HashMap<String, Book>();
		List<Book> bookList = this.getBookList();
		for (int i = 0; i < bookList.size(); i++) {
			wordList.put(bookList.get(i).getBookName(), bookList.get(i));
		}

		return wordList;
	}

	// Returns the list of books in a a HashMap - key = bookAuhtor, value = Book
	// Object
	public HashMap<String, Book> bookHashByAuthor() {
		HashMap<String, Book> wordList = new HashMap<String, Book>();
		List<Book> bookList = this.getBookList();
		for (int i = 0; i < bookList.size(); i++) {
			wordList.put(bookList.get(i).getBookAuthor(), bookList.get(i));
		}

		return wordList;
	}

	// A book identified by bookId and bookStatus - can be - reserved/released
	public boolean reserveBook(int bookId, String bookStatus) {
		String queryString = "";
		if (bookStatus.equals("AVAILABLE"))// id 
			queryString = "UPDATE `test`.`books` SET `status`='RESERVED' WHERE   `id`='"
					+ bookId + "';";
		else if (bookStatus.equals("RESERVED"))
			queryString = "UPDATE `test`.`books` SET `status`='AVAILABLE' WHERE   `id`='"
					+ bookId + "';";
		System.out.println(queryString);
		try {
			DBConn.execute(queryString);
			return true;
		} catch (SQLException e1) {
			e1.printStackTrace();
			return false;
		}

	}

	// Getters and setters - get/set the connection to the DB
	public DBConnection getDBConn() {
		return DBConn;
	}

	public void setDBConn(DBConnection dBConn) {
		DBConn = dBConn;
	}

	@Override
	public void deleteBook(Book book) {
		String queryString = "";
			queryString = "delete from `test`.`books`  WHERE `id`='" + book.getBookId()+"'";
			System.out.println(queryString);
		try {
			DBConn.execute(queryString);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public boolean addComment(int bookId, String comment, String username) {
		String queryString = "";
			queryString = "insert into `test`.`comment` values ('"+Math.random()*1000000+"','"+username + "','" + bookId + "','" + comment+"')";
			System.out.println(queryString);
		try {
			DBConn.execute(queryString);
			return true;
		} catch (SQLException e1) {
			e1.printStackTrace();
			return false;
		}
	}
	
	@Override
	public int addBook(String title, String author, String status) {
		String queryString = "";
			queryString = "insert into `test`.`books` (`title`, `author`, `status`)  values ('"+title+ "','" + author + "','" + status+"')";
			System.out.println(queryString);
		try {
			DBConn.execute(queryString);
			
			String getString = "select books.id from `test`.`books` where title='" + title + "'" + " and author='" + author + "'" + " and status='" + status + "'";
			ResultSet executeQuery = DBConn.executeQuery(getString);
			executeQuery.next();
			int id = executeQuery.getInt("id");
			
			return id;
		} catch (SQLException e1) {
			e1.printStackTrace();
			return -1;
		}
	}

	@Override
	public boolean updateBookRating(int bookId, int rating, int nrOfRatings) {
		String queryString = "UPDATE `test`.`books` SET `rating`='" + rating + "', nr_of_ratings = '" + nrOfRatings +"' WHERE   `id`='"
				+ bookId + "';";
		System.out.println(queryString);
		try {
			DBConn.execute(queryString);
			return true;
		} catch (SQLException e1) {
			e1.printStackTrace();
			return false;
		}
	}
	
	
	
}
