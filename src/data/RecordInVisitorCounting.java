package data;

import java.time.Instant;

public class RecordInVisitorCounting {
	
	private Instant dateTaken;
	private Instant returnDate;
	public Book book;
	public Visitor surname;
	
	public void createRecord(Book book, String surname, Instant dateTaken) {
		this.book = book;
		this.surname.surname = surname;
		this.dateTaken = dateTaken;
	}
	
	public void updateRecord(Book book, String surname, Instant returnDate) {
		this.book = book;
		this.surname.surname = surname;
		this.returnDate = returnDate;
	}
	
	public void deleteRecord(Book book) {
		this.book = null;
		this.surname.surname = null;
		this.returnDate = null;
		this.dateTaken = null;
	}

	public Instant getDateTaken() {
		return dateTaken;
	}

	public void setDateTaken(Instant dateTaken) {
		this.dateTaken = dateTaken;
	}

	public Instant getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Instant returnDate) {
		this.returnDate = returnDate;
	}

	public Book getBook() {
		return book;
	}
	
	public Visitor getSurname() {
		return surname;
	}

	public void setSurname(Visitor surname) {
		this.surname = surname;
	}

}
