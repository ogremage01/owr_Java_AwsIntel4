
// 반복문-for와 while의 차이
public class ForWhileComp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for 문으로 구현: 1~100안의 짝수의 합
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}