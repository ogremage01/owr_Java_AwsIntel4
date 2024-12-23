package stu;

public class StudentMain {
	public static void main(String[] args) {
		String name = "";// 이름
		int ban = 0;// 반
		int no = 0;// 번호
		int kor = 0;// 국어점수
		int eng = 0;// 영어점수
		int math = 0;// 수학점수
		
		int total = 0;
		double average = 0;
	
		name = "홍길동";
		ban = 2;
		no = 1;
		kor = 100;
		eng = 60;
		math = 76;
		
		Student stu = new Student(name, ban, no, kor, eng, math);
		
		total = stu.getTotal();
		average = stu.getAverage();
		
		System.out.println("이름: " + stu.name + " /반: " + stu.ban + " /번호: " + stu.no);
		System.out.println("국어: " + stu.kor + " /영어: " + stu.eng + " /수학: " + stu.math);
		System.out.println("총점: " + total);
		System.out.println("평균: " + average);
	}

}
