import java.util.Scanner;

// 조건문 switch
public class ControlTest146 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int key = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("달을 입력해주세요");
		key = scan.nextInt();

		switch (key) {
			case 1:
			case 2:
			case 12:
				System.out.println(key + "월은 겨울입니다.");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println(key + "월은 봄입니다.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(key + "월은 여름입니다.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(key + "월은 가을입니다.");
				break;
			default:
				System.out.println("존재하지 않는 달입니다. 다른 별 사람인가요?");
				break;
		}

	}
}