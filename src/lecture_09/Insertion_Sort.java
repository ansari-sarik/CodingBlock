package lecture_09;

public class Insertion_Sort {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 9, 4, 4, 5, 6, 8 };
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			Insert_Last_Element(arr, i);
		}
	}

	public static void Insert_Last_Element(int[] arr, int i) {
		int item = arr[i];
		int j = i - 1;
		while (j >= 0 ) {
			if(arr[j] > item) {
			arr[j + 1] = arr[j];
			arr[j] = item;
			}
			j--;
		}

		// index bola hota to j+1 return karenge
	}
}
