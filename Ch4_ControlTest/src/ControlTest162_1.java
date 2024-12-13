
public class ControlTest162_1 {

	public static void main(String[] args) {

//		직각삼각형을 출력하시오
//		*
//		**
//		***
//		****
//		*****
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
