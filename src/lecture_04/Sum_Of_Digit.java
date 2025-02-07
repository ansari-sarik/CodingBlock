package lecture_04;

import java.util.Scanner;

public class Sum_Of_Digit {
	public static void main(String[] args) {
		int n = 23145;
 		int sum = 0;
		while(n>0) {
			int rem = n%10; 
			sum = sum + rem;
			n = n/10;
		}
		System.out.println(sum);
	}
}
