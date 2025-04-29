package lecture_13;

public class SubString_Demo {
	public static void main(String[] args) {
		String s = "codingblock";
		System.out.println(s.substring(4,7));
		System.out.println(s.substring(2));
		Print_All_SubString(s);
	}
	
	public static void Print_All_SubString(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i,j));
			}
		}
	}
}
