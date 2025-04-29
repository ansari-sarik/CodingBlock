package lecture_11;

public class Spiral_Print {
	public static void main(String[] args) {
		int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		Print(arr);
	}
	
	public static void Print(int[][] arr) {
		int minrow = 0;
		int mincol = 0;
		int maxrow = arr.length-1;
		int te = arr.length*arr[0].length;
		int c = 0;
		while(c < te) {
		int maxcol = arr[0].length-1;
		for (int i = mincol; i <= maxcol && c < te; i++) {
			System.out.print(arr[minrow][i]+ " ");
			c++;
		}
		minrow++;
		
		for (int i = minrow; i <= maxrow && c < te; i++) {
			System.out.print(arr[i][maxcol] + " ");
			c++;
		}
		maxcol--;
		
		for (int i = maxcol; i >= mincol && c < te; i--) {
			System.out.print(arr[maxrow][i] + " ");
			c++;
		}
		maxrow--;
		
		for (int i = maxrow; i >= minrow && c < te; i--) {
			System.out.print(arr[i][mincol] + " ");
			c++;
		}
		
		mincol++;
		}
	}
}
