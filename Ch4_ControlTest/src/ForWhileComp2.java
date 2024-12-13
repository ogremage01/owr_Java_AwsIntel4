
// 반복문-반복문-for와 while의 차이
public class ForWhileComp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while 문으로 구현: 1~100안의 짝수의 합

		int sum = 0;
		int num1 = 1;
		while (num1 <= 100) {
			if (num1 % 2 == 0) {
				sum += num1++;

			} else {
				num1++;
			}
		}
		System.out.println(sum);
	}
}