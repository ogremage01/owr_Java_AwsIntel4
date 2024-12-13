//문자열 배열 다루기

import java.util.Scanner;

public class ArrayTest205_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


String[] nameArr = new String[3];
		
		nameArr[0] = "홍길동";
		nameArr[1] = "이순신";
		nameArr[2] = "춘향이";
		
		System.out.println(nameArr[0]=="홍길동");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력하세요");
		String str = scan.nextLine();
		
		System.out.println(str == nameArr[1]);
		System.out.println(nameArr[1].equals(str));

	}

}
