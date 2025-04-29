package lecture_06;

public class Fun_Demo2 {
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println(Add());
	}

	public static int Add() {
		int a = 8;
		int b = 7;
		int c = a + b - sub();
		return c;
	}

	public static int sub() {
		int a = 9;
		int b = 7;
		int c = a - b;
		return c;
	}
}
