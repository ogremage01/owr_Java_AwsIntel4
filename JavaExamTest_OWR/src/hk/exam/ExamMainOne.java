package hk.exam;
import hk.exam.one.DiceService;
public class ExamMainOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //1번 문제 주사위 번호 하나 뽑기 - 힌트: 무작위 숫자를 반환해주는 클래스의 기능을 사용
		DiceService ds = new DiceService();
		ds.throwDice();

	}

}
