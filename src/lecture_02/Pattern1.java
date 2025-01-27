package lecture_02;

public class Pattern1 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int star = 5;
		// for row
		while (row <= n) {
			// for star
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			row++;
			System.out.println();
		}
	}
}
