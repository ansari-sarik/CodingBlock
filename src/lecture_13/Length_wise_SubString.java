package lecture_13;

public class Length_wise_SubString {
	public static void main(String[] args) {
		String s = "hello";
		print_All_SubString(s);
		
	}
	
	public static void print_All_SubString(String s) {
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				System.out.println(s.substring(i,j));
				
			}
		}
	}
}
