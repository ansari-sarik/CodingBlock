package lecture_02;

public class Pattern5 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int star = n;
		int space = 0;
		while(row<=n) {
			int i = 1;
			while(i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while(j<= star) {
				System.out.print("* ");
				j++;
			}
			row++;
			star--;
			space++;
			System.out.println();
		}
	}
}
