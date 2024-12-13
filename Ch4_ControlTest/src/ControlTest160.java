
// 반복문-for

import java.util.Scanner;

public class ControlTest160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int input = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("원하시는 단을 입력하세요");
		input = scan.nextInt();
		
		for (int i = 1;i <= 9;i++) {
			System.out.println(input + " * " + i + " = " + input*i);
		}

	}

}