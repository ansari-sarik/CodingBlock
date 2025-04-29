package lecture_07;

import java.util.Scanner;

public class Take_Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];	//java type declaration
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Display(arr);
	}
	
	public static void Display(int [] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
	}
		System.out.println();
	}
}
