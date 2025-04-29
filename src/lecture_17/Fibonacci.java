package lecture_17;

import java.util.Iterator;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 7;
		int a = 0;
		int b = 1;
		fibo(n, a, b);
	}

	public static void fibo(int n, int a, int b) {
		for (int i = 0; i < n; i++) {
			int c = a + b;
			a = b;
			b = c;
		}
		System.out.println(a);
	}
}
