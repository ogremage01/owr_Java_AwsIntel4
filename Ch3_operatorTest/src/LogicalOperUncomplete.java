
public class LogicalOperUncomplete {

	public static void main(String[] args) {
		int num = 5;
		int n = 150;

		System.out.println(num + "는 0보다 크고, 9보다는 작은가?");
		System.out.println(0 < num && num < 9);
		System.out.println(n + "는 0보다 작거나 100보다는 큰가?");
		System.out.println(n < 0 || n > 100);
	}
}
