package Extra_Class_26;

import java.util.*;

public class Help_Ramu {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] rickshaw_ride = new int[n];
			int[] cab_ride = new int[m];
			for (int i = 0; i < rickshaw_ride.length; i++) {
				rickshaw_ride[i] = sc.nextInt();
			}
			for (int i = 0; i < cab_ride.length; i++) {
				cab_ride[i] = sc.nextInt();
			}
			System.out.println(MinimumSum(c1, c2, c3, c4, rickshaw_ride, cab_ride));
			t--;
		}
	}

	public static int MinimumSum(int c1, int c2, int c3, int c4, int[] rickshaw_ride, int[] cab_ride) {
		int rickshaw_cost = 0;
		for (int i = 0; i < rickshaw_ride.length; i++) {
			rickshaw_cost += Math.min(rickshaw_ride[i] * c1, c2);
		}
		rickshaw_cost = Math.min(rickshaw_cost, c3);
		int cab_cost = 0;
		for (int i = 0; i < cab_ride.length; i++) {
			cab_cost += Math.min(cab_ride[i] * c1, c2);
		}
		cab_cost = Math.min(cab_cost, c3);
		int total_cost = rickshaw_cost + cab_cost;
		return Math.min(total_cost, c4);
	}
}