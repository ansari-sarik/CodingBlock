package lecture_16;

public class First_Occc {
	public static void main(String[] args) {
		int[] arr = {2,3,5,3,7,3};
		int item = 3;
		System.out.println(index(arr, item , 0));
	}
	
	public static int index(int[] arr, int item, int idx) {
		if(arr[idx] == arr.length) {
			return -1;
		}
		if(arr[idx] == item) {
			return idx;
		}
		
		return index(arr, item , idx+1);
	}
}
