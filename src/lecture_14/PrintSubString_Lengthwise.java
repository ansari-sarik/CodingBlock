package lecture_14;

public class PrintSubString_Lengthwise {
	public static void main(String[] args) {
		String str = "abcd";
		SubString(str);
	}
	
	public static void SubString(String str) {
		for (int len = 1; len <= str.length(); len++) {   // j - i = len
			for (int j = len; j <= str.length(); j++) {
				int i = j - len;
				System.out.println(str.substring(i,j));
			}
		}
	}
}
