import java.util.Random;
import java.util.Scanner;

public class ControlTestex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int num = 0;
		int result = 0;

		System.out.println("3의 배수를 판별하는 프로그램입니다. 수를 넣어주세요.");
		num = scan.nextInt();
		if (num < 3) {
			System.out.println("3보다 작은 수는 3의 배수가 아닙니다.");
		} else {
			result = num % 3;

			if (result == 0) {
				System.out.println("3의 배수입니다.");
			} else {
				System.out.println("3의 배수가 아닙니다.");
			}
		}
	}

}
