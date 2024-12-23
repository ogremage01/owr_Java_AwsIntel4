package stu;

public class Student {
	
	String name = "";//이름
	int ban = 0;//반
	int no = 0;//번호
	int kor = 0;//국어점수
	int eng = 0;//영어점수
	int math = 0;//수학점수
	

	
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	int getTotal(){
		int total = 0;
		total = kor + eng + math;
		return total;
	}
	
	double getAverage() {
		double average = 0;
		average = (int)(((getTotal()*1.0/3)+0.005)*100)*0.01;
		return average;
	}
	

	
	
	
	

}
