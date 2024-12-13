//배열의 값 위치 변경

public class ArrayTest189 {
	public static void main(String[] args) {

		int[] ballArr = new int[45];
//		1-45 삽입
		for (int i = 0; i < ballArr.length; i++) {
			ballArr[i] = i + 1;
		}
//		내용 확인
//		for (int i = 0; i < ballArr.length; i++) {
//			System.out.print(ballArr[i] + "\t");
//		}
//		System.out.println();

//		내용 확인
		for (int i = 0; i < ballArr.length; i++) {
			System.out.print(ballArr[i] + "\t");
//			원하는 숫자단위로 줄을 만들기 위한 코드
			if ((i+1)%5==0) {
				System.out.println();
			}
		}

	}

}
