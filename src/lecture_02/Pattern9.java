package lecture_02;

public class Pattern9 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int star = 1;
		int space = n - 1;
		while (row <= n) {
			// space
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
			// next line prep
			row++;
			star += 2;
			space--;
			System.out.println();
		}
	}
}
