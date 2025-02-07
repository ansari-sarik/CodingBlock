package lecture_03;

public class Pattern17 {
	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		int star = n / 2;
		int space = 1;
		// for row
		while (row <= n) {
			// for star
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			// for space
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			int k = 1;
			while (k <= star) {
				System.out.print("* ");
				k++;
			}
			// mirroring
			if (row < n / 2 + 1) {
				star--;
				space += 2;
			} else {
				star++;
				space -= 2;
			}
			row++;
			System.out.println();
		}
	}
}
