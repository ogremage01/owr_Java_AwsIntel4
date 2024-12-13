
public class ControlTest164_4 {

	public static void main(String[] args) {

//		삼각형을 출력하시오
//		    *
//		   ***
//		  *****
//		 *******
//		*********
//		for (int i = 1; i <= 9; i += 2) {
//
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();//처음 해보려고 했던 방식
		for (int i = 1; i <= 5; i ++) {
			for (int k = 4; k >= i; k--) {
				System.out.print(" ");
			}for (int j = 1; j <= i*2-1; j++) {
				System.out.print("*");//교과서식
		//	}for (int l = 1; l <= i-1; l++) {
	//			System.out.print("*");//원래 했던 방식
			}
			System.out.println();
		}
	}

}