package lecture_03;

public class Pattern24 {
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
				System.out.print(row+" ");
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
