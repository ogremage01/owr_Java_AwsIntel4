package three50;

import three50.book.Book;

public class BookMain {
	public static void main(String[] args) {
		Book bk1 = new Book();

		Book bk2 = new Book();

		bk1.setTitle("모비딕");
		bk1.setAuthor("허먼 멜빌");
		bk1.setPrice(33000);
		bk1.setPublicationDate("2019.08.12");
		bk1.setPublisher("문학동네");
		

		bk2.setTitle("롤리타");
		bk2.setAuthor("블라디미르 나보코프");
		bk2.setPrice(15300);
		bk2.setPublicationDate("2013.01.30");
		bk2.setPublisher("문학동네");

		bk1.getInfo();

		System.out.println();

		bk2.getInfo();

	}

}
