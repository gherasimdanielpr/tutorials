package BookJDBC.services;

import BookJDBC.dao.BookDAO;
import BookJDBC.dao.PreferencesDAO;
import BookJDBC.entities.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookService {

	// we have no new anywhere - injection is made by Spring
	// there must be getters and setters
	private BookDAO bookDAO;
	private PreferencesDAO preferencesDAO;

	// Asks the bookDAO to get a books as ArrayList
	public List<Book> getBookList() {
		List<Book> books = bookDAO.getBookList();
		return books;

	}

	public List<Book> getBookListWithPreferences(String username) {
		List<Book> books = bookDAO.getBookList();
		for (Book b : books) {
			b.setPrefered(isBookPrefered(b.getBookId(), username));
		}
		return books;
	}

	public void deleteBook(Book book) {
		bookDAO.deleteBook(book);
	}

	// Asks the bookDAO to get a books HashMap by bookName
	public HashMap<String, Book> getHashByName() {
		return bookDAO.bookHashByName();
	}

	// Asks the bookDAO to get a books HashMap by bookAuhtor
	public HashMap<String, Book> getHashByAuthor() {
		return bookDAO.bookHashByAuthor();
	}

	// Asks the bookDAO to reserve/release a book
	public boolean reserveBook(int bookId, String bookStatus) {
		if (bookDAO.reserveBook(bookId, bookStatus))
			return true;
		else
			return false;
	}

	public Book getBook(int bookId) {
		return bookDAO.getBook(bookId);
	}

	public int updateBookRating(int bookId, int newRating, int oldRating,
			int nrOfRatings) {
		int rating;
		if (nrOfRatings > 1) {
			rating = (int) ((oldRating + newRating) / nrOfRatings);
		} else {
			rating = newRating;
		}

		if (bookDAO.updateBookRating(bookId, rating, nrOfRatings)) {
			return rating;
		}
		return -1;
	}

	public boolean isBookPrefered(int bookId, String username) {
		if (preferencesDAO.getPreferences(username)!=null) {
			return preferencesDAO.getPreferences(username).contains(bookId);
		}
		return false;
	}

	// Typical search using * and ? for a book in a books HashMay with the key
	// bookName/bookAuthor
	public ArrayList<Book> search(String word, HashMap<String, Book> wordList) {
		ArrayList<Book> result = new ArrayList<Book>();

		if (!word.contains("?") && !word.contains("*")) {
			if (wordList.containsKey(word)) {
				result.add(wordList.get(word));
				return result;
			}
		} else if (!word.contains("*")) { // contine numai ?
			word = word.replace('?', '.');
			Pattern p = Pattern.compile(word);
			String[] words = new String[wordList.size()];
			wordList.keySet().toArray(words);
			for (int i = 0; i < wordList.size(); i++) {
				Matcher m = p.matcher(words[i]);
				if (m.matches()) {
					System.out.println("Found!");
					result.add(wordList.get(words[i]));
				}
			}
			return result;
		} else {
			// . means any character. * means previous character (or group) 0 or
			// more times.
			// .* means any character 0 or more times.
			// \\* e folosit pentru split cand e vorba de caractere cu o
			// semnificatie diferita
			// charAt(poz) - returneza caracterul de la indicele poz
			// substring(initPoz, finalPoz);
			word = word.replace('?', '.');
			String[] parts = word.split("\\*");
			String wordSearch = "";
			for (String part : parts) {
				wordSearch += part;
				wordSearch += ".*";

			}
			if (word.charAt(word.length() - 1) != '*')
				wordSearch = wordSearch.substring(0, wordSearch.length() - 2);

			if (wordSearch.equals(""))
				wordSearch = ".*";
			// o expresie regulata trebuie sa fie intai compilata ca o instanta
			// a Pattern
			Pattern p = Pattern.compile(wordSearch);
			String[] words = new String[wordList.size()];
			wordList.keySet().toArray(words);
			for (int i = 0; i < wordList.size(); i++) {
				Matcher m = p.matcher(words[i]);
				if (m.matches()) {
					result.add(wordList.get(words[i]));
				}
			}
			return result;
		}
		return null;
	}

	// ////////////////////////////////////////////////////////////////////////////////////
	// Getters and Setters
	public BookDAO getBookDAO() {
		return bookDAO;
	}

	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}

	public boolean addComment(int bookId, String comment, String username) {
		return bookDAO.addComment(bookId, comment, username);
	}

	public PreferencesDAO getPreferencesDAO() {
		return preferencesDAO;
	}

	public void setPreferencesDAO(PreferencesDAO preferencesDAO) {
		this.preferencesDAO = preferencesDAO;
	}
	
	

}
