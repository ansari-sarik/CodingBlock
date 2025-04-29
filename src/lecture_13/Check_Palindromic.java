package lecture_13;

public class Check_Palindromic {
	public static void main(String[] args) {
		String s1 = "nitin";
		System.out.println(is_Palindromic(s1));
	}
	
	public static boolean is_Palindromic(String s) {
		int i = 0;
		int j = s.length() - 1;
		while(i < j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
