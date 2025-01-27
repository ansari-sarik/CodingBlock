// Again karna h feb i first week m 

package lecture_02;

import java.util.Scanner;

public class Pattern24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int num = 1;
		int space = n - 1;
		// for row
		while (row <= n) {
			// for space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// for number
			int j = 1;
			while (j <= num) {
				System.out.print(row +" ");
				j++;
			}
			row++;
			System.out.println();
			space--;
			num += 2;
		}
	}
}
