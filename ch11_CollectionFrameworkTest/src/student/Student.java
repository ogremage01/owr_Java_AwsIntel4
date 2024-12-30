package student;

public class Student {

	int num = 0;
	String name = "";
	int age = 0;
	String ability = "";

	Student() {

	}

	Student(int num, String name, int age, String ability) {
		this.num = num;
		this.name = name;
		this.age = age;
		this.ability = ability;
	}

	void info() {
		System.out.println(num + ". " + name + " " + age + " " + ability);
	}

}
