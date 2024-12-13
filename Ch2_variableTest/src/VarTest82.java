//형변환

import java.util.Scanner;

public class VarTest82 {
	public static void main(String[] args) {

		int x = 0;
		int y = 0;

		double resultNum = 0.0;

		Scanner scan = new Scanner(System.in);
		System.out.println("두 수의 나눈 값의 몫을 구하여라");

		System.out.println("첫번째 값: ");
		x = scan.nextInt();

		System.out.println("두번째 값: ");
		y = scan.nextInt();

		resultNum = (double) x / (double) y;

		System.out.println(x + "/" + y + "=" + resultNum);

	}

}
