import java.util.Arrays;

public class ArrayTest2 {
	public static void main(String[] args) {

//		배열에 들어있는 임의의 숫자들을 작은 값에서 큰값으로 정렬하시오

		int[] jumsuArr = { 70, 80, 50, 100, 1 };

		int temp = 0;
//		Arrays.sort(jumsuArr);
//		for(int i = 0;i<5;i++) {
//			System.out.print(jumsuArr[i]+" ");	
//		}
		for (int i = 0; i < 6; i++) {
			for(int j =i+1;j<5;j++) {
				if(jumsuArr[i]<jumsuArr[j]) {
			}
		}
		}
		
}
}