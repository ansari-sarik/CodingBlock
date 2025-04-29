package lecture_18;

import java.util.*;

public class Combination_Sum {
	public static void main(String[] args) {
		int[] coin = { 2, 3, 6, 7 };
		int amount = 7;
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		print(coin, amount, ll, 0, ans);
		System.out.println(ans);
	}

	public static void print(int[] coin, int amount, List<Integer> ll, int idx, List<List<Integer>> ans) {
		if (amount == 0) {
			// System.out.println(ll);
			ans.add(new ArrayList<>(ll));
			return;
		}

		for (int i = idx; i < coin.length; i++) {
			if (amount >= coin[i]) {
				ll.add(coin[i]);
				print(coin, amount - coin[i], ll, i, ans);
				ll.remove(ll.size() - 1);
			}
		}
	}
}



