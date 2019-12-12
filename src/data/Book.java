package data;

public class Book {
	
	public String title;
	private String author;
	private int year;
	private String publishingHouse;

	public void createBook(String title, String author, int year, String publishingHouse) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.publishingHouse = publishingHouse;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public void deleteBook(String title) {
		this.title = null;
		author = null;
		year = 0;
		publishingHouse = null;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}
	
}
