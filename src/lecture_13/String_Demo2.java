package lecture_13;

public class String_Demo2 {
	public static void main(String[] args) {
		String S1 = "Hello";
		String S2 = "Hello";
		String S3 = new String("Hello");
		String S4 = new String("Hello");
		S1 = S1 + "Bye";
		System.out.println(S1);
		S2 = S2.concat("Ok");
		System.out.println(S2);
		String S5 = "Raj" + "Kaju";
		String S6 = "RajKaju";
		System.out.println(S5 == S6);
		int [] arr = new int[7];
		System.out.println(arr.length);
		System.out.println(S1.length());  // find the string length;
		System.out.println(S1.charAt(4)); // print the character
	}
}
