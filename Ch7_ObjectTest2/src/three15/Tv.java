package three15;

public class Tv { 

	boolean power;
	int channel;
	int volume;
	// 볼륨 속성 추가
	
	public void power(){
		power = !power;
	}
	
	void channelUp(){
		++channel;
	}
	
	void channelDown(){
		--channel;
	}
	
	
	// 볼륨 업 기능구현
	void volumeUp(){
		++volume;
	}
	
	// 볼륨 다운 기능구현
	void volumeDown(){
		--volume;
	}
		
}
