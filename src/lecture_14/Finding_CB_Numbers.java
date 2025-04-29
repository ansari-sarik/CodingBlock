package lecture_14;

public class Finding_CB_Numbers {
	public static void main(String[] args) {
		String str = "81615";
		subString(str);
	}

	public static void subString(String str) {
		int count = 0;
		boolean[] visited = new boolean[str.length()];
		for (int len = 1; len <= str.length(); len++) {
			for (int j = len; j <= str.length(); j++) {
				int i = j - len;
				String s = str.substring(i, j); // string
				if (isCBNumber(Long.parseLong(s)) == true && Isvisited(visited, i, j - 1) == true) {
					count++;
					for (int k = i; k < j; k++) {
						visited[k] = true;
					}
				}
			}
		}
		System.out.println(count);
	}

	public static boolean Isvisited(boolean[] visited, int i, int j) {
		for (int k = i; k < j; k++) {
			if (visited[k] == true) {
				return false;
			}
		}
		return true;
	}

	public static boolean isCBNumber(long num) {
		if (num == 0 || num == 1) {
			return false;
		}
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				return true;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (num % arr[i] == 0) {
				return false;
			}
		}
		return true;
	}
}
