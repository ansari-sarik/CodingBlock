package lecture_11;

public class Transpose_Array {
	public static void main(String[] args) {
		int[][] arr = { { 2, 3, 1, 4 }, { 5, 6, 7, 9 }, { 8, 12, 11, 10 }, { 16, 15, 14, 13 } };
		Transpose(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void Transpose(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = row + 1; col < arr.length; col++) {
				int temp = arr[row][col];
				arr[row][col] = arr[col][row];
				arr[col][row] = temp;
			}
		}
	}
}
