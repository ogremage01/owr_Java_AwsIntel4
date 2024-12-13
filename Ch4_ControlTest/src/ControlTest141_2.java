
// 조건문 if -else- if else

import java.util.Scanner;

public class ControlTest141_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int scoreNum = 0;
		String grade = "";

		Scanner scan = new Scanner(System.in);

		System.out.println("학점을 입력하세요");

		scoreNum = scan.nextInt();

		/*
		 * if (scoreNum > 100 || scoreNum < 0) { System.out.println("잘못된 점수입니다."); }
		 * else if (scoreNum <= 100 || scoreNum > 0)
		 */ {
			if (scoreNum >= 90) {
				grade = "A";
			} else if (scoreNum >= 80) {
				grade = "B";
			} else if (scoreNum >= 70) {
				grade = "C";
			} else if (scoreNum >= 0) {
				grade = "F";
			}

			System.out.println(scoreNum + "점은 " + grade + "학점입니다.");
		}

	}
}