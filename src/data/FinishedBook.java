package data;

public class FinishedBook {
	
	public Book book;
	private int grade;
	
	public void addFinishedBook(Book book, int grade) {
		this.book = book;
		this.grade = grade;
	}

	public void deleteFinishedBook(Book book) {
		this.book = null;
		this.grade = 0;
	}

	public Book getBook() {
		return book;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}
