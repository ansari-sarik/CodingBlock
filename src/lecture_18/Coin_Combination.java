package lecture_18;

public class Coin_Combination {
	public static void main(String[] args) {
		int[] coin = { 2, 3, 4, 5 };
		int amount = 10;
		print(coin, amount, "", 0);
	}

	public static void print(int[] coin, int amount, String ans, int idx) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = idx; i < coin.length; i++) {
			if (amount >= coin[i]) {
				print(coin, amount - coin[i], ans + coin[i], i);
			}
		}
	}
}
