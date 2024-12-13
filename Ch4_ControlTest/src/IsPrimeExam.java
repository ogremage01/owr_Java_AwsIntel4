
import java.util.Scanner;

/**
 * @author user
 * 
 *         키보드로부터 정수를 입력받아서 그 수가 소수인지 아닌지 판별하는 프로그램을 작성하시오.
 * 
 */
public class IsPrimeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("2 이상의 자연수를 입력하세요");
		num1 = scan.nextInt();
		
		for(int i =2;i<num1;i++) {
			if(num1%i==0) {
				System.out.println("소수가 아닙니다");
				break;
			}
		}System.out.println("소수입니다");
		
		
		
		
	}
}