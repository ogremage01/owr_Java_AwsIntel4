
public class LogicalCompare {
	public static void main(String[] args) { 
		int firstNum = 5;
		int secondNum = 0;
		System.out.println("firstNum = " + firstNum + "\t secondNum = " + secondNum);
		System.out.println("firstNum != 0 || ++secondNum != 0 => " 
				+ (firstNum != 0 || ++secondNum != 0));
		System.out.println("firstNum = " + firstNum + "\t secondNum = " + secondNum);
		System.out.println();
		
		System.out.println("2번 문제");
		System.out.println("firstNum = " + firstNum + "\t secondNum = " + secondNum);
		System.out.println("firstNum == 0 || ++secondNum != 0 => " 
				+ (firstNum == 0 || ++secondNum != 0));
		System.out.println("firstNum = " + firstNum + "\t secondNum = " + secondNum);
		System.out.println();
		
		
		
	} 
}
