package four64;

public class StringPractice {
	public static void main(String[] args) {
		String s = new String("Hello");
		System.out.println(s);
		char[] c = {'H', 'e', 'l', 'l', 'o'};
		String s2 = new String(c);
		System.out.println(s2);
		StringBuffer sb = new StringBuffer("Hello");
		String s3 = new String(sb);
		System.out.println(s3);
		String s4 = "hello";
		char c1 =s.charAt(1);
		System.out.println(c1);
		int i1 ="aaa".compareTo("aaa");
		int i2 ="aaa".compareTo("bbb");
		int i3 ="bbb".compareTo("aaa");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		String s5 = "Hello";
		String s6 = s5.concat(" World");
		System.out.println(s6);
		boolean b;
		System.out.println(b = s.contains("He"));
		System.out.println(b = s.endsWith("llo"));
		System.out.println(b = s.equals("hello"));
		System.out.println(b = s.equals("Hello"));
		System.out.println(b= s.equalsIgnoreCase("hello"));
		System.out.println(b= s.equalsIgnoreCase("Hello"));
		int idx1;
		System.out.println(idx1 = s.indexOf("o"));
		System.out.println(idx1 = s.indexOf("k"));
		System.out.println(idx1 = s.indexOf('e', 0));
		System.out.println(idx1 = s.indexOf('e', 2));
		System.out.println(idx1 = s.indexOf("He"));
		String s1 = new String("abc");
		s2 = new String("abc");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.intern()==s2.intern());
		s = "java.lang.java";
		idx1 = s.lastIndexOf('.');
		System.out.println(idx1);
		idx1 = s.indexOf('.');
		System.out.println(idx1);
		System.out.println(s.length());
		s2 = s.replace('j', 'J');
		System.out.println(s2);
		System.out.println();
		
	}

}
