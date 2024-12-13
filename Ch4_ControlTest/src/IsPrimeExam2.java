
import java.util.Scanner;

/**
 * @author user
 * 
 *         키보드로부터 정수를 입력받아서 그 수가 소수인지 아닌지 판별하는 프로그램을 작성하시오.
 * 
 */
public class IsPrimeExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 1;
		int num3 = 1;
		Scanner scan = new Scanner(System.in);

		System.out.println("0이 아닌 자연수를 입력하세요");
		num1 = scan.nextInt();

		while (num1 >= num2) {
			num2++;
			if (num1 % num2 == 0) {
				num3++;

			}
		}

		if (num3 == 2) {
			System.out.println(num1 + "은 소수입니다. 약수의 개수: " + num3);
		} else {
			System.out.println(num1 + "은 소수가 아닙니다. 약수의 개수: " + num3);

		}
	}
}