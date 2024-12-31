package hk.exam.six;

public class Tv {

	protected boolean power; // tv전원 전원이 꺼진 상태에서는 다른 기능들이 절대 작동되어서는 안된다.
	protected int channel; // 채널 제일 작은 채널값은 1 최대값 5 5를 넘기면 1이 되어야 함 / 1에서 내려가면 5

	protected int volume; // 볼륨 최소 0 최대 3 0에서는 더 내려가지 않음 / 3에서 더 올라가면 안됨
	private boolean silence = false; // 음소거 상태
	private int previousVolume = 0; // 음소거 이전 볼륨 상태
	private boolean record = false; // 녹화 상태

	public Tv() {
		power = false;
		channel = 1;
		volume = 0;
	}

	// tv전원 키거나 끔
	public void powerButton() {

		if (power == false) {
			power = !power;
			System.out.println("Tv켜짐");
		} else if (power) {
			System.out.println("Tv꺼짐");
			power = !power;
		}
	}

	public boolean getPower() {
		return power;
	}

	// 채널 올리기
	public void channelUp() {
		if (power) {
			if (channel == 5) {
				channel = 1;
				System.out.println("현재 채널: " + channel);
			} else if (channel < 5) {
				channel++;
				System.out.println("현재 채널: " + channel);
			}
		}
	}

	// 채널 낮추기
	public void channelDown() {
		if (power) {
			if (channel == 1) {
				channel = 5;
				System.out.println("현재 채널: " + channel);
			} else if (channel > 1) {
				channel--;
				System.out.println("현재 채널: " + channel);
			}

		}
	}

	// 볼륨 올리기
	public void volumeUp() {
		if (power) {
			if (volume == 3) {
				System.out.println("볼륨을 더이상 높일 수 없습니다");
				System.out.println("현재 볼륨: " + volume);
			} else if (volume < 3) {
				volume++;
				System.out.println("현재 볼륨: " + volume);
			}
		}
	}

	// 볼륨 낮추기
	public void volumeDown() {
		if (power) {
			if (volume == 0) {
				System.out.println("볼륨을 더이상 낮출 수 없습니다");
				System.out.println("현재 볼륨: " + volume);
			} else if (volume > 0) {
				volume--;
				System.out.println("현재 볼륨: " + volume);
			}
		}
	}

	// 음소거 버튼
	public void silenceButton() {
		if (power) {
			silence = !silence;
			if (silence) {
				previousVolume = volume;
				volume = 0;
				System.out.println("----음소거 모드 사용중----");
			} else {
				volume = previousVolume;
				System.out.println("----음소거 모드 종료----");
			}
		}
	}

	// 녹화 버튼
	public void recordingButton() {
		if (power) {
			record = !record;
			if (record) {
				System.out.println("녹화 시작");
			} else if (record == false) {
				System.out.println("녹화 종료");
			}
		}
	}

	// Tv 정보표시
	@Override
	public String toString() {

		StringBuffer strBuffer = new StringBuffer();

		strBuffer.append("현재 채널은 ");
		strBuffer.append(channel + "\n");
		strBuffer.append("현재 볼륨은 ");
		strBuffer.append(volume + " 입니다\t");

		return strBuffer.toString();
	}

}
