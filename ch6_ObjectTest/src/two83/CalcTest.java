package two83;

//오버로딩(Overloading)
public class CalcTest {

	public static void main(String[] args) {
		
		
		
		Calc calc = new Calc();
		
		int a = 5;
		int b = 3;
		
		
		calc.add(a,b);
		calc.add((long)a,b);
		calc.add(a,(long)b);
		calc.add((long)a,(long)b);
		
		calc.division(a,b);
		calc.division((double)a,b);
		calc.division((double)a,(double)b);
		
		

	}

}
