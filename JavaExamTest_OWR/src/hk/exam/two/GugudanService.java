package hk.exam.two;

import java.util.Iterator;

public class GugudanService {

	public GugudanService() {
	}

	// 원하는 단 하나 출력
	public void singleDan(int num) {
		System.out.println("   " + num + "단");
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num * i);

		}
	}

	// 사용자가 지정한 2개의 숫자 사이 만큼의 구구단 출력
	public void showGugudan(int frontIndex, int lastIndex) {

		// “처음 숫자가 마지막 숫자보다 클 수 없습니다.”
		if (frontIndex > lastIndex) {
			System.out.println("처음 숫자가 마지막 숫자보다 클 수 없습니다.");
		} else if (frontIndex <= lastIndex) {

			// 몇 단이 시작되는지 출력
			for (int i = frontIndex; i <= lastIndex; i++) {
				System.out.print("    " + i + "단     \t");

			}
			System.out.println();

			// 여러 단을 한번에 출력해준다.
			for (int i = 1; i <= 9; i++) {
				for (int j = frontIndex; j <= lastIndex; j++) {
					System.out.print(j + " * " + i + " = " +i * j + "\t");

				}
				System.out.println();

			}
		}
	}

}
