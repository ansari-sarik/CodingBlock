package lecture_04;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int divident = 60;
		int divisor = 36;
		while(divident%divisor!=0) {
			int rem = divident%divisor;
			divident = divisor;
			divisor = rem;
		}
		System.out.println(divisor);
	}

}
