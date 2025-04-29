package lecture_13;

public class Reverse_Words_in_a_String_151 {
	public static void main(String[] args) {
		String s = "  the    sky   is   blue   ";
//		s = s.trim();
//		System.out.println(s);
		s = s.trim();
		String[] arr = s.split(" +");
		String ans = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			ans = ans + arr[i] + " ";
		}
		System.out.println(ans.trim());
	}
}
