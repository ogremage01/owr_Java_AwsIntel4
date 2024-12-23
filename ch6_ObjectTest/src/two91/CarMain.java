package two91;


// 생성자 Constructor
public class CarMain {
	
	
	public static void main(String[] args) {
		
		String name = "";
		String color = "";
		String gearType = "";
		String fuel ="";
		int door = 0;
		int price = 0;
		
//		자동차 클래스를 만든다/색상,기어,문,자신이 생각하는 자동차라면 있어야 하는 특징 하나 추가
//		자동차에는 자동차정보를 출력하는 기능이 있다
		
//		모델명: 
//		특징:
//		색상:
//		기어:
//		문:
//		가격:
		
//		===========================
//		생성자를 통해서 나의 드림카 정보를 기입하시오
		
		name = "배트모빌";
		color = "black";
		gearType = "manual";		
		fuel ="electric";
		door = 2;			
		price = 40000000;
		
		Car car = new Car(name, color, gearType, fuel, door, price);
		
		car.info();
		
		
		
		
		
		
				
		
	}
	
	
	
	
	

}
