package lecture_13;

public class String_Demo {
	public static void main(String[] args) {
		String S1 = "Hello";
		String S2 = "Hello";
		String S3 = new String("Hello");
		String S4 = new String("Hello");
		System.out.println(S1);
		System.out.println(S2);
		System.out.println(S3);
		System.out.println(S4);
		System.out.println(S1 == S2);
		System.out.println(S1 == S3);
		System.out.println(S1.equals(S4));
	}
}
