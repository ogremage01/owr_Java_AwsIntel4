package hk.exam.six;

public class TvRemoteControl implements RemoteControl {
	Tv tv = new Tv();

	void alertInfo() {
		System.out.println("Tv 전원이 켜져있지 않습니다");
		System.out.println("Tv 전원을 켜주십시요");
	}

	// 전원 버튼
	public void powerButton(Tv tv) {
		tv.powerButton();
	}

	// 볼륨 낮추기 버튼
	public void volumeDown(Tv tv) {
		if (tv.power == false) {
			alertInfo();
			return;
		} else if (tv.power) {
			tv.volumeDown();
			return;
		}

	}

	// 볼륨 올리기 버튼
	public void volumeUp(Tv tv) {
		if (tv.power == false) {
			alertInfo();
			return;
		} else if (tv.power) {
			tv.volumeUp();
			return;
		}
	}

	// 채널 올리기 버튼
	public void channelUp(Tv tv) {
		if (tv.power == false) {
			alertInfo();
			return;
		} else if (tv.power) {
			tv.channelUp();
			return;
		}
	}

	// 채널 낮추기 버튼
	public void channelDown(Tv tv) {
		if (tv.power == false) {
			alertInfo();
			return;
		} else if (tv.power) {
			tv.channelDown();
			return;
		}
	}

	// 현재 Tv 정보표시 (Tv 채널, 볼륨 표시 및 Tv이름)
	public void representationInfoButton(Tv tv) {
		if (tv.power == false) {
			alertInfo();
			return;
		} else if (tv.power) {
			System.out.println(REMOTE_CONTROL_TV_NAME);
			System.out.println(tv.toString());
			return;
		}
	}

	@Override
	public void recordButton(Tv tv)
	// TODO Auto-generated method stub
	{
		if (tv.power == false) {
			alertInfo();
			return;
		} else if (tv.power) {
			tv.recordingButton();
			return;
		}
	}

	@Override
	public void silence(Tv tv)
	// TODO Auto-generated method stub
	{
		if (tv.power == false) {
			alertInfo();
			return;
		} else if (tv.power) {
			tv.silenceButton();
			return;
		}
	}
}
