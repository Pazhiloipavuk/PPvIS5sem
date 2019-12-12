package data;

public class PlaceInBookStorage {

	private Enum jenre;
	private Enum subject;
	private Book book;

	public void createPlace(Book book, Enum subject, Enum jenre) {
		this.jenre = jenre;
		this.subject = subject;
		this.book = book;
	}

	public void deletePlace(Book book) {
		this.jenre = null;
		this.subject = null;
		this.book = null;
	}

	public Enum getJenre() {
		return jenre;
	}

	public Enum getSubject() {
		return subject;
	}
	
	public Book getBook() {
		return book;
	}
	
	public void setJenre(Enum jenre) {
		this.jenre = jenre;
	}

	public void setSubject(Enum subject) {
		this.subject = subject;
	}
}
