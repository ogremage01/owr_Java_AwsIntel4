package four90;

import java.util.Scanner;

public class WrapperBasic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		래퍼(Wrapper) 클래스
		
		String str = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 입력해줄래?");
		str = scan.nextLine();
		
		int n = 0;
		
		int tempStrNum = Integer.parseInt(str);
		
		System.out.println(n + str);
		System.out.println(n + tempStrNum);
		
		Double numDouble = Double.valueOf("30.1232");
		
		System.out.println(numDouble*10);
		
				
	}

}
