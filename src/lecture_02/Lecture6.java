package lecture_02;

public class Lecture6 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int star = n;
		int space = 0;

		// for rows
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
			star--;
			space += 2;
			System.out.println();
		}
	}
}
