package hk.exam.one;

public class DiceService {
	public DiceService(){}
	
	// 주사위를 던지다
	public void throwDice(){
		
		// 주사위는 1부터 6까지 숫자만 존재
		int result = 0;
		System.out.println("주사위를 던졌습니다");
		result = (int)(Math.random()*6)+1;
		System.out.println("주사위 숫자: " + result);
				
		

		
	}
}
