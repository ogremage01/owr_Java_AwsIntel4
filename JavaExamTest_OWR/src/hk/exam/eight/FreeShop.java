package hk.exam.eight;

// 면세점
public class FreeShop {
	
	// 면세점이 열리면 책, 컴퓨터, Tv, 스마트폰을 한개 판매 가능하다
	// 상품을 한번 판매한 경우 해당 상품은 존재하지 않는다. ex) 책을 팔았으면 책은 존재하지 않음 하지만 나머지 상품은 존재한다.
	
	double storeMoney = 0;  // 주인장의 소지금
	private Book book = null; // 책 한권 
	private Computer computer = null; // 컴퓨터 한개
	private Tv tv = null; // Tv 한개
	private SmartPhone smartPhone = null; // 스마트폰 한개
	
	public FreeShop() {
		super();
	}

	public FreeShop(Book book, Computer computer, Tv tv, SmartPhone smartPhone){
		this.storeMoney = 100000; // 초기자금은 무조건 10만원
		this.book = book;
		this.computer = computer;
		this.tv = tv;
		this.smartPhone = smartPhone;
	}
	
	// 물건 구입
	// 메서드명 buy로 작성하시오
	/**
	 * @param customer  고객
	 * @param ?? 어떤 상품을 살까
	 * @throws CloneNotSupportedException
	 */
	public void buy(Customer a, Product b) {
		while(true) {
			if (b==null) {
				System.out.println("재고가 없습니다");
				break;
			}else if(b!=null) {
				if(a.getMoney()<b.price) {
					System.out.println("자산이 충분하지 않습니다.");
					break;}
				else if(a.getMoney()>=b.price) {
					System.out.println(b.name + " 구매 완료");
					a.setMoney(a.getMoney()-b.price);//지불
					a.setMyBonusPoint(a.getMyBonusPoint()+b.bonusPoint);//보너스포인트 획득
					a.setProduct(b);//구매자 제품획득
//					this. = null;//매장 재고 수정
					storeMoney+=b.price;//매출기록
					
					break;
				}
			}
		}
		
	}
		
		// 물건이 존재하는지 여부
		
		
		// 물건이 존재하면 구매 가능여부 확인
		// 나의 소지금으로 해당 상품의 구매가 가능하면
		
			// 나의 소지금으로 해당 상품의 구매가 불가능하면
		
	

	@Override
	public String toString() {
		return "FreeShop 상태 = 매진: [storeMoney=" + storeMoney + ", book=" + book + ", computer=" + computer + ", tv=" + tv
				+ ", smartPhone=" + smartPhone + "]";
	}
	
}
