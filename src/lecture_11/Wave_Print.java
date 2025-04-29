package lecture_11;

public class Wave_Print {
	public static void main(String[] args) {
		int[][] arr = {{2,3,4,1}, {21,12,6,8}, {10, 20, 39}};
		verticalWavePrint(arr);
		
	}
	
	public static void verticalWavePrint(int[][] arr) {
		for (int col = 0; col < arr[0].length; col++) {
			if(col % 2 == 0) {
				for (int row = 0; row <= arr.length; row++) {
					System.out.print(arr[row][col] + " ");
				}
				}else {
					for (int row = arr.length; row >=0 ; row--) {
						System.out.print(arr[row][col] + " ");
					}
				}
			}
		}
	}

