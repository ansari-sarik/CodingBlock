package lecture_02;

public class Pattern4 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int space = n - 1;
		int star = 1;
		// for row
		while (row <= n) {
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
			row++;
			space--;
			star++;
			System.out.println();
		}
	}
}
