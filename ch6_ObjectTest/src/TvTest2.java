

public class TvTest2 {
	public static void main(String[] args) {


		Tv2 tv = new Tv2();
		
		
		tv.color = "흑색";
		tv.name = "오우람";
		
		Tv2 tv2 = new Tv2();
		
		tv2.color = tv.color;
		tv2.name = tv.name;
		tv2.channel = tv.channel;
		tv2.power = tv.power;
		
		
		tv2.channelUp();
		tv2.channelUp();
		tv2.channelUp();
		
		tv2.name = "박찬정";
		
		System.out.println(tv.name + " 정보");
		System.out.println("TV 색상: " + tv.color);
		System.out.println("현재 TV 채널: " + tv.channel);
		System.out.println();
		
		
		System.out.println(tv2.name + " 정보");
		System.out.println("TV 색상: " + tv2.color);
		System.out.println("현재 TV 채널: " + tv2.channel);
		


	}

}

//Tv2 클래스를 활용한다
//
//Tv 하나를 생성하는데
//Tv에는 색상, 전원, 채널, 이름이 존재한다
//
//자신이 좋아하는 색상을 입력하고
//Tv명은 본인명 Tv로 설정한다 
//
//새로운 Tv를 만들고 
//기존의 Tv 설정을 복제한 후
//채널을 3개 올린다
//짝꿍의 이름으로 tv명을 설정한다
//
//각 Tv의 정보를 출력하시오
//tv명 정보
//tv 색상: ??
//현재 채널: ??
//    
//tv명 정보
//tv 색상: ??
//현재 채널: ??      