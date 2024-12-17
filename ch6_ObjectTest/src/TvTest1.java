

public class TvTest1 {
	public static void main(String[] args) {

		Tv tv = new Tv();
		
		
		tv.power();
		tv.color = "흑색";
		for(int i = 0; i < 7; i++) {
			tv.channelUp();
		}
		Tv tv2 = new Tv();
		tv2.channel = 100;
		for(int i = 0; i < 3; i++) {
			tv2.channelDown();
		}
		System.out.println("첫 tv");
		System.out.println("전원: " + tv.power);
		System.out.println("색상: " + tv.color);
		System.out.println("채널: " + tv.channel);
		System.out.println();
		System.out.println("tv2");
		System.out.println("전원: " + tv2.power);
		System.out.println("색상: " + tv2.color);
		System.out.println("채널: " + tv2.channel);
		
	}

}


//Tv를 하나 만드는데
//
//tv power를 켜고
//
//색상은 자신이 맘에 드는 색으로 하나 설정하고
//
//채널을 7번 올린다
//
//새로운 Tv를 만들고 채널을 100으로 설정한 후
//채널을 3번 내린다
//
//처음 tv의 정보를 출력한다
//두번째 tv의 정보를 출력한다
//**출력형태**
//첫 tv
//전원: ??
//색상: ??
//채널: ??
//      
//tv2
//전원: ??
//색상: ??
//채널: ??