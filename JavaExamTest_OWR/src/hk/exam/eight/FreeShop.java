package hk.exam.eight;

import java.util.HashMap;

// 면세점
public class FreeShop {

	// 면세점이 열리면 책, 컴퓨터, Tv, 스마트폰을 한개 판매 가능하다
	// 상품을 한번 판매한 경우 해당 상품은 존재하지 않는다. ex) 책을 팔았으면 책은 존재하지 않음 하지만 나머지 상품은 존재한다.

	double storeMoney = 0; // 주인장의 소지금
	private Book book = null; // 책 한권
	private Computer computer = null; // 컴퓨터 한개
	private Tv tv = null; // Tv 한개
	private SmartPhone smartPhone = null; // 스마트폰 한개

	public FreeShop() {
		super();
	}

	public FreeShop(Book book, Computer computer, Tv tv, SmartPhone smartPhone) {
		this.storeMoney = 100000; // 초기자금은 무조건 10만원
		this.book = book;
		this.computer = computer;
		this.tv = tv;
		this.smartPhone = smartPhone;
	}

	// 물건 구입
	// 메서드명 buy로 작성하시오
	/**
	 * @param customer 고객
	 * @param ??       어떤 상품을 살까
	 * @throws CloneNotSupportedException
	 */
	public void buy(Customer a, Product b) {

		
//		boolean c = true;
//		if (b.getClass() == this.tv.getClass()) {
//			if (this.tv == null) {
//				c = false;
//			} else if (b.getClass() == this.book.getClass()) {
//				if (this.book == null) {
//					c = false;
//				}
//			}
//		} else if (b.getClass() == this.computer.getClass()) {
//			if (this.computer == null) {
//				c = false;
//			}
//		} else if (b.getClass() == this.smartPhone.getClass()) {
//			if (this.smartPhone == null) {
//				c = false;
//			}
//		}

		if (c == false) {
			System.out.println(b.name + "은 다 팔렸습니다");
			return;

		} else if (c) {
			if (a.getMoney() < b.price) {
				System.out.println(b.name + "제품을 구입하기에");
				System.out.println(b.price - a.getMoney() + " 원 부족합니다.");
				return;

			} else if (a.getMoney() >= b.price) {
				System.out.println(b.name + " 구매 완료");
				a.setMoney(a.getMoney() - b.price);// 지불
				a.setMyBonusPoint(a.getMyBonusPoint() + b.bonusPoint);// 보너스포인트 획득
				a.setProduct(b);// 구매자 제품획득
				if (b == book) {
					this.book = null;
				} else if (b == computer) {
					this.computer = null;
				} else if (b == smartPhone) {
					this.smartPhone = null;
				} else if (b == tv) {
					this.tv = null;
				}
				storeMoney += b.price;// 매출기록
				return;

			}
		}

	}

	// 물건이 존재하는지 여부

	// 물건이 존재하면 구매 가능여부 확인
	// 나의 소지금으로 해당 상품의 구매가 가능하면

	// 나의 소지금으로 해당 상품의 구매가 불가능하면

	@Override
	public String toString() {
		return "FreeShop 상태 = 매진: [storeMoney=" + storeMoney + ", book=" + book + ", computer=" + computer + ", tv="
				+ tv + ", smartPhone=" + smartPhone + "]";
	}

}
