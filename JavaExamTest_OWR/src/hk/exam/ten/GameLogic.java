package hk.exam.ten;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GameLogic {

	private int input = 0;
	private int userAnswer = 0;
	private int min = 2;
	private int max = 11;
	private int nowPlayer = 0;
	private int tryTime = 0;
	private int up = 0;
	private int down = 0;

	public void upAndDown() {

		BottleCap bc = new BottleCap();
		ArrayList<Player> playerList = new ArrayList<Player>();

		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				while (true) {
					System.out.println("참가할 인원을 말씀해 주세요.(" + min + "~" + max + "인)");// 참가 플레이어 입력
					input = sc.nextInt();
					if (input >= min && input <= max) {
						break;
					} else {
						System.out.println("범위 내 숫자만 입력가능합니다.");// 최소/최대 예외 처리
					}
				}

				sc.nextLine();
				break;

			} catch (InputMismatchException ie) {
				// TODO: handle exception
				System.out.println("잘못 입력하셨습니다. 숫자만 입력가능합니다. 다시 입력해 주십시오.");// 문자 입력시 예외 처리
				sc.next();
				continue;
			}

		}
		// 참가자 이름 입력
		for (int i = 0; i < input; i++) {

			String name = "";

			System.out.println(i + "번째 참가자의 이름을 말씀해 주세요.");
			name = sc.nextLine();
			Player pc = new Player();
			pc.setName(name);
			playerList.add(pc);

		}
		// 병뚜껑 숫자 결정 및 초기 업&다운 수치 결정
		bc.setNum((int) (Math.random() * 1000) + 1);
		up = (bc.getNum() / 100 * 100) + 100;
		down = bc.getNum() / 100 * 100;
		System.out.println(bc.getNum());// 테스트용 점수표기

		while (true) {// 수 입력 진행
			tryTime++;

			while (true) {
				try {
					System.out.println(playerList.get(nowPlayer).getName() + "님");

					System.out.println(down + "~" + up + "숫자를 입력해주세요");
					userAnswer = sc.nextInt();
					break;

				} catch (InputMismatchException ie) {// 문자 입력 시
					// TODO: handle exception
					System.out.println("잘못 입력하셨습니다. 숫자만 입력가능합니다. 다시 입력해 주십시오.");
					sc.next();
					continue;
				}
			}

			if (userAnswer == bc.getNum()) {// 정답 적중 시
				playerList.get(nowPlayer).setPassCheck();
				System.out.println(playerList.get(nowPlayer).getName() + "님");
				System.out.println("병뚜껑 번호" + bc.getNum() + "맞췄습니다.");
				System.out.println("총 시도 횟수는 " + tryTime + "번입니다.");

				for (int i = 0; i < playerList.size(); i++) {
					if (playerList.get(i).getPassCheck()) {
						System.out.println("병뚜껑 숫자를 맞추신 분은 [name=" + playerList.get(i).getName() + "입니다., userAnswer="
								+ userAnswer + " , passCheck=" + playerList.get(i).getPassCheck() + "] 벌칙받으러 ㄱㄱ^^");
					} else if (playerList.get(i).getPassCheck() == false) {
						System.out.println("[name=" + playerList.get(i).getName() + "님은 생존하셨습니다. , passCheck="
								+ playerList.get(i).getPassCheck() + "] 축하합니다~~");
					}
				}

				return;
				// 범위 이내 오답 시
			} else if (userAnswer > bc.getNum() && userAnswer <= up) {
				System.out.println("틀렸습니다. 다음 분은 더 작은 수를 입력해 주세요");
				up = userAnswer - 1;
				nowPlayer = (nowPlayer + 1) % playerList.size();

			} else if (userAnswer < bc.getNum() && userAnswer >= down) {
				System.out.println("틀렸습니다. 다음 분은 더 큰 수를 입력해 주세요");
				down = userAnswer + 1;
				nowPlayer = (nowPlayer + 1 % playerList.size());

				// 범위 바깥 오답 시
			} else if (userAnswer >= up) {
				System.out.println(up + "보다 큰 값을 넣을 수 없습니다.");
			} else if (userAnswer <= down) {
				System.out.println(down + "보다 작은 값을 넣을 수 없습니다.");
			}

		}
	}
}
