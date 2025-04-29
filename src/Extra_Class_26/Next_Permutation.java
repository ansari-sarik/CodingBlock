package Extra_Class_26;

public class Next_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };
		permutation(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void permutation(int[] arr) {
		int n = arr.length;
		int p = -1;
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				p = i;
				break;
			}
		}
		if (p == -1) {
			Reverse(arr, 0, n - 1);
			return;
		}

		int q = -1;
		for (int i = n - 1; i > p; i--) {
			if (arr[i] > arr[p]) {
				q = i;
				break;
			}
		}
		int t = arr[p];
		arr[p] = arr[q];
		arr[q] = t;
		Reverse(arr, p + 1, n - 1);
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
