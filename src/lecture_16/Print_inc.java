package lecture_16;

public class Print_inc {
	public static void main(String[] args) {
		int n = 5;
		inc(n);
	}
	
	public static void inc(int n) {
		//similar base case
		if(n == 0) {
			return;
		}
		 inc(n - 1);
		System.out.println(n);
	}
}
