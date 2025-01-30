//ai의 조언에 따른 오버로딩 방식에 의한 파일입니다.
/*(AI답변)오버로딩 방식이 가독성 및 유지보수 측면에서 보통 더 효율적입니다. 
 * 비슷한 상품 간의 구매 로직을 공통된 메서드로 묶어 관리하는 것은 향후 코드 수정을 훨씬 수월하게 만들어 줍니다. 
 * 또한, 새로운 상품 타입이 추가될 경우에 대한 유연성과 확장성을 제공합니다.*/

package hk.exam.eight;

// 면세점
public class FreeShop2 {

	// 면세점이 열리면 책, 컴퓨터, Tv, 스마트폰을 한개 판매 가능하다
	// 상품을 한번 판매한 경우 해당 상품은 존재하지 않는다. ex) 책을 팔았으면 책은 존재하지 않음 하지만 나머지 상품은 존재한다.

	double storeMoney = 0; // 주인장의 소지금
	private Book book = null; // 책 한권
	private Computer computer = null; // 컴퓨터 한개
	private Tv tv = null; // Tv 한개
	private SmartPhone smartPhone = null; // 스마트폰 한개

	public FreeShop2() {
		super();
	}

	public FreeShop2(Book book, Computer computer, Tv tv, SmartPhone smartPhone) {
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
	public void buy(Customer a, Book b) {
		if(this.book==null) {
			System.out.println(b.name + "은 매진되었습니다.");
			return;
		}
		purchaseProduct(a,b);
		this.book=null;
		return;
	}
	public void buy(Customer a, Computer b) {
		if(this.computer==null) {
			System.out.println(b.name + "은 매진되었습니다.");
			return;
		}
		purchaseProduct(a,b);
		this.computer=null;
		return;
		
	}
	public void buy(Customer a, Tv b) {
		if(this.tv==null) {
			System.out.println(b.name + "은 매진되었습니다.");
			return;
		}
		purchaseProduct(a,b);
		this.tv=null;
		return;
		
	}
	public void buy(Customer a, SmartPhone b) {
		if(this.smartPhone==null) {
			System.out.println(b.name + "은 매진되었습니다.");
			return;
		}
		purchaseProduct(a,b);
		this.smartPhone=null;
		return;
		
	}
		
		void purchaseProduct(Customer a, Product b) {
			if (a.getMoney() < b.price) {
				System.out.println(b.name + "제품을 구입하기에");
				System.out.println(b.price - a.getMoney() + " 원 부족합니다.");
				return;

			} else if (a.getMoney() >= b.price) {
				System.out.println(b.name + " 구매 완료");
				a.setMoney(a.getMoney() - b.price);// 지불
				a.setMyBonusPoint(a.getMyBonusPoint() + b.bonusPoint);// 보너스포인트 획득
				a.setProduct(b);// 구매자 제품획득
				storeMoney += b.price;// 매출기록}
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
