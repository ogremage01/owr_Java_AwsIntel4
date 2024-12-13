//2행 3열에 숫자들을 1행에 1/2행에 2만 입력 후출력하시오


public class ArrayTest214 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numArr = {
				{1,1,1},
				{2,2,2}
		};
		for(int i = 0; i<numArr.length;i++) {
			for(int j =0; j<numArr[0].length;j++) {
				numArr[i][j]=i+1;
			}
			}
		
		System.out.println("===========================");
		for(int i = 0; i<numArr.length;i++) {
			for(int j =0; j<numArr[0].length;j++) {
				System.out.print(numArr[i][j] + " ");
			}System.out.println();
		}
		
		
		
    }
}


