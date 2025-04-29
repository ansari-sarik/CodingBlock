package lecture_10;

public class First_Bad_Version_278 {
	public static void main(String[] args) {
		int n = 100;
		System.out.println(Version_Control(n));
	}
	
	public static int Version_Control(int n) {
		int low = 1;
		int high = n;
		int ans = 0;
		while(low<=high) {
			int mid = (low + high)/2;
			if(isBadversion(mid) == true) {
				ans = mid;
				high = high - 1;
			}else {
				low = low + 1;
			}
		}
		return ans;
	}
	
	public static boolean isBadversion(int n) {
		return false;
	}
}
