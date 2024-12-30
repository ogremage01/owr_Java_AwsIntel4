package student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> stuList = new ArrayList();

		Student stu1 = new Student(1, "박진우", 32, "게임");
		Student stu2 = new Student(2, "박찬정", 25, "심리학");
		Student stu3 = new Student(3, "오우람", 35, "독서");
		Student stu4 = new Student(4, "전유빈", 25, "포토샵");
		Student stu5 = new Student(5, "정현식", 30, "속기");
		Student stu6 = new Student(6, "주찬미", 25, "노력");
		Student stu7 = new Student(7, "최유혁", 26, "요리");

		stuList.add(stu1);
		stuList.add(stu2);
		stuList.add(stu3);
		stuList.add(stu4);
		stuList.add(stu5);
		stuList.add(stu6);
		stuList.add(stu7);

		HashMap<String, Student> nickMap = new HashMap<String, Student>();

		nickMap.put("박우", stu1);
		nickMap.put("박정", stu2);
		nickMap.put("오람", stu3);
		nickMap.put("전빈", stu4);
		nickMap.put("정식", stu5);
		nickMap.put("주미", stu6);
		nickMap.put("최혁", stu7);

		Scanner sc = new Scanner(System.in);
		String input = "";
		try {
			System.out.println("찾고자 하는 별명을 입력해주세요");
			input = sc.nextLine();

			System.out.println("==" + input + " 학생 정보==");
			nickMap.get(input).info();

		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("존재하지 않습니다");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("오류가 발생했습니다");
		}

//		System.out.println("==AWS 반 학생들 정보==");
//
//		for (int i = 0; i < stuList.size(); i++) {
//			stuList.get(i).info();
//		}

	}

}
