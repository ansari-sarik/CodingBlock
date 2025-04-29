package lecture_08;

public class Reversal_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		Rotate(arr, k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Rotate(int[] arr, int k) {
		int n = arr.length;
		k = k % n; // 0 to n-1
		
		// starting ke n-k elements
		Reverse(arr,0, n - k - 1);
		
		// last ke k elements
		Reverse(arr, n - k, n - 1);

		// all elements
		Reverse(arr, 0, n - 1);
	}

	public static void Reverse(int[] arr, int i, int j) {
		while (i < j) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;
		}
	}
}
