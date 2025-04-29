package lecture_05;

import java.util.Scanner;

public class Data_Types_Demo_3 {
	public static void main(String[] args) {
		char ch = 'a';
		System.out.println((int)(ch));
		ch++;
		System.out.println(ch);
		ch += 1;
		System.out.println(ch);
		ch = (char)(ch + 1);
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
	}
}
