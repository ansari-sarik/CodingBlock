package lecture_17;

public class SubSequence {
	public static void main(String[] args) {
		String ques = "abc";
		printSubSeq(ques, " ");
	}

	public static void printSubSeq(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);

		printSubSeq(ques.substring(1), ans);
		printSubSeq(ques.substring(1), ans + ch);
	}
}
