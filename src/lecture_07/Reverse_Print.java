package lecture_07;

public class Reverse_Print {
	public static void main(String[] args) {
		int [] arr = {3,5,6,2,1};
		Print(arr);
	}
	
	public static void Print(int[] arr) {
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
