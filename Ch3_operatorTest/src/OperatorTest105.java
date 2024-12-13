// 올림처리 방법
public class OperatorTest105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num = 3.1402;
		double resultNum = 0.0;
		double raise = 0.0;
		
		raise = 0.009;

		resultNum = (int) ((num+raise) * 100) / 100.0;

		System.out.println("소수점 세번째 자리에서 올림.즉 2번째 자리까지만 출력");
		System.out.println(num + " -> " + resultNum);
	}

}
