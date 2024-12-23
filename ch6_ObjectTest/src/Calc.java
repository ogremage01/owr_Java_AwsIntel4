//보이드를 사용해보자
// calc 클래스에 사칙연산 메서드를 만든다/만약 3, 5를 입력하면 3+5 =8...../나누기는 세번째 자리에서 올림처리하는 로직
// 3/0으로 나누는 경우에는 0으로 나눌 수 없습니다라고 경고 표시가 뜨고 0으로 출력하는 형태로 구현하시오

public class Calc {

	void add(int a, int b) {
		int result = a + b;
		String view = "";
		view = a + " + " + b + " = " + (a + b);
		System.out.println(view);
	}

	void subtract(int a, int b) {
		int result = a - b;
		String view = "";
		view = a + " - " + b + " = " + (a - b);
		System.out.println(view);
	}

	void multifly(int a, int b) {
		int result = a * b;
		String view = "";
		view = a + " * " + b + " = " + (a - b);
		System.out.println(view);
	}

	void divide(int a, int b) {
		if (b == 0) {
			System.out.print("0으로 나눌 수 없습니다.\t0");
			return;
			}
			double result = (int) (((a * 1.0 / b) + 0.009) * 100) / 100.0;
			String view = "";
			view = a + " / " + b + " = " + (int) (((a * 1.0 / b) + 0.009) * 100) / 100.0;
			System.out.println(view);
		

	}

}
