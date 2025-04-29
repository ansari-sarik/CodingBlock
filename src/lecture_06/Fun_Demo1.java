package lecture_06;

// non parameterize
public class Fun_Demo1 {
	public static void main(String[] args) {
		System.out.println("Hello");
		addition();
		System.out.println("Bye");
	}
	public static void addition () {
		int a = 7;
		int b = 9;
		int c = a + b;
		sub();
		System.out.println(c);
	}
	public static void sub () {
		int a = 7;
		int b = 9;
		int c = a - b;
		System.out.println(c);
	}
}
