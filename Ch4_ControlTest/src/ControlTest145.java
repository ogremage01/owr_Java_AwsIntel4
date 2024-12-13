// 조건문 실전

import java.util.Scanner;

public class ControlTest145 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 0;
		String grade = "";

		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하시오");
		score = scan.nextInt();

			if (score >= 98) {
				grade = "A+";
			} else if (score >= 94) {
				grade = "A";
			} else if (score >= 90) {
				grade = "A-";
			} else if (score >= 88) {
				grade = "B+";
			} else if (score >= 84) {
				grade = "B";
			} else if (score >= 80) {
				grade = "B-";
			} else {
				grade = "C";
			}
			System.out.println("당신의 학점은 " + score + "점");
			System.out.println(grade + "등급입니다.");

	}

}
