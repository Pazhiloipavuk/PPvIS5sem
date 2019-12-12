package data;

import java.util.ArrayList;
import java.util.List;

public class Visitor {
	
	private Enum status;
	public String name;
	public String surname;
	private List<Book> listOfFavouriteBooks = new ArrayList<>();
	private List<Book> listOfBooksToBeRead = new ArrayList<>();
	private List<FinishedBook> listOfFinishedBook = new ArrayList<>();
	
	public void createProfile(String name, String surname, Enum status) {
		this.name = name;
		this.surname = surname;
		this.status = status;
	}
	
	public void addToList(List<Book> list, Book book) {
		list.add(book);
	}
	
	public void addToList(List<FinishedBook> list, FinishedBook book) {
		list.add(book);
	}
	
	public void deleteFromList(List<Book> list, Book book) {
		list.remove(book);
	}
	
	public void deleteFromList(List<FinishedBook> list, FinishedBook book) {
		list.remove(book);
	}

	public Enum getStatus() {
		return status;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public List<Book> getListOfFavouriteBooks() {
		return listOfFavouriteBooks;
	}

	public List<Book> getListOfBooksToBeRead() {
		return listOfBooksToBeRead;
	}
	
	public List<FinishedBook> getListOfFinishedBook() {
		return listOfFinishedBook;
	}

	public void setStatus(Enum status) {
		this.status = status;
	}

	public void setListOfFavouriteBooks(List<Book> listOfFavouriteBooks) {
		this.listOfFavouriteBooks = listOfFavouriteBooks;
	}

	public void setListOfBooksToBeRead(List<Book> listOfBooksToBeRead) {
		this.listOfBooksToBeRead = listOfBooksToBeRead;
	}

	public void setListOfFinishedBook(List<FinishedBook> listOfFinishedBook) {
		this.listOfFinishedBook = listOfFinishedBook;
	}
}
