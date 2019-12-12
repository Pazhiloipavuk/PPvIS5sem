package data;

import java.time.Instant;

public class RecordInBookCatalog {
	
	private int averageGrade;
	private Enum status;
	public Book book;
	
	public void createRecord(Book book, int averageGrade, Enum status) {
		this.book = book;
		this.averageGrade = averageGrade;
		this.status = status;
	}
	
	public void updateRecord(Book book) {
		this.book = book;
	}
	
	public void deleteRecord(Book book) {
		this.book = null;
	}

	public int getAverageGrade() {
		return averageGrade;
	}

	public void setAverageGrade(int averageGrade) {
		this.averageGrade = averageGrade;
	}

	public Enum getStatus() {
		return status;
	}

	public void setStatus(Enum status) {
		this.status = status;
	}

	public Book getBook() {
		return book;
	}
}
