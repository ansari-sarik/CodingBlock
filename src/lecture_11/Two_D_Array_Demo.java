package lecture_11;

public class Two_D_Array_Demo {
	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[0][2]);
		int row = arr.length;
		int col = arr[0].length;
		int[][] other = arr;
		int [][] arr1 = new int [3][];	//this is correct
	//	int [][] arr2 = new int [][4];  // this is wrong
	}
}
