package lecture_09;

public class Selection_Sort {
	public static void main(String[] args) {
		int[] arr = { 4, -1, 5, 3, 2, 1 };
		System.out.println(Minimum_Index(arr, 2));
	}

	public static int Minimum_Index(int[] arr, int idx) {
		int mini = idx;
		for (int i = idx + 1; i < arr.length; i++) {
			if (arr[i] < arr[mini]) {
				mini = i;
			}
		}
		return mini;
	}
}
