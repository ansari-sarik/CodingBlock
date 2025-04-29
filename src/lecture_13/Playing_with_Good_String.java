package lecture_13;

import java.util.Scanner;

public class Playing_with_Good_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(Length_Good_String(str));
		
	}
	public static int Length_Good_String(String str) {
		int ans = 0; int c = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Isvowels(ch)) {
				c++;
			}else{
				ans = Math.max(ans, c);
				c = 0;
			}
		}
		ans = Math.max(ans, c);
		return ans;
	}
	
	public static boolean Isvowels(char ch) {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}
	
}
