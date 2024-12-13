
// 조건문 if -else-else if

import java.util.Scanner;

public class ControlTest140_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;

		System.out.println("정수를 입력하세요");

		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();

		if (x > 0) {
			System.out.println(x + " - 양수");
		} else if (x == 0) {
			System.out.println(x + " - 0");
		} else if (x < 0) {
			System.out.println(x + " - 음수");
		}

	}

}
