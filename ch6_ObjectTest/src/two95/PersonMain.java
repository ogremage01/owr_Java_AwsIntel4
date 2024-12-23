package two95;

// this 자기자신, this() 생성자에서 다른 생성자 호출하기
public class PersonMain {

	public static void main(String[] args) {
		String hairColor = "";
		double weight = 0.0;
		double height = 0.0;

		Person person = new Person();
		person.personInfo();
		System.out.println("============");

		hairColor = "black";
		weight = 89.0;
		height = 180.0;

		Person person2 = new Person(hairColor, weight, height);

		person2.personInfo();
		

	}

}
