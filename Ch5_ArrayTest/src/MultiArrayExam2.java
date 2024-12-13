
// 2차원 배열

public class MultiArrayExam2 {

	public static void main(String[] args) {
//		2차원 배열에 구구단의 결과값을 저장한다
		int[][] comp = new int[8][9];
		String[][] strComp = new String[8][9];

		for (int i = 0; i < comp.length; i++) {
			for (int j = 0; j < comp[0].length; j++) {
				comp[i][j] = ((i + 2) * (j + 1));
				strComp[i][j] = (i + 2) + " * " + (j + 1) + " = " + comp[i][j];
			}
		}
		for (int i = 0; i < strComp.length; i++) {
			for (int j = 0; j < strComp[0].length; j++) {
				System.out.print(strComp[i][j] + "\t");
			}
			System.out.println();

		}
	}
}
