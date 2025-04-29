package lecture_14;

public class Wrapper_Class_Demo {
	public static void main(String[] args) {
		int a = 9;
		Integer a1 = 91;
		System.out.println(a);
		System.out.println(a1);
		
		// Autoboxing
		a1 = a;
		
		// Unboxing
		int b = 2;
		int b1 = 653;
		b = b1;
		
		Integer c1 = 18;
		Integer c2 = 18;
		Integer c3 = 189;
		Integer c4 = 189;
		System.out.println(c1 == c2);
		System.out.println(c3 == c4);
	}
}
