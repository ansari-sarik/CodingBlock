package lecture_09;

public class Maximum_Subarray {
	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(Subarray_Sum(arr));
	}
	
	public static int Subarray_Sum(int[] arr) {
		int ans = Integer.MIN_VALUE;
			int sum = 0;
			for(int i = 0; i < arr.length; i++) {
				sum += arr[i];
				ans = Math.max(ans, sum);
				if(sum<0) {
					sum = 0;
				}
			}
		return ans;
	}
}
