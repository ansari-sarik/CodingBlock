package lecture_20;

public class check_Prime {
	public static void main(String[] args) {
		int n = 89;
		System.out.println(Isprime(n));
	}

	public static boolean Isprime(int n) {
		int div = 2;
		while (div * div <= n) {
			if (n % div == 0) {
				return false;
			}
			div++;
		}
		return true;
	}

}
