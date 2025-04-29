package lecture_07;

public class Swap_Demo_02 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println(arr[0] + " " + arr[1]);
		Swap(arr, 0, 1);
		System.out.println(arr[0] + " " + arr[1]);
	}

	public static void Swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
