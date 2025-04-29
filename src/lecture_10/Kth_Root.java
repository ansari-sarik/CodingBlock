package lecture_10;

public class Kth_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 143;
		int k =3;
		System.out.println(Kthroot(n,k));
	}
	
	public static int Kthroot(int n, int k) {
		int low = 1, high = n;
		int ans = 0;
		while(low<=high) {
			int mid = (low+high)/2;
			if(Math.pow(mid , k)<=n) {
				ans = mid;
				low = mid + 1;
			}
			else {
				high = mid -1;
			}
		}
		return ans;
	}

}
