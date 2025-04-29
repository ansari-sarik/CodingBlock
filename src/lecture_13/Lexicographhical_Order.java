package lecture_13;

public class Lexicographhical_Order {
	public static void main(String[] args) {
		String s1 = "kunal";
		String s2 = "komal";
		System.out.println(s1.compareTo(s2));
		String s3 = "ankit";
		String s4 = "ankita";
		System.out.println(s3.compareTo(s4));
		System.out.println(compareTo(s1,s2));
	}
	//s1 > s2 +ve  | s1<s2 -ve | s1 and s2 equal 0
	public static int compareTo(String s1, String s2) {
		if(s1 == s2) {
			return 0;
		}
		
		int len = Math.min(s1.length(), s2.length());
		for (int i = 0; i < len; i++) {
			if(s1.charAt(i)!= s2.charAt(i)) {
				return s1.charAt(i) - s2.charAt(i);
			}
		}
		
		return s1.length() - s2.length();
	}
}
