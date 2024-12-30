package five85;

import java.util.ArrayList;

public class TestArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list1 = new ArrayList();

		list1.add(new Integer(10));
		list1.add(new Integer(100));
		list1.add(new Integer(1000));
		list1.add(new Integer(10000));
		
//		for(int i = 1; i<=4;i++) {
//			list1.add(new Integer(Math.pow(10*1.0, i*1.0)));
//		}

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

	}

}
