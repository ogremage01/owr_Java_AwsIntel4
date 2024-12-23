package two91;

import java.text.DecimalFormat;
// 생성자 Constructor
public class Car {
	DecimalFormat df = new DecimalFormat("###,###");

	String name = "";
	String color = "";
	String gearType = "";		//자동, 수동
	String fuel ="";
	int door = 0;				//문의 개수
	int price = 0;
	
	
	Car(String n, String c, String gt, String f, int d, int p){
		name = n;
		color = c;
		gearType = gt;
		fuel = f;
		door = d;
		price = p;
	}
	
	void info() {
		System.out.println("모델명: " + name);
		System.out.println("색상: " + color);
		System.out.println("기어: " + gearType);
		System.out.println("문 " + door);
		System.out.println("연료 " + fuel);
		System.out.println("가격: " + df.format(price));
	}
	
	
	
	

}
