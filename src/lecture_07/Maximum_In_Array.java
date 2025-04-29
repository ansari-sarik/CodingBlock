package lecture_07;

public class Maximum_In_Array {
	public static void main(String[] args) {
		int [] arr = {3,5,6,8,1,34,67,68,36,7};
		System.out.println(Maximum(arr));
	}
	
	public static int Max1(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		return max;
	}
	
	public static int Maximum(int[] arr) {
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
