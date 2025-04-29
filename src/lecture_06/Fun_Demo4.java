package lecture_06;

public class Fun_Demo4 {
		public static void main(String[] args) {
			System.out.println("Hello");
			int a = 7;
			int b = 9;
			int x =addition(a,b);
			System.out.println(x);
			System.out.println("Bye");
		}
		public static int addition(int a , int b) {
			int c = a + b;
			return c - sub(b,c);
		}
		public static int sub(int a , int b) {
			int c = a - b;
			return c;
		}
	}


