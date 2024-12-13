
// 반복문-for
public class ControlTest159 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.print(i);
		}
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			sum = sum + i;
			System.out.println("1부터 " + i + "까지의 합: " + sum);

		}

	}
}