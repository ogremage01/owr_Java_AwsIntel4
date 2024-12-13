//형변환

import java.util.Scanner;

public class VarTest74 {
	public static void main(String[] args) {
		
//		실수 하나를 키보드 입력을 받는다
//		
//		11.123
//		
//		서로 값이 좀 달라진다고 쳐도 일단 그냥 두 숫자가 바뀌어서 출력되면 성공
		double double1=0.0;
		int temp1=0;
		int num1 = 0;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("실수를 하나 입력해주세요:");
		
		double1 = scan.nextDouble();
		
		num1 = 100;
		temp1 = (int)double1;
		double1 = num1;
		num1 = temp1;
		
		System.out.println(num1);
		System.out.println(double1);

	}

}
