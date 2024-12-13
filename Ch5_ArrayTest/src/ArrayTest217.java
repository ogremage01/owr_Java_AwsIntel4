//

public class ArrayTest217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1~24를 순차적으로 4행 6열 2차원 배열에 넣는다
//		이들을 중첩 for문을 활용해 행열을 구분해 출력한다.

		int[][] numArr = new int[4][6];
		int num = 0;

		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				num++;
				numArr[i][j] = num;
				
			}
		}
		
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				System.out.print(numArr[i][j] + "\t");

			}
			System.out.println();
		}

	}
}
