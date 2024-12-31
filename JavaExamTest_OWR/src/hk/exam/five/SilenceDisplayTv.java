package hk.exam.five;

public class SilenceDisplayTv extends SilenceTv {

	@Override
	public void powerButton() {
		// TODO Auto-generated method stub
		super.powerButton();
		if (power) {
			System.out.println("음소거 상태표시 가능 Tv 켜짐");
		} else if (power == false) {
			System.out.println("음소거 상태표시 가능 Tv 꺼짐");
		}
	}

	@Override
	public void silenceButton() {
		// TODO Auto-generated method stub
		if (power) {
			super.silenceButton();
			if (silence) {
				System.out.println("----음소거 모드 사용중----");
				System.out.println("볼륨: " + volume);
			} else if(silence==false) {
				System.out.println("----음소거 모드 종료----");
				System.out.println("볼륨: " + volume);
			}
		}
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		if (power) {
			if (volume == 3) {
				System.out.println("볼륨을 더이상 높일 수 없습니다");
				System.out.println("현재 볼륨: " + volume);
			} else if (volume < 3) {
				super.volumeUp();
			}
		}

	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		if (power) {
			if (volume == 0) {
				System.out.println("볼륨을 더이상 낮출 수 없습니다");
				System.out.println("현재 볼륨: " + volume);
			} else if (volume > 0) {
				super.volumeDown();
			}
		}

	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		if (power) {
			if (channel == 5) {
				channel = 1;
				System.out.println("현재 채널: " + channel);
			} else if (channel < 5) {
				super.channelUp();
			}
		}

	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		if (power) {
			if (channel == 1) {
				channel = 5;
				System.out.println("현재 채널: " + channel);
			}
			else if (channel > 1) {
				super.channelDown();
			}

		}

	}

	public String toString() {
		return "SilenceDisplayTv [power " + power + ", channel=" + channel + ", volume=" + volume + " silence="
				+ silence + "]";
	}
}