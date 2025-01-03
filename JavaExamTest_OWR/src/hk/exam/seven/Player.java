package hk.exam.seven;

public class Player {

	private String name = ""; // 이름
	private int age = 0; // 나이
	private int score = 0; // 2개의 카드를 더한 점수
	private boolean winner = false; // 승자가 누구인지 기록 (true 승자, false 패자)
	private Card[] myChoiceCards = null; // 내가 선택한 2장의 카드

	CardCase cc = new CardCase();

	// 생성자 (멤버변수 초기화)
	public Player(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.myChoiceCards = new Card[2];
		cc.init();//분리. 원래는 셔플에 있었음

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Card[] getMyChoiceCards() {
		return myChoiceCards;
	}

	public void setMyChoiceCards(Card[] myChoiceCards) {
		this.myChoiceCards = myChoiceCards;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public boolean isWinner() {
		return winner;
	}

	public void setWinner(boolean winner) {
		this.winner = winner;
	}

	// 게임에 이용할 카드를 뽑는다
	public Card[] drawCard() {

		// 내가 가진 전체 카드
		// 카드 2장을 뽑는다
		// 그리고 뽑은 카드는 다시는 사용하지 못한다. -> 카드덱에 존재하지 않는다
		
		for(int i=0;i<myChoiceCards.length;i++) {
			myChoiceCards[i] = cc.getCardList().get(0);
			cc.getCardList().remove(0);	
		}
		return myChoiceCards;

	}

	// 카드 섞기
	public void shuffle() {
		
		for (int i = 0; i < cc.getCardList().size(); i++) {
			Card temp = new Card();
			int randNum = 0;
			randNum = (int) (Math.random() * (cc.getCardList().size()));
			temp=cc.getCardList().get(randNum);
			cc.getCardList().set(randNum, cc.getCardList().get(i));
			cc.getCardList().set(i, temp); 
			
			
		}

	}

	// 카드덱에 들어있는 52장의 카드들을 잘 섞어준다.

}
