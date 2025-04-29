package lecture_10;

public class Search_in_Rotated_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		int item = 0;
		System.out.println(Search(arr, item));

	}

	public static int Search(int[] arr, int item) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == item) {
				return mid;
			} else if (arr[mid] >= arr[low]) { // upper
				if (arr[low] <= item && arr[mid] > item) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else { // low line pe hun
				if (arr[mid] > item && arr[high] >= item) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}

}
