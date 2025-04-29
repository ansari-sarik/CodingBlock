package lecture_06;

import java.util.Scanner;

public class Armstrong_Num_Check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Armstrong_Num(n));
	}

	public static boolean Armstrong_Num(int n) {
		int c = count_of_Digit(n);
		int sum = 0;
		int p = n;
		while (n > 0) {
			int rem = n % 10;
			sum = (int) (sum + Math.pow(rem, c));
			n = n / 10;
		}
		if (sum == p) {
			return true;
		} else {
			return false;
		}
	}

	public static int count_of_Digit(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}
}
