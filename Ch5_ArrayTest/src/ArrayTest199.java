//배열 선언 방법들

public class ArrayTest199 {
	public static void main(String[] args) {

		int[] numArr = new int[3];

		int[] numArr2 = new int[] {
				1, 2, 3, 4, 5
			};

		int[] numArr3 = { 
				1, 2, 3, 4, 5 
			};
		
		System.out.println(numArr3[2]);
		
		//오류
		int[] numArr4= new int[3];
		
//		numArr4= {1,2,3};

	}

}
