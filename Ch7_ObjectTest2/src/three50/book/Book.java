package three50.book;

public class Book {

	private String title = "";
	private String author = "";
	private String publisher = "";
	private int price = 0;
	private String publicationDate = "";

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String getPublisher() {
		return publisher;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	
	public String getpublicationDate() {
		return publicationDate;
	}	

	
//	별로 안좋은 코드. get~같은거 넣지 말 것. 변수 써라
	public void getInfo() {
		System.out.println("표제: " + getTitle());
		System.out.println("저자: " + getAuthor());
		System.out.println("출판사: " + getPublisher());
		System.out.println("가격: " + getPrice());
		System.out.println("출판일: " + getpublicationDate());

	}

}
