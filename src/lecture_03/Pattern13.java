package lecture_03;

public class Pattern13 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int star = 1;
		//for row
		while(row<=2*n-1) {
			// for star
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			// mirroring
			if(row<n) {
				star++;
			}
			else {
				star--;
			}
			row++;
			System.out.println();
		}
	}
}
