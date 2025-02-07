package lecture_04;

import java.util.Scanner;

public class Pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 0;
		int star = 1;
		// for row
		while (row < n) {
			// for star
			int i = 0;
			int ncr = 1;
			while (i < star) {
				System.out.print(ncr + "  ");
				ncr = (ncr * (row - i)) / (i + 1);
				i++;
			}
			row++;
			System.out.println();
			star++;

		}
	}
}
