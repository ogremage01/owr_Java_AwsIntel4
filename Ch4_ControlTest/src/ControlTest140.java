
// 조건문 if -else-else if

import java.util.Scanner;

public class ControlTest140 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;
		int gender = 0;

		System.out.println("프로그램을 켜시기 위해서는 -999가 아닌 수를 입력해 주세요." + "종료하시려면 -999를 입력해 주세요.");

		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();

		if (x != -999) {
			System.out.println("숫자를 입력해 주세요.");
			System.out.println("1. 남성 2. 여성");
			gender = scan.nextInt();
			if (gender == 1) {
				System.out.println("남성을 선택했습니다.");
			} else if (gender == 2) {
				System.out.println("여성을 선택했습니다.");
			}
		} else if (x == -999) {
			System.out.println("프로그램을 종료합니다.");
		}

	}

}
