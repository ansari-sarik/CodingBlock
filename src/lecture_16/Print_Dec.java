package lecture_16;

public class Print_Dec {
	public static void main(String[] args) {
		int n = 5;
		dec(n);
		
	}
	
	public static void dec(int n) {
		//Base case
		if(n == 0) {
			return;
		}
		
		// Smaller code
		System.out.println(n);
		dec(n - 1);
	}
}
