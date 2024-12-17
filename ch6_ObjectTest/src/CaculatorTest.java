import java.util.Scanner;

public class CaculatorTest {
	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		int input = 0;
		double result = 0;
		
		Caculator cacul = new Caculator();
		Scanner scan = new Scanner(System.in);

		System.out.println("인수 a를 입력하시오(a?b)");
		a = scan.nextInt();
		
		System.out.println("인수 b를 입력하시오(a?b)");
		b = scan.nextInt();

		System.out.println("원하는 계산을 선택하시오");
		System.out.println("1. 더하기 2. 빼기 3. 곱하기 4. 나누기");
		input = scan.nextInt();
		
		switch (input) {
			case 1:
				result = cacul.add(a, b);
			case 2:
				result = cacul.subtract(a, b);
			case 3:
				result = cacul.multiply(a, b);
			case 4:
				result = cacul.divide(a, b);

		}
		System.out.println(result);

	}

}
