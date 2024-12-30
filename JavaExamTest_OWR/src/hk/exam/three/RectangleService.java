package hk.exam.three;

public class RectangleService {

	// 정사각형을 출력한다
	public void printRectangle(int line) {

		// 라인

		for (int i = 1; i <= line; i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}for(int j = 0;j<=line-1-i;j++) {
				System.out.print("?");
			}
			System.out.println();

		}
		// 직각삼각형

		// 역직각삼각형

	}

}