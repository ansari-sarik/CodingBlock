package lecture_02;

public class Pattern3 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int star = n;
		int space = 0;
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
				System.out.print(" ");
				j++;
			}
			row++;
			star--;
			space++;
			System.out.println();
		}
	}
}
