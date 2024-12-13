
import java.util.Scanner;

/**
 * @author user
 * 
 * 키보드로부터 정수를 입력받아서 그 수까지의 
 * 피보나치 수열을 출력하는 프로그램을 작성하시오.
 * 예1: 5입력 -> 출력: 0 1 1 2 3 
 * 예2: 10입력 -> 0 1 1 2 3 5 8 13 21 34
 */
public class FiSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;//입력받는 수
		int num2 = 0;//입력받는 수를 카운팅 하는 수
		
		int fi0=0;//피보나치의 1항
		int fi1=1;//피보나치의 2항
		int fi2=0;//피보나치의 계산값
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		num1=scan.nextInt();
		
		
		if (num1==1) {
			System.out.println(fi0);
		}
		else if (num1==2) {
			System.out.print(fi0 + "\t");
			System.out.print(fi1 + "\t");
		}
		else if (num1>=2) {
			System.out.print(fi0 + "\t");
			System.out.print(fi1 + "\t");
			while (num1>num2+2) {
				fi2=fi0+fi1;
				System.out.print(fi2 + "\t");
				fi0=fi1;
				fi1=fi2;
				num2++;
			}
		}

	}

}
