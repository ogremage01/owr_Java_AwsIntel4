// 반올림 처리 방법
public class OperatorTest105_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num = 3.141592;
		double resultNum = 0.0;
//		double halfRaise = 0.0;

//		halfRaise = 0.005;

//		resultNum = (int) ((num+halfRaise) * 100) / 100.0;

		resultNum = num + 0.005;
		System.out.println(resultNum);

		resultNum = resultNum * 100;
		System.out.println(resultNum);

		resultNum = (int) resultNum;
		System.out.println(resultNum);

		resultNum = (int) resultNum / 100.0;
		System.out.println(resultNum);

		System.out.println("소수점 세번째 자리에서 반올림.즉 2번째 자리까지만 출력");
		System.out.println(num + " -> " + resultNum);
	}

}
