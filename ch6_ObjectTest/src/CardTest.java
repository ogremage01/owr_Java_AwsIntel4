

public class CardTest {
	
	public static void main(String[] args) {
//		Card[] CardArr = new Card[10];
		
		Card c1 = new Card();
		Card c2 = new Card();
		Card c3 = new Card();
		Card c4 = new Card();
		Card c5 = new Card();
		Card c6 = new Card();
		Card c7 = new Card();
		Card c8 = new Card();
		Card c9 = new Card();
		Card c10 = new Card();
		
		
		
		
		c1.kind = "♥";		
		c2.kind = "♥";
		c3.kind = "♥";
		c4.kind = "♥";
		c5.kind = "♥";
		c6.kind = "♥";
		c7.kind = "♥";
		c8.kind = "♥";
		c9.kind = "♥";
		c10.kind = "♥";
		
		c1.number = 1;
		c2.number = 2;
		c3.number = 3;
		c4.number = 4;
		c5.number = 5;
		c6.number = 6;
		c7.number = 7;
		c8.number = 8;
		c9.number = 9;
		c10.number = 10;

		Card[] cArr = {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10};
		System.out.println("제작자: " + Card.made);
		for(int i =0;i<cArr.length;i++) {
			System.out.print(cArr[i].kind + cArr[i].number + "\n");
		}
		
////////////////////////////////////////////////////		
		
			
			
//		}
	}
}
