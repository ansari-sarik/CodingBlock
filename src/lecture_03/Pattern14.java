package lecture_03;

public class Pattern14 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int space = n - 1;
		int star = 1;
		// for row
		while (row <= 2*n-1) {
			// for space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// for star
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			//mirroring
			if(row<5) {
				star++;
				space--;
			}
			else {
				star--;
				space++;
			}
			row++;
			System.out.println();
		}
	}
}
