package lecture_03;

public class Pattern15 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int star = n;
		int space = 0;
		// for row
		while (row <= 2*n-1) {
			// for space
			int i = 1;
			while (i <= space) {
				System.out.print("   ");
				i++;
			}
			// for star
			int j = 1;
			while (j <= star) {
				System.out.print("*  ");
				j++;
			}
			//mirroring
			if(row<n) {
				star--;
				space+=2;
			}
			else {
				star++;
				space-=2;
			}
			row++;
			System.out.println();
		}
	}
}
