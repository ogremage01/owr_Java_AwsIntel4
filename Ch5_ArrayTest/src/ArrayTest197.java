
public class ArrayTest197 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArr = { 79, 88, 91, 33, 100, 55, 95 };

		int min = 0;
		int max = 0;

//		맥스값 찾기+민값 찾기
		min = numArr[0];
		for (int i = 0; i < numArr.length; i++) {
			if (max < numArr[i]) {
				max = numArr[i];
			}
			if (min > numArr[i]) {
				min = numArr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);

	}
}
