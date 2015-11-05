package BookJDBC.entities;

import java.util.ArrayList;

// Book POJO
public class Book {

	private int bookId;
	private String bookName;
	private String bookAuthor;
	private String bookStatus;
	private int rating;
	private int nrOfRatings;
	private boolean prefered;

	public Book(int bookId, String bookName, String bookAuthor,
				String bookStatus, int rating, int nrOfRatings) {
		super();
		this.bookId = bookId;
		this.rating = rating;
		this.nrOfRatings = nrOfRatings;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookStatus = bookStatus;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(String bookStatus) {
		this.bookStatus = bookStatus;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getNrOfRatings() {
		return nrOfRatings;
	}

	public void setNrOfRatings(int nrOfRatings) {
		this.nrOfRatings = nrOfRatings;
	}

	public boolean isPrefered() {
		return prefered;
	}

	public void setPrefered(boolean prefered) {
		this.prefered = prefered;
	}

	

}