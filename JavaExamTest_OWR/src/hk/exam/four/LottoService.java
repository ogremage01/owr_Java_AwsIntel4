package hk.exam.four;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LottoService {
	// 인스턴스의 변수는 배열 or 컬렉션 클래스 둘 중 하나만 이용

	// 45개의 정수값을 저장하기 위한 배열 생성.
	private int[] balls = new int[45];
	private int[] luckyBall = new int[6];

	private ArrayList<Integer> ballList = new ArrayList<>();
	private ArrayList<Integer> luckyBallList = new ArrayList<>();

	// 1~45까지의 공 준비
	public void setLottoNumber() {
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}

		// 배열의 각 요소에 1~45의 값을 저장한다.

	}

	// 45개의 로또 번호 중 중복되지 않는 나만의 숫자 6개를 선택
	public void setAutoLottoNumber() {

		for (int i = 0; i < 6; i++) {
			int temp = 0;
			int ranball = 0;
			ranball = ((int) (Math.random() * 44) + 1);
			temp = balls[i];
			balls[i] = balls[ranball];
			balls[ranball] = temp;
			luckyBall[i] = balls[i];

		}

	}

	/**
	 * 
	 * @param sequence true이면 오름차순, false이면 내림차순 정렬
	 * 
	 *                 <pre>
	 * 로또 번호 정렬
	 *                 </pre>
	 */
	public void sortLottoNumber(boolean sequence) {

		if (sequence) { // 오름차순 정렬
			System.out.println("오름차순");
//			Arrays.sort(luckyBall);
			for (int i = 0; i < luckyBall.length; i++) {
				for (int j = 0; j < luckyBall.length - 1; j++) {
					int temp = 0;
					if (luckyBall[j] > luckyBall[j + 1]) {
						temp = luckyBall[j];
						luckyBall[j] = luckyBall[j + 1];
						luckyBall[j + 1] = temp;
					}
				}
			}
			for (int i = 0; i < 6; i++) {
				System.out.print(luckyBall[i] + " ");
			}
			System.out.println();

		} else if (sequence == false) { // 내림차순 정렬
			System.out.println("내림차순");
			for (int i = 0; i < luckyBall.length; i++) {
				for (int j = 0; j < luckyBall.length - 1; j++) {
					int temp = 0;
					if (luckyBall[j] < luckyBall[j + 1]) {
						temp = luckyBall[j];
						luckyBall[j] = luckyBall[j + 1];
						luckyBall[j + 1] = temp;
					}
				}

			}
			for (int i = 0; i < 6; i++) {
				System.out.print(luckyBall[i] + " ");
			}System.out.println();
		}
		

	}

	// 6개의 공의 숫자를 출력
	public void printLottoNumber() {
		for (int i = 0; i < 6; i++) {
			System.out.print(balls[i] + " ");
		}
		System.out.println();

	}

}
