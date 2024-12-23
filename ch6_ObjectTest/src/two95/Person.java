package two95;

// 생성자 Constructor
public class Person {
	String hairColor = "empty";
	double weight = 0.0;
	double height = 0.0;

	Person() {
		this("black", 98.0, 176.7);

	}

	Person(String hairColor, double weight, double height) {
		this.hairColor = hairColor;
		this.weight = weight;
		this.height = height;

	}

	void personInfo() {
		System.out.println(hairColor);
		System.out.println(weight);
		System.out.println(height);

	}

}
