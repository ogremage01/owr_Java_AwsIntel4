// 삼항 연산자

import java.util.Scanner;

public class OperatorTest130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. 키보드 입력을 하나 받는다. 2. 그 값이 0보다 큰 수라면 양수 3. 0보다 작은 수라면 음수라고 출력하는 프로그램을 만드시오
		 */

		int x = 0;
		String result = "";

		Scanner scan = new Scanner(System.in);

		System.out.println("정수를 입력하세요");
		x = scan.nextInt();

		result = x > 0 ? "양수" : (x == 0 ? "0" : "음수");

		System.out.println("입력값: " + x + " -> " + result);

	}

}
