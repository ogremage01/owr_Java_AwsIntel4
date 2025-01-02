package hk.exam.ten;

import java.util.ArrayList;
import java.util.Scanner;

public class GameLogic {

	public void upAndDown() {

		BottleCap bc = new BottleCap();
		ArrayList<Player> playerList = new ArrayList<Player>();

		Scanner sc = new Scanner(System.in);
		int input = 0;
		int userAnswer = 0;

		while (true) {
			try {
				System.out.println("참가할 인원을 말씀해 주세요.(2~11인)");
				input = sc.nextInt();
				sc.nextLine();
				break;

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("다시 입력해주세요");
				sc.next();
				continue;
			}

		}

		for (int i = 0; i < input; i++) {

			String name = "";

			System.out.println(i  + "번째 참가자의 이름을 말씀해 주세요.");
			name = sc.nextLine();
			Player pc = new Player(name);
			playerList.add(pc);

		}
		bc.num = (int) (Math.random() * 1000) + 1;
		int up = (bc.num / 100 * 100) + 100;
		int down = bc.num / 100 * 100;
		System.out.println(bc.num);
		int nowplayer = 0;

		while (true) {
			playerList.get(nowplayer).time++;

			while (true) {
				try {
					System.out.println(playerList.get(nowplayer).name + "님");

					System.out.println(down + "~" + up + "사이의 숫자를 입력해 주세요");
					userAnswer = sc.nextInt();
					break;

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("숫자를 입력해 주세요");
					sc.next();
					continue;
				}
			}

			if (userAnswer == bc.num) {
				playerList.get(nowplayer).passCheck=true;
				System.out.println(playerList.get(nowplayer).name + "님");
				System.out.println("병뚜껑 번호" + bc.num + "맞췄습니다.");
				System.out.println("총 시도 횟수는 " + playerList.get(nowplayer).time + "번입니다."); 
				for (int i = 0; i < playerList.size(); i++) {
					if (playerList.get(i).passCheck) {
						System.out.println("병뚜껑 숫자를 맞추신 분은 [name=" + playerList.get(i).name + "입니다., userAnswer="
								+ userAnswer + " , passCheck=" + playerList.get(i).passCheck + "] 벌칙받으러 ㄱㄱ^^");
					} else if (playerList.get(i).passCheck == false) {
						System.out.println("[name=" + playerList.get(i).name + "님은 생존하셨습니다. , passCheck="
								+ playerList.get(i).passCheck + "] 축하합니다~~");
					}
				}

				break;
			} else if (userAnswer > bc.num) {
				System.out.println("틀렸습니다. 다음 분은 더 작은 수를 입력해 주세요");
				up=userAnswer-1;
				nowplayer=(nowplayer+1)%playerList.size();

			} else if (userAnswer < bc.num) {
				System.out.println("틀렸습니다. 다음 분은 더 큰 수를 입력해 주세요");
				down=userAnswer+1;
				nowplayer=(nowplayer+1)%playerList.size();
				

			}

		}
	}
}
