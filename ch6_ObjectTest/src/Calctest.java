// calc 클래스에 사칙연산 메서드를 만든다/만약 3, 5를 입력하면 3+5 =8...../나누기는 세번째 자리에서 올림처리하는 로직
// 3/0으로 나누는 경우에는 0으로 나눌 수 없습니다라고 경고 표시가 뜨고 0으로 출력하는 형태로 구현하시오

public class Calctest {
	public static void main(String[] args) {
		Calc calc = new Calc();
		
		calc.add(3, 7);
		calc.subtract(3, 7);
		calc.multifly(3, 7);
		calc.divide(3, 7);
		calc.divide(3, 0);
		
		
		
		
	}
	


}


